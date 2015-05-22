/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.crypto;

import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;

/**
 * @Archivo Base64Coder.java
 * @Fecha                    @Autor   @Cambios
 * 01/10/2010 10:57:54 AM    mbocanegra
 */
public class Base64Coder extends AbstractPreferences  {

    private String store;
    private static Base64Coder instance = new Base64Coder();

    /**Hide the constructor; this is a singleton. */
    private Base64Coder() {
        super(null, "");
    }

    /**Given a byte array, return its Base64 representation as a String. */
    public static synchronized String encode(byte[] b) {
        instance.putByteArray(null, b);
        return instance.get(null, null);
    }

    /**Given a String containing a Base64 representation, return the corresponding byte array. */
    public static synchronized byte[] decode(String base64String) {
        instance.put(null, base64String);
        return instance.getByteArray(null, null);
    }

    @Override
    public String get(String key, String def) {
        return store;
    }

    @Override
    public void put(String key, String value) {
        store = value;
    }

    //Other methods required to implement the abstract class;  these methods are not used.
    protected AbstractPreferences childSpi(String name) {
        return null;
    }

    protected void putSpi(String key, String value) {
    }

    protected String getSpi(String key) {
        return null;
    }

    protected void removeSpi(String key) {
    }

    protected String[] keysSpi() throws BackingStoreException {
        return null;
    }

    protected String[] childrenNamesSpi() throws BackingStoreException {
        return null;
    }

    protected void syncSpi() throws BackingStoreException {
    }

    protected void removeNodeSpi() throws BackingStoreException {
    }

    protected void flushSpi() throws BackingStoreException {
    }

//    /** Just used for simple unit testing. Remove as desired.*/
//    public static void main(String[] args) throws Exception {
//        String s = "qwertyu";
//        System.out.println("Start:" + s);
//        String es = Base64Coder.encode(s.getBytes("UTF8"));
//        System.out.println("Encoded:" + es);
//        System.out.println("Decoded:" + new String(Base64Coder.decode(es)));
//
//    }
}
