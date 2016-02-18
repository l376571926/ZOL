package cn.com.zol.app.zolclientandroid.module5.ui;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * Created by liyiwei on 2016/2/2.
 */
public class UserFragment extends BaseFragment implements View.OnClickListener {

    private boolean flag;
    private TextView uEnter, uRead, uCollect, uPublish, uScore;
    private RelativeLayout myMsg,myTask,myOrders,mySec,myRecommends,mySettings;

    @Override
    protected int getLayout() {
        return R.layout.fragment_user;
    }

    @Override
    protected void initView() {
        uEnter = (TextView) root.findViewById(R.id.personal_avatar_enter);
        uRead = (TextView) root.findViewById(R.id.personal_read);
        uCollect = (TextView) root.findViewById(R.id.personal_collect);
        uPublish = (TextView) root.findViewById(R.id.personal_publish);
        uScore = (TextView) root.findViewById(R.id.personal_score);
        myMsg = (RelativeLayout) root.findViewById(R.id.personal_my_msg);
        myTask = (RelativeLayout) root.findViewById(R.id.personal_my_task);
        myOrders = (RelativeLayout) root.findViewById(R.id.personal_my_orders);
        mySec = (RelativeLayout) root.findViewById(R.id.personal_my_sec);
        myRecommends = (RelativeLayout) root.findViewById(R.id.personal_my_recommends);
        mySettings = (RelativeLayout) root.findViewById(R.id.personal_my_settings);

    }

    @Override
    protected void initEvent() {
        uEnter.setOnClickListener(this);
        uRead.setOnClickListener(this);
        uCollect.setOnClickListener(this);
        uPublish.setOnClickListener(this);
        uScore.setOnClickListener(this);
        myMsg.setOnClickListener(this);
        myTask.setOnClickListener(this);
        myOrders.setOnClickListener(this);
        mySec.setOnClickListener(this);
        myRecommends.setOnClickListener(this);
        mySettings.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {

        //用户未登录，跳转登录页面

        switch (v.getId()){
            case R.id.personal_my_sec:
                startActivity(new Intent(getActivity(),SecondHandActivity.class));
                break;
            case R.id.personal_my_recommends:
                startActivity(new Intent(getActivity(),RecommendActivity.class));
                break;
            case R.id.personal_my_settings:
                break;
            case R.id.personal_my_msg:
                jump(flag);
                break;
            case R.id.personal_my_orders:
                jump(flag);
                break;
            case R.id.personal_my_task:
                jump(flag);
                break;
            case R.id.personal_read:
                jump(flag);
                break;
            case R.id.personal_collect:
                jump(flag);
                break;
            case R.id.personal_publish:
                jump(flag);
                break;
            case R.id.personal_score:
                jump(flag);
                break;
            case R.id.personal_avatar_enter:
                jump(flag);
                break;
        }
    }

    /**
     * 根据用户是否登录确定跳转页面（还未记录，测试）
     * @param flag
     */
    private void jump(boolean flag)
    {
        if (!flag){
            startActivity(new Intent(getActivity(),LoginActivity.class));
        }
    }
}
