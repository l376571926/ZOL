package cn.com.zol.app.zolclientandroid.module1.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyiwei on 2016/2/23.
 */
public class Hotlist
{

    /**
     * doc_update_nums : 0
     * list : [{"id":"5693203","stitle":"余承东：华为三年干掉苹果，五年干掉三星","joinPeople":"6474","sdate":"2016-02-22 11:53:35","type":"0","comment_num":700,"url":"http://appnews.zol.com.cn/569/5693203.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/420/lizYzllwHMg.jpg","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/420/lizYzllwHMg.jpg"},{"id":"5692479","stitle":"满屏黑科技 三星Galaxy S7/edge上手速评","joinPeople":"170887","sdate":"2016-02-22 04:26:40","type":"0","comment_num":676,"url":"http://mobile.zol.com.cn/569/5692479.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/308/lioQBcwUZzfn6.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/308/lioQBcwUZzfn6.jpg"},{"id":"5693176","stitle":"简直安卓机皇！vivo Xplay5确认搭载6GB运存","joinPeople":"18629","sdate":"2016-02-22 11:34:32","type":"0","comment_num":364,"url":"http://news.zol.com.cn/569/5693176.html","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/406/liuHnhVsFHrA.jpg","imgsrc2":"http://2e.zol-img.com.cn/article/12_440x330/406/liuHnhVsFHrA.jpg"},{"id":"5692023","stitle":"看MWC集5张XPlay5神卡 就赢vivo机皇","joinPeople":"78515","sdate":"2016-02-22 07:42:47","type":"0","comment_num":310,"url":"http://mobile.zol.com.cn/569/5692023.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/225/lie8NOZbuVLg.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/225/lie8NOZbuVLg.jpg"},{"id":"5693667","stitle":"不可思议！三星S7内置水冷散热系统","joinPeople":"27367","sdate":"2016-02-23 05:31:00","type":"0","comment_num":275,"url":"http://news.zol.com.cn/569/5693667.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/512/liuPBplHzisP6.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/512/liuPBplHzisP6.jpg"},{"id":"5694736","stitle":"外媒称三星S7 edge是至今最漂亮的手机 没有之一","joinPeople":"2358","sdate":"2016-02-23 10:00:49","type":"0","comment_num":217,"url":"http://appnews.zol.com.cn/569/5694736.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/677/limPBA4fRfYo6.jpg","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/677/limPBA4fRfYo6.jpg"},{"id":"5694283","stitle":"乐视怒告百度不正当竞争：索赔百万","joinPeople":"1300","sdate":"2016-02-22 19:14:36","type":"0","comment_num":216,"url":"http://appnews.zol.com.cn/569/5694283.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/629/lihuwNTxlmrlc.jpg","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/629/lihuwNTxlmrlc.jpg"},{"id":"5691612","stitle":"清风徐来 游戏电竞看NMK.Girls女子战队","joinPeople":"517","sdate":"2016-02-22 05:37:00","type":"0","comment_num":210,"url":"http://diy.zol.com.cn/569/5691612.html","imgsrc":"http://article.fd.zol-img.com.cn/t_s170x300/g5/M00/0B/06/ChMkJ1bG8neIDkJOABX7la1XwgIAAKsdAAAAAAAFfut995.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330/g5/M00/0B/06/ChMkJ1bG8nKIDgMkABlIHlncBn4AAKscwNHZgcAGUg2119.jpg"},{"id":"5694479","stitle":"首发&首销骁龙820：乐Max Pro上手速评","joinPeople":"37026","sdate":"2016-02-23 02:12:47","type":"0","comment_num":181,"url":"http://mobile.zol.com.cn/569/5694479.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/650/li9tZ8Xk3EM.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/650/li9tZ8Xk3EM.jpg"},{"id":"5692577","stitle":"余承东顶库克：支持苹果拒绝破解iPhone","joinPeople":"14053","sdate":"2016-02-22 09:27:19","type":"0","comment_num":178,"url":"http://news.zol.com.cn/569/5692577.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/332/li0NCXk1f3e7s.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/332/li0NCXk1f3e7s.jpg"},{"id":"5694281","stitle":"同是千元配置 为何小米和OPPO/vivo差价这么大？","joinPeople":"5681","sdate":"2016-02-23 05:29:00","type":"0","comment_num":170,"url":"http://appnews.zol.com.cn/569/5694281.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/627/liY0dEHePiD.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/627/liY0dEHePiD.jpg"},{"id":"5692802","stitle":"论性价比？华为MateBook或超苏菲三条街","joinPeople":"11415","sdate":"2016-02-22 12:16:54","type":"0","comment_num":165,"url":"http://nb.zol.com.cn/569/5692802.html","imgsrc":"http://2b.zol-img.com.cn/article/12_170x300/427/liALnoyeY5hX.jpg","imgsrc2":"http://2b.zol-img.com.cn/article/12_440x330/427/liALnoyeY5hX.jpg"},{"id":"5692543","stitle":"HTC连发三款新机：波点设计","joinPeople":"8500","sdate":"2016-02-22 08:02:10","type":"0","comment_num":151,"url":"http://news.zol.com.cn/569/5692543.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/317/lirsreAVyNubE.jpg","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/317/lirsreAVyNubE.jpg"},{"id":"5692566","stitle":"米5咋看? LG G5安兔兔综合战斗力133054","joinPeople":"20144","sdate":"2016-02-22 09:14:07","type":"0","comment_num":152,"url":"http://mobile.zol.com.cn/569/5692566.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/326/li0FLXIAtouHk.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/326/li0FLXIAtouHk.jpg"},{"id":"5692046","stitle":"MWC每日有奖猜机第一弹:辨辨雄雌","joinPeople":"7409","sdate":"2016-02-22 05:28:00","type":"0","comment_num":150,"url":"http://mobile.zol.com.cn/569/5692046.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/315/liWJ5BfxDAyo.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/315/liWJ5BfxDAyo.jpg"}]
     * num : 491
     * date : 2016-02-23 14:24:35
     * totalPage : 8
     * resVersion : 1456210569
     */

    private String doc_update_nums;
    private int num;
    private String date;
    private int totalPage;
    private String resVersion;
    /**
     * id : 5693203
     * stitle : 余承东：华为三年干掉苹果，五年干掉三星
     * joinPeople : 6474
     * sdate : 2016-02-22 11:53:35
     * type : 0
     * comment_num : 700
     * url : http://appnews.zol.com.cn/569/5693203.html
     * imgsrc : http://2a.zol-img.com.cn/article/12_170x300/420/lizYzllwHMg.jpg
     * imgsrc2 : http://2a.zol-img.com.cn/article/12_440x330/420/lizYzllwHMg.jpg
     */

    private List<ListEntity> list;

    public static Hotlist objectFromData(String str)
    {

        return new Gson().fromJson(str, Hotlist.class);
    }

    public static Hotlist objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), Hotlist.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Hotlist> arrayHotlistFromData(String str)
    {

        Type listType = new TypeToken<ArrayList<Hotlist>>()
        {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Hotlist> arrayHotlistFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Hotlist>>()
            {
            }.getType();

            return new Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return new ArrayList();

    }

    public void setDoc_update_nums(String doc_update_nums)
    {
        this.doc_update_nums = doc_update_nums;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setTotalPage(int totalPage)
    {
        this.totalPage = totalPage;
    }

    public void setResVersion(String resVersion)
    {
        this.resVersion = resVersion;
    }

    public void setList(List<ListEntity> list)
    {
        this.list = list;
    }

    public String getDoc_update_nums()
    {
        return doc_update_nums;
    }

    public int getNum()
    {
        return num;
    }

    public String getDate()
    {
        return date;
    }

    public int getTotalPage()
    {
        return totalPage;
    }

    public String getResVersion()
    {
        return resVersion;
    }

    public List<ListEntity> getList()
    {
        return list;
    }

    public static class ListEntity
    {
        private String id;
        private String stitle;
        private String joinPeople;
        private String sdate;
        private String type;
        private int comment_num;
        private String url;
        private String imgsrc;
        private String imgsrc2;

        public static ListEntity objectFromData(String str)
        {

            return new Gson().fromJson(str, ListEntity.class);
        }

        public static ListEntity objectFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ListEntity.class);
            } catch (JSONException e)
            {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ListEntity> arrayListEntityFromData(String str)
        {

            Type listType = new TypeToken<ArrayList<ListEntity>>()
            {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ListEntity> arrayListEntityFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ListEntity>>()
                {
                }.getType();

                return new Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

            } catch (JSONException e)
            {
                e.printStackTrace();
            }

            return new ArrayList();

        }

        public void setId(String id)
        {
            this.id = id;
        }

        public void setStitle(String stitle)
        {
            this.stitle = stitle;
        }

        public void setJoinPeople(String joinPeople)
        {
            this.joinPeople = joinPeople;
        }

        public void setSdate(String sdate)
        {
            this.sdate = sdate;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public void setComment_num(int comment_num)
        {
            this.comment_num = comment_num;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public void setImgsrc(String imgsrc)
        {
            this.imgsrc = imgsrc;
        }

        public void setImgsrc2(String imgsrc2)
        {
            this.imgsrc2 = imgsrc2;
        }

        public String getId()
        {
            return id;
        }

        public String getStitle()
        {
            return stitle;
        }

        public String getJoinPeople()
        {
            return joinPeople;
        }

        public String getSdate()
        {
            return sdate;
        }

        public String getType()
        {
            return type;
        }

        public int getComment_num()
        {
            return comment_num;
        }

        public String getUrl()
        {
            return url;
        }

        public String getImgsrc()
        {
            return imgsrc;
        }

        public String getImgsrc2()
        {
            return imgsrc2;
        }
    }
}
