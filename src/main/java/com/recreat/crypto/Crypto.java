// Decompiled by DJ v3.7.7.81 Copyright 2004 Atanas Neshkov  Date: 26/01/2007 10:49:35
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3)
// Source File Name:   Crypto.java
package com.recreat.crypto;

import com.sun.crypto.provider.SunJCE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import org.apache.log4j.Logger;

/**
 * @Archivo Crypto.java
 * @Fecha                @Autor   @Cambios
 * 01/10/2010 09:59:13 AM    mbocanegra
 */
public class Crypto {

    private static Logger logger = Logger.getLogger(Crypto.class);
    private static Key key;
    private static Crypto instance;

    private Crypto() throws CryptoException {
        try {
            Security.insertProviderAt(new SunJCE(), 1);
            String rutaArchivo = "WebSecretKey.ser";
            File file = new File(rutaArchivo);
            System.out.println("create absolute PATH: " + file.getAbsolutePath());
            if (!file.exists()) {
                KeyGenerator generator = KeyGenerator.getInstance("DES");
                generator.init(new SecureRandom());
                key = generator.generateKey();
                logger.debug("create absolute PATH: " + file.getAbsolutePath());
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
                out.writeObject(key);
                out.close();
            }
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaArchivo));
            logger.debug("absolute PATH: " + file.getAbsolutePath());
            key = (Key) in.readObject();
            in.close();
        } catch (Exception e) {            
            throw new CryptoException(e.getMessage(), e);
        }
    }

    public static synchronized Crypto getInstance() throws CryptoException {
        if (instance == null) {
            instance = new Crypto();
        }
        return instance;
    }

    public String doEncrypt(String amalgam) throws CryptoException {
        String base64;

        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(1, key);
            byte stringBytes[] = amalgam.getBytes("UTF8");
            byte raw[] = cipher.doFinal(stringBytes);

            base64 = Base64Coder.encode(raw);
//            BASE64Encoder encoder = new BASE64Encoder();
//            base64 = encoder.encode(raw);
        } catch (Exception ex) {
            throw new CryptoException(ex.getMessage(), ex);
        }
        //System.out.println("entra a crypto:  " + base64);
        return base64;
    }

    public String doDecrypt(String text) throws CryptoException {
        String result;

        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(2, key);
//            BASE64Decoder decoder = new BASE64Decoder();
//            byte raw[] = decoder.decodeBuffer(text);
            byte raw[] = Base64Coder.decode(text);
            byte stringBytes[] = cipher.doFinal(raw);
            result = new String(stringBytes, "UTF8");
        } catch (Exception ex) {
            throw new CryptoException(ex.getMessage(), ex);
        }

        return result;
    }

    public String encriptByMD5(String argument) {
        byte result[] = (byte[]) null;

        try {
            MessageDigest mg = MessageDigest.getInstance("MD5");
            mg.update(argument.getBytes());
            result = mg.digest();
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage(), e);
        }
        return result.toString();
    }

//    public static void main(String arg[]) {
//        try {
//            Crypto cripto = getInstance();
//            System.out.println(cripto.doDecrypt("cc8NDVBeOOU="));
//            //System.out.println(cripto.doEncrypt("admin"));
//        } // try
//        catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        } // try-catch
//    }
}
