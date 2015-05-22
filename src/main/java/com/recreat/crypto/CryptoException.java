/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.crypto;



/**
 * @Archivo CryptoException.java
 * @Fecha                @Autor   @Cambios
 * 01/10/2010 10:03:57 AM    mbocanegra
 */
public class CryptoException extends BaseException {

    public CryptoException(String message, Exception exception) {
        super(message, exception);
    }

    public CryptoException(String message, String params[], Exception exception) {
        super(message, params, exception);
    }

    public CryptoException(String message, String params[]) {
        super(message, params);
    }

    public CryptoException(Exception exception) {
        super(exception);
    }

    public CryptoException(Class source, String propertiesFileName, Throwable cause) {
        super(source, propertiesFileName, cause);
    }

    public CryptoException(String message) {
        super(message);
    }
}
