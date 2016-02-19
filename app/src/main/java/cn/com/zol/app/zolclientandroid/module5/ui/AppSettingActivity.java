package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class AppSettingActivity extends Activity implements View.OnClickListener{

    private TextView settingBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolBarUtils.setContentView(this,R.layout.activity_app_setting);
        initView();
        initEvent();
        initData();
    }

    private void initView() {
        settingBack = (TextView) findViewById(R.id.setting_back);

    }

    private void initEvent() {
        settingBack.setOnClickListener(this);
    }

    private void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_back:
                finish();
                break;
        }
    }
}
