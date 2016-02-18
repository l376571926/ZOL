package cn.com.zol.app.zolclientandroid.other.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lidroid.xutils.util.LogUtils;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;

public class KyIndicator extends HorizontalScrollView
{
    /**
     * 用来存放TextView标签的集合
     */
    private List<View> tabs;
    private boolean barVisibility = true;//是否显示滚动条
    private int barHeight = dip2px(this.getContext(), 3);//滚动条高度
    private int barColor = 0xFF1283EC;//滚动条颜色
    /**
     * 当前选中标签的序号-1
     */
    private int selectedIndex = 0;//当前选中的tab
    private OnTabSelectedListener onTabSelectedListener;

    public KyIndicator(Context context)
    {
        super(context);
        this.setHorizontalScrollBarEnabled(false);
        this.setWillNotDraw(false);
    }

    public KyIndicator(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.setHorizontalScrollBarEnabled(false);
        this.setWillNotDraw(false);
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!barVisibility)
            return;
        if (tabs.size() == 0)
            return;
    }

    /**
     * 添加wrapper
     */
    public void addTab(View tab)
    {
        if (tabs == null)
            tabs = new ArrayList<>();
        LinearLayout root = (LinearLayout) this.getChildAt(0);
        if (root == null)
        {
            root = new LinearLayout(this.getContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            root.setLayoutParams(lp);
            root.setGravity(Gravity.CENTER);
            this.addView(root);
        }
        tabs.add(tab);
        root.addView(tab);
        final int position = tabs.size() - 1;
        tab.setClickable(true);
        tab.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                TextView textView = ((TextView) arg0.findViewById(R.id.textview));
//                LogUtils.e(textView.getText() + "被点击了");
                setCurrentTab(position);
            }
        });
    }

    /**
     * 设置当前tab,并显示在屏幕中央
     */
    public void setCurrentTab(int position)
    {
        if (tabs.size() == 0)
        {
            return;
        }
        /**
         * 得到标签栏的LinearLayout
         */
        View view = tabs.get(position);
        TextView textView = (TextView) view.findViewById(R.id.textview);
//        LogUtils.e((textView.getText() + "跟随移动并选中"));
        LinearLayout root = (LinearLayout) this.getChildAt(0);
        int totalWidth = 0;
        for (int i = 0; i < position; i++)
        {
            View child = root.getChildAt(i);//从LinearLayout中循环获取子控件,得到所有之前添加进去的TextView
            int childWidth = child.getWidth();//获取每个TextView的宽度
            totalWidth += childWidth;//计算所有TextView控件的总宽度,也就是整个标题栏所有标签相加的总长度,包括没有显示在屏幕上的,在屏幕外面的长度
        }
        int screenWidth = this.getWidth();//获取屏幕宽度
        int currentTextViewWidth = root.getChildAt(position).getWidth();//当前TextView标签控件的宽度
        int moveSize = totalWidth - (screenWidth / 2 - currentTextViewWidth / 2);//屏幕中间位置的坐标
        smoothScrollTo(moveSize, 0);//控件横向移动到指定位置
        if (selectedIndex == position)
            return;
        selectedIndex = position;
        if (onTabSelectedListener != null)
        {
            for (int i = 0; i < tabs.size(); i++)
            {
                if (i == position)
                {
                    continue;
                }
                onTabSelectedListener.unSelected(tabs.get(i), i);
            }
            onTabSelectedListener.Selected(view, position);
        }
    }

    /**
     * 计算总宽度
     */
    private int getTotalWidth()
    {
        int totalWidth = 0;
        LinearLayout root = (LinearLayout) this.getChildAt(0);
        for (int i = 0; i < tabs.size(); i++)
        {
            View child = root.getChildAt(i);
            totalWidth += child.getWidth();
        }
        return totalWidth;
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 标签选中监听器
     *
     * @param onTabSelectedListener
     */
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener)
    {
        this.onTabSelectedListener = onTabSelectedListener;
    }

    public interface OnTabSelectedListener
    {
        void Selected(View tab, int index);

        void unSelected(View tab, int index);
    }
}
