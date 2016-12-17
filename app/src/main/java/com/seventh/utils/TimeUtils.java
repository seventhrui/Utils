package com.seventh.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import hirondelle.date4j.DateTime;

/**
 *
 */
public class TimeUtils {
	/**
	 * yyyyMMdd
	 */
	public static final String DATEFORMAT_1_1 = "YYYYMMDD";
	/**
	 * yyyyMMdd HH:mm
	 */
	public static final String DATEFROMAT_1_2 = "YYYYMMDD hh:mm";
	/**
	 * yyyyMMdd HH:mm:ss
	 */
	public static final String DATEFROMAT_1_3 = "YYYYMMDD hh:mm:ss";
	
	/**
	 * yyyy-MM-dd
	 */
	public static final String DATEFORMAT_2_1 = "YYYY-MM-DD";
	/**
	 * yyyy-MM-dd HH:mm
	 */
	public static final String DATEFROMAT_2_2 = "YYYY-MM-DD hh:mm";
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String DATEFROMAT_2_3 = "YYYY-MM-DD hh:mm:ss";
	
	/**
	 * yyyy_MM_dd
	 */
	public static final String DATEFORMAT_3_1 = "YYYY_MM_DD";
	/**
	 * yyyy_MM_dd HH:mm
	 */
	public static final String DATEFROMAT_3_2 = "YYYY_MM_DD hh:mm";
	/**
	 * yyyy_MM_dd HH:mm:ss
	 */
	public static final String DATEFROMAT_3_3 = "YYYY_MM_DD hh:mm:ss";
	/**
	 * hh:mm
	 */
	public static final String DATEFORMAT_4_1 = "hh:mm";
	
	/**
	 * 
	 * @return
	 */
	public static long getNowTimemS(){
		Date date = new Date();
		return date.getTime();
	}
	
	/**
	 * 
	 * @return
	 */
	public static long getNowTimeS(){
		return getNowTimemS()/1000;
	}
	
	/**
	 * 
	 * @return
	 */
	public static Date getNowDate(){
		return new Date();
	}
	
	/**
	 * 
	 * @return<br/>
	 * 0000-00-00 00:00:00.000000000
	 */
	public static DateTime getNowDateTime(){
		return DateTime.now(TimeZone.getDefault());
	}
	
	
	public static String getNowDateTime(String formatstr){
		return DateTime.now(TimeZone.getDefault()).format(formatstr);
	}
	
	/**
	 * 
	 * @param datestr
	 * @param formatstr
	 * @return
	 */
	public static Date str2Date(String datestr, String formatstr){
		SimpleDateFormat format = new SimpleDateFormat(formatstr);
	    Date date = null;
		try {
			date = format.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    return date;
	}
	
	/**
	 * 
	 * @param datetime
	 * @return
	 */
	public static Date DateTime2Date(DateTime datetime){
		long datems = datetime.getMilliseconds(TimeZone.getDefault());
		Date date = new Date(datems);
		return date;
	}
	
	/**
	 * 
	 * @param dt
	 * @return
	 */
	public static DateTime Date2DateTime(Date dt){
		long datems = dt.getTime();
		DateTime datetiem = DateTime.forInstant(datems, TimeZone.getDefault());
		return datetiem;
	}
	
	/**
	 * 
	 * @return
	 */
	public static String timeToChatTime(String datestr, String formatstr){
		Date date = str2Date(datestr,formatstr);
		DateTime datetime = Date2DateTime(date);
		DateTime datenow = getNowDateTime();
		
		int d1 = datetime.getDay();
		int d2 = datenow.getDay();
		
		if(d1 == d2){
			return datetime.format(DATEFORMAT_4_1);
		}
		else{
			
			return datetime.format(DATEFORMAT_2_1);
		}
	}
}
