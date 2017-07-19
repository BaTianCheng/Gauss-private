package com.esb.jinying.common;

public class PubUtils {
	   /**
	    * Name:    increaseGlideNo
	    * Desc:    把GlideNo的值加一
	    * Author:  Pian Zhaobin
	    * @param   strGlideNo  Sequence No
	    * @return  String
	   */
	   public static String increaseGlideNo(String strGlideNo) {
		   if (strGlideNo == null) {
	            return null;
	       }

	       char[] arrChar = strGlideNo.toCharArray();

	       for(int i = arrChar.length - 1; i >= 0; i--)
	           if ((arrChar[i] >= '0') && (arrChar[i] < '9')) {
	               arrChar[i]++;
	                break;
        }else if ((arrChar[i] >= 'A') && (arrChar[i] < 'Z')) {
	                arrChar[i]++;

	                break;
	       }else if ((arrChar[i] >= 'a') && (arrChar[i] < 'z')) {
	                arrChar[i]++;

	               break;
	       }else if ((arrChar[i] == '9') || (arrChar[i] == 'z') ||
	                    (arrChar[i] == 'Z')) {
	                arrChar[i] = '0';
	       }

	       return (new String(arrChar));
	   }
}
