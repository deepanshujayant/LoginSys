/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Deepanshu
 */
public class hashPass {
    public static String hashPass(String pass)throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());
        byte[] b = md.digest();
        StringBuffer sb = new StringBuffer();
        for(byte bl : b){
            sb.append(Integer.toHexString(bl & 0xff).toString());
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
