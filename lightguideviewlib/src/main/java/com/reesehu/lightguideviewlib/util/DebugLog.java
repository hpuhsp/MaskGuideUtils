package com.reesehu.lightguideviewlib.util;

import android.util.Log;

/**
 * Created by zhy on 15/9/23.
 */
public class DebugLog {
    private static final String TAG = "HighLight";
    private static boolean debug = true;

    public static void e(String msg) {
        if (debug)
            Log.e(TAG, msg);
    }

    public static void d(String msg) {
        if (debug)
            Log.e(TAG, msg);
    }

}
