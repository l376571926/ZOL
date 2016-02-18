package cn.com.zol.app.zolclientandroid.other.utils;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.view.WindowManager;

/**
 * 全屏下显示透明系统通知栏的处理类
 * <p>
 * Created by liyiwei on 2016/2/1.
 */
public class ToolBarUtils
{

    /**
     * 使传入的Activity具有透明通知栏的功能
     *
     * @param activity    要设置通知栏透明效果的Activity
     * @param layoutResID Activity所要展示的布局文件
     */
    public static void setContentView(Activity activity, @LayoutRes int layoutResID)
    {
        addFlag(activity);//添加全屏显示透明通知栏参数
        activity.setContentView(layoutResID);
        show(activity);//显示通知栏

    }

    private static void addFlag(Activity activity)
    {
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);//让window占满整个手机屏幕，不留任何边界（border）
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);//window大小不再不受手机屏幕大小限制，即window可能超出屏幕之外，这时部分内容在屏幕之外。
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//实现系统通知栏透明
    }

    /**
     * 隐藏系统通知栏
     */
    private static void hide(Activity activity)
    {
        WindowManager.LayoutParams attrs = activity.getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        activity.getWindow().setAttributes(attrs);
    }

    /**
     * 显示系统通知栏
     */
    private static void show(Activity activity)
    {

        WindowManager.LayoutParams attrs = activity.getWindow().getAttributes();
        attrs.flags &= ~WindowManager.LayoutParams.FLAG_FULLSCREEN;
        activity.getWindow().setAttributes(attrs);
    }

}
