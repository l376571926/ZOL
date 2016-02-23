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
public class Headline
{

    /**
     * list : [{"stitle":"不做手机的诺基亚现在在做什么？","sdate":"2016-02-23 14:00:05","type":"0","listStyle":"1","label":"","joinPeople":"1","url":"http://appnews.zol.com.cn/569/5695270.html","id":"5695270","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/737/li50E9gyh3VaA.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/07/ChMkJlbL1NKIDiJvAABKW5anWiQAALQsQMYozYAAEpz552.jpg","comment_num":11},{"stitle":"拍照出色搭配超级续航 金立S8上手体验","sdate":"2016-02-23 13:42:05","type":"0","listStyle":"1","label":"","joinPeople":"1576","url":"http://mobile.zol.com.cn/569/5694815.html","id":"5694815","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/687/liHkrx3y41vg.png","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/04/ChMkJ1bLwxuIeB5OAAIfG7-5ecgAALP_AEUi_YAAh8z140.jpg","comment_num":24},{"stitle":"联想要淘汰摩托罗拉：Motorola将被Moto取代！","sdate":"2016-02-23 12:00:11","type":"0","listStyle":"1","label":"","joinPeople":"814","url":"http://news.zol.com.cn/569/5694877.html","id":"5694877","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/704/liV8aAGjEo77Y.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/05/ChMkJlbLydmIUb1YAAH5gS0Hv4EAALQPgOnHiEAAfmZ544.jpg","comment_num":47},{"stitle":"外媒称三星S7 edge是至今最漂亮的手机 没有之一","sdate":"2016-02-23 12:00:10","type":"0","listStyle":"1","label":"","joinPeople":"2358","url":"http://appnews.zol.com.cn/569/5694736.html","id":"5694736","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/677/limPBA4fRfYo6.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/03/ChMkJlbLvYeISbMsAAA0rWpWZ4sAALPwgDFz08AADTF239.jpg","comment_num":235},{"stitle":"强制收费？腾讯证实正测试公众号付费阅读","sdate":"2016-02-23 12:00:09","type":"0","listStyle":"1","label":"","joinPeople":"379","url":"http://soft.zol.com.cn/569/5694858.html","id":"5694858","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/04/07/ChMkJlbL0VuIIruQAAC9XSyjLokAALQkwFVHs4AAL11160.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/0A/05/ChMkJlbGkEiISBd7AADkvJvqnrsAAKoFgP7BkoAAOTU045.jpg","comment_num":53},{"stitle":"三星A9 Pro获型号核准：4G内存+16MP镜头","sdate":"2016-02-23 12:00:08","type":"0","listStyle":"1","label":"","joinPeople":"3545","url":"http://news.zol.com.cn/569/5694817.html","id":"5694817","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/684/li5kuS4611aQA.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/04/ChMkJ1bLwXeIMK0vAACo3--qXikAALP6AHLangAAKj3500.jpg","comment_num":23},{"stitle":"三星固件升级 还你行云流水般体验","sdate":"2016-02-23 09:00:05","type":"18","listStyle":"1","label":"","joinPeople":"","url":"http://bbs.zol.com.cn/sjbbs/d98_212305.html","id":"0","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/04/06/ChMkJlbLzciIN4gjAACqkXRSGQ4AALQbQJ4YgcAAKqp855.png","imgsrc2":"http://icon.zol.com.cn/zol_wap_pic/defaultpic.png","comment_num":0},{"stitle":"余承东：华为MateBook太优秀，友商都会抄袭","sdate":"2016-02-23 12:00:07","type":"0","listStyle":"1","label":"","joinPeople":"768","url":"http://appnews.zol.com.cn/569/5695227.html","id":"5695227","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/716/lixpJ633oZLc.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/06/ChMkJ1bLzuyICaCQAACInvzhglEAALQewEdBUcAAIi227.jpeg","comment_num":71},{"stitle":"库克听了很暖心！小扎：支持苹果 拒开后门","sdate":"2016-02-23 12:00:07","type":"0","listStyle":"1","label":"","joinPeople":"171","url":"http://news.zol.com.cn/569/5694596.html","id":"5694596","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/671/lid9ygZPWF7tQ.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/03/ChMkJlbLus2IAL64AAM8DUqrBZwAALPpwDNs5oAAzwl686.jpg","comment_num":10},{"stitle":"3.0/type-c转一圈 USB接口为何回到原点","sdate":"2016-02-23 12:00:06","type":"0","listStyle":"1","label":"","joinPeople":"13492","url":"http://mobile.zol.com.cn/566/5661202.html","id":"5661202","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/551/lidfbdMD2LeQ.png","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/02/01/ChMkJ1bKxD-IBg_SAAJi0_CXk60AALHDwHhc8EAAmLr372.jpg","comment_num":60},{"stitle":"IT数码开学季：我为学狂 整装待发","sdate":"2016-02-23 12:00:05","type":"18","listStyle":"1","label":"推广","joinPeople":"","url":"http://go.zol.com/topic/5686800.html","id":"0","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/04/0E/ChMkJ1bL_4aIEGUBAABix2zOrmEAALSVwCK0xMAAGLf434.jpg","imgsrc2":"http://icon.zol.com.cn/zol_wap_pic/defaultpic.png","comment_num":0},{"stitle":"HTC One M10背部谍照流出 依然有灰带","sdate":"2016-02-23 12:00:05","type":"0","listStyle":"1","label":"","joinPeople":"1833","url":"http://news.zol.com.cn/569/5695244.html","id":"5695244","imgsrc":"http://2b.zol-img.com.cn/article/12_170x300/739/liOKX9YZVfAM.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/07/ChMkJ1bL1a-IUtJxAAErUunvdAEAALQugEpHQ8AAStq393.jpg","comment_num":19},{"stitle":"宏碁发布两款新机 Liquid Jade 2/Zest","sdate":"2016-02-23 12:00:05","type":"0","listStyle":"1","label":"","joinPeople":"720","url":"http://mobile.zol.com.cn/569/5694824.html","id":"5694824","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/688/li0SljS2PV3mU.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/05/ChMkJ1bLxNiIf6dgAACGYirTgVsAALQDgBGRkQAAIZ6834.jpg","comment_num":13},{"stitle":"王雪红：HTC Vive完爆Oculus，799美元非常好","sdate":"2016-02-23 12:00:05","type":"0","listStyle":"1","label":"","joinPeople":"108","url":"http://appnews.zol.com.cn/569/5694866.html","id":"5694866","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/692/liWa3pNI0fNOQ.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/05/ChMkJ1bLxt2IXugQAABmUK2kj4QAALQIQERF9YAAGZo874.jpg","comment_num":22},{"stitle":"1元就有机会获得苹果6s玫瑰金64g","sdate":"2016-02-16 06:00:05","type":"18","listStyle":"1","label":"推广","joinPeople":"","url":"http://1.wowozhe.com/tg/zgc/index.htm","id":"0","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/04/06/ChMkJlbLzQmILTP2AAAaMBbgg88AALQYwP8EBsAABpI527.jpg","imgsrc2":"http://icon.zol.com.cn/zol_wap_pic/defaultpic.png","comment_num":0}]
     * num : 2000
     * doc_update_nums : 40
     * pics : [{"id":"5691666","stitle":"苹果\"1970事件\" 是什么\"鬼\"？","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56cae38d2635f.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/06/ChMkJlbKhoqIQMUXAADVLobhWwkAALEhAGng-MAANVG049.jpg","type":0,"url":"http://mobile.zol.com.cn/569/5691666.html"},{"id":"5685089","stitle":"","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56c6efc93e3ad.jpg","imgsrc2":"","type":"2","url":"http://topic.zol.com.cn/568/5685089.html"},{"id":"5681757","stitle":"扒一扒VR风口的现在飞到哪儿了","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56c989d06c043.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/00/0F/ChMkJlbBkI6IDOMEAAF5Cu5ZgrcAAKCqQKswUkAAXki971.jpg","type":0,"url":"http://nb.zol.com.cn/568/5681757.html"},{"id":"5684279","stitle":"华为PK小米 谁家做笔记本更靠谱？","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56c6ef15df5c6.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/08/05/ChMkJ1bFhRCIZOX8AADJzfWXvhQAAKgSQDwsdcAAMnl158.jpg","type":0,"url":"http://nb.zol.com.cn/568/5684279.html"},{"id":"5688516","stitle":"","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56c59ea33954d.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/08/05/ChMkJlbFf7CIQPkVAAKQ02A3ZaEAAKgGQD_OuMAApDr803.jpg","type":0,"url":"http://4g.zol.com.cn/568/5688516.html"}]
     * resVersion : 1456210019
     */

    private String num;
    private String doc_update_nums;
    private String resVersion;
    /**
     * stitle : 不做手机的诺基亚现在在做什么？
     * sdate : 2016-02-23 14:00:05
     * type : 0
     * listStyle : 1
     * label :
     * joinPeople : 1
     * url : http://appnews.zol.com.cn/569/5695270.html
     * id : 5695270
     * imgsrc : http://2f.zol-img.com.cn/article/12_170x300/737/li50E9gyh3VaA.jpg
     * imgsrc2 : http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/04/07/ChMkJlbL1NKIDiJvAABKW5anWiQAALQsQMYozYAAEpz552.jpg
     * comment_num : 11
     */

    private List<ListEntity> list;
    /**
     * id : 5691666
     * stitle : 苹果"1970事件" 是什么"鬼"？
     * imgsrc : http://digital.zol.com.cn/275_module_images/20/56cae38d2635f.jpg
     * imgsrc2 : http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/06/ChMkJlbKhoqIQMUXAADVLobhWwkAALEhAGng-MAANVG049.jpg
     * type : 0
     * url : http://mobile.zol.com.cn/569/5691666.html
     */

    private List<PicsEntity> pics;

    public static Headline objectFromData(String str)
    {

        return new Gson().fromJson(str, Headline.class);
    }

    public static Headline objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), Headline.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Headline> arrayHeadlineFromData(String str)
    {

        Type listType = new TypeToken<ArrayList<Headline>>()
        {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Headline> arrayHeadlineFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Headline>>()
            {
            }.getType();

            return new Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return new ArrayList();

    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public void setDoc_update_nums(String doc_update_nums)
    {
        this.doc_update_nums = doc_update_nums;
    }

    public void setResVersion(String resVersion)
    {
        this.resVersion = resVersion;
    }

    public void setList(List<ListEntity> list)
    {
        this.list = list;
    }

    public void setPics(List<PicsEntity> pics)
    {
        this.pics = pics;
    }

    public String getNum()
    {
        return num;
    }

    public String getDoc_update_nums()
    {
        return doc_update_nums;
    }

    public String getResVersion()
    {
        return resVersion;
    }

    public List<ListEntity> getList()
    {
        return list;
    }

    public List<PicsEntity> getPics()
    {
        return pics;
    }

    public static class ListEntity
    {
        private String stitle;
        private String sdate;
        private String type;
        private String listStyle;
        private String label;
        private String joinPeople;
        private String url;
        private String id;
        private String imgsrc;
        private String imgsrc2;
        private int comment_num;

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

        public void setStitle(String stitle)
        {
            this.stitle = stitle;
        }

        public void setSdate(String sdate)
        {
            this.sdate = sdate;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public void setListStyle(String listStyle)
        {
            this.listStyle = listStyle;
        }

        public void setLabel(String label)
        {
            this.label = label;
        }

        public void setJoinPeople(String joinPeople)
        {
            this.joinPeople = joinPeople;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public void setImgsrc(String imgsrc)
        {
            this.imgsrc = imgsrc;
        }

        public void setImgsrc2(String imgsrc2)
        {
            this.imgsrc2 = imgsrc2;
        }

        public void setComment_num(int comment_num)
        {
            this.comment_num = comment_num;
        }

        public String getStitle()
        {
            return stitle;
        }

        public String getSdate()
        {
            return sdate;
        }

        public String getType()
        {
            return type;
        }

        public String getListStyle()
        {
            return listStyle;
        }

        public String getLabel()
        {
            return label;
        }

        public String getJoinPeople()
        {
            return joinPeople;
        }

        public String getUrl()
        {
            return url;
        }

        public String getId()
        {
            return id;
        }

        public String getImgsrc()
        {
            return imgsrc;
        }

        public String getImgsrc2()
        {
            return imgsrc2;
        }

        public int getComment_num()
        {
            return comment_num;
        }
    }

    public static class PicsEntity
    {
        private String id;
        private String stitle;
        private String imgsrc;
        private String imgsrc2;
        private int type;
        private String url;

        public static PicsEntity objectFromData(String str)
        {

            return new Gson().fromJson(str, PicsEntity.class);
        }

        public static PicsEntity objectFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), PicsEntity.class);
            } catch (JSONException e)
            {
                e.printStackTrace();
            }

            return null;
        }

        public static List<PicsEntity> arrayPicsEntityFromData(String str)
        {

            Type listType = new TypeToken<ArrayList<PicsEntity>>()
            {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<PicsEntity> arrayPicsEntityFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<PicsEntity>>()
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

        public void setImgsrc(String imgsrc)
        {
            this.imgsrc = imgsrc;
        }

        public void setImgsrc2(String imgsrc2)
        {
            this.imgsrc2 = imgsrc2;
        }

        public void setType(int type)
        {
            this.type = type;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public String getId()
        {
            return id;
        }

        public String getStitle()
        {
            return stitle;
        }

        public String getImgsrc()
        {
            return imgsrc;
        }

        public String getImgsrc2()
        {
            return imgsrc2;
        }

        public int getType()
        {
            return type;
        }

        public String getUrl()
        {
            return url;
        }
    }
}
