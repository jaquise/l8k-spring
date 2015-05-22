/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.type;

import java.io.Serializable;

/**
 *
 * @author jaquise
 */
public class PadreType implements Serializable, Cloneable{
    private static final Long serialVersionUID = 1L;

    public PadreType(){

    }

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            // No deberia ocurrir
        }
        return clone;
    }
}