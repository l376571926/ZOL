package cn.com.zol.app.zolclientandroid.module4.ui;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.lidroid.xutils.util.LogUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module4.adapter.ItemAdapter;
import cn.com.zol.app.zolclientandroid.module4.bean.Banner;
import cn.com.zol.app.zolclientandroid.module4.bean.Item;
import cn.com.zol.app.zolclientandroid.other.MyApplication;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * 放心购模块
 * Created by liyiwei on 2016/2/2.
 */
public class ShopFragment extends BaseFragment
{

    private List<View> imageViewList;
    private RadioGroup radioGroup;

    private PagerAdapter pagerAdapter;
    private List<Item> itemList;
    /**
     * ViewPager当前页
     */
    private int currentPageId;

    @Override
    protected int getLayout()
    {
        return R.layout.fragment_shop;
    }

    private ViewPager viewPager;
    private ListView listView;

    @Override
    protected void initView()
    {
        listView = (ListView) getActivity().findViewById(R.id.goods_list);

        View inflate = getActivity().getLayoutInflater().inflate(R.layout.frag_shop_lv_header_viewpager, null);
        viewPager = (ViewPager) inflate.findViewById(R.id.frag_shop_viewpager_banner_vp);
        listView.addHeaderView(inflate);//先添加到ListView的头部,再设置适配器

        inflate = getActivity().getLayoutInflater().inflate(R.layout.fragment_shop_radio_group, null);
        radioGroup = (RadioGroup) inflate.findViewById(R.id.fragment_shop_buttons_rg);
        listView.addHeaderView(inflate);//先添加到ListView的头部,再设置适配器

    }

    private ItemAdapter itemAdapter;

    @Override
    protected void initEvent()
    {
        imageViewList = new ArrayList<>();
        pagerAdapter = new PagerAdapter()
        {
            @Override
            public int getCount()
            {
                return imageViewList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object)
            {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position)
            {
                container.addView(imageViewList.get(position));
                return imageViewList.get(position);
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object)
            {
                container.removeView(imageViewList.get(position));
            }
        };
        viewPager.setAdapter(pagerAdapter);

        Timer timer = new Timer();
        timer.schedule(
                new TimerTask()
                {
                    @Override
                    public void run()
                    {
                        if (imageViewList.size() != 0)
                        {
                            /**
                             * 下一个要显示的page页的索引
                             */
                            currentPageId = (currentPageId + 1) % imageViewList.size();
                            handler.obtainMessage().sendToTarget();
                        }
                    }
                }
                , 3000
                , 3000
        );

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {
            }

            @Override
            public void onPageSelected(int position)
            {
                currentPageId = position;
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {
//                LogUtils.e("自动滚动:" + state);
                if (state == 1)
                {
                    /**
                     * 当手指触摸ViewPager页面时,停止广告的自动滚动
                     */
                    manualPlayBanner = true;
//                    LogUtils.e("切换为手动滚动,停止自动滚动,无操作则5秒后切换回自动滚动");
                }
            }
        });

        itemList = new ArrayList<>();
        itemAdapter = new ItemAdapter(getActivity(), itemList);
        listView.setDividerHeight(0);
        listView.setAdapter(itemAdapter);
    }

    @Override
    protected void initData()
    {
        String apiUrlNewFocusPic = "http://api.zol.com/index.php?c=Tuan_AppReturn&a=NewFocusPic";
        String apiUrlNewGoodsList = "http://api.zol.com/index.php?c=Tuan_AppReturn&a=NewGoodsList";

        final String vs = "and420";
        downBannerData(apiUrlNewFocusPic, vs);

        String page = "1";
        downItemData(apiUrlNewGoodsList, vs, page);
    }

    /**
     * 使用Volley执行GET请求,下载ListView所要展示的数据
     */
    private void downItemData(String apiUrl, String vs, String page)
    {
        StringBuilder builder = new StringBuilder(apiUrl);
        builder.append("&vs=" + vs);
        builder.append("&page=" + page);
        apiUrl = builder.toString();

        StringRequest request = new StringRequest(apiUrl
                , new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
//                LogUtils.e("请求到ListView要展示的内容为:" + response);

                //直接将结果赋值给itemList,将无法更新ListView
                List<Item> items = Item.arrayItemFromData(((String) response));
//                LogUtils.e("获取到ShopFragment广告栏数据,大小为:" + items.size());
                itemList.clear();
                itemList.addAll(items);
            }
        }
                , new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                LogUtils.e("请求失败,未请求到ListView要展示的内容,错误信息为:" + error.getMessage());
            }
        });
        MyApplication.requestQueue.add(request);

    }

    private void downBannerData(String apiUrl, String vs)
    {
        StringBuilder builder = new StringBuilder(apiUrl);
        builder.append("&vs=" + vs);
        apiUrl = builder.toString();

        StringRequest request = new StringRequest(apiUrl
                , new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
//                LogUtils.e("请求到Banner要展示的内容为:" + response);

                List<Banner> bannerList = Banner.arrayBannerFromData(response);

                /**
                 * 获取所有横幅广告的图片链接地址存入集合中,并循环获得100倍相同链接,后面循环广告要用
                 */
                List<String> picUrlList = new ArrayList<>();
                for (int j = 0; j < 100; j++)
                {
                    for (int i = 0; i < bannerList.size(); i++)
                    {
                        Banner banner = bannerList.get(i);
                        String picUrl = banner.getPicUrl();
                        picUrlList.add(picUrl);
                    }
                }

                /**
                 * 取出集合中所有picUrl并设置ImageView
                 */
                for (int i = 0; i < picUrlList.size(); i++)
                {
                    ImageView imageView = new ImageView(getActivity());
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    MyApplication.imageLoader.get(picUrlList.get(i), ImageLoader.getImageListener(imageView, 0, 0));
                    imageViewList.add(imageView);
                }
                //通知适配器数据已更新
                pagerAdapter.notifyDataSetChanged();
                currentPageId = picUrlList.size() / 2;
                /**
                 * 设置ViewPager起始页面为图片链接集合总数的一半位置,这样就可以实现左右滑动很大数量而不到边界,假循环
                 */
                viewPager.setCurrentItem(currentPageId);
            }
        }
                , new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                LogUtils.e("请求失败,未请求到Banner要展示的内容,错误信息为:" + error.getMessage());
            }
        });
        MyApplication.requestQueue.add(request);
    }

    /**
     * 为true表示手动滚动广告
     */
    private boolean manualPlayBanner;
    private Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            /**
             * 默认自动滚动,当手指在ViewPager上有滑动操作时停止自动滚动,
             * 当无操作时,5秒延时后切换为自动滚动
             */
            if (manualPlayBanner)
            {
                new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Timer timer = new Timer();
                        timer.schedule(
                                new TimerTask()
                                {
                                    @Override
                                    public void run()
                                    {
                                        manualPlayBanner = false;
                                    }
                                }
                                , 5000
                        );
                    }
                }).start();
            } else
            {
                viewPager.setCurrentItem(currentPageId);
            }

        }
    };
}
