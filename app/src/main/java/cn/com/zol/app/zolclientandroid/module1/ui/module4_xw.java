package cn.com.zol.app.zolclientandroid.module1.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.adapter.FragNewsXwItemAdapter;
import cn.com.zol.app.zolclientandroid.module1.bean.Headline;
import cn.com.zol.app.zolclientandroid.module1.bean.News;
import cn.com.zol.app.zolclientandroid.module1.utils.PublicStringRequestUtils;
import cn.com.zol.app.zolclientandroid.other.MyApplication;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class Module4_xw extends ListFragment implements PublicStringRequestUtils.OnDataChangeListener
{

    private List<RelativeLayout> relativeLayoutList = new ArrayList<>();
    private FragNewsXwItemAdapter itemAdapter;
    private PagerAdapter bannerAdapter;
    private List<News.ListEntity> listEntities;// = new ArrayList<>();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        /**
         * 请求头条UI所需要展示的数据
         */
        PublicStringRequestUtils requestUtils = new PublicStringRequestUtils(this);
        requestUtils.request("1");

        addListViewHeader();
        addListViewBody();
    }

    /**
     * 显示ViewPager横幅广告
     */
    private void addListViewHeader()
    {
        bannerAdapter = new PagerAdapter()
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
        //添加头布局
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.frag_news_public_lv_header, null);
        getListView().addHeaderView(inflate);
        //设置ListFragment的适配器
        ViewPager viewPager = ((ViewPager) inflate.findViewById(R.id.frag_news_public_lv_header_container_vp));
        viewPager.setAdapter(bannerAdapter);
    }

    /**
     * 显示ListView中的数据
     */
    private void addListViewBody()
    {
        listEntities = new ArrayList<>();
        itemAdapter = new FragNewsXwItemAdapter(getActivity(), listEntities);
        setListAdapter(itemAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        Toast.makeText(getActivity(), itemAdapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void stringRequestResult(String response)
    {
//        LogUtils.e("新闻模块请求数据成功!response=" + response);
//        Logger.json(response);

        updateBodyDate(response);

        updateBannerDate(response);
    }

    /**
     * 更新ListView的数据
     *
     * @param response 请求到的数据
     */
    private void updateBodyDate(String response)
    {
        List<News.ListEntity> listEntityList = News.ListEntity.arrayListEntityFromData(response, "list");

        this.listEntities.clear();
        this.listEntities.addAll(listEntityList);

    }

    /**
     * 更新横幅广告栏的数据
     *
     * @param response 请求到的数据
     */
    private void updateBannerDate(String response)
    {
        List<Headline.PicsEntity> picsEntityList = Headline.PicsEntity.arrayPicsEntityFromData(response, "pics");
        for (Headline.PicsEntity picsEntity : picsEntityList)
        {
            String imgsrc = picsEntity.getImgsrc();
            String stitle = picsEntity.getStitle();

            /**
             * 这句不能提取出去，否则会报错
             */
            View layout = getActivity().getLayoutInflater().inflate(R.layout.frag_news_tt_lv_header, null);

            RelativeLayout relativeLayout = (RelativeLayout) layout.findViewById(R.id.container);
            NetworkImageView imageView = (NetworkImageView) layout.findViewById(R.id.frag_news_tt_item_icon_niv);
            TextView textView = (TextView) layout.findViewById(R.id.frag_news_tt_lv_header_title_tv);

            imageView.setImageUrl(imgsrc, MyApplication.imageLoader);
            textView.setTextColor(Color.WHITE);
            textView.setText(stitle);

            relativeLayoutList.add(relativeLayout);
        }
        bannerAdapter.notifyDataSetChanged();
    }
}
