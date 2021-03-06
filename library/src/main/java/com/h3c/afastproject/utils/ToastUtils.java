package com.h3c.afastproject.utils;

import android.support.annotation.StringRes;
import android.widget.Toast;

import com.h3c.afastproject.AFastProject;

/**
 * Created by H3c on 16/5/24.
 */

public class ToastUtils {
    public static void show(@StringRes int stringRes) {
        show(StringUtils.getString(stringRes));
    }
    public static void show(final String info) {
        TaskUtils.runOnUI(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(AFastProject.getApplicationContext(), info, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
