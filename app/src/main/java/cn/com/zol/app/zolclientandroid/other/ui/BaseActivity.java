package cn.com.zol.app.zolclientandroid.other.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;

import cn.com.zol.app.zolclientandroid.R;

/**
 * 抽象类可以没有抽象方法,但是如果一个类内部有抽象方法,那么这个类必须声明为抽象类
 * Created by liyiwei on 2016/1/29.
 */
public abstract class BaseActivity extends FragmentActivity// implements View.OnClickListener
{
    protected FrameLayout llChildContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

//        ToolBarUtils.setContentView(this, R.layout.activity_base);
        setContentView(R.layout.activity_base);
        //父类控件初始化
        initDefaultView();
        initDefaultEvent();

        //填充从子类获得的布局到父类的container中
        getLayoutInflater().inflate(getLayout(), llChildContainer);

        //子类控件初始化
        initView();
        initEvents();
        initData();
    }

    private void initDefaultView()
    {
        llChildContainer = (FrameLayout) findViewById(R.id.activity_base_content_container_fl);

    }

    private void initDefaultEvent()
    {

    }

    /**
     * 获取布局
     *
     * @return
     */
    protected abstract int getLayout();

    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 初始化事件
     */
    protected abstract void initEvents();

    /**
     * 初始化数据
     */
    protected abstract void initData();

}


