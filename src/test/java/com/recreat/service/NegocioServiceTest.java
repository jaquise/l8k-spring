/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.service;

import com.recreat.spring.SisLocFactory;
import com.recreat.type.NegocioType;
import com.recreat.type.UsuarioType;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jaquise
 */
public class NegocioServiceTest {
    
    @Autowired
    private NegocioService instance;
    
    public NegocioServiceTest() {
        instance = SisLocFactory.getInstance().getNegocioService();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listar method, of class NegocioService.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        
        NegocioType negocio = new NegocioType();
        //negocio.setNombre("negocio 01");
        //negocio.setUsuarioId("53875e4a3b3e59ea5e9aa011");
        
        List<NegocioType> result = instance.listar(negocio);
        
        System.out.println("result:" + result);
        assertTrue(result != null);
    }

    /**
     * Test of insertar method, of class NegocioService.
     */
    //@Test
    public void testInsertar() throws Exception {
        System.out.println("insertar");
        NegocioType negocio = null;
        NegocioService instance = new NegocioService();
        String expResult = "";
        String result = instance.insertar(negocio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}