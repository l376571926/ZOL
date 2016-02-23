package cn.com.zol.app.zolclientandroid.other.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.widget.RadioGroup;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.ui.NewsFragment;
import cn.com.zol.app.zolclientandroid.module2.ui.PriceFragment;
import cn.com.zol.app.zolclientandroid.module3.ui.BbsFragment;
import cn.com.zol.app.zolclientandroid.module4.ui.ShopFragment;
import cn.com.zol.app.zolclientandroid.module5.ui.UserFragment;

/**
 * 主页
 */
public class HomeActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener
{

    private RadioGroup radioGroup;
    private FragmentTransaction transaction;
    private Fragment[] fragments;

    @Override
    protected int getLayout()
    {
        return R.layout.activity_home;
    }

    @Override
    protected void initView()
    {
        /**
         * 在子类中操作父类控件,直接findViewById就可以了,不用以父类布局根视图来寻找
         */
        radioGroup = (RadioGroup) findViewById(R.id.activity_base_buttons_rg);

    }

    @Override
    protected void initEvents()
    {
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    protected void initData()
    {
        fragments = new Fragment[]
                {
                        new NewsFragment(),
                        new PriceFragment(),
                        new BbsFragment(),
                        new ShopFragment(),
                        new UserFragment()
                };
        transaction = getSupportFragmentManager().beginTransaction();

        int i = 0;
        for (Fragment fragment : fragments)
        {
            /**
             * 获取要添加的fragment的包名+类名
             */
            String name = fragment.getClass().getName();
            /**
             * 截取出要添加的fragment的类名
             */
            String substring = name.substring(name.lastIndexOf(".") + 1);
            /**
             * 将fragment的类名作为tag添加fragment,以便让后面的操作可以通过这个tag来找到它
             */
            transaction.add(R.id.activity_home_child_fragment_container_fl, fragment, substring);
            transaction.hide(fragment);
        }
        transaction.show(fragments[0]).commit();
    }

    /**
     * 监听   资讯/查报价/论坛/放心购/我     五个按钮的点击动作
     *
     * @param group     RadioGroup
     * @param checkedId 按下按钮的R.id.xxx
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId)
    {
        switch (checkedId)
        {
            case R.id.activity_base_news_rb:
                showFragment(0);
                break;
            case R.id.activity_base_price_rb:
                showFragment(1);
                break;
            case R.id.activity_base_bbs_rb:
                showFragment(2);
                break;
            case R.id.activity_base_shop_rb:
                showFragment(3);
                break;
            case R.id.activity_base_user_rb:
                showFragment(4);
                break;
        }
    }

    /**
     * 显示fragment数组中指定的fragment
     *
     * @param fragmentId 要显示的fragment在fragment数组中的索引,以0开始计算
     */
    private void showFragment(int fragmentId)
    {

        transaction = getSupportFragmentManager().beginTransaction();
        int i = 0;
        for (Fragment fragment : fragments)
        {
            if (fragmentId == i++)
            {
                //fragment只能show一次,按第二无效,因为它已经展示在手机屏幕上了,无法再次展示
                transaction.show(fragment);
            } else
            {
                transaction.hide(fragment);
            }
        }
        transaction.commit();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
//            View inflate = getLayoutInflater().inflate(R.layout.frag_news_dy, null);
//            WebView webView = (WebView) inflate.findViewById(R.id.fragment_news_dingyue_content_wv);
//            if (webView.canGoBack())
//            {
//                webView.goBack();
//                return true;
//            } else
//            {
//                return super.onKeyDown(keyCode, event);
//            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
