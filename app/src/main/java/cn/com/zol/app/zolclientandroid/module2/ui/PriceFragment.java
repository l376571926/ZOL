package cn.com.zol.app.zolclientandroid.module2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * 查报价模块Fragment
 * Created by liyiwei on 2016/2/2.
 */
public class PriceFragment extends BaseFragment implements AdapterView.OnItemClickListener
{
    private ListView listView;

    @Override
    protected int getLayout()
    {
        return R.layout.frag_price;
    }

    @Override
    protected void initView()
    {
        listView = (ListView) getActivity().findViewById(R.id.fragment_price_listview_lv);
    }

    @Override
    protected void initEvent()
    {
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void initData()
    {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {

    }
}
