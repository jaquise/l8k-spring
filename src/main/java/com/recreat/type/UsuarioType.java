/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.type;

import com.recreat.util.Collections;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jaquise
 */

@Document(collection = Collections.TB_USUARIO)
public class UsuarioType extends PadreType{
    
    @Id
    private String usuarioId;
    //Atributos
    private String nombre;
    private String correo;
    private String usuario;
    private String contrasenha;
    private Date fechaNacimiento;
    private String pais;
    private Character estado;
    
    public UsuarioType(){
        
    }
    public UsuarioType(String usuarioId){
        this.usuarioId = usuarioId;
    }
    
    @Override
    public UsuarioType clone() {
        UsuarioType clone = (UsuarioType) super.clone();
        return clone;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
