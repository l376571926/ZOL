package cn.com.zol.app.zolclientandroid.module5.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.utils.ToolBarUtils;

public class SecondHandActivity extends Activity {

    private WebView webView ;
    private ProgressBar webProgress ;
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
        webView.loadUrl(WEB_URL);
    }

    private void initEvent() {
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100){
                    webProgress.setVisibility(View.GONE);
                }else {
                    if (View.GONE == webProgress.getVisibility()){
                        webProgress.setVisibility(View.VISIBLE);
                    }

                    webProgress.setVisibility(newProgress);

                }
                super.onProgressChanged(view,newProgress);
            }
        });
    }
}
