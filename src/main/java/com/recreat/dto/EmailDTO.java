/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.dto;

import com.recreat.type.PadreType;
import java.util.List;

/**
 *
 * @author jaquise
 */
public class EmailDTO extends PadreType {
    
    protected String to;
    protected List<String> listTo;
    protected String cc;
    protected List<String> listCc;
    protected String subject;
    protected String text;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getListTo() {
        return listTo;
    }

    public void setListTo(List<String> listTo) {
        this.listTo = listTo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public List<String> getListCc() {
        return listCc;
    }

    public void setListCc(List<String> listCc) {
        this.listCc = listCc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
