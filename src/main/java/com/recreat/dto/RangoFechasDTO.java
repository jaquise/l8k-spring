
package com.recreat.dto;

import com.recreat.type.PadreType;
import com.recreat.util.Constante;
import com.recreat.util.FechaUtils;
import java.util.Date;

public class RangoFechasDTO extends PadreType{

    protected String fechaInicio;
    protected String fechaFin;
    protected String horaInicio;
    protected String horaFin;
    protected String fechaHoraInicio;
    protected String fechaHoraFin;
    protected Date dateInicio;
    protected Date dateFin;

    @Override
    public RangoFechasDTO clone(){
        RangoFechasDTO clone = (RangoFechasDTO) super.clone();
        return clone;
    }

    public String getFechaInicioBDToString(){
        if(dateInicio!=null){
            return FechaUtils.convertirDateToString(dateInicio, Constante.FORMATOFECHABD);
        }
        return "";
    }
    public String getFechaFinBDToString(){
        if(dateFin!=null){
            return FechaUtils.convertirDateToString(dateFin, Constante.FORMATOFECHABD);
        }
        return "";
    }
    public String getFechaInicioLongBDToString(){
        if(dateInicio!=null){
            return FechaUtils.convertirDateToString(dateInicio, Constante.FORMATOFECHABD_LONG);
        }
        return "";
    }
    public String getFechaFinLongBDToString(){
        if(dateFin!=null){
            return FechaUtils.convertirDateToString(dateFin, Constante.FORMATOFECHABD_LONG);
        }
        return "";
    }
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(String fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public String getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(String fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Date getDateInicio() {
        return dateInicio;
    }

    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
        this.fechaInicio = FechaUtils.convertirDateToString(dateInicio, Constante.FORMATOFECHABD);
        this.horaInicio = FechaUtils.convertirDateToString(dateInicio, Constante.FORMATOHORA);
        this.fechaHoraInicio = FechaUtils.convertirDateToString(dateInicio, Constante.FORMATOFECHABD_LONG);
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
        this.fechaFin = FechaUtils.convertirDateToString(dateFin, Constante.FORMATOFECHABD);
        this.horaFin = FechaUtils.convertirDateToString(dateFin, Constante.FORMATOHORA);
        this.fechaHoraFin = FechaUtils.convertirDateToString(dateFin, Constante.FORMATOFECHABD_LONG);
        
    }

    @Override
    public String toString() {
        return "RangoFechasType{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

    
}
