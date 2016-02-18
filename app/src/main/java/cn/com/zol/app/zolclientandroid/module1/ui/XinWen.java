package cn.com.zol.app.zolclientandroid.module1.ui;

import android.webkit.WebView;
import android.widget.EditText;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class XinWen extends BaseFragment
{

    @Override
    protected int getLayout()
    {
        return R.layout.fragment_news_xinwen;
    }

    @Override
    protected void initView()
    {
        EditText editText = (EditText) getActivity().findViewById(R.id.fragment_news_xinwen_url_address_et);
        WebView webView = (WebView) getActivity().findViewById(R.id.fragment_news_xinwen_url_response_wv);

        String string = editText.getText().toString();
        webView.loadUrl(string);


    }

    @Override
    protected void initEvent()
    {

    }

    @Override
    protected void initData()
    {

    }
}
