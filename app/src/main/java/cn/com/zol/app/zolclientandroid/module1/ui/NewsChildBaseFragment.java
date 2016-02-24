package cn.com.zol.app.zolclientandroid.module1.ui;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

import cn.com.zol.app.zolclientandroid.module1.utils.PublicStringRequestUtils;

/**
 * Created by liyiwei on 2016/2/24.
 */
public abstract class NewsChildBaseFragment extends ListFragment implements PublicStringRequestUtils.OnDataChangeListener
{
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        sendDataRequest();

        addListViewHeader();

        addListViewBody();

    }

    /**
     * 请求网络数据
     */
    protected abstract void sendDataRequest();

    /**
     * 添加ListView的头布局
     */
    protected abstract void addListViewHeader();

    /**
     * 添加ListView的主体数据
     */
    protected abstract void addListViewBody();

}
