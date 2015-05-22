/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.service;

import com.recreat.dto.TablaDTO;
import com.recreat.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jaquise
 */
@Service
@Repository
public class TablaService {
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    public List<TablaDTO> listarPaises(){
        return mongoTemplate.findAll(TablaDTO.class, Collections.TB_PAIS);
    }
    
}
