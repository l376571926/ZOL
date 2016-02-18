package cn.com.zol.app.zolclientandroid.module4.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyiwei on 2016/2/10.
 */
public class Banner
{

    /**
     * picUrl : http://i0.mercrt.fd.zol-img.com.cn/g5/M00/0F/06/ChMkJlauuz6IZS2uAAGPPFtdbo0AAH8gwOi_SYAAY9U580.jpg
     * hitUrl : http://go.zol.com/topic/5665384.html?spm=691.39775
     */

    private String picUrl;
    private String hitUrl;

    public static Banner objectFromData(String str)
    {

        return new Gson().fromJson(str, Banner.class);
    }

    public static Banner objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getJSONArray(key).toString(), Banner.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Banner> arrayBannerFromData(String str)
    {

        Type listType = new TypeToken<ArrayList<Banner>>()
        {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Banner> arrayBannerFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Banner>>()
            {
            }.getType();

            return new Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return new ArrayList();

    }

    public void setPicUrl(String picUrl)
    {
        this.picUrl = picUrl;
    }

    public void setHitUrl(String hitUrl)
    {
        this.hitUrl = hitUrl;
    }

    public String getPicUrl()
    {
        return picUrl;
    }

    public String getHitUrl()
    {
        return hitUrl;
    }
}
