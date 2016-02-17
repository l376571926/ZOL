package cn.com.zol.app.zolclientandroid.module1.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.MyApplication;
import cn.com.zol.app.zolclientandroid.other.adapter.PublicItemAdapter;
import cn.com.zol.app.zolclientandroid.other.bean.PublicListTItem;
import cn.com.zol.app.zolclientandroid.other.utils.PublicStringRequestUtils;

/**
 * 头条模块
 * Created by liyiwei on 2016/2/3.
 */
public class TouTiao extends ListFragment implements PublicStringRequestUtils.OnListDataChangeListener, PublicStringRequestUtils.OnPicsDataChangeListener
{
    private List<RelativeLayout> relativeLayoutList = new ArrayList<>();
    private PublicItemAdapter adapter;

    private PagerAdapter bannerAdapter = new PagerAdapter()
    {
        @Override
        public int getCount()
        {
            return relativeLayoutList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object)
        {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position)
        {
            container.addView(relativeLayoutList.get(position));
            return relativeLayoutList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView(relativeLayoutList.get(position));
        }
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        PublicStringRequestUtils requestUtils = new PublicStringRequestUtils(this, this);
        requestUtils.request("0", "0");

        addListViewHeader();
        addListViewBody();
    }

    /**
     * 显示ViewPager横幅广告
     */
    private void addListViewHeader()
    {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.fragment_news_public_listview_header, null);

        ViewPager viewPager = ((ViewPager) inflate.findViewById(R.id.fragment_news_public_listview_header_container_vp));

        viewPager.setAdapter(bannerAdapter);
        getListView().addHeaderView(inflate);
    }

    private List<PublicListTItem.ListEntity> listEntities = new ArrayList<>();

    /**
     * 显示ListView中的数据
     */
    private void addListViewBody()
    {
        adapter = new PublicItemAdapter(getActivity(), listEntities);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        Toast.makeText(getActivity(), adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setListBodyData(List<PublicListTItem.ListEntity> listEntities)
    {
        this.listEntities.addAll(listEntities);
    }

    @Override
    public void setListHeaderData(List<PublicListTItem.PicsEntity> picsEntities)
    {
        relativeLayoutList.clear();
        for (PublicListTItem.PicsEntity picsEntity : picsEntities)
        {
            View layout = getActivity().getLayoutInflater().inflate(R.layout.fragment_news_toutiao_banner_item, null);

            RelativeLayout relativeLayout = (RelativeLayout) layout.findViewById(R.id.container);
            ImageView imageView = (ImageView) layout.findViewById(R.id.toutiao_item_icon);
            TextView textView = (TextView) layout.findViewById(R.id.stitle);

            String imgsrc = picsEntity.getImgsrc();
            MyApplication.imageLoader.get(imgsrc, ImageLoader.getImageListener(imageView, 0, 0));
            String stitle = picsEntity.getStitle();
            textView.setText(stitle);

            relativeLayoutList.add(relativeLayout);
        }
        bannerAdapter.notifyDataSetChanged();
    }
}
