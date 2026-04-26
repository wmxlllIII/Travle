package com.zzy.travle.data.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.util.TravleApplication;

public class AccountManager {

    public static final String TAG = "LoginManager";
    private static final String PREF_NAME = "login_prefs";
    private static final String KEY_USER_ID = "user_id";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_AVATAR = "avatar";
    private static final String KEY_TOKEN = "token";

    private final SharedPreferences mSp;

    private static class Holder {
        private static final AccountManager INSTANCE = new AccountManager();
    }

    public static AccountManager getInstance() {
        return Holder.INSTANCE;
    }

    private AccountManager() {
        Context context = TravleApplication.getContext();
        mSp = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void saveLoginInfo(UserVO user) {
        mSp.edit()
                .putLong(KEY_USER_ID, user.getUserId())
                .putString(KEY_USERNAME, user.getUsername())
                .putString(KEY_EMAIL, user.getEmail())
                .putString(KEY_AVATAR, user.getAvatar())
                .putString(KEY_TOKEN, user.getToken())
                .apply();
    }

    public UserVO getLoginUser() {
        if (!hasToken()) {
            return null;
        }

        long userId = mSp.getLong(KEY_USER_ID, 0);
        String username = mSp.getString(KEY_USERNAME, "");
        String email = mSp.getString(KEY_EMAIL, "");
        String avatar = mSp.getString(KEY_AVATAR, "");
        String token = mSp.getString(KEY_TOKEN, "");

        return new UserVO(userId, username, email, avatar, token);
    }

    public boolean hasToken() {
        String token = mSp.getString(KEY_TOKEN, "");
        return !TextUtils.isEmpty(token);
    }

    public String getToken() {
        return mSp.getString(KEY_TOKEN, "");
    }

    public long getUserId() {
        return mSp.getLong(KEY_USER_ID, 0);
    }

    public void logout() {
        mSp.edit().clear().apply();
    }
}
