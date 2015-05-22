/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.service;

import com.recreat.spring.SisLocFactory;
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
public class UsuarioServiceTest {
    
    @Autowired
    UsuarioService instance;
    
    public UsuarioServiceTest() {
        instance = SisLocFactory.getInstance().getUsuarioService();
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
     * Test of listar method, of class UsuarioService.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        UsuarioType usuario = new UsuarioType();
        //usuario.setUsuario("TEST");
        
        List<UsuarioType> result = instance.listar(usuario);
        if(result != null){
            for(UsuarioType item : result){
                System.out.println("usuarioId: " + item.getUsuarioId());
                System.out.println("nombre: " + item.getNombre());
                System.out.println("correo: " + item.getCorreo());
                System.out.println("Usuario: " + item.getUsuario());
                System.out.println("");
            }
        }
        
        assertTrue(result != null);
    }

    /**
     * Test of insertar method, of class UsuarioService.
     */
    //@Test
    public void testInsertar() throws Exception {
        System.out.println("insertar");
        UsuarioType usuario = new UsuarioType();
        usuario.setNombre("Prueba Usuario");
        usuario.setCorreo("email@email.com");
        usuario.setUsuario("ADMIN");
        usuario.setContrasenha("123");
        
        String result = instance.insertar(usuario);
        
        System.out.println("result: " + result);
        assertTrue(result != null);
    }

    /**
     * Test of actualizar method, of class UsuarioService.
     */
    //@Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        UsuarioType usuario = new UsuarioType();
        usuario.setUsuarioId("53767d0f3b3ed93048468ab5");
        usuario.setEstado('A');
        
        instance.actualizar(usuario);
    }

    /**
     * Test of eliminar method, of class UsuarioService.
     */
    //@Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        String usuarioId = "53767b0a3b3e0022a4814398";
        
        instance.eliminar(usuarioId);
    }

    /**
     * Test of logearUsuario method, of class UsuarioService.
     */
    //@Test
    public void testLogearUsuario() throws Exception {
        System.out.println("logearUsuario");
        String usuario = "ADMIN";
        String contrasenha = "123";
        
        UsuarioType result = instance.logearUsuario(usuario, contrasenha);
        if(result != null)
            System.out.println("result:" + result.getNombre());
        
        assertTrue(result != null);
    }

    /**
     * Test of verificarUsuario method, of class UsuarioService.
     */
    //@Test
    public void testVerificarUsuario() throws Exception {
        System.out.println("verificarUsuario");
        String usuario = "JAQUISE";
        
        Boolean result = instance.verificarUsuario(usuario);
        System.out.println("result: " + result);
        assertTrue(result);
    }
}