package cn.com.zol.app.zolclientandroid.other.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.lidroid.xutils.util.LogUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.update.UmengUpdateAgent;

import java.util.Timer;
import java.util.TimerTask;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.MyApplication;
import cn.com.zol.app.zolclientandroid.other.bean.StartPic;

/**
 * 程序启动后的第一个activity
 * <p/>
 * 显示zol广告的页面
 */
public class LauncherActivity extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        UmengUpdateAgent.update(this);

        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.skip);
        imageView.setOnClickListener(this);

        /**
         * 下面这个if语句可以用isFirstOpen().if快速打出来
         */
        if (isFirstOpen())
        {
            getSharedPreferences("isFirstOpen", MODE_PRIVATE).edit().putBoolean("firstOpenFlag", false).commit();
            new Timer().schedule(new TimerTask()
            {
                @Override
                public void run()
                {
                    startActivity(new Intent(LauncherActivity.this, GuideActivity.class));
                    finish();
                }
            }, 3000);
        } else
        {
            imageView.setVisibility(View.VISIBLE);
            setLauncherImage();
            new Timer().schedule(new TimerTask()
            {
                @Override
                public void run()
                {
                    startActivity(new Intent(LauncherActivity.this, HomeActivity.class));
                    finish();
                }
            }, 5000);

        }

    }

    private boolean isFirstOpen()
    {
        /**
         *getSharedPreferences的第一个参数为想得到的预设文件的文件名,第二个私有就可以了
         *
         * getBoolean从预设文件中获取指定字段的值.如果该文件不存在,返回true
         */
        return getSharedPreferences("isFirstOpen", Context.MODE_PRIVATE).getBoolean("firstOpenFlag", true);
    }

    /**
     * 从网络获取app启动图片
     */
    private void setLauncherImage()
    {

        final ImageView imageView = ((ImageView) findViewById(R.id.start_image));
        String apiUrl = "http://lib.wap.zol.com.cn/ipj/wap_launch_logo_index.php?os=2";
        //1.发送请求
        StringRequest request = new StringRequest(
                apiUrl
                , new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
//                LogUtils.e("tag:StringRequest success result--->" + response);
                /**
                 * 获取手机分辨率
                 */
                DisplayMetrics metrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(metrics);
                String screenSize = "s" + metrics.widthPixels + "x" + metrics.heightPixels;

                StartPic.UrlEntity urlEntity = StartPic.UrlEntity.objectFromData(response, "url");
                if (urlEntity != null)
                {
                    String picUrl = "";
                    switch (screenSize)
                    {
                        case "s320x480":
                            picUrl = urlEntity.getS320x480();
                            break;
                        case "s480x854":
                            picUrl = urlEntity.getS480x854();
                            break;
                        case "s540x960":
                            picUrl = urlEntity.getS540x960();
                            break;
                        case "s720x1280":
                            picUrl = urlEntity.getS720x1280();
                            break;
                        case "s800x1280":
                            picUrl = urlEntity.getS800x1280();
                            break;
                        case "s1080x1800":
                            picUrl = urlEntity.getS1080x1800();
                            break;
                        case "s1080x1920":
                            picUrl = urlEntity.getS1080x1920();
                            break;
                        case "s1440x2560":
                            picUrl = urlEntity.getS1440x2560();
                            break;
                        default:
                            break;
                    }
                    MyApplication.imageLoader.get(
                            picUrl
                            , ImageLoader.getImageListener(imageView, 0, 0));
                }
            }
        }
                , new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                LogUtils.e("tag:StringRequest error result--->" + error.getMessage());
            }
        });
        //2.将请求加入请求队列
        MyApplication.requestQueue.add(request);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.skip:
                Toast.makeText(this, "跳过按钮换下了", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
