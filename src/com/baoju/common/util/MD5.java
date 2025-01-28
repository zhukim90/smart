package com.baoju.common.util;
import java.security.*;

/**
 * 字符加密
 */
public class MD5 {
	/**
	 * 加密
	 * @param inStr
	 * @return
	 */
	public static String encode(String inStr){
		if(inStr==null){
			return null ;
		}
		MessageDigest md5 = null;
		try{
	       md5 = MessageDigest.getInstance("MD5");
	    }catch (Exception e){
	       System.out.println(e.toString());
	       e.printStackTrace();
	     }
	    char[] charArray = inStr.toCharArray();
	    byte[] byteArray = new byte[charArray.length];
	    for (int i=0; i<charArray.length; i++)
	       byteArray[i] = (byte) charArray[i];
	    byte[] md5Bytes = md5.digest(byteArray);
	    StringBuffer hexValue = new StringBuffer();
	    for (int i=0; i<md5Bytes.length; i++){
	       int val = ((int) md5Bytes[i] ) & 0xff; 
	       if (val < 16) hexValue.append("0");
	       hexValue.append(Integer.toHexString(val));
	    }
	    return hexValue.toString();
	}
	
	public static void main(String[] args) {
		MD5 en=new MD5();
		System.out.println(en.encode("admin"));
	}
	 
	
}
