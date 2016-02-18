package cn.com.zol.app.zolclientandroid.module1.ui;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * 资讯模块Fragment
 * <p/>
 * Created by liyiwei on 2016/2/2.
 */
public class NewsFragment extends BaseFragment implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener
{
    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private RadioButton ttRbtn;
    private RadioButton rbRbtn;
    private RadioButton dyRbtn;
    private RadioButton xwRbtn;
    private RadioButton pcRbtn;
    private RadioButton sjRbtn;
    private RadioButton smRbtn;
    private RadioButton dnRbtn;
    private RadioButton zjRbtn;
    private RadioButton wsRbtn;
    private RadioButton dgRbtn;
    private RadioButton zbRbtn;
    private HorizontalScrollView horizontalScrollView;
    private ImageView titleRightIv;

    /**
     * 初始化布局
     *
     * @return 界面展示的基础布局
     */
    @Override
    protected int getLayout()
    {
        return R.layout.fragment_news;
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initView()
    {
        horizontalScrollView = (HorizontalScrollView) getActivity().findViewById(R.id.fragment_news_titlebar_hsv);
        radioGroup = (RadioGroup) getActivity().findViewById(R.id.fragment_news_titlebar_rg);
        ttRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_tt_rb);
        ttRbtn.setChecked(true);
        rbRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_rb_rb);
        dyRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_dy_rb);
        xwRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_xw_rb);
        pcRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_pc_rb);
        sjRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_sj_rb);
        smRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_sm_rb);
        dnRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_dn_rb);
        zjRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_zj_rb);
        wsRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_ws_rb);
        dgRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_dg_rb);
        zbRbtn = (RadioButton) getActivity().findViewById(R.id.fragment_news_titlebar_zb_rb);
        titleRightIv = (ImageView) getActivity().findViewById(R.id.fragment_news_titlebar_img_iv);

        viewPager = (ViewPager) getActivity().findViewById(R.id.fragment_news_viewpager_container_vp);

    }

    /**
     * 初始化事件
     */
    @Override
    protected void initEvent()
    {
        radioGroup.setOnCheckedChangeListener(this);
        viewPager.addOnPageChangeListener(this);
    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData()
    {
        String tabStr[] = {"头条", "热榜", "订阅", "新闻", "评测", "手机", "数码", "电脑", "攒机", "外设", "导购", "直播"};
        showFragment();

    }

    /**
     * 显示12个子栏目fragment
     */
    private void showFragment()
    {
        /**
         * 要展示在ViewPager中的fragment
         */
        final List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new TouTiao());
        fragmentList.add(new ReBang());
        fragmentList.add(new DingYue());
        fragmentList.add(new XinWen());
        fragmentList.add(new PingCe());
        fragmentList.add(new ShouJi());
        fragmentList.add(new ShuMa());
        fragmentList.add(new DianNao());
        fragmentList.add(new ZangJi());
        fragmentList.add(new WaiShe());
        fragmentList.add(new DaoGou());
        fragmentList.add(new ZhiBo());

        viewPager.setAdapter(new FragmentStatePagerAdapter(getChildFragmentManager())
        {
            @Override
            public Fragment getItem(int position)
            {
                return fragmentList.get(position);
            }

            @Override
            public int getCount()
            {
                return fragmentList.size();
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
    {
    }

    @Override
    public void onPageSelected(int position)
    {
        changeTabTextColorAndLocation(position);
//        LogUtils.e(position + "");
    }

    @Override
    public void onPageScrollStateChanged(int state)
    {
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId)
    {
        //循环读取RadioGroup中所有RadioButton的Id并存入集合中
        List<Integer> idList = new ArrayList<>();
        for (int i = 0; i < group.getChildCount(); i++)
        {
            idList.add(group.getChildAt(i).getId());
        }
        //遍历集合中的id与checkedId进行比较,得出当前选中RadioButton的索引
        int position = 0;
        for (Integer integer : idList)
        {
            if (integer == checkedId)
            {
                break;
            } else
            {
                position++;
            }
        }
        //设置当前RadioButton高亮,并平移到屏幕中央
        changeTabTextColorAndLocation(position);
        //根据position设置当前page页
        viewPager.setCurrentItem(position);
    }

    /**
     * 平移点击的按钮到屏幕中间位置并高亮
     *
     * @param position 选中控件在HorizontalScrollView中的索引
     */
    private void changeTabTextColorAndLocation(int position)
    {
        int childCount = radioGroup.getChildCount();
//        LogUtils.e("平移点击的按钮到屏幕中间位置并高亮,changeTabTextColorAndLocation:" + radioGroup.toString());
        for (int i = 0; i < childCount; i++)
        {
            RadioButton childRadioButton = (RadioButton) radioGroup.getChildAt(i);
            if (position == i)
            {
                childRadioButton.setTextColor(Color.YELLOW);
            } else
            {
                childRadioButton.setTextColor(Color.RED);
            }
        }

        //获取屏幕分辨率等参数
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        //获取屏幕中间位置(除去右边图片宽度)的x轴坐标,midScreenX
        int titleRightIvWidth = titleRightIv.getWidth();
//        LogUtils.e("图片宽度titleRightIvWidth=" + titleRightIvWidth);

        int screenWidthPixels = metrics.widthPixels;
//        LogUtils.e("屏宽screenWidthPixels=" + screenWidthPixels);

        int midScreenX = (screenWidthPixels - titleRightIvWidth) / 2;
//        LogUtils.e("中屏X坐标(去图片)midScreenX=" + midScreenX);

        //获取单个RadioButton的宽度,itemWidth,因为布局的所有RadioButton均按1:1权重分配宽度,所以每个RadioButton的宽度是一样的
        float currentItemX = radioGroup.getChildAt(position).getX();
//        LogUtils.e("当前RadioButton的currentItemX=" + currentItemX);

        //当前选中RadioButton的几何中心的X坐标
        int offsetX = ((int) currentItemX) - midScreenX;
//        LogUtils.e("偏移量offsetX=" + offsetX);
        horizontalScrollView.smoothScrollTo(offsetX, 0);

    }
}
