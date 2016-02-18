package cn.com.zol.app.zolclientandroid.other.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liyiwei on 2016/2/2.
 */
public abstract class BaseFragment extends Fragment
{
    protected View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        root = inflater.inflate(getLayout(), container, false);
        return root;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        initView();

        initEvent();

        initData();
    }

    /**
     * 获取布局
     *
     * @return
     */
    protected abstract int getLayout();

    /**
     * 初始化视图
     *
     * @return
     */
    protected abstract void initView();

    /**
     * 初始化事件
     *
     * @return
     */
    protected abstract void initEvent();

    /**
     * 初始化数据
     *
     * @return
     */
    protected abstract void initData();

}
