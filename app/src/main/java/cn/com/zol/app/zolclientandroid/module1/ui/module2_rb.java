package cn.com.zol.app.zolclientandroid.module1.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.adapter.FragNewsTtItemAdapter;
import cn.com.zol.app.zolclientandroid.module1.bean.Headline;
import cn.com.zol.app.zolclientandroid.module1.utils.PublicStringRequestUtils;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class Module2_rb extends ListFragment implements PublicStringRequestUtils.OnDataChangeListener
{
    private List<Headline.ListEntity> listEntities;// = new ArrayList<>();
    private FragNewsTtItemAdapter itemAdapter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        PublicStringRequestUtils requestUtils = new PublicStringRequestUtils(this);
        /**
         * 请求热榜所需展示的数据
         */
        requestUtils.request("8", "1");

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
        listEntities = new ArrayList<>();
        itemAdapter = new FragNewsTtItemAdapter(getActivity(), listEntities);
        /**
         * ListFragmentk中设置适配器要用setListAdapter(adapter),而不是getListView().setAdapter(adapter);
         */
        getListView().setDividerHeight(0);
        setListAdapter(itemAdapter);
    }

    @Override
    public void setListViewData(String response)
    {
//        LogUtils.e("热榜模块请求数据成功!response=" + response);

        List<Headline.ListEntity> listEntityList = Headline.ListEntity.arrayListEntityFromData(response, "list");
        listEntities.addAll(listEntityList);
        itemAdapter.notifyDataSetChanged();
    }
}
