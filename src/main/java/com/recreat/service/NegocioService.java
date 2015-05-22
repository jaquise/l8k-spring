/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.recreat.service;

import com.mongodb.BasicDBObject;
import com.recreat.type.NegocioType;
import com.recreat.util.Collections;
import com.recreat.util.MapUtils;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import org.springframework.data.mongodb.core.query.Query;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jaquise
 */
@Service
@Repository
public class NegocioService {
 
    @Autowired
    private MongoTemplate mongoTemplate;
    
    public List<NegocioType> listar(NegocioType negocio) throws Exception {

        Query query = MapUtils.processQueryBean(negocio, "negocioId");
        return mongoTemplate.find(query, NegocioType.class, Collections.TB_NEGOCIO);
    }
    
    public String insertar(NegocioType negocio) throws Exception {
        if (!mongoTemplate.collectionExists(Collections.TB_NEGOCIO)) {
            mongoTemplate.createCollection(Collections.TB_NEGOCIO);
        }

        mongoTemplate.insert(negocio, Collections.TB_NEGOCIO);
        return negocio.getNegocioId();
    }
    
    public void actualizar(NegocioType negocio) throws Exception {
        BasicDBObject newDocument = MapUtils.processBasicDBObject(negocio);
        newDocument.removeField("negocioId");

        ObjectId id = new ObjectId(negocio.getNegocioId());
        Query query = query(where("_id").is(id));
        Update update = Update.fromDBObject(newDocument);

        mongoTemplate.updateFirst(query, update, Collections.TB_NEGOCIO);
    }
    
}
