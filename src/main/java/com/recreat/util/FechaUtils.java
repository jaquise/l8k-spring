package com.recreat.util;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import com.recreat.dto.RangoFechasDTO;

/**
 * @Autor jhuancapaza
 */
public class FechaUtils {

    //Conversiones
    public static String convertirDateToStringLong(Date datoDate) {

        Format formatter = new SimpleDateFormat(Constante.FORMATOFECHA_LONG);
        String fechaejecucion = formatter.format(datoDate);

        return fechaejecucion;

    }
    public static String convertirDateToString(Date datoDate) {

        Format formatter = new SimpleDateFormat(Constante.FORMATOFECHA);
        String fechaejecucion = formatter.format(datoDate);

        return fechaejecucion;
    }
    public static String convertirDateToString(Date datoDate, String formato) {

        Format formatter = new SimpleDateFormat(formato);
        String fechaejecucion = formatter.format(datoDate);

        return fechaejecucion;
    }
    public static Date convertirStringToDateLong(String datoString) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(Constante.FORMATOFECHA_LONG);
        Date fecha = null;
        try {
            fecha = formatoDelTexto.parse(datoString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fecha;
    }
    public static Date convertirStringToDate(String datoString) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(Constante.FORMATOFECHA);
        Date fecha = null;

        try {
            fecha = formatoDelTexto.parse(datoString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return fecha;
    }
    public static Date convertirStringToDate(String datoString, String formato) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formato);
        Date fecha = null;

        try {
            fecha = formatoDelTexto.parse(datoString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return fecha;
    }
    public static String convertirDateToTime(Date datoDate) {
        // Date t = convertirStringToDateLong(datoDate);
        String fechaejecucion = "";
        Format formatter = new SimpleDateFormat(Constante.FORMATOHORA);
        try {
            fechaejecucion = formatter.format(datoDate);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return fechaejecucion;

    }
    public static String cambiarFormatoFecha(String fecha, String formato, String nuevoFormato) {
        if (fecha != null && !fecha.isEmpty() && formato != null && !formato.isEmpty() && nuevoFormato != null && !nuevoFormato.isEmpty()) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                Date date = sdf.parse(fecha);
                sdf = new SimpleDateFormat(nuevoFormato);
                return sdf.format(date);
            } catch (Exception ex) {
                return null;
            }
        } else {
            return null;
        }
    }
    public static Date cambiarFormatoFecha(Date date, String formato, String nuevoFormato) {
        if (date != null && formato != null && !formato.isEmpty() && nuevoFormato != null && !nuevoFormato.isEmpty()) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String fecha = sdf.format(date);
                sdf = new SimpleDateFormat(nuevoFormato);
                return sdf.parse(fecha);
            } catch (Exception ex) {
                return null;
            }
        } else {
            return null;
        }
    }
    public static Date aDate(String strFecha, String formato) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formato);
        Date fecha = null;

        try {
            fecha = formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return fecha;

    }    
    //Calculo
    public static RangoFechasDTO inicializarFechasMes() {
        Calendar fInicio = Calendar.getInstance();
        fInicio.set(Calendar.MONTH, fInicio.get(Calendar.MONTH) - 1);
        fInicio.set(Calendar.HOUR_OF_DAY, 00);
        fInicio.set(Calendar.MINUTE, 00);
        fInicio.set(Calendar.SECOND, 00);
        fInicio.set(Calendar.MILLISECOND, 000);

        Calendar fFin = Calendar.getInstance();
        fFin.set(Calendar.HOUR_OF_DAY, fFin.getActualMaximum(Calendar.HOUR_OF_DAY));
        fFin.set(Calendar.MINUTE, fFin.getActualMaximum(Calendar.MINUTE));
        fFin.set(Calendar.SECOND, fFin.getActualMaximum(Calendar.SECOND));
        fFin.set(Calendar.MILLISECOND, fFin.getActualMaximum(Calendar.MILLISECOND));

        RangoFechasDTO rangoFechas = new RangoFechasDTO();
        rangoFechas.setDateInicio(fInicio.getTime());
        rangoFechas.setFechaInicio(convertirDateToStringLong(fInicio.getTime()));
        rangoFechas.setDateFin(fFin.getTime());
        rangoFechas.setFechaFin(convertirDateToStringLong(fFin.getTime()));
        return rangoFechas;
    }
    public static RangoFechasDTO inicializarQuincena() {
        Calendar fInicio = Calendar.getInstance();
        fInicio.set(Calendar.DATE, fInicio.get(Calendar.DATE) - 15);
        fInicio.set(Calendar.HOUR_OF_DAY, 00);
        fInicio.set(Calendar.MINUTE, 00);
        fInicio.set(Calendar.SECOND, 00);
        fInicio.set(Calendar.MILLISECOND, 000);

        Calendar fFin = Calendar.getInstance();
        fFin.set(Calendar.HOUR_OF_DAY, fFin.getActualMaximum(Calendar.HOUR_OF_DAY));
        fFin.set(Calendar.MINUTE, fFin.getActualMaximum(Calendar.MINUTE));
        fFin.set(Calendar.SECOND, fFin.getActualMaximum(Calendar.SECOND));
        fFin.set(Calendar.MILLISECOND, fFin.getActualMaximum(Calendar.MILLISECOND));

        RangoFechasDTO rangoFechas = new RangoFechasDTO();
        rangoFechas.setDateInicio(fInicio.getTime());
        rangoFechas.setFechaInicio(convertirDateToStringLong(fInicio.getTime()));
        rangoFechas.setDateFin(fFin.getTime());
        rangoFechas.setFechaFin(convertirDateToStringLong(fFin.getTime()));
        return rangoFechas;
    }
    public static RangoFechasDTO inicializarDia(){
        Calendar fInicio = Calendar.getInstance();
        fInicio.set(Calendar.HOUR_OF_DAY, 00);
        fInicio.set(Calendar.MINUTE, 00);
        fInicio.set(Calendar.SECOND, 00);
        fInicio.set(Calendar.MILLISECOND, 000);

        Calendar fFin = Calendar.getInstance();
        fFin.set(Calendar.HOUR_OF_DAY, fFin.getActualMaximum(Calendar.HOUR_OF_DAY));
        fFin.set(Calendar.MINUTE, fFin.getActualMaximum(Calendar.MINUTE));
        fFin.set(Calendar.SECOND, fFin.getActualMaximum(Calendar.SECOND));
        fFin.set(Calendar.MILLISECOND, fFin.getActualMaximum(Calendar.MILLISECOND));

        RangoFechasDTO rangoFechas = new RangoFechasDTO();
        rangoFechas.setDateInicio(fInicio.getTime());
        rangoFechas.setFechaInicio(convertirDateToStringLong(fInicio.getTime()));
        rangoFechas.setDateFin(fFin.getTime());
        rangoFechas.setFechaFin(convertirDateToStringLong(fFin.getTime()));
        return rangoFechas; 
    }
    public static boolean entreRangoFecha(Date dato, Date fechaInicial, Date fechaFinal) {
        boolean rango;
        if ((dato.equals(fechaInicial) || dato.after(fechaInicial)) && (dato.equals(fechaFinal) || dato.before(fechaFinal))) {
            rango = true;
        } else {
            rango = false;
        }
        return rango;
    }
    public static int obtenerDiferencia(Date fechaInicial, Date fechaFinal, char tiempo) {

        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        //Convertir Inicio
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        //Convertir Fin
        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        //Calculo
        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;


        switch (tiempo) {
            case 'd'://días
                return (int) Math.floor(diferencia / (1000 * 60 * 60 * 24));
            case 'h'://horas
                return (int) Math.floor(diferencia / (1000 * 60 * 60));
            case 'm'://minutos
                return (int) Math.floor(diferencia / (1000 * 60));
            case 's'://segundos
                return (int) Math.floor(diferencia / 1000);
            default:
                return (int) Math.floor(diferencia);
        }
    }
    public static long obtenerDiferencia(String fechaInicio, String fechaFin, String formato, char tiempo) {
        Date dateInicio = aDate(fechaInicio, formato);
        Date dateFin = aDate(fechaFin, formato);
        if (fechaInicio != null && !fechaInicio.isEmpty() && fechaFin != null && !fechaFin.isEmpty()) {

            long milisegundos = dateFin.getTime() - dateInicio.getTime();

            switch (tiempo) {
                case 'd':
                    return (int) Math.floor(milisegundos / (1000 * 60 * 60 * 24));
                case 'h':
                    return (int) Math.floor(milisegundos / (1000 * 60 * 60));
                case 'm':
                    return (int) Math.floor(milisegundos / (1000 * 60));
                case 's':
                    return (int) Math.floor(milisegundos / 1000);
                default:
                    return (int) Math.floor(milisegundos);
            }
        } else {
            return 0;
        }
    }
    public static String getNombreDia(Date fecha) {
        SimpleDateFormat f = new SimpleDateFormat("EEEE", new Locale("ES"));
        String nombreDia = f.format(fecha.getTime());
        return nombreDia;
    }
    public static String getNombreDiaLong(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        SimpleDateFormat f = new SimpleDateFormat("EEEE", new Locale("ES"));

        String nombreDia = f.format(fecha.getTime());
        return nombreDia + " " + cal.get(Calendar.DAY_OF_MONTH);
    }
    public static Date sumaDias(Date fecha, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_YEAR, dias);
        return cal.getTime();
    }
    public static Date restaDias(Date fecha, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_YEAR, (dias * -1));
        return cal.getTime();
    }
    public static Date sumaMinutos(Date fecha, int minutos) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.MINUTE, minutos);
        return cal.getTime();
    }
    public static String formatearTiempo(long valor, char formatoValor, int salida) {
        String resultado;
        long milisegundos;
        long segundos;
        long minutos;
        long horas;
        long dias;


        switch (formatoValor) {
            //Valor es en segundos
            case 's':
                segundos = valor;
                minutos = segundos / 60;
                horas = minutos / 60;
                //Calcular
                dias = horas / 24;
                horas = horas % 24;
                minutos = minutos % 60;
                segundos = segundos % 60;
                break;

            //Valor es en minutos
            case 'm':
                minutos = valor;
                horas = minutos / 60;
                //Calcular
                dias = horas / 24;
                horas = horas % 60;
                minutos = minutos % 60;
                segundos = 0;
                break;

            //Valor es en milisegundos
            default://ms
                milisegundos = valor;
                segundos = milisegundos / 1000;
                minutos = segundos / 60;
                horas = minutos / 60;

                //Calcular
                dias = horas / 24;
                horas = horas % 60;
                minutos = minutos % 60;
                segundos = segundos % 60;

        }
        //Tipos de Salida
        if (salida == 1) {
            resultado = dias + "," + horas + ":" + minutos + ":" + segundos;
        } else if (salida == 2) {
            resultado = horas + " horas, " + minutos + " minutos, " + segundos + " segundos";
        } else//Salida 0
        {
            resultado = horas + ":" + minutos + ":" + segundos;
        }

        return resultado;
    }
    public static String formateaFecha(String vFecha, Integer tipo) {
        String vDia, vMes, vAno, fecha = "";
        if (tipo == 1) {
            StringTokenizer tokens = new StringTokenizer(vFecha, "/");
            vAno = tokens.nextToken();
            vMes = tokens.nextToken();
            vDia = tokens.nextToken();
            fecha = vAno + "-" + vMes + "-" + vDia;
        } else if (tipo == 2) {
            String limit = "";
            limit = (vFecha.contains("-")) ? "-" : limit;
            limit = (vFecha.contains("/")) ? "/" : limit;

            if (!limit.equals("")) {
                String vFechaDate, vFechaTime;
                StringTokenizer tokenFecha = new StringTokenizer(vFecha, " ");
                vFechaDate = tokenFecha.nextToken();
                vFechaTime = tokenFecha.nextToken();
                StringTokenizer tokenDate = new StringTokenizer(vFechaDate, limit);
                vAno = tokenDate.nextToken();
                vMes = tokenDate.nextToken();
                vDia = tokenDate.nextToken();
                fecha = vDia + limit + vMes + limit + vAno + " " + vFechaTime;
            }
        }
        return fecha;
    }
    public static boolean diferenciaFechasDosMeses(String inicio, String fin) {
        int firstDay = Integer.parseInt(inicio.substring(8, 10));
        int lastDay = Integer.parseInt(fin.substring(8, 10));
        int firstMonth = Integer.parseInt(inicio.substring(5, 7));
        int lastMonth = Integer.parseInt(fin.substring(5, 7));
        int firstYear = Integer.parseInt(inicio.substring(0, 4));
        int lastYear = Integer.parseInt(fin.substring(0, 4));

        final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día

        int año0 = lastYear;
        int mes0 = lastMonth;
        int dia0 = lastDay; //Fecha anterior
        Calendar calendar0 = new GregorianCalendar(año0, mes0 - 1, dia0);
        java.sql.Date hoy = new java.sql.Date(calendar0.getTimeInMillis()); 
        int año = firstYear;
        int mes = firstMonth;
        int dia = firstDay; //Fecha anterior
        Calendar calendar = new GregorianCalendar(año, mes - 1, dia);
        java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis());
        long diferencia = (hoy.getTime() - fecha.getTime()) / MILLSECS_PER_DAY;

        if (diferencia <= 65 && diferencia >= 0) {
            return true;
        } else {
            return false;
        }
    }
    //Prueba
    public static void main(String[] args) {
  /*      //INFO: dateDesde:Fri May 17 19:09:55 COT 2013
        //INFO: dateHasta:Thu May 16 19:10:23 COT 2013
        Date date = convertirStringToDateLong("2013-05-25 10:01:00");
        //Date date= convertirStringToDate("2013-05-25 11:00:00");
        Date dateInicio = convertirStringToDateLong("2013-05-25 10:00:00");
        Date dateFin = convertirStringToDateLong("2013-05-25 13:00:00");
        //String dateFin2= convertirDateToString(new Date(),"MM de yyyy");
        System.out.println("rango:" + entreRangoFecha(date, dateInicio, dateFin));
        System.out.println("antes:" + date.before(dateFin));
        System.out.println("despues:" + date.after(dateInicio));
        //System.out.println("antes:"+dateFin.before(date));
        //System.out.println("despues:"+dateInicio.after(date));
        Date date1 = convertirStringToDateLong("2013-06-03 12:00:00");//may
        Date date2 = convertirStringToDateLong("2013-06-01 10:10:00");//men
        Integer x = obtenerDiferencia(date2, date1, 'x');
        System.out.println("x :" + x);
        String z = formatearTiempo(x, 'm', 0);
        System.out.println("Z :" + z);
        Integer zz = obtenerDiferencia(date1, date2, 'd');
        System.out.println("zz :" + zz);
        Integer xx = obtenerDiferencia(date1, date2, 'h');
        System.out.println("xx :" + xx);
        Integer yy = obtenerDiferencia(date1, date2, 'm');
        System.out.println("yy :" + yy);
        // String sx = convertirDateToTime("2013-06-01 10:10:00");
        //    System.out.println("SX : " + sx);
        Integer xsc = Integer.parseInt("70475");

        // Double xsc = 3000.0000;
        String zs = formatearTiempo(xsc, 'm', 1);
        System.out.println("ZS :" + zs);
        RangoFechasDTO s = FechaUtils.inicializarFechasMes();
        System.out.println("S :" + s.getFechaInicio() + "//" + s.getFechaFin());
        System.out.println("*-/" + convertirStringToDate(s.getFechaFin()));
        RangoFechasDTO sd = FechaUtils.inicializarQuincena();
        System.out.println("SD :" + sd.getFechaInicio() + "//" + sd.getFechaFin());
        System.out.println("xxxxx _" + sd.getDateInicio());
        
        boolean dif = diferenciaFechasDosMeses("2013-09-14","2013-12-12");
        System.out.println(""+dif);
        Date datex = new Date();
        System.out.println("DateX :" + convertirDateToString(datex,"yyyy-MM-dd"));   */
        boolean dif = diferenciaFechasDosMeses("2013-09-14","2013-12-12");
        System.out.println(""+dif);
        RangoFechasDTO sd = FechaUtils.inicializarQuincena();
        long s = obtenerDiferencia(sd.getDateInicio(), sd.getDateFin(), 'd');
        System.out.println("s "+s);
        RangoFechasDTO dia = FechaUtils.inicializarDia();
        System.out.println("DiI :" +dia.getDateInicio());
        System.out.println("DiF :" +dia.getDateFin());
    }
    
}
