package com.seventh.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeRender {

	private static SimpleDateFormat formatBuilder;

	public static String getDate(String format) {
		formatBuilder = new SimpleDateFormat(format);
		return formatBuilder.format(new Date());
	}

	public static String getDate() {
		return getDate("yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 
	 * @param time
	 * @return
	 */
	public static String getShortTime(String time){
		String strtime = time;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = sdf.parse(time);
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			String nowstr = sdf.format(new Date());
			Date datenow = sdf.parse(nowstr);
			int temp = daysBetween(date1, datenow);
			if(temp==0) {
				sdf = new SimpleDateFormat("HH:mm:ss");
				strtime = sdf.format(date1);
			}
			else if(temp==1) {
				sdf = new SimpleDateFormat("HH:mm:ss");
				strtime = "昨天" + sdf.format(date1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return strtime;
	}
	
	/**
	 * 
	 * @param time1
	 * @param time2
	 * @return
	 */
	public static boolean isCloseEnough(String time1, String time2){
		boolean isclose = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = sdf.parse(time1);
			Date date2 = sdf.parse(time2);
			long temp = date1.getTime()-date2.getTime();
			isclose = temp < 1000 * 5;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return isclose;
	}
	
	/**
	 * 
	 * @param smdate
	 * @param bdate
	 * @return 
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}
}