package cn.com.zol.app.zolclientandroid.module1.ui;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.lidroid.xutils.util.LogUtils;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.adapter.FragNewsTtItemAdapter;
import cn.com.zol.app.zolclientandroid.module1.bean.Headline;
import cn.com.zol.app.zolclientandroid.module1.utils.PublicStringRequestUtils;
import cn.com.zol.app.zolclientandroid.other.MyApplication;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class Module6_sj extends NewsChildBaseFragment
{
    private List<RelativeLayout> relativeLayoutList;
    private PagerAdapter bannerAdapter;
    private List<Headline.ListEntity> listEntities;
    private FragNewsTtItemAdapter itemAdapter;

    @Override
    protected void sendDataRequest()
    {
        PublicStringRequestUtils requestUtils = new PublicStringRequestUtils(this);
        /**
         * 请求头条所需展示的数据
         */
        requestUtils.request("74");

    }

    @Override
    protected void addListViewHeader()
    {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.frag_news_public_lv_header, null);
        ViewPager viewPager = ((ViewPager) inflate.findViewById(R.id.frag_news_public_lv_header_container_vp));

        relativeLayoutList = new ArrayList<>();
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
        viewPager.setAdapter(bannerAdapter);
        getListView().addHeaderView(inflate);
    }

    @Override
    protected void addListViewBody()
    {
        listEntities = new ArrayList<>();
        itemAdapter = new FragNewsTtItemAdapter(getActivity(), listEntities);
        getListView().setDividerHeight(0);
        setListAdapter(itemAdapter);
    }

    @Override
    public void stringRequestResult(String response)
    {
        LogUtils.e("手机模块请求数据成功!response=" + response);

        List<Headline.ListEntity> listEntityList = Headline.ListEntity.arrayListEntityFromData(response, "list");

        listEntities.addAll(listEntityList);

        updateBannerDate(response);
    }

    private void updateBannerDate(String response)
    {
        List<Headline.PicsEntity> picsEntityList = Headline.PicsEntity.arrayPicsEntityFromData(response, "pics");
        for (Headline.PicsEntity picsEntity : picsEntityList)
        {
            String imgsrc = picsEntity.getImgsrc();
            String stitle = picsEntity.getStitle();

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
