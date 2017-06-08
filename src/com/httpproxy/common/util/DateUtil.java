/**
 * @(#)DateUtil.java	1.00 2001/03/26
 */

package com.httpproxy.common.util;

import java.util.*;
import java.sql.Timestamp;

/**
 * Title:        	DateUtil
 * Description:  	Utilities for Date Time
 * Copyright:    	Copyright (c) 2001
 * Company:         GE.Corp
 * @author: 	    Tim Wang Zhiyong																																													    raogaohua
 * @version:        1.00 2001/03/29
 * @modification:   2001/04/25 wangzhiyong
 *                  改变了一些策略，
 *                  1。当把其它类型的时间数据转换成字符串型时间格式时
 *                      如果传来的参数是null 或者 “”，则返回“”
 *                  2。当把其它类型的时间数据转换成Calendar,Timestamp
 *                      型时间格式时,如果传来的参数是null 或者 “”，
 *                      则返回null
 */
public class DateUtil
{
    //预定义的日期类型：日期，时间，日期+时间
    public final static int TYPE_YYYYMMDD = 0;
    public final static int TYPE_HHMMSS = 1;
    public final static int TYPE_YYYYMMDDHH24MMSS = 2;

    //日期类型的分割符号，
    //如果是SEPARATOR_CHINESE，则表示“XXXX年XX月XX日”的格式
    //如果是SEPARATOR_ENGLISH，则表示“Jan 1st, 2001”的格式
    public final static String SEPARATOR_SLASH  = "/";
    public final static String SEPARATOR_DOT  = ".";
    public final static String SEPARATOR_HYPHEN  = "-";
    public final static String SEPARATOR_CHINESE  = "CHN";
    public final static String SEPARATOR_ENGLISH  = "ENG";

    //时间的几个属性
    public final static int FIELD_YEAR = Calendar.YEAR;
    public final static int FIELD_MONTH = Calendar.MONTH;
    public final static int FIELD_DATE = Calendar.DATE;
    public final static int FIELD_HOUR_OF_DAY = Calendar.HOUR_OF_DAY;
    public final static int FIELD_MINUTE = Calendar.MINUTE;
    public final static int FIELD_SECOND = Calendar.SECOND;

    // 月份简称
    public final static String[] MONTH_ABBR = new String[]
    {
        "Jan",  "Feb",  "Mar",  "Apr",
        "May",  "June", "July", "Aug",
        "Sept", "Oct",  "Nov",  "Dec",
    };

    //日期简称
    public final static String[] DATE_ABBR = new String[]
    {
        "1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th",
        "11th","12th","13th","14th","15th","16th","17th","18th","19th","20th",
        "21st","22nd","23rd","24th","25th","26th","27th","28th","29th","30th",
        "31st",
    };

    //日简称
    String[] DAY_ABBR = new String[]
    {
        "Sun","Mon","Tue","Wed","Thu","Fri",
    };

    public DateUtil()
    {
    }


    /**
     * Name:    getStdDateTime
     * Desc:    得到标准的时间格式--YYYYMMDD 或者 HHMMSS 或者 YYMMDDHHMMSS
     * Author:  Wang Zhiyong
     * @param   calc  Calendar类型的日期
     * @param   nType 要求返回的时间类型
     *          nType = TYPE_YYYYMMDD       日期
     *                  TYPE_HHMMSS         时间
     *                  TYPE_YYYYMMDDHH24MMSS 日期+时间
     * @return  返回标准日期
     */
    public static String getStdDateTime(Calendar calc,int nType)
        throws Exception
    {
        //if (calc == null) throw new Exception("参数错误: calc 不能为null");
        if (calc == null) return "";

        if (nType != TYPE_YYYYMMDD && nType != TYPE_HHMMSS
                && nType != TYPE_YYYYMMDDHH24MMSS)
            throw new Exception("参数错误: nType 值不对");

        String strStdDateTime = "";

        String strYear = String.valueOf(calc.get(Calendar.YEAR));
        String strMonth = String.valueOf(calc.get(Calendar.MONTH)+1);
        String strDate = String.valueOf(calc.get(Calendar.DATE));
        String strHour = String.valueOf(calc.get(Calendar.HOUR_OF_DAY));
        String strMinute = String.valueOf(calc.get(Calendar.MINUTE));
        String strSecond = String.valueOf(calc.get(Calendar.SECOND));
        switch (nType)
        {
            case TYPE_YYYYMMDD:
                if (strMonth.length()==1) strMonth = "0"+strMonth;
                if (strDate.length()==1) strDate = "0"+strDate;
                strStdDateTime = strYear+strMonth+strDate;
                break;
            case TYPE_HHMMSS:
                if (strHour.length()==1) strHour = "0"+strHour;
                if (strMinute.length()==1) strMinute = "0"+strMinute;
                if (strSecond.length()==1) strSecond = "0"+strSecond;
                strStdDateTime = strHour+strMinute+strSecond;
                break;
            case TYPE_YYYYMMDDHH24MMSS:
                if (strMonth.length()==1) strMonth = "0"+strMonth;
                if (strDate.length()==1) strDate = "0"+strDate;
                if (strHour.length()==1) strHour = "0"+strHour;
                if (strMinute.length()==1) strMinute = "0"+strMinute;
                if (strSecond.length()==1) strSecond = "0"+strSecond;
                strStdDateTime = strYear+strMonth+strDate
                                +strHour+strMinute+strSecond;
                break;
        }
        return strStdDateTime;
    }

    /**
     * Name:    getStdDateTime
     * Desc:    得到标准的时间格式--YYYYMMDD 或者 HHMMSS 或者 YYMMDDHHMMSS
     * Author:  Wang Zhiyong
     * @param   timeStame Timestamp类型的日期
     * @param   nType 要求返回的时间类型
     *          nType = TYPE_YYYYMMDD       日期
     *                  TYPE_HHMMSS         时间
     *                  TYPE_YYYYMMDDHH24MMSS 日期+时间
     * @return  返回标准日期
     */
    public static String getStdDateTime(Timestamp timeStamp,int nType)
        throws Exception
    {
        //if (timeStamp == null) throw new Exception("参数错误: timeStamp 不能为null");
        if ( timeStamp == null ) return "";

        Calendar calc = Calendar.getInstance();
        Date date = new Date(timeStamp.getTime());
        calc.setTime(date);
        return getStdDateTime(calc,nType);
    }

    /**
     * Name:    getStdDate
     * Desc:    得到标准的8码时间格式--YYYYMMDD
     * Author:  Wang Zhiyong
     * @param   strUserDate 用户格式的日期，支持的格式有
     *              "YYYYMMDD"  "YYYY-MM-DD"    "YYYY/MM/DD"    "YYYY.MM.DD"
     *              "YYYY年MM月DD日"
     * @return  返回标准日期
     */
    public static String getStdDate(String strUserDate)
        throws Exception
    {
        //if (strUserDate == null )
        //    throw new Exception("参数错误: strUserDate 不能为null");
        if (strUserDate == null || strUserDate.length()==0) return "";

        String strStdDate = "";
        int nYear = 0,nMonth = 0,nDate = 0;
        String strSeparator = "";
        if (strUserDate.indexOf(SEPARATOR_DOT)>0)
            strSeparator = SEPARATOR_DOT;
        else if (strUserDate.indexOf(SEPARATOR_HYPHEN)>0)
            strSeparator = SEPARATOR_HYPHEN;
        else if (strUserDate.indexOf(SEPARATOR_SLASH)>0)
            strSeparator = SEPARATOR_SLASH;
        else if (strUserDate.indexOf("年")>0)
            strSeparator = SEPARATOR_CHINESE;
        else if (strUserDate.length() == 8)
            strSeparator = "STANDARD";
        if( strSeparator.equals(SEPARATOR_DOT)
            || strSeparator.equals(SEPARATOR_HYPHEN)
            || strSeparator.equals(SEPARATOR_SLASH)) {
            String[] strArray = StringUtils.split(strUserDate,strSeparator);
            nYear = Integer.parseInt(strArray[0]);
            nMonth = Integer.parseInt(strArray[1]);
            nDate = Integer.parseInt(strArray[2]);
        } else if (strSeparator.equals(SEPARATOR_CHINESE)) {
            nYear = Integer.parseInt(strUserDate.substring(
                            0,strUserDate.indexOf("年")));
            nMonth = Integer.parseInt(strUserDate.substring(
                            strUserDate.indexOf("年")+1,strUserDate.indexOf("月")));
            nDate = Integer.parseInt(strUserDate.substring(
                            strUserDate.indexOf("月")+1,strUserDate.indexOf("日")));
        } else if (strSeparator.equalsIgnoreCase("STANDARD"))
        {
            nYear = Integer.parseInt(strUserDate.substring(0,4));
            nMonth = Integer.parseInt(strUserDate.substring(4,6));
            nDate = Integer.parseInt(strUserDate.substring(6,8));
        }

        //对两位的年(YY)做预防处理，规定 60 以下是20YY年，60以上是19YY年
        if (nYear < 60 )
            nYear = 2000 + nYear;
        else if (nYear >= 60 && nYear < 1000)
            nYear = 1900 + nYear;
        String strYear = nYear + "";
        String strMonth = nMonth + "";
        String strDate = nDate + "";
        if (strMonth.length()==1) strMonth = "0"+strMonth;
        if (strDate.length()==1) strDate = "0"+strDate;
        strStdDate = strYear+strMonth+strDate;
        return strStdDate;

    }

    /**
     * Name:    getUserDateTime
     * Desc:    得到用户需要的日期时间格式
     *          “YYYY-MM-DD” ,“XXXX年XX月XX日” ，“Jan 1st, 2001”,
     *          “12:20:30”,“1999年12月31号 12点31分20秒”等等
     * Author:  Wang Zhiyong
     * @param   strStdDate  标准的8码日期，6码时间或者14码日期+时间值
     * @param   strSeparator 日期类型的分割符号
     *          strSeparator =
     *              SEPARATOR_SLASH  --  “2001/01/01”,“2001/01/01 12:30:20”
     *              SEPARATOR_DOT  --  “2001.01.01”,“2001.01.01 12:30:20”
     *              SEPARATOR_HYPHEN  --  “2001-01-01”,“2001-01-01 12:30:30”
     *              SEPARATOR_CHINESE  --  “XXXX年XX月XX日”,“XXXX年XX月XX日 12时30分20秒”
     *              SEPARATOR_ENGLISH  --  “Jan 1st, 2001”，“Jan 1st, 2001 12:30:30”
     *          当只要求输出时分秒数据时,
     *              SEPARATOR_CHINESE --    “12时30分20秒”
     *              其他值            --    “12:30:20”
     * @param   nType 要求返回的时间类型
     *          nType = TYPE_YYYYMMDD       日期
     *                  TYPE_HHMMSS         时间
     *                  TYPE_YYYYMMDDHH24MMSS 日期+时间
     * @return  返回用户需要的日期格式
     */
    public static String getUserDateTime(
            String strStdDateTime,
            String strSeparator,
            int nType)
        throws Exception
    {
        //if (strStdDateTime == null)
        //    throw new Exception("参数错误: strStdDateTime 不能为null");
        if (strStdDateTime == null || strStdDateTime.length() < 6 ) return "";

        if (strSeparator == null)
            throw new Exception("参数错误: strSeparator 不能为null");
        if (nType != TYPE_YYYYMMDD && nType != TYPE_HHMMSS
                && nType != TYPE_YYYYMMDDHH24MMSS)
            throw new Exception("参数错误: nType 值不对");

        String strUserDateTime = "";
        String strYear = "", strMonth = "", strDate = "";
        String strHour = "", strMinute = "", strSecond = "";

        switch (nType)
        {
            case TYPE_YYYYMMDD:
                if (strStdDateTime.length() != 8 && strStdDateTime.length() != 14)
                    throw new Exception("参数错误: strStdDateTimeTime格式不对");
                strYear = strStdDateTime.substring(0,4);
                strMonth = strStdDateTime.substring(4,6);
                strDate = strStdDateTime.substring(6,8);
                if (strSeparator.equalsIgnoreCase("CHN"))
                {
                    strUserDateTime = strYear+"年"+strMonth+"月"+strDate+"日";
                }
                else if (strSeparator.equalsIgnoreCase("ENG"))
                {
                    strUserDateTime = MONTH_ABBR[Integer.parseInt(strMonth)-1]+" "
                                + DATE_ABBR[Integer.parseInt(strDate)-1]+", "
                                + strYear;
                }
                else
                {
                    strUserDateTime = strYear + strSeparator
                                + strMonth +strSeparator
                                + strDate;
                }
                break;
            case TYPE_YYYYMMDDHH24MMSS:
                if (strStdDateTime.length() != 14)
                    throw new Exception("参数错误: strStdDateTimeTime格式不对");
                strYear = strStdDateTime.substring(0,4);
                strMonth = strStdDateTime.substring(4,6);
                strDate = strStdDateTime.substring(6,8);
                strHour = strStdDateTime.substring(8,10);
                strMinute = strStdDateTime.substring(10,12);
                strSecond = strStdDateTime.substring(12,14);
                if (strSeparator.equalsIgnoreCase("CHN"))
                {
                    strUserDateTime = strYear+"年"+strMonth+"月"+strDate+"日 "
                                    + strHour+"时"+strMinute+"分"+strSecond+"秒";
                }
                else if (strSeparator.equalsIgnoreCase("ENG"))
                {
                    strUserDateTime = MONTH_ABBR[Integer.parseInt(strMonth)-1]+" "
                                + DATE_ABBR[Integer.parseInt(strDate)-1]+", "
                                + strYear+" "
                                + strHour+":"+strMinute+":"+strSecond;
                }
                else
                {
                    strUserDateTime = strYear + strSeparator
                                + strMonth +strSeparator
                                + strDate+" "
                                + strHour+":"+strMinute+":"+strSecond;
                }
                break;
            case TYPE_HHMMSS:
                if (strStdDateTime.length() != 6 && strStdDateTime.length()!=14)
                    throw new Exception("无法从strStdDateTimeTime参数中得到时间（时分秒）数据");
                if (strStdDateTime.length()==14) strStdDateTime = strStdDateTime.substring(8,14);
                strHour = strStdDateTime.substring(0,2);
                strMinute = strStdDateTime.substring(2,4);
                strSecond = strStdDateTime.substring(4,6);
                if (strSeparator.equalsIgnoreCase("CHN"))
                {
                    strUserDateTime = strHour +"时"+strMinute+"分"+strSecond+"秒";
                }
                else
                {
                    strUserDateTime = strHour +":"+strMinute+":"+strSecond;
                }
                break;
        }
        return strUserDateTime;
    }

    /**
     * Name:    getUserDate
     * Desc:    得到用户需要的日期格式
     *          “YYYY-MM-DD” ,“XXXX年XX月XX日” ，“Jan 1st, 2001”,
     * Author:  Wang Zhiyong
     * @param   strStdDate  标准的8码日期，6码时间或者14码日期+时间值
     * @param   strSeparator 日期类型的分割符号
     *          strSeparator =
     *              SEPARATOR_SLASH  --  “2001/01/01”,“2001/01/01 12:30:20”
     *              SEPARATOR_DOT  --  “2001.01.01”,“2001.01.01 12:30:20”
     *              SEPARATOR_HYPHEN  --  “2001-01-01”,“2001-01-01 12:30:30”
     *              SEPARATOR_CHINESE  --  “XXXX年XX月XX日”,“XXXX年XX月XX日 12时30分20秒”
     *              SEPARATOR_ENGLISH  --  “Jan 1st, 2001”，“Jan 1st, 2001 12:30:30”
     *          当只要求输出时分秒数据时,
     *              SEPARATOR_CHINESE --    “12时30分20秒”
     *              其他值            --    “12:30:20”
     * @return  返回用户需要的日期格式
     */
    public static String getUserDate(
            String strStdDateTime,
            String strSeparator)
        throws Exception
    {
        return getUserDateTime(strStdDateTime,strSeparator,TYPE_YYYYMMDD);
    }

    /**
     * Name:    getUserTime
     * Desc:    得到用户需要的时间格式 "HH:MM:SS" “12时30分20秒”
     * Author:  Wang Zhiyong
     * @param   strStdDate  标准的14码日期+时间值
     * @param   strSeparator 日期类型的分割符号
     *          strSeparator =
     *              SEPARATOR_CHINESE --    “12时30分20秒”
     *              其他值            --    “12:30:20”
     * @return  返回用户需要的日期格式
     */
    public static String getUserTime(
            String strStdDateTime,
            String strSeparator)
        throws Exception
    {
        return getUserDateTime(strStdDateTime,strSeparator,TYPE_HHMMSS);
    }

    /**
     * Name:    getCalendar
     * Desc:    得到Calendar类型的日期时间
     * Author:  Wang Zhiyong
     * @param   strStdDateTime  8码（"YYYYMMDD"）或者14码（"YYYYMMDDHHMMSS"）
     *                          的日期字符串
     *                          注意 6码的时间格式（"HHMMSS"）不被使用
     * @return  返回Calendar类型的日期时间
     */
    public static Calendar getCalendar(String strStdDateTime)
        throws Exception
    {
        //if (strStdDateTime == null)
        //    throw new Exception("参数错误: strStdDateTime 不能为null");
        if (strStdDateTime == null || strStdDateTime.length()==0) return null;

        int nLength = strStdDateTime.length();
        if (nLength != 8 && nLength != 14){
            throw new Exception("参数错误: strStdDateTime格式不对，必须使用标准的8码或者14码格式");
        }
        int nYear = Integer.parseInt(strStdDateTime.substring(0,4));
        int nMonth = Integer.parseInt(strStdDateTime.substring(4,6))-1;
        int nDate = Integer.parseInt(strStdDateTime.substring(6,8));
        int nHour = 0 ; int nMinute = 0; int nSecond = 0;
        if (nLength == 14)
        {
            nHour = Integer.parseInt(strStdDateTime.substring(8,10));
            nMinute = Integer.parseInt(strStdDateTime.substring(10,12));
            nSecond = Integer.parseInt(strStdDateTime.substring(12,14));
        }
        Calendar calc=Calendar.getInstance();
        calc.set(nYear,nMonth,nDate,nHour,nMinute,nSecond);
        return calc;
    }

    /**
     * Name:    getCalendar
     * Desc:    得到Calendar类型的日期时间
     * Author:  Wang Zhiyong
     * @param   Timestamp 需要转换的时间
     * @return  返回Calendar类型的日期时间
     */
    public static Calendar getCalendar(Timestamp timeStamp)
    {
        if (timeStamp == null ) return null;
        Calendar calc=Calendar.getInstance();
        Date date = new Date(timeStamp.getTime());
        calc.setTime(date);
        return calc;
    }

    /**
     * Name:    getTimestamp
     * Desc:    得到Timestamp类型的日期时间
     * Author:  Wang Zhiyong
     * @param   calendar 需要转换的时间
     * @return  返回Timestamp类型的日期时间
     */
    public static Timestamp getTimestamp(Calendar calendar)
    {
        if (calendar == null ) return null;
        Date date = calendar.getTime();
        Timestamp timeStamp = new Timestamp(date.getTime());
        return timeStamp;
    }

    /**
     * Name:    getTimestamp
     * Desc:    得到Timestamp类型的日期时间
     * Author:  Wang Zhiyong
     * @param   strStdDateTime  8码（"YYYYMMDD"）或者14码（"YYYYMMDDHHMMSS"）
     *                          的日期字符串
     *                          注意 6码的时间格式（"HHMMSS"）不被使用
     * @return  返回Timestamp类型的日期时间
     */
    public static Timestamp getTimestamp(String strStdDateTime)
        throws Exception
    {
        Calendar calc=getCalendar(strStdDateTime);
        return getTimestamp(calc);
    }

    /**
     * Name:    getCurrentDateTime
     * Desc:    得到当前日期时间
     * Author:  Wang Zhiyong
     * @param   nType 要求返回的时间类型
     *          nType = TYPE_YYYYMMDD       日期
     *                  TYPE_HHMMSS         时间
     *                  TYPE_YYYYMMDDHH24MMSS 日期+时间
     * @return  返回当前日期
     */
    public static String getCurrentDateTime(int nType)
        throws Exception
    {

      //Unix操作系统时区问题
      TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
      TimeZone.setDefault(tz);

        return getStdDateTime(Calendar.getInstance(),nType);
    }

    /**
     * Name:    getCurrentDate
     * Desc:    得到当前日期
     * Author:  Wang Zhiyong
     * @param   strSeparator 日期类型的分割符号
     *          strSeparator =
     *              null 或者"" 表示标准时间
     *              SEPARATOR_SLASH  --  “2001/01/01”
     *              SEPARATOR_DOT  --  “2001.01.01”
     *              SEPARATOR_HYPHEN  --  “2001-01-01”
     *              SEPARATOR_CHINESE  --  “XXXX年XX月XX日”
     *              SEPARATOR_ENGLISH  --  “Jan 1st, 2001”
     * @return  返回当前日期
     */
    public static String getCurrentDate(String strSeparator)
        throws Exception
    {
        String strDate = getStdDateTime(Calendar.getInstance(),TYPE_YYYYMMDD);
        if (strSeparator == null || strSeparator.length() == 0)
            return strDate;
        else
            return getUserDate(strDate,strSeparator);
    }

    /**
     * Name:    getCurrentTime
     * Desc:    得到当前时间
     * Author:  Wang Zhiyong
     * @param   strSeparator 日期类型的分割符号
     *          strSeparator =
     *              null 或者"" 表示标准时间
     *              SEPARATOR_CHINESE  --  “XX时XX分XX秒”
     *              其他 -- "HH:MM:SS"
     * @return  返回当前时间
     */
    public static String getCurrentTime(String strSeparator)
        throws Exception
    {
        String strDate = getStdDateTime(Calendar.getInstance(),TYPE_YYYYMMDDHH24MMSS);
        if (strSeparator == null || strSeparator.length() == 0)
            return strDate.substring(8,14);
        else
            return getUserTime(strDate,strSeparator);
    }

    /**
     * Name:    add
     * Desc:    计算时间函数
     * Author:  Wang Zhiyong
     * @param   strStdDate  标准的 8码日期，6码时间 或者 14码日期+时间值
     * @param   nType 要求返回的时间类型
     *          nType = TYPE_YYYYMMDD       日期
     *                  TYPE_HHMMSS         时间
     *                  TYPE_YYYYMMDDHH24MMSS 日期+时间
     * @param   nField 要求计算的时间属性
     *          nField = FIELD_YEAR
     *                   FIELD_MONTH
     *                   FIELD_DATE
     *                   FIELD_HOUR
     *                   FIELD_MINUTE
     *                   FIELD_SECOND
     * @param   nAmount 要求计算的数值，可以为负数
     * @return  返回经过计算以后的时间字符串
     */
    public static String add(String strStdDateTime,int nType,int nField,int nAmount)
        throws Exception
    {
        if (strStdDateTime.length()==6)
            strStdDateTime = getCurrentDateTime(TYPE_YYYYMMDD)+strStdDateTime;
        Calendar calc = getCalendar(strStdDateTime);
        calc.add(nField,nAmount);
        return getStdDateTime(calc,nType);
    }

    /**
     * Name:    add
     * Desc:    计算时间函数
     * Author:  Wang Zhiyong
     * @param   strStdDate  标准的 8码日期
     * @param   nField 要求计算的时间属性
     *          nField = FIELD_YEAR
     *                   FIELD_MONTH
     *                   FIELD_DATE
     * @param   nAmount 要求计算的数值，可以为负数
     * @return  返回经过计算以后的时间字符串8码标准时间格式
     */
    public static String add(String strStdDate,int nField,int nAmount)
        throws Exception
    {
        return add(strStdDate,TYPE_YYYYMMDD,nField,nAmount);
    }

    /**
     * Name:    getDaysOfMonth
     * Desc:    得到指定月份的天数
     * Author:  Wang Zhiyong
     * @param   strStdDateTime  8码（"YYYYMMDD"）或者14码（"YYYYMMDDHHMMSS"）
     *                          的日期字符串
     *                          注意 6码的时间格式（"HHMMSS"）不能使用
     * @return  返回指定月份的天数
     */
    public static int getDaysOfMonth(String strStdDateTime)
        throws Exception
    {
        if (strStdDateTime == null)
            throw new Exception("参数错误: strStdDateTime 不能为null");

        int nLength = strStdDateTime.length();
        if (nLength != 8 && nLength != 14){
            throw new Exception("参数错误: strStdDateTime格式不对，必须使用标准的8码或者14码格式");
        }

        int year=Integer.parseInt(strStdDateTime.substring(0,4));
        int mon=Integer.parseInt(strStdDateTime.substring(4,6));
        if(mon<=0||mon>12) return 0;
  	    int day_tab[][]=new int[][]
        {
            {0,31,28,31,30,31,30,31,31,30,31,30,31},
            {0,31,29,31,30,31,30,31,31,30,31,30,31}
        };
        boolean leap;
        leap=year%4==0 && year%100!=0 || year%400==0;  /* 1..leap  0..not */
        if (leap)
            return(day_tab[1][mon]);
        else
            return(day_tab[0][mon]);
    }

    /**
     * Name:    getDaysOfTwoDate
     * Desc:    得到两个日期之间的天数
     * Author:  zhaoshouqiang
     * @param   strBeginDate  8码（"YYYYMMDD")的日期字符串
     *          strEndDate    8码（"YYYYMMDD")的日期字符串
     * @return  返回两个日期之间的天数
     */
    public static int getDaysOfTwoDate(String strBeginDate, String strEndDate)
        throws Exception
    {
        if (strBeginDate == null)
            throw new Exception("参数错误: 参数1不能为null");
        if (strEndDate == null)
            throw new Exception("参数错误: 参数2不能为null");
        int nLength1 = strBeginDate.length();
        int nLength2 = strEndDate.length();
        if (nLength1 != 8 || nLength2 != 8){
            throw new Exception("参数错误: 参数格式不对，必须使用标准的8码");
        }

        Calendar calc1=getCalendar(strBeginDate);
        Date date1 = calc1.getTime();
        Calendar calc2=getCalendar(strEndDate);
        Date date2 = calc2.getTime();
        return Integer.parseInt(Long.toString(((date2.getTime() - date1.getTime())/86400000)));

    }

    /**
     * Name:    getDateFromDateDays
     * Desc:    根据日期和日期相差的天数得到新日期
     * Author:  zhaoshouqiang
     * @param   strBeginDate  8码（"YYYYMMDD")的日期字符串
     *          iDays 相差的天数
     * @return  返回新日期
     */
    public static String getDateFromDateDays(String strBeginDate, int iDays)
        throws Exception
    {
        if (strBeginDate == null)
            throw new Exception("参数错误: 参数1不能为null");
        int nLength1 = strBeginDate.length();
        if (nLength1 != 8){
            throw new Exception("参数错误: 参数格式不对，必须使用标准的8码");
        }

        Calendar calc1=getCalendar(strBeginDate);
        Date date1 = calc1.getTime();
        long lTemp = date1.getTime() + (iDays * 86400000l);
        date1 = new Date(lTemp);
        calc1.setTime(date1);
        return getStdDateTime(calc1,TYPE_YYYYMMDD);

    }

    /**
     * Name:    printCurrentTime
     * Desc:    打印出当前的时间，到毫秒级。
     *          目的是为某些测试效率的函数使用
     * Author:  Wang Zhiyong
     * @param:  strDesc 描述
     * @return  void
     */
    public static void printCurrentTime(String strDesc)
    {
        String strTime = "";
        Calendar calc = Calendar.getInstance();
        strTime = calc.get(calc.HOUR_OF_DAY)+"时"
                + calc.get(calc.MINUTE)+"分"
                + calc.get(calc.SECOND)+"秒"
                + calc.get(calc.MILLISECOND)+"毫秒";
        System.out.println(strDesc + " : " + strTime);
    }

    public static void main(String[] args)
    {
        try
        {
            System.out.println(DateUtil.getDateFromDateDays("20000517",10000));
            System.out.println(DateUtil.getStdDate("2000年1月1日"));
            System.out.println(DateUtil.getStdDate("01年1月1日"));
            System.out.println(DateUtil.getStdDate("1999/1/1"));
            DateUtil client = new DateUtil();
            System.out.println(client.getDaysOfTwoDate("19991231","19980201"));
            String strDate = "20010102";
            Calendar calc = Calendar.getInstance();
            Date date = calc.getTime();
            Timestamp timestamp = new Timestamp(date.getTime());
            //strDate = DateUtil.add("20000202",DateUtil.TYPE_YYYYMMDD,DateUtil.FIELD_MONTH,-5);
            strDate = DateUtil.getUserDateTime("20010402152309","-",DateUtil.TYPE_YYYYMMDDHH24MMSS);
            //calc = DateUtil.getCalendar(strDate);
            System.out.println("StrDate = "+strDate);
            System.out.println("calc = "+calc.get(Calendar.YEAR)+"/"
                                +(calc.get(Calendar.MONTH)+1)+"/"
                                +calc.get(Calendar.DATE)+" "
                                +calc.get(Calendar.HOUR_OF_DAY)+":"
                                +calc.get(Calendar.MINUTE)+":"
                                +calc.get(Calendar.SECOND));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * Name:    getFirstDayOfOtherMonth
     * Desc:    获取相距该日期若干月月份的第一天的日期值
     * Para:    Calendar cale
     *          int iMonths
     * Retu:    Calendar
     * auth:    Liang Jixiang
     * Date:    2001.05.29
     */
    public static Calendar getFirstDayOfOtherMonth(
                        Calendar cale,
                        int iMonths)
    {
        int iMonth = cale.get(Calendar.MONTH) + iMonths;
        int iYear = cale.get(Calendar.YEAR);
        Calendar cale1 = Calendar.getInstance();
        while(iMonth < 0)
        {
            iMonth+=12;
            iYear-=1;
        }
        while(iMonth > 11)
        {
            iMonth-=12;
            iYear+=1;
        }
        cale1.set(iYear,iMonth,1,0,0,0);
        return cale1;
    }
    /**
     * Name:    getLastDayOfOtherMonth
     * Desc:    获取相距该日期若干月月份的最后一天的日期值
     * Para:    Calendar cale
     *          int iMonths
     * Retu:    Calendar
     * auth:    Liang Jixiang
     * Date:    2001.05.29
     */
    public static Calendar getLastDayOfOtherMonth(
                        Calendar cale,
                        int iMonths)
    {
        int iMonth = cale.get(Calendar.MONTH) + iMonths + 1;
        int iYear = cale.get(Calendar.YEAR);
        Calendar cale1 = Calendar.getInstance();
        while(iMonth < 0)
        {
            iMonth+=12;
            iYear-=1;
        }
        while(iMonth > 11)
        {
            iMonth-=12;
            iYear+=1;
        }
        cale1.set(iYear,iMonth,1,0,0,0);
        long lTemp = cale1.getTime().getTime();
        lTemp-=1000;
        Date date = new Date(lTemp);
        cale1.setTime(date);
        return cale1;
    }
    /**
     * Name:    getDayAfter
     * Desc:    根据日期和日期相差的天数得到新日期
     * Para:    Calendar cale
     *          int iDays
     * Retu:    Calendar
     * auth:    Liang Jixiang
     * Date:    2001.05.29
     */
    public static Calendar getDayAfter(Calendar cale,int iDays)
    {
        long lTemp = cale.getTime().getTime() + (iDays * 86400000);
        Date date = new Date(lTemp);
        cale.setTime(date);
        return cale;
    }
    /**
     * Name:    checkWeekDay
     * Desc:    检查该日期是否为星期几(iDay指定)
     * Para:    Calendar cale
     *          int iDay(Sunday--1,...)
     * Retu:    boolean
     * auth:    Liang Jixiang
     * Date:    2001.05.29
     */
    public static boolean checkWeekDay(Calendar cale,int iDay)
    {
        if (iDay == cale.get(Calendar.DAY_OF_WEEK))
            return true ;
        else
            return false ;
    }
    /**
     * Name:    checkDayOfMonth
     * Desc:    检查两日期是否在同一月中
     * Para:    Calendar cale1
     *          Calendar cale2
     * Retu:    boolean
     * auth:    Liang Jixiang
     * Date:    2001.05.29
     */
    public static boolean checkDayOfMonth(Calendar cale1,Calendar cale2)
    {
        if (cale1.get(Calendar.MONTH) == cale2.get(Calendar.MONTH))
            return true ;
        else
            return false ;
    }

    /**
     * Name:    getStdTime
     * Desc:    得到标准的6码时间格式--HHMMSS
     * Author:  zhaoshouqiang
     * @param   strUserTime 用户格式的时间，支持的格式有
     *              "HHMMSS"  "HH:MM:SS"    "HH时MM分SS秒"
     * @return  返回标准时间
     */
    public static String getStdTime(String strUserTime)
        throws Exception
    {

        if (strUserTime == null || strUserTime.length() < 6) return "";

        String strStdTime = "";
        int nHour = 0,nMin = 0,nSec = 0;
        String strSeparator = "";
        if (strUserTime.indexOf(":")>0)
            strSeparator = ":";
        else if (strUserTime.indexOf("时")>0)
            strSeparator = SEPARATOR_CHINESE;
        else if (strUserTime.length() == 6)
            strSeparator = "STANDARD";
        if( strSeparator.equals(":")) {
            String[] strArray = StringUtils.split(strUserTime,":");
            nHour = Integer.parseInt(strArray[0]);
            nMin = Integer.parseInt(strArray[1]);
            nSec = Integer.parseInt(strArray[2]);
        } else if (strSeparator.equals(SEPARATOR_CHINESE)) {
            nHour = Integer.parseInt(strUserTime.substring(
                            0,strUserTime.indexOf("时")));
            nMin = Integer.parseInt(strUserTime.substring(
                            strUserTime.indexOf("时")+1,strUserTime.indexOf("分")));
            nSec = Integer.parseInt(strUserTime.substring(
                            strUserTime.indexOf("分")+1,strUserTime.indexOf("秒")));
        } else if (strSeparator.equalsIgnoreCase("STANDARD"))
        {
            nHour = Integer.parseInt(strUserTime.substring(0,2));
            nMin = Integer.parseInt(strUserTime.substring(2,4));
            nSec = Integer.parseInt(strUserTime.substring(4,6));
        }

        String strHour = nHour + "";
        String strMin = nMin + "";
        String strSec = nSec + "";
        if (strHour.length()==1) strHour = "0"+strHour;
        if (strMin.length()==1) strMin = "0"+strMin;
        if (strSec.length()==1) strSec = "0"+strSec;
        strStdTime = strHour+strMin+strSec;
        return strStdTime;

    }



}
//end
