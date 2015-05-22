package com.recreat.util;

/**
 * @Autor jaquise
 */
public interface Constante {
    //Operaciones
    public static  final String EXCEPCION = "Ex";
    public static  final String EXCEPCION_MENSAJE = "EXC.001";
    public static  final String TRANSACCION       = "Tx";    
    public static  final String INSERT_EXITO      = "001";
    public static  final String INSERT_SINEXITO   = "002";
    public static  final String UPDATE_EXITO      = "003";
    public static  final String UPDATE_SINEXITO   = "004";
    public static  final String DELETE_EXITO      = "005";
    public static  final String DELETE_SINEXITO   = "006";        
    public static  final int  OPERACION_EXITOSA  = 1;
    public static  final int  OPERACION_SINEXITO = 0;      
    public static  final String ERROR   = "Error";        
    public static  final String EXITO   = "Información";        
    public static  final String ADVERTENCIA   = "Advertencia";        
    
    //Navegacion
    public static final String NAVIGATION_NUEVO   = "nuevo";
    public static final String NAVIGATION_EDITAR   = "editar";
    public static final String NAVIGATION_EXITO   = "exito";
    public static final String NAVIGATION_ERROR   = "error";
    public static final String NAVIGATION_CANCEL   = "cancelar";
    public static final String NAVIGATION_DETALLE   = "detalle";
    public static final String NAVIGATION_CONTROL   = "control";

    //Urls
    public static final String URL_IMAGES   = "/images/";
    
    //Estados
    public static final Character ESTADO_ACTIVO    	= 'A';
    public static final String ESTADO_ACTIVO_DESC   = "ACTIVO";
    public static final Character ESTADO_ABIERTO   	= 'A';
    public static final String ESTADO_ABIERTO_DESC  = "ABIERTO";
    public static final Character ESTADO_INACTIVO  	= 'I';
    public static final String ESTADO_INACTIVO_DESC = "INACTIVO";
    public static final Character ESTADO_NUEVO     	= 'N';
    public static final String ESTADO_NUEVO_DESC    = "NUEVO";
    public static final Character ESTADO_MATRICULADO     	= 'M';
    public static final String ESTADO_MATRICULADO_DESC = "MATRICULADO";
    public static final Character ESTADO_INSTALADO     	= 'Y';
    public static final String ESTADO_INSTALADO_DESC = "INSTALADO";
    public static final Character ESTADO_MANTENIMIENTO      = 'R';
    public static final String ESTADO_MANTENIMIENTO_DESC = "MANTENIMIENTO";   
    public static final Character ESTADO_MODIFICADO      = 'M';
    public static final String ESTADO_MODIFICADO_DESC = "MODIFICADO";   
    public static final Character ESTADO_CERRADO   	= 'C';
    public static final String ESTADO_CERRADO_DESC  = "CERRADO";
    public static final Character ESTADO_RETRASADO 	= 'R';
    public static final String ESTADO_RETRASADO_DESC= "RETRASADO";
    public static final Character ESTADO_PENDIENTE 	= 'P';
    public static final String ESTADO_PENDIENTE_DESC= "PENDIENTE";
    public static final Character ESTADO_REALIZADO 	= 'R';
    public static final String ESTADO_REALIZADO_DESC= "REALIZADO";
    public static final Character ESTADO_VISITADO ='V';
    public static final String ESTADO_VISITADO_DESC ="VISITADO";
    public static final Character ESTADO_NO_VISITADO ='N';
    public static final String ESTADO_NO_VISITADO_DESC ="NO VISITADO";
    public static final Character ESTADO_BLOQUEADO 	= 'B';
    public static final String ESTADO_BLOQUEADO_DESC= "BLOQUEADO";
    public static final Character ESTADO_ACTUALIZADO 	= 'A';
    public static final String ESTADO_ACTUALIZADO_DESC= "ACTUALIZADO";
    public static final Character ESTADO_NOACTUALIZADO 	= 'N';
    public static final String ESTADO_NOACTUALIZADO_DESC= "NOACTUALIZADO";
    public static final Character ESTADO_EJECUTANDOSE 	= 'E';
    public static final String ESTADO_EJECUTANDOSE_DESC= "EJECUTANDOSE";    
    public static final Character ESTADO_NOEJECUTADO 	= 'N';
    public static final String ESTADO_NOEJECUTADO_DESC= "NO EJECUTADO";
    public static final Character ESTADO_VISITADO_TARDE 	= 'T';
    public static final String ESTADO_VISITADO_TARDE_DESC= "VISITADO TARDE";
    public static final Character ESTADO_NOVISITADO 	= 'N';
    public static final String ESTADO_NOVISITADO_DESC= "NO VISITADO";
    public static final Character ESTADO_VISITADO_DESORDEN 	= 'D';
    public static final String ESTADO_VISITADO_DESORDEN_DESC= "VISITADO DESORDEN";
    public static final Character ESTADO_ENCAMINO 	= 'C';
    public static final String ESTADO_ENCAMINO_DESC= "EN CAMINO";
    public static final Character ESTADO_LIBRE 	= 'L';
    public static final String ESTADO_LIBRE_DESC= "LIBRE";
    public static final Character ESTADO_ASIGNADO 	= 'A';
    public static final String ESTADO_ASIGNADO_DESC= "ASIGNADO";
    public static final Character ESTADO_TURNO 	= 'T';
    public static final String ESTADO_TURNO_DESC= "TURNO";
    public static final Character ESTADO_NOTIFICADO = 'N';
    public static final String ESTADO_NOTIFICADO_DESC= "NOTIFICADO";
    public static final Character ESTADO_ENSITIO = 'S';
    public static final String ESTADO_ENSITIO_DESC= "EN SITIO";
    public static final Character ESTADO_ACEPTADO = 'A';
    public static final String ESTADO_ACEPTADO_DESC= "ACEPTADO";
    
    public static final String ESTADO_LOCALIZACION_LOCALIZADO_DESC = "LOCALIZADO";
    public static final Character ESTADO_LOCALIZACION_LOCALIZADO = 'L';
    public static final String ESTADO_LOCALIZACION_FINALIZADO_DESC = "FINALIZADO";
    public static final Character ESTADO_LOCALIZACION_FINALIZADO = 'F';
    
    public static final Character ESTADO_REVISION_INTERNA = 'I';
    public static final String ESTADO_REVISION_INTERNA_DESC = "REVISIÓN INTERNA";
    public static final Character ESTADO_CONTACTO_CLIENTE = 'C';
    public static final String ESTADO_CONTACTO_CLIENTE_DESC = "CONTACTO CLIENTE";
    public static final Character ESTADO_REVISION_FINAL = 'F';
    public static final String ESTADO_REVISION_FINAL_DESC = "REVISIÓN FINAL";

    public static final Character RUTA_ACTIVO      = 'A';
    public static final Character RUTA_RETRASADO   = 'R';
    
    public static final Character PUNCON_FLEXIBLE    = 'F';
    public static final String PUNCON_FLEXIBLE_DESC = "FLEXIBLE";
    public static final Character PUNCON_NOFLEXIBLE  = 'N';
    public static final String PUNCON_NOFLEXIBLE_DESC  = "NO FLEXIBLE";

    //Prioridades
    public static final String PRIORIDAD_ALTA    	= "A";
    public static final String PRIORIDAD_ALTA_DESC   = "ALTA";
    public static final String PRIORIDAD_NORMAL    	= "N";
    public static final String PRIORIDAD_NORMAL_DESC   = "NORMAL";
    public static final String PRIORIDAD_BAJA    	= "B";
    public static final String PRIORIDAD_BAJA_DESC   = "BAJA";
    
    //Opciones Divisiones
    public static final Character DIVISION_COMPANIA   = 'C';
    public static final String DIVISION_COMPANIA_DESC   = "COMPANIA";
    public static final Character DIVISION_FLOTA      = 'F';
    public static final String DIVISION_FLOTA_DESC      = "FLOTA";
    public static final Character DIVISION_VEHICULO   = 'V';
    public static final String DIVISION_VEHICULO_DESC   = "VEHICULO";
    
    public static final Character CONTACTO_MATENIMIENTO   = 'M';
    public static final String CONTACTO_MATENIMIENTO_DESC   = "MANTENIMIENTO";
    public static final Character CONTACTO_EMERGENCIA   = 'E';
    public static final String CONTACTO_EMERGENCIA_DESC   = "EMERGENCIA";
    
    public static final int DEFECTO_SI   = 1;
    public static final String DEFECTO_SI_DESC   = "SI";
    public static final int DEFECTO_NO   = 0;
    public static final String DEFECTO_NO_DESC   = "NO";
    
    public static final int MOSTRARMONITOREO   = 1;
    public static final int ENMONITOREO_SI   = 1;
    public static final String ENMONITOREO_SI_DESC   = "SI";
    public static final int ENMONITOREO_NO   = 0;
    public static final String ENMONITOREO_NO_DESC   = "NO";
    
    public static final int IGNITION_ACTIVO   = 1;
    public static final String IGNITION_ACTIVO_DESC   = "ACTIVO";
    public static final int IGNITION_INACTIVO   = 0;
    public static final String IGNITION_INACTIVO_DESC   = "INACTIVO";
    
    public static final int ESTADOLOCALIZACION_ACTIVO   = 1;
    public static final String ESTADOLOCALIZACION_ACTIVO_DESC   = "ACTIVO";
    public static final int ESTADOLOCALIZACION_INACTIVO   = 0;
    public static final String ESTADOLOCALIZACION_INACTIVO_DESC   = "INACTIVO";       
    
    //Eventos Complejos  
    public static final Character TIPOEVENTO_EVENTO   = 'E';
    public static final String TIPOEVENTO_EVENTO_DESC   = "EVENTO";
    public static final Character TIPOEVENTO_ALARMA   = 'A';
    public static final String TIPOEVENTO_ALARMA_DESC   = "ALARMA";

    public static final Character TIPOALARMA_UNICO   = 'U';
    public static final String TIPOALARMA_UNICO_DESC   = "UNICO";
    public static final Character TIPOALARMA_RECURRENTE   = 'R';
    public static final String TIPOALARMA_RECURRENTE_DESC   = "RECURRENTE";
    
    public static final Character IGNITION_PRENDIDO   = 'P';
    public static final String IGNITION_PRENDIDO_DESC   = "PRENDIDO";
    public static final Character IGNITION_APAGADO   = 'A';
    public static final String IGNITION_APAGADO_DESC   = "APAGADO";

    //Tipo Ruta Evento
    public static final String RUTAEVENTO_CAMINO   = "1";
    public static final String RUTAEVENTO_EFICIENCIA   = "2";
    public static final String RUTAEVENTO_PUNTOCONTROL   = "3";
    public static final String PUNTOCONTROLEVENTO_PUNTOVISITADO   = "1";
    public static final String PUNTOCONTROLEVENTO_VISITAATRASADO   = "2";
    public static final String PUNTOCONTROLEVENTO_PARADA   = "3";
    public static final String PUNTOCONTROLEVENTO_PUNTONOVISITADO   = "4";

    //Alarmas
    public static final String GENERAR_ALARMA   	= "A";
    public static final String GENERAR_ALARMA_DESC  = "ALARMA";
    public static final String GENERAR_EVENTO   	= "E";
    public static final String GENERAR_EVENTO_DESC  = "EVENTO";
    
    public static final String ALARMA_FALSA 	= "F";
    public static final String ALARMA_FALSA_DESC= "Falsa Alarma";
    public static final String ALARMA_REAL	= "A";
    public static final String ALARMA_REAL_DESC= "Alarma Real";
    public static final String ALARMA_OPERATIVO= "G";
    public static final String ALARMA_OPERATIVO_DESC= "Generar Operativo";
    
    //Recursos
    public static final String TIPODESPACHO_ENTREGA  = "E";
    public static final String TIPODESPACHO_ENTREGA_DESC  = "ENTREGA";
    public static final String TIPODESPACHO_RECOJO  = "R";
    public static final String TIPODESPACHO_RECOJO_DESC  = "RECOJO";

    public static final int TIPORECURSO_MERCADERIA  = 0;
    public static final String TIPORECURSO_MERCADERIA_DESC  = "MERCADERIA";
    public static final int TIPORECURSO_OTROS  = 1;
    public static final String TIPORECURSO_OTROS_DESC  = "OTROS";
    
    //Capa
    public static final Character TIPOCAPAOBJETO_PUNTO ='P';
    public static final Character TIPOCAPAOBJETO_CIRCULO = 'C';
    public static final Character TIPOCAPAOBJETO_POLIGONO = 'G';
    public static final Character TIPOCAPAOBJETO_RECTANGULO = 'R';
    public static final Character TIPOCAPAOBJETO_LINEA = 'L';
    
    public static final String TIPOPUNTOCONTROL_CONTROL = "C";
    public static final String TIPOPUNTOCONTROL_PARADA = "P";
    
    //Rporte Automatico
    public static final String TIPOREPORTE_UNICO = "U";
    public static final String TIPOREPORTE_DIARIO = "D";
    public static final String TIPOREPORTE_SEMANAL = "S";
    public static final String TIPOREPORTE_MENSUAL = "S";
    
    //TIPOS POSICION
    public static final int TIPOPOSICION_NORMAL = 1;
    public static final int TIPOPOSICION_PARADA = 2;
    public static final int TIPOPOSICION_EXCESO = 3;
    public static final int TIPOPOSICION_EVENTO = 4;
    public static final int TIPOPOSICION_ALARMA = 5;    
    public static final String TIPOPOSICION_NORMAL_DESC = "POSICION NORMAL";
    public static final String TIPOPOSICION_PARADA_DESC = "PARADA";
    public static final String TIPOPOSICION_EXCESO_DESC = "EXCESO DE VELOCIDAD";
    public static final String TIPOPOSICION_EVENTO_DESC = "EVENTO";
    public static final String TIPOPOSICION_ALARMA_DESC = "ALARMA";
    public static final String TIPOPOSICION_NINGUNO_DESC = "SIN POSICION";
    
    //FLOTA
    public static final String TIPOFLOTA_COMPARTIDO = "C";
    public static final String TIPOFLOTA_ORIGINAL = "O";
    
    //TIPO UNIDAD
    public static final Character TIPOUNIDAD_LITRO = 'L';
    public static final Character TIPOUNIDAD_GALON = 'G';
    public static final String TIPOUNIDAD_LITRO_DESC = "Litros";
    public static final String TIPOUNIDAD_GALON_DESC = "Galones";
       
    //Otros    
    public static final String FORMATOFECHA = "dd/MM/yyyy";
    public static final String FORMATOFECHABD = "yyyy-MM-dd";
    public static final String FORMATOFECHA_LONG = "dd/MM/yyyy HH:mm:ss";
    public static final String FORMATOFECHABD_LONG = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMATOHORA = "HH:mm:ss";
    
    public static final int DIA_DOMINGO = 0;
    public static final int DIA_LUNES = 1;    
    public static final int DIA_MARTES = 2;
    public static final int DIA_MIERCOLES = 3;
    public static final int DIA_JUEVES = 4;
    public static final int DIA_VIERNES = 5;
    public static final int DIA_SABADO = 6;
    
    public static final Character OPERACION_LECTURA = 'L';
    public static final String OPERACION_LECTURA_DESC = "Lectura";
    public static final Character OPERACION_ESCRITURA = 'E';
    public static final String OPERACION_ESCRITURA_DESC = "Escritura";
    public static final String OPERACION_LECTURAESCRITURA_DESC = "Lectura/Escritura";
    
    public static final String SMS = "SMS";
    public static final String IP = "IP";
    
    public static final String IGUAL = "=";
    public static final String IGUAL_DESC = "IGUAL";
    public static final String MAYOR = ">";
    public static final String MAYOR_DESC = "MAYOR";
    public static final String MENOR = "<";
    public static final String MENOR_DESC = "MENOR";
    public static final String MAYORIGUAL = ">=";
    public static final String MAYORIGUAL_DESC = "MAYORIGUAL";
    public static final String MENORIGUAL = "<=";    
    public static final String MENORIGUAL_DESC = "MENORIGUAL";
    
}
