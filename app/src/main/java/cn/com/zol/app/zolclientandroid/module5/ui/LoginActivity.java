package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class LoginActivity extends Activity implements View.OnClickListener
{

    private TextView tvBack;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ToolBarUtils.setContentView(this, R.layout.activity_login);//添加全屏显示透明通知栏参数并显示通知栏

        initView();
        initEvents();
        initDatas();

    }

    private void initView()
    {
        tvBack = (TextView) findViewById(R.id.back);
        tvRegister = (TextView) findViewById(R.id.user_register);
    }

    private void initEvents()
    {
        tvBack.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
    }

    private void initDatas()
    {
    }

    @Override
    public void onClick(View v)
    {
        Log.e("tag", "获取到点击控件的ID为:" + v.getId());
        switch (v.getId())
        {
            case R.id.back:
                //Toast.makeText(this, "呵呵", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.user_register:
                startActivity(new Intent(this,RegisterActivity.class));
                break;
        }
    }

    /**
     * 按返回键跳到GuideActivity
     *
     * @param keyCode
     * @param event
     * @return
     */
   /* @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
            startActivity(new Intent(this, GuideActivity.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }*/
}
