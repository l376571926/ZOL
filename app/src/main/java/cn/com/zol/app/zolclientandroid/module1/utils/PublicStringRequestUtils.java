package cn.com.zol.app.zolclientandroid.module1.utils;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.lidroid.xutils.util.LogUtils;

import cn.com.zol.app.zolclientandroid.other.MyApplication;

/**
 * 资讯模块下各子模块网络数据请求公有类
 * Created by liyiwei on 2016/2/15.
 */
public class PublicStringRequestUtils
{
    private OnDataChangeListener onListDataChangeListener;

    public PublicStringRequestUtils(OnDataChangeListener onListDataChangeListener)
    {
        this.onListDataChangeListener = onListDataChangeListener;
    }

    /**
     * @param class_id 0头条/8热榜/1新闻/2评测/74手机/7数码/210电脑/165攒机/353外设/6导购/15直播
     */
    public void request(String class_id)
    {
        /**
         * http://lib.wap.zol.com.cn/ipj/docList/?v=7.0&class_id=0&page=1&vs=and420&retina=1&last_time=2016-01-29%2010:05
         * v			7.0(必要)
         * class_id	    0头条/8热榜/1新闻/2评测/74手机/7数码/210电脑/165攒机/353外设/6导购/15直播
         * page		    1
         * vs			and420
         * retina		1
         * last_time	2016-01-29%2010:05
         */

        String apiUrl = "http://lib.wap.zol.com.cn/ipj/docList/?v=7.0";
        String page = "0";
        String vs = "and420";
        String retina = "1";

        StringBuilder builder = new StringBuilder(apiUrl);
        builder.append("&class_id=" + class_id);
        builder.append("&page=" + page);
        builder.append("&vs=" + vs);
        builder.append("&retina=" + retina);
        apiUrl = builder.toString();

        StringRequest request = new StringRequest(apiUrl
                , new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
//                LogUtils.e("请求数据成功,response=" + response);
                if (onListDataChangeListener != null)
                {
                    onListDataChangeListener.stringRequestResult(response);
                }
            }
        }
                , new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                LogUtils.e("请求数据失败:" + error.getMessage());
            }
        });
        MyApplication.requestQueue.add(request);
    }

    /**
     * @param class_id 0头条/8热榜/1新闻/2评测/74手机/7数码/210电脑/165攒机/353外设/6导购/15直播
     * @param page     第几页
     */
    public void request(String class_id, String page)
    {
        /**
         * http://lib.wap.zol.com.cn/ipj/docList/?v=7.0&class_id=0&page=1&vs=and420&retina=1&last_time=2016-01-29%2010:05
         * v			7.0(必要)
         * class_id	    0头条/8热榜/1新闻/2评测/74手机/7数码/210电脑/165攒机/353外设/6导购/15直播
         * page		    1
         * vs			and420
         * retina		1
         * last_time	2016-01-29%2010:05
         */

        String apiUrl = "http://lib.wap.zol.com.cn/ipj/docList/?v=7.0";
        String vs = "and420";
        String retina = "1";

        StringBuilder builder = new StringBuilder(apiUrl);
        builder.append("&class_id=" + class_id);
        builder.append("&page=" + page);
        builder.append("&vs=" + vs);
        builder.append("&retina=" + retina);
        apiUrl = builder.toString();

        StringRequest request = new StringRequest(apiUrl
                , new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
//                LogUtils.e("请求数据成功,response=" + response);
                if (onListDataChangeListener != null)
                {
                    onListDataChangeListener.stringRequestResult(response);
                }
            }
        }
                , new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                LogUtils.e("请求数据失败:" + error.getMessage());
            }
        });
        MyApplication.requestQueue.add(request);
    }

    public interface OnDataChangeListener
    {
        void stringRequestResult(String response);
    }
}
