package cn.com.zol.app.zolclientandroid.module1.ui;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * Created by liyiwei on 2016/2/9.
 */
public class DingYue extends BaseFragment
{
    private WebView webView;

    @Override
    protected int getLayout()
    {
        return R.layout.fragment_news_dingyue;
    }

    @Override
    protected void initView()
    {
        webView = (WebView) getActivity().findViewById(R.id.fragment_news_dingyue_content_wv);
    }

    @Override
    protected void initEvent()
    {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        settings.setUseWideViewPort(true);
        /**
         * 绽放大网页到屏幕大小
         */
        settings.setLoadWithOverviewMode(true);

        webView.setWebChromeClient(new WebChromeClient()
        {
            @Override
            public void onProgressChanged(WebView view, int newProgress)
            {
                super.onProgressChanged(view, newProgress);
            }
        });

        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
//                if (url.contains("image.baidu.com"))
//                {
//                    Toast.makeText(getActivity(), "呵呵", Toast.LENGTH_SHORT).show();
//                }
                return false;
            }
        });
        webView.loadUrl("https://www.baidu.com");

    }

    @Override
    protected void initData()
    {

    }

}
