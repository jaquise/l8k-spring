/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.util;

import com.mongodb.BasicDBObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.beanutils.BeanMap;
import org.bson.types.ObjectId;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import org.springframework.data.mongodb.core.query.Query;

/**
 *
 * @author Ibatis
 */
public class MapUtils {

    /**
     * Creates a new instance of IbatisUtil
     * @param bean
     * @return 
     */
    public static Map processBean(Object bean) {
        Map map = new HashMap();
        try {
            BeanMap beanMap = new BeanMap(bean);
            Iterator it = beanMap.keyIterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                Object value = beanMap.get(key);

                if (value != null && !key.equals("class")) {
                    map.put(key, value);
                }
            }
        } catch (Exception ex) {
        }
        return map;
    }

    public static Map processBean(Object... beans) {
        Map map = new HashMap();
        BeanMap beanMap;
        try {
            for (Object bean : beans) {
                beanMap = new BeanMap(bean);
                Iterator it = beanMap.keyIterator();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    Object value = beanMap.get(key);

                    if (value != null && !key.equals("class")) {
                        map.put(key, value);
                    }
                }
            }
        } catch (Exception ex) {
        }
        return map;
    }

    public static BasicDBObject processBasicDBObject(Object bean) {
        BasicDBObject newDocument = new BasicDBObject();
        try {
            BeanMap beanMap = new BeanMap(bean);
            Iterator it = beanMap.keyIterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                Object value = beanMap.get(key);

                if (value != null && !key.equals("class")) {
                    newDocument.put(key, value);
                }
            }
        } catch (Exception ex) {
        }
        return newDocument;
    }

    public static Query processQueryBean(Object bean, String Id) {
        Query query = new Query();
        try {
            BeanMap beanMap = new BeanMap(bean);
            Iterator it = beanMap.keyIterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                Object value = beanMap.get(key);

                if (value != null && !key.equals("class") && !key.equals(Id)) {
                    query.addCriteria(where(key).is(value));
                }
                if (value != null && !key.equals("class") && key.equals(Id)) {
                    ObjectId id = new ObjectId((String) value);
                    query.addCriteria(where("_id").is(id));
                }

            }
        } catch (Exception ex) {
        }
        return query;
    }

}
