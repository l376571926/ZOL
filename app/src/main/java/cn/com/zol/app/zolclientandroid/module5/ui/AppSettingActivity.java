package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Logger;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module5.utils.DataCleanManager;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class AppSettingActivity extends Activity implements View.OnClickListener{

    private TextView settingBack;
    private RelativeLayout setTextSize;
    private TextView getTextSize;
    private RelativeLayout nightMode;
    private TextView screenBrightness;
    private RelativeLayout setCache;
    private TextView cacheClean;
    private RelativeLayout setThirdParty;
    private TextView imageMode;
    private RelativeLayout setImageQuality;
    private CheckBox setRightScroll;
    private CheckBox setDisplayImg;
    private CheckBox setPullArticle;
    private CheckBox setpullNotifi;


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
        setTextSize = (RelativeLayout) findViewById(R.id.set_text_size);
        getTextSize = (TextView) findViewById(R.id.get_text_size);
        nightMode = (RelativeLayout) findViewById(R.id.set_night_mode);
        screenBrightness = (TextView) findViewById(R.id.set_screen_brightness);
        setCache = (RelativeLayout) findViewById(R.id.set_cache);
        cacheClean = (TextView) findViewById(R.id.cache_clean);
        setThirdParty = (RelativeLayout) findViewById(R.id.set_third_party);
        imageMode = (TextView) findViewById(R.id.image_mode);
        setImageQuality = (RelativeLayout) findViewById(R.id.set_image_quality);
        setRightScroll = (CheckBox) findViewById(R.id.set_right_scroll);
        setDisplayImg = (CheckBox) findViewById(R.id.set_display_img);
        setPullArticle = (CheckBox) findViewById(R.id.set_pull_article);
        setpullNotifi = (CheckBox) findViewById(R.id.set_pull_notification);

        reflashCache();
    }



    private void initEvent() {
        settingBack.setOnClickListener(this);
        setTextSize.setOnClickListener(this);
        nightMode.setOnClickListener(this);
        setCache.setOnClickListener(this);
        setThirdParty.setOnClickListener(this);
        setImageQuality.setOnClickListener(this);
        setRightScroll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(AppSettingActivity.this,"未定义设置",Toast.LENGTH_SHORT).show();
            }
        });
        setDisplayImg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(AppSettingActivity.this,"未定义设置",Toast.LENGTH_SHORT).show();
            }
        });
        setPullArticle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(AppSettingActivity.this,"未定义设置",Toast.LENGTH_SHORT).show();
            }
        });
        setpullNotifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(AppSettingActivity.this,"未定义设置",Toast.LENGTH_SHORT).show();
            }
        });
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
            case R.id.set_third_party:
                jump(ThirdPartyActivity.class);
                break;
            case R.id.set_image_quality:
                showImageQualityDislog();
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
     * 设置更改App的整画面质量的弹出对话框（还未设置成调整全部）
     */
    private void showImageQualityDislog(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(AppSettingActivity.this);
        builder.setTitle("画面质量");
        final String[] str = new String[]{"高品质","低品质"};
        builder.setItems(str, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0:
                        imageMode.setText("高品质");
                        break;
                    case 1:
                        imageMode.setText("低品质");
                        break;
                    default:
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

    /**
     * active的无数据跳转
     * @param cls 指定的active
     */
    private void jump(Class cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }


}
