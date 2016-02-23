package cn.com.zol.app.zolclientandroid.module1.ui;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * Created by liyiwei on 2016/2/9.
 */
public class Module3_dy extends BaseFragment
{
    private static final String apiUrl = "http://lib.wap.zol.com.cn/ipj/rss/rssList/?v=3.0&imei=000000000000000";

    /**
     * {
     * "lisType": "2",
     * "media_ids": "1",
     * "version": "and420"
     * }
     */

    @Override
    protected int getLayout()
    {
        return R.layout.frag_news_dy;
    }

    @Override
    protected void initView()
    {
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
