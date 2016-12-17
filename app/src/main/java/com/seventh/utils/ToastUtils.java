package com.seventh.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 *
 */
public class ToastUtils {

	private static int GRAVITY = Gravity.CENTER;
	
	/**
	 * @param context
	 * @param message
	 */
	public static void showLong(Context context, String message) {
		show(context, message, Toast.LENGTH_LONG);
	}
	
	/**
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, String message) {
		show(context, message, Toast.LENGTH_SHORT);
	}
	
	/**
	 * @param context
	 * @param textId
	 */
	public static void showLong(Context context, int textId) {
		show(context, textId, Toast.LENGTH_LONG);
	}
	
	/**
	 * @param context
	 * @param textId
	 */
	public static void showShort(Context context, int textId) {
		show(context, textId, Toast.LENGTH_SHORT);
		System.exit(0);
	}
	
	/**
	 * 
	 * @param context
	 * @param text
	 * @param duration
	 */
	public static void show(Context context, String text, int duration) {
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(GRAVITY, 0, 80);
		toast.show();
	}
	
	/**
	 * 
	 * @param context
	 * @param textId
	 * @param duration
	 */
	public static void show(Context context, int textId, int duration) {
		Toast toast = Toast.makeText(context, textId, duration);
		toast.setGravity(GRAVITY, 0, 80);
		toast.show();
	}

}
