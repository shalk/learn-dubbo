package com.xshalk.dubbo.spi.jdk;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @author shalk
 * @since 19-7-12
 */
public class Test {
    public static void main(String[] args) {
        String str = "315edfbdfrb5rgfhb1651656";
        String key = "com.sccin.cn";

        byte[] crypted = null;
        try {

            SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");

            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            crypted = cipher.doFinal(str.getBytes());
            System.out.println(new String(Base64.getEncoder().encode(crypted)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
