package com.sunday.Yunmusicdemo.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sunday.Yunmusicdemo.R;
import com.sunday.Yunmusicdemo.helps.UserHelper;
import com.sunday.Yunmusicdemo.utils.UserUtils;

public class MeActivity extends BaseActivity {

    private TextView mTvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        initView();
    }

    private void initView () {
        initNavBar(true, "个人中心", false);

        mTvUser = fd(R.id.tv_user);
        mTvUser.setText("用户名：" + UserHelper.getInstance().getPhone());
    }

    /**
     * 修改密码点击事件
     */
    public void onChangeClick (View v) {
        startActivity(new Intent(this, ChangePasswordActivity.class));
    }


    /**
     * 退出登录
     */
    public void onLogoutClick (View v) {
        UserUtils.logout(this);
    }
}
