package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class ThirdPartyActivity extends Activity implements View.OnClickListener {

    private TextView thirdPartyBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolBarUtils.setContentView(this,R.layout.activity_third_party);

        initView();
        intiEvent();
    }

    private void initView() {
        thirdPartyBack = (TextView) findViewById(R.id.Third_party_back);
    }

    private void intiEvent() {
        thirdPartyBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Third_party_back:
                finish();
                break;
        }
    }
}
