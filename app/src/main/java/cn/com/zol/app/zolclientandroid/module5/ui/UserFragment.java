package cn.com.zol.app.zolclientandroid.module5.ui;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.ui.BaseFragment;

/**
 * Created by liyiwei on 2016/2/2.
 */
public class UserFragment extends BaseFragment implements View.OnClickListener {

    private boolean flag;
    private TextView uEnter, uRead, uCollect, uPublish, uScore;

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

    }

    @Override
    protected void initEvent() {
        uEnter.setOnClickListener(this);
        uRead.setOnClickListener(this);
        uCollect.setOnClickListener(this);
        uPublish.setOnClickListener(this);
        uScore.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {

        //用户未登录，跳转登录页面

        if (flag == false) {
            startActivity(new Intent(getActivity(), LoginActivity.class));
        }
    }
}
