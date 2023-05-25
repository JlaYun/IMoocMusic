package com.sunday.Yunmusicdemo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.sunday.Yunmusicdemo.helps.RealmHelper;

import io.realm.Realm;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
        Realm.init(this);

        RealmHelper.migration();
    }
}
