/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.type;

import com.recreat.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jaquise
 */
@Document(collection = Collections.TB_NEGOCIO)
public class NegocioType extends PadreType{
    
    @Id
    private String negocioId;
    //Referencia TB_USUARIO
    private String usuarioId;
    //Atributos
    private String nombre;
    private String descripcion;
    private String direccion;
    private String contacto;
    private String correo;
    private String logo;
    
    //Relaciones
    @Transient
    private List<LocalType> listLocal;
    
    
    @Override
    public NegocioType clone() {
        NegocioType clone = (NegocioType) super.clone();
        
        if(listLocal != null){
            List<LocalType> clonedList = new ArrayList<LocalType>(listLocal.size());
            for(LocalType type : listLocal){
                clonedList.add(type.clone());
            }
            clone.setListLocal(clonedList);
        }
        
        return clone;
    }

    public String getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(String negocioId) {
        this.negocioId = negocioId;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public List<LocalType> getListLocal() {
        return listLocal;
    }

    public void setListLocal(List<LocalType> listLocal) {
        this.listLocal = listLocal;
    }
    
}
