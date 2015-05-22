/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.dto;

import org.springframework.data.annotation.Id;
import com.recreat.type.PadreType;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jaquise
 */
@Document
public class TablaDTO extends PadreType {
    
    @Id
    protected String codigo;
    protected String descripcion;
    
    @Override
    public TablaDTO clone() {
        TablaDTO clone = (TablaDTO) super.clone();
        return clone;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
