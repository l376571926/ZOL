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
public class Item
{

    /**
     * picUrl : http://i2.mercrt.fd.zol-img.com.cn/g5/M00/09/00/ChMkJ1ahnWuIAQ2mAAFvd0tnMT8AAHjHQIx2KYAAW-P322.jpg
     * salePrice : 69.00
     * marketPrice : 299.00
     * goodsName : 3D智能捶打按摩 缓解疲劳 提高睡眠质量 增强免疫力
     * attentionNum : 1031
     * url : http://m.zol.com/tuan/22905.html
     * goodsType : 1
     * stauts : 剩9天
     */

    private String picUrl;
    private String salePrice;
    private String marketPrice;
    private String goodsName;
    private String attentionNum;
    private String url;
    private int goodsType;
    private String stauts;

    public static Item objectFromData(String str)
    {

        return new Gson().fromJson(str, Item.class);
    }

    public static Item objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getJSONArray(key).toString(), Item.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Item> arrayItemFromData(String str)
    {

        Type listType = new TypeToken<ArrayList<Item>>()
        {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Item> arrayItemFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Item>>()
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

    public void setSalePrice(String salePrice)
    {
        this.salePrice = salePrice;
    }

    public void setMarketPrice(String marketPrice)
    {
        this.marketPrice = marketPrice;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public void setAttentionNum(String attentionNum)
    {
        this.attentionNum = attentionNum;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setGoodsType(int goodsType)
    {
        this.goodsType = goodsType;
    }

    public void setStauts(String stauts)
    {
        this.stauts = stauts;
    }

    public String getPicUrl()
    {
        return picUrl;
    }

    public String getSalePrice()
    {
        return salePrice;
    }

    public String getMarketPrice()
    {
        return marketPrice;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public String getAttentionNum()
    {
        return attentionNum;
    }

    public String getUrl()
    {
        return url;
    }

    public int getGoodsType()
    {
        return goodsType;
    }

    public String getStauts()
    {
        return stauts;
    }
}
