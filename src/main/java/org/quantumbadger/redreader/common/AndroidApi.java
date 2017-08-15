package org.quantumbadger.redreader.common;

import android.os.Handler;
import android.os.Looper;

/**
 * Temporary, was missing upstream
 */

public class AndroidApi {
	public static Handler UI_THREAD_HANDLER = new Handler(Looper.getMainLooper());
}
