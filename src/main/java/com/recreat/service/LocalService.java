/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.recreat.service;

import com.mongodb.BasicDBObject;
import com.recreat.type.LocalType;
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
public class LocalService {
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    public List<LocalType> listar(LocalType local) throws Exception {

        Query query = MapUtils.processQueryBean(local, "localId");
        return mongoTemplate.find(query, LocalType.class, Collections.TB_LOCAL);
    }
    
    public String insertar(LocalType local) throws Exception {
        if (!mongoTemplate.collectionExists(Collections.TB_LOCAL)) {
            mongoTemplate.createCollection(Collections.TB_LOCAL);
        }

        mongoTemplate.insert(local, Collections.TB_LOCAL);
        return local.getLocalId();
    }
    
    public void actualizar(LocalType local) throws Exception {
        BasicDBObject newDocument = MapUtils.processBasicDBObject(local);
        newDocument.removeField("localId");

        ObjectId id = new ObjectId(local.getLocalId());
        Query query = query(where("_id").is(id));
        Update update = Update.fromDBObject(newDocument);

        mongoTemplate.updateFirst(query, update, Collections.TB_LOCAL);
    }
}
