package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.os.Bundle;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class AppSettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolBarUtils.setContentView(this,R.layout.activity_app_setting);
        initView();
        initEvent();
        initData();
    }

    private void initView() {

    }

    private void initEvent() {

    }

    private void initData() {

    }
}
