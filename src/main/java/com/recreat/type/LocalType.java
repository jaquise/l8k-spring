/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.type;

import com.recreat.util.Collections;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jaquise
 */
@Document(collection = Collections.TB_LOCAL)
public class LocalType extends PadreType{
    
    @Id
    private String localId;
    //Referencia TB_NEGOCIO
    private String negocioId;
    //Atributos
    private String nombre;
    private String direccion;
    private String horario;
    private String telefono;
    private String correo;
    private Double longitud;
    private Double latitud;
    private String descripcion;
    private String correoContacto;
    private String tipo;
    private List<String> fotos;
    
    public LocalType(){
        
    }    
    public LocalType(String localId){
        this.localId = localId;
    }
    
    @Override
    public LocalType clone() {
        LocalType clone = (LocalType) super.clone();
        return clone;
    }
    
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(String negocioId) {
        this.negocioId = negocioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }
    
    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
