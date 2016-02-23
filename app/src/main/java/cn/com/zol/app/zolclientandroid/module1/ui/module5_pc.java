package cn.com.zol.app.zolclientandroid.module1.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;

import com.lidroid.xutils.util.LogUtils;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * Created by liyiwei on 2016/2/3.
 */
public class Module5_pc extends BaseFragment
{
    private Button zoomInBtn;
    private Button zoomOutBtn;
    private TextView testView;

    @Override
    protected int getLayout()
    {
        return R.layout.fragment_news_pingce;
    }

    @Override
    protected void initView()
    {
        zoomInBtn = (Button) getActivity().findViewById(R.id.fragment_news_pingce_zoom_in_btn);
        zoomOutBtn = (Button) getActivity().findViewById(R.id.fragment_news_pingce_zoom_out_btn);
        testView = (TextView) getActivity().findViewById(R.id.fragment_news_pingce_test_tv);

    }

    @Override
    protected void initEvent()
    {
        zoomInBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                zoomIn(testView);
            }
        });
        zoomOutBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                zoomOut(testView);
            }
        });
    }

    @Override
    protected void initData()
    {

    }

    /**
     * 放大动画
     *
     * @param view
     */
    private void zoomIn(View view)
    {
        ScaleAnimation animation = new ScaleAnimation(1.0f
                , 1.4f
                , 1.0f
                , 1.4f
                , Animation.RELATIVE_TO_SELF
                , 0.5f
                , Animation.RELATIVE_TO_SELF
                , 0.5f);
        animation.setDuration(500);
////        animation.setRepeatCount(2);
        animation.setFillAfter(true);
////        animation.setStartOffset(1000);
        view.setAnimation(animation);
        view.startAnimation(animation);
        LogUtils.e("控件放大执行完毕!");
    }

    /**
     * 缩小动画
     *
     * @param view
     */
    private void zoomOut(View view)
    {
        ScaleAnimation animation = new ScaleAnimation(1.4f
                , 1.0f
                , 1.4f
                , 1.0f
                , Animation.RELATIVE_TO_SELF
                , 0.5f
                , Animation.RELATIVE_TO_SELF
                , 0.5f);
        animation.setDuration(500);
////        animation.setRepeatCount(2);
        animation.setFillAfter(true);
////        animation.setStartOffset(1000);
        view.setAnimation(animation);
        view.startAnimation(animation);
        LogUtils.e("控件缩小执行完毕!");
    }
}
