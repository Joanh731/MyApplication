package com.example.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

public class ScreenSizeUtil {
    public static void getScreenSize(Context context, Point point) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getRealSize(point);
    }
}
