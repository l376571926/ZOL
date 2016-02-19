package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class SecondHandActivity extends Activity implements View.OnClickListener{

    private WebView webView ;
    private ProgressBar webProgress ;
    private ImageView backIV,sharedIV;
    private final String WEB_URL = "http://wap.zol.com.cn/ershou/?vs=and420&ssid=0&t=1455708005&token=c3988c3376c9ed2d10fd52adcb5e5f7f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolBarUtils.setContentView(this,R.layout.activity_second_hand);
        initView();
        initEvent();
    }

    private void initView() {

        webView = (WebView) findViewById(R.id.second_hand_web);
        webProgress = (ProgressBar) findViewById(R.id.second_web_progbar);
        backIV = (ImageView) findViewById(R.id.second_hand_back);
        sharedIV = (ImageView) findViewById(R.id.second_hand_shared);

        backIV.setOnClickListener(this);
        sharedIV.setOnClickListener(this);

        webView.setWebViewClient(new WebViewClient());

    }


    private void initEvent() {

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                webProgress.setVisibility(View.VISIBLE);
                webProgress.setVisibility(newProgress);
                if (newProgress == 100){
                    webProgress.setVisibility(View.GONE);
                }
            }
        });
        webView.loadUrl(WEB_URL);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.second_hand_back){
            finish();
        }else if (v.getId()==R.id.second_hand_shared){
            Toast.makeText(this,"弹出分享界面",Toast.LENGTH_SHORT).show();
        }
    }
}
