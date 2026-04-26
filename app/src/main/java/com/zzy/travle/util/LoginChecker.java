package com.zzy.travle.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.zzy.travle.data.manager.AccountManager;
import com.zzy.travle.ui.activity.LoginActivity;

public class LoginChecker {
    public static boolean checkLogin(Context context) {
        if (!AccountManager.getInstance().hasToken()) {
            Intent intent = new Intent(context, LoginActivity.class);
            context.startActivity(intent);
            return false;
        }
        return true;
    }

    public static long requireUserId(Activity activity) {
        if (!checkLogin(activity)) {
            return -1;
        }

        return AccountManager.getInstance().getUserId();
    }
}
