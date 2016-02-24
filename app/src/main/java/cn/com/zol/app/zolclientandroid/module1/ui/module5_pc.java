package cn.com.zol.app.zolclientandroid.module1.ui;

import android.view.View;

import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.adapter.FragNewsTtItemAdapter;
import cn.com.zol.app.zolclientandroid.module1.bean.Headline;
import cn.com.zol.app.zolclientandroid.module1.utils.PublicStringRequestUtils;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class Module5_pc extends NewsChildBaseFragment
{

    private List<Headline.ListEntity> listEntityList;
    private FragNewsTtItemAdapter itemAdapter;

    @Override
    protected void sendDataRequest()
    {
        /**
         * 请求头条UI所需要展示的数据
         */
        PublicStringRequestUtils requestUtils = new PublicStringRequestUtils(this);
        requestUtils.request("2");
    }

    @Override
    protected void addListViewBody()
    {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.frag_news_pc_header, null);
        getListView().addHeaderView(inflate);
    }

    @Override
    protected void addListViewHeader()
    {
        listEntityList = new ArrayList<>();
        itemAdapter = new FragNewsTtItemAdapter(getActivity(), listEntityList);
        getListView().setDividerHeight(0);
        setListAdapter(itemAdapter);

    }

    @Override
    public void stringRequestResult(String response)
    {
//        LogUtils.e("评测模块请求数据成功!response=" + response);
//        Logger.json(response);

        List<Headline.ListEntity> listEntityList = Headline.ListEntity.arrayListEntityFromData(response, "list");
        this.listEntityList.addAll(listEntityList);
        itemAdapter.notifyDataSetChanged();

    }
}
