package cn.com.zol.app.zolclientandroid.module1.ui;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
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
    private HorizontalScrollView horizontalScrollView;
    private ImageView titleRightIv;
    /**
     * 上一个被点击的RadioButton
     */
    private RadioButton lastRadioButton;

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
        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(0);
        radioButton.performClick();
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
        fragmentList.add(new Module1_tt());
        fragmentList.add(new Module2_rb());
        fragmentList.add(new Module3_dy());
        fragmentList.add(new Module4_xw());
        fragmentList.add(new Module5_pc());
        fragmentList.add(new Module6_sj());
        fragmentList.add(new Module7_sm());
        fragmentList.add(new Module8_dn());
        fragmentList.add(new Module9_zj());
        fragmentList.add(new Module10_ws());
        fragmentList.add(new Module11_dg());
        fragmentList.add(new Module12_zb());

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

//        LogUtils.e("测试初始状态RadioGroup是否执行!!!");

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
        changeCurrentTabColor(position);
        showTitleTabAnimation(position);
        moveCurrentTabToMid(position);
    }

    private void moveCurrentTabToMid(int position)
    {
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

    private void changeCurrentTabColor(int position)
    {
        int childCount = radioGroup.getChildCount();
//        LogUtils.e("平移点击的按钮到屏幕中间位置并高亮,changeTabTextColorAndLocation:" + radioGroup.toString());
        for (int i = 0; i < childCount; i++)
        {
            RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
            if (position == i)
            {
                /**
                 * 这里只执行一次
                 */
//                zoomIn(radioButton);
                radioButton.setTextColor(Color.WHITE);
            } else
            {
                /**
                 * 这里执行childCount-1次
                 */
//                zoomOut(radioButton);
                radioButton.setTextColor(0xffbee2ff);
            }

        }
    }

    private void showTitleTabAnimation(int position)
    {
        if (lastRadioButton != null)
        {
            zoomOut(lastRadioButton);
        }
        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(position);
        zoomIn(radioButton);
        lastRadioButton = radioButton;
    }

    /**
     * 放大动画
     *
     * @param view
     */
    private void zoomIn(View view)
    {
        ScaleAnimation animation = new ScaleAnimation(1.0f
                , 1.2f
                , 1.0f
                , 1.2f
                , Animation.RELATIVE_TO_SELF
                , 0.5f
                , Animation.RELATIVE_TO_SELF
                , 0.5f);
//        animation.setDuration(500);
//        animation.setRepeatCount(2);
        animation.setFillAfter(true);
//        animation.setStartOffset(1000);
        view.setAnimation(animation);
        view.startAnimation(animation);
//        LogUtils.e("控件放大执行完毕!");
    }

    /**
     * 缩小动画
     *
     * @param view
     */
    private void zoomOut(View view)
    {
        ScaleAnimation animation = new ScaleAnimation(1.2f
                , 1.0f
                , 1.2f
                , 1.0f
                , Animation.RELATIVE_TO_SELF
                , 0.5f
                , Animation.RELATIVE_TO_SELF
                , 0.5f);
//        animation.setDuration(500);
//        animation.setRepeatCount(2);
        animation.setFillAfter(true);
//        animation.setStartOffset(1000);
        view.setAnimation(animation);
        view.startAnimation(animation);
//        LogUtils.e("控件缩小执行完毕!");
    }
}
