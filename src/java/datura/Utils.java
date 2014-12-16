/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import javax.sql.*;
import sun.misc.BASE64Encoder;

/**
 *
 * @author lfz
 */
public class Utils {

    public static int count;

    public static synchronized int getCount() {
        count++;
        return count;
    }

    public static synchronized DataSource getDataSourse() throws NamingException {
        Context initContext = new InitialContext();
        Context envContext = (Context) initContext.lookup("java:/comp/env");
        DataSource db = (DataSource) envContext.lookup("daturalink");
        return db;
    }
    /*
     * 加密运算  按MD5算法进行运算
     */
    public static String md5(String sourceStr) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes("utf-8"));
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public static String NewId() {
        return String.format("%s", java.util.UUID.randomUUID().toString().toUpperCase());
    }

    public static String EmptyUUID() {
        return "00000000-0000-0000-0000-000000000000";
    }

    public static boolean IsEqualForUUID(String uuid, String compareUUID) {
        if (uuid == null  ) {
            return compareUUID == null;
        }  
        return false;
    }
}
