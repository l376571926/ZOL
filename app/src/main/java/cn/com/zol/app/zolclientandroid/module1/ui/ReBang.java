package cn.com.zol.app.zolclientandroid.module1.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;

import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.adapter.PublicItemAdapter;
import cn.com.zol.app.zolclientandroid.other.bean.PublicListTItem;
import cn.com.zol.app.zolclientandroid.other.utils.PublicStringRequestUtils;
import cn.com.zol.app.zolclientandroid.other.utils.PublicStringRequestUtils.OnListDataChangeListener;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class ReBang extends ListFragment implements OnListDataChangeListener
{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        addListViewHeader();
        addListViewBody();
    }

    /**
     * 显示ListView的头
     */
    private void addListViewHeader()
    {
        /**
         * 获取ListView头布局视图,并将头布局添加到ListView的主布局中去
         */
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.fragment_news_rebang_header, null);
        getListView().addHeaderView(inflate);
    }

    /**
     * 显示ListView的主体内容
     */
    public void addListViewBody()
    {
        PublicStringRequestUtils requestUtils = new PublicStringRequestUtils(this);
        requestUtils.request("8", "1");
    }

    @Override
    public void setListBodyData(List<PublicListTItem.ListEntity> listEntities)
    {
        PublicItemAdapter itemAdapter = new PublicItemAdapter(getActivity(), listEntities);
        /**
         * ListFragmentk中设置适配器要用setListAdapter(adapter),而不是getListView().setAdapter(adapter);
         */
        setListAdapter(itemAdapter);
    }
}
