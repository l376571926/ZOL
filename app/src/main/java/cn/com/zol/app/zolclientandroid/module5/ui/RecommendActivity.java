package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class RecommendActivity extends Activity implements View.OnClickListener {

    private TextView backRecommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolBarUtils.setContentView(this,R.layout.activity_recommend);
        initView();
        initEvent();
    }

    private void initView() {
        backRecommend = (TextView) findViewById(R.id.back_recommend);
    }

    private void initEvent() {
        backRecommend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_recommend:
                finish();
                break;
        }
    }
}
