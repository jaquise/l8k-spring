/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Archivo SpringConfiguracion.java
 * @Fecha
 * @Autor
 * @Cambios 16/09/2010 02:42:36 PM
 */
public class SpringConfiguracion {

    public static BeanFactory configurar(String[] xml) {
        if (xml == null) {
            xml = new String[]{"spring-context.xml"};
        }
        ApplicationContext context = new ClassPathXmlApplicationContext(xml);

        BeanFactory factory = (BeanFactory) context;
        return factory;

    }
}
