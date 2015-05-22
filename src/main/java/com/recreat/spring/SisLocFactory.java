package com.recreat.spring;

import com.recreat.service.LocalService;
import com.recreat.service.NegocioService;
import com.recreat.service.TablaService;
import com.recreat.service.UsuarioService;
import com.recreat.util.ConstanteFactory;
import org.springframework.beans.factory.BeanFactory;

/**
 * @Archivo SisLocFactory.java
 * @Fecha
 * @Autor
 * @Cambios 17/09/2010 11:51:22 AM
 */
public class SisLocFactory {

    public static String[] dataContext;
    private static SisLocFactory singleton = null;
    private BeanFactory factory = null;

    private SisLocFactory() {
        factory = SpringConfiguracion.configurar(dataContext);
    }

    public static SisLocFactory getInstance() {
        if (singleton == null) {
            singleton = new SisLocFactory();
        }

        return singleton;
    }

    public BeanFactory getFactory() {
        return factory;
    }

    public TablaService getTablaService() {
        return factory.getBean(ConstanteFactory.TABLA, TablaService.class);
    }
    public UsuarioService getUsuarioService() {
        return factory.getBean(ConstanteFactory.USUARIO, UsuarioService.class);
    }
    public NegocioService getNegocioService() {
        return factory.getBean(ConstanteFactory.NEGOCIO, NegocioService.class);
    }
    public LocalService getLocalService() {
        return factory.getBean(ConstanteFactory.LOCAL, LocalService.class);
    }
}
