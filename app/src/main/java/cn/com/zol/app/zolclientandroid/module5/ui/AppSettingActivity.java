package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module5.utils.DataCleanManager;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class AppSettingActivity extends Activity implements View.OnClickListener{

    private TextView settingBack;
    private RelativeLayout setTextSixe;
    private TextView getTextSize;
    private RelativeLayout nightMode;
    private TextView screenBrightness;
    private RelativeLayout setCache;
    private TextView cacheClean;

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
        setTextSixe = (RelativeLayout) findViewById(R.id.set_text_size);
        getTextSize = (TextView) findViewById(R.id.get_text_size);
        nightMode = (RelativeLayout) findViewById(R.id.set_night_mode);
        screenBrightness = (TextView) findViewById(R.id.set_screen_brightness);
        setCache = (RelativeLayout) findViewById(R.id.set_cache);
        cacheClean = (TextView) findViewById(R.id.cache_clean);

        reflashCache();
    }



    private void initEvent() {
        settingBack.setOnClickListener(this);
        setTextSixe.setOnClickListener(this);
        nightMode.setOnClickListener(this);
        setCache.setOnClickListener(this);
    }

    private void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_back:
                finish();
                break;
            case R.id.set_text_size:
                showTextDislog();
                break;
            case R.id.set_night_mode:
                setScreenBrightness();
                break;
            case R.id.set_cache:
                DataCleanManager.clearAllCache(this);
                reflashCache();
                break;
        }
    }

    /**
     * 设置更改App的整个字体大小的弹出对话框（还未设置成调整全部）
     */
    private void showTextDislog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(AppSettingActivity.this);
        builder.setTitle("文字大小");
        final String[] str = new String[]{"超大","大","中","小"};
        builder.setItems(str, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0:
                        getTextSize.setText("超大");
                        break;
                    case 1:
                        getTextSize.setText("大");
                        break;
                    case 2:
                        getTextSize.setText("中");
                        break;
                    case 3:
                        getTextSize.setText("小");
                        break;
                }
            }
        });
        builder.show();
    }

    /**
     * 根据夜间模式的更改设置屏幕亮度
     */
    private void setScreenBrightness(){
        String screenStr = screenBrightness.getText().toString();
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        if ("白天".equals(screenStr)){
            screenBrightness.setText("夜间");
            Toast.makeText(AppSettingActivity.this,"开启夜间模式",Toast.LENGTH_SHORT).show();
            lp.screenBrightness = 0.0f;
            getWindow().setAttributes(lp);
        }else {
            screenBrightness.setText("白天");
            Toast.makeText(AppSettingActivity.this,"开启白天模式",Toast.LENGTH_SHORT).show();
            lp.screenBrightness = 1.0f;
            getWindow().setAttributes(lp);
        }
    }

    /**
     *刷新缓存 并显示0
     */
    private void reflashCache() {
        try {
            String cacheSize = DataCleanManager.getTotalCacheSize(this);
            cacheClean.setText(cacheSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
