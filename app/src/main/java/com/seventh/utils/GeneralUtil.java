package com.seventh.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;

public class GeneralUtil {
	/**
	 * 
	 * @param context
	 * @return
	 */
	public static String getVersionName(Context context) {
		try {
			String i = context.getPackageManager().getPackageInfo(
					context.getPackageName(), 0).versionName;
			return i;
		} catch (PackageManager.NameNotFoundException localNameNotFoundException) {
			localNameNotFoundException.printStackTrace();
		}
		return "1.0";
	}
	
	/**
	 * 
	 * @param context
	 * @return 
	 */
	public static int getVersion(Context context) {
	    try {
	        PackageManager manager = context.getPackageManager();
	        PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
	        return  info.versionCode;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return 0;
	    }
	}
	
	/**
	 * 
	 * @param dp
	 * @param resources
	 * @return
	 */
	public static int dpToPx(float dp, Resources resources) {
		float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics());
		return (int) px;
	}

}
