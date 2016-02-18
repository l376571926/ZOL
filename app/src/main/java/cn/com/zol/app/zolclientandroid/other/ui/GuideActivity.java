package cn.com.zol.app.zolclientandroid.other.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module5.ui.LoginActivity;

/**
 * 引导页从左侧进入
 * Created by liyiwei on 2016/1/29.
 */
public class GuideActivity extends Activity implements View.OnClickListener, ViewPager.OnPageChangeListener
{
    private List<ImageView> imageViewLists;// = new ArrayList<>();
    private ViewPager viewPager;
    private RadioButton radioButton1, radioButton2, radioButton3;
    private RadioGroup radioGroup;
    private Button btnJump, btnWeixin, btnLogin;
    private LinearLayout llLogin;
    private TextView tvLook;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        initView();
        initData();
        initEvents();

    }

    private void initView()
    {

        /**
         * 类型转换语句可以用.castf增强输入
         * viewPager = findViewById(R.id.activity_guide_container_vp).cast
         */
        viewPager = ((ViewPager) findViewById(R.id.activity_guide_container_vp));

        /**
         * 三个小圆点
         */
        radioGroup = (RadioGroup) findViewById(R.id.activity_guide_radio_group_rg);
        radioButton1 = (RadioButton) findViewById(R.id.activity_guide_radio_button1_rb);
        radioButton2 = (RadioButton) findViewById(R.id.activity_guide_radio_button2_rb);
        radioButton3 = (RadioButton) findViewById(R.id.activity_guide_radio_button3_rb);
        /**
         * 跳过
         */
        btnJump = (Button) findViewById(R.id.activity_guide_jump_to_main_btn);
        /**
         * 登录/微信登录/先去看看
         */
        llLogin = (LinearLayout) findViewById(R.id.activity_guide_login_ll);
        btnLogin = (Button) findViewById(R.id.activity_guide_login_btn);
        btnWeixin = (Button) findViewById(R.id.activity_guide_login_by_weixin_btn);
        tvLook = (TextView) findViewById(R.id.activity_guide_look_tv);

    }

    private void initEvents()
    {
        btnLogin.setOnClickListener(this);
        btnWeixin.setOnClickListener(this);
        btnJump.setOnClickListener(this);
        tvLook.setOnClickListener(this);

        viewPager.addOnPageChangeListener(this);
        imageViewLists = new ArrayList<>();
        int[] img_id = {R.drawable.renew_nav_img_1
                , R.drawable.renew_nav_img_2
                , R.drawable.renew_nav_img_3};
        /**
         * 下面这个for循环可以用img_id.for快速打出来
         */
        for (int anImg_id : img_id)
        {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(anImg_id);
            imageViewLists.add(imageView);
        }
        viewPager.setAdapter(new PagerAdapter()
        {
            @Override
            public int getCount()
            {
                return imageViewLists.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object)
            {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object)
            {
                //加了下面这句话会报错
//                super.destroyItem(container, position, object);
                container.removeView(imageViewLists.get(position));

            }

            @Override
            public Object instantiateItem(ViewGroup container, int position)
            {
                ImageView imageView = imageViewLists.get(position);
                container.addView(imageView);
                return imageView;
            }
        });
    }

    private void initData()
    {

    }

    @Override
    public void onClick(View v)
    {
        /**
         * 下面这个switch代码块可以用v.switch快速打出来
         */
        switch (v.getId())
        {
            /**
             * 上面不添加监听这里按下是没有日志出来的
             */
            case R.id.activity_guide_login_btn:
                Log.e("tag", "登录按钮按下");
                startActivity(new Intent(this, LoginActivity.class));
                finish();
                break;
            case R.id.activity_guide_login_by_weixin_btn:
                Log.e("tag", "微信登录按钮按下");
                Toast.makeText(this, "未定义微信登录功能", Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_guide_look_tv:
                Log.e("tag", "先去看看按钮按下");
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                break;
            case R.id.activity_guide_jump_to_main_btn:
                Log.e("tag", "跳过按钮按下");
                Toast.makeText(this, "未定义跳过功能", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.e("tag", "不知道你按的啥");
                Toast.makeText(this, "无此按钮", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * @param position
     * @param positionOffset
     * @param positionOffsetPixels
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
    {

    }

    /**
     * ViewPager流动到了哪一页
     *
     * @param position
     */
    @Override
    public void onPageSelected(int position)
    {
        /**
         * 下面这个switch代码块可以用position.switch快速打出来
         */
        switch (position)
        {
            case 0: //引导页第一页
                llLogin.setVisibility(View.INVISIBLE);//隐藏登录/微信登录/先去看看,三个控件
                radioGroup.setVisibility(View.VISIBLE);//显示下方三个小圆点
                btnJump.setVisibility(View.VISIBLE);//显示跳转按钮

                radioButton1.setChecked(true);//默认选中第一个小圆点
                break;

            case 1://引导页第二页
                llLogin.setVisibility(View.INVISIBLE);//隐藏登录/微信登录/先去看看,三个控件
                radioGroup.setVisibility(View.VISIBLE);//显示下方三个小圆点
                btnJump.setVisibility(View.VISIBLE);//显示跳转按钮

                radioButton2.setChecked(true);//第二页时选中第二个小圆点
                break;

            case 2://引导页第三页
                llLogin.setVisibility(View.VISIBLE);//显示登录/微信登录/先去看看,三个控件
                radioGroup.setVisibility(View.INVISIBLE);//隐藏下方三个小圆点
                btnJump.setVisibility(View.INVISIBLE);//隐藏跳转按钮

                break;

        }
    }

    /**
     * @param state
     */
    @Override
    public void onPageScrollStateChanged(int state)
    {

    }
}
