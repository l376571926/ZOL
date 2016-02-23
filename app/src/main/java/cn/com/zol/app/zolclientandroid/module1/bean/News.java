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
public class News
{

    /**
     * doc_update_nums : 10997
     * list : [{"id":"5695742","stitle":"适马正式发布EF-FE卡口自动对焦转接环","joinPeople":"0","sdate":"2016-02-23 14:13:31","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0D/ChMkJ1bL-k2IamBHAALKWzrB5F0AALSGgCujFUAAspz466.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0D/ChMkJlbL-k-IJj_2AAJm2ymlLl0AALSGgC9mUQAAmbz665.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0D/ChMkJlbL-lCIUBIeAANxGyNMsqoAALSGgDdwaMAA3Ez631.jpg"],"comment_num":0,"url":"http://dcdv.zol.com.cn/569/5695742.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/800/liNgYvSH8F2FY.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/800/liNgYvSH8F2FY.jpg"},{"id":"5695730","stitle":"国际民航组织宣布禁止锂电池行李托运","joinPeople":"0","sdate":"2016-02-23 14:09:31","type":"0","pics":[],"comment_num":0,"url":"http://dcdv.zol.com.cn/569/5695730.html","imgsrc":"","imgsrc2":"http://icon.zol.com.cn/zol_wap_pic/defaultpic.png"},{"id":"5695255","stitle":"《轩辕剑外传穹之扉》登陆Steam商店","joinPeople":"0","sdate":"2016-02-23 14:09:31","type":"0","pics":[],"comment_num":0,"url":"http://game.zol.com.cn/569/5695255.html","imgsrc":"http://article.fd.zol-img.com.cn/t_s170x300/g5/M00/04/07/ChMkJlbL1M-IebGCAAlfO6Gt5wAAALQsQLJRRYACV9T938.png","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330/g5/M00/04/07/ChMkJlbL1M-IebGCAAlfO6Gt5wAAALQsQLJRRYACV9T938.png"},{"id":"5695719","stitle":"旗舰/入门全都有 TCL通讯亮相MWC 2016 ","joinPeople":"0","sdate":"2016-02-23 14:02:07","type":"0","pics":["http://2a.zol-img.com.cn/article/12_180x134/792/liCiWSvYEMJM6.png"],"comment_num":0,"url":"http://mobile.zol.com.cn/569/5695719.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/792/liCiWSvYEMJM6.png","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/792/liCiWSvYEMJM6.png"},{"id":"5695655","stitle":"适马正式发布30mm f/1.4 DC DN镜头","joinPeople":"0","sdate":"2016-02-23 13:57:34","type":"0","pics":["http://2b.zol-img.com.cn/article/12_180x134/787/lia2gAtoNPYRY.jpg"],"comment_num":0,"url":"http://dcdv.zol.com.cn/569/5695655.html","imgsrc":"http://2b.zol-img.com.cn/article/12_170x300/787/lia2gAtoNPYRY.jpg","imgsrc2":"http://2b.zol-img.com.cn/article/12_440x330/787/lia2gAtoNPYRY.jpg"},{"id":"5695640","stitle":"镜头黑科技 适马发布50-100mm f/1.8镜头","joinPeople":"0","sdate":"2016-02-23 13:55:24","type":"0","pics":["http://2f.zol-img.com.cn/article/12_180x134/797/liMZfUElyd5Q.jpg"],"comment_num":0,"url":"http://dcdv.zol.com.cn/569/5695640.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/797/liMZfUElyd5Q.jpg","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/797/liMZfUElyd5Q.jpg"},{"id":"5695638","stitle":"索尼Xperia X手机售价曝光：299欧元起","joinPeople":"0","sdate":"2016-02-23 13:53:02","type":"0","pics":["http://2b.zol-img.com.cn/article/12_180x134/793/lic5bzYbovYWs.jpg"],"comment_num":0,"url":"http://news.zol.com.cn/569/5695638.html","imgsrc":"http://2b.zol-img.com.cn/article/12_170x300/793/lic5bzYbovYWs.jpg","imgsrc2":"http://2b.zol-img.com.cn/article/12_440x330/793/lic5bzYbovYWs.jpg"},{"id":"5695629","stitle":"vivo Xplay5真机渲染图曝光：颜值甚高","joinPeople":"0","sdate":"2016-02-23 13:47:38","type":"0","pics":["http://2e.zol-img.com.cn/article/12_180x134/778/li7UjXUrmr36.jpg"],"comment_num":0,"url":"http://news.zol.com.cn/569/5695629.html","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/778/li7UjXUrmr36.jpg","imgsrc2":"http://2e.zol-img.com.cn/article/12_440x330/778/li7UjXUrmr36.jpg"},{"id":"5695620","stitle":"甲骨文5亿美元收购云计算公司Ravello","joinPeople":"0","sdate":"2016-02-23 13:42:04","type":"0","pics":["http://2a.zol-img.com.cn/article/12_180x134/780/libyCfQwe8Sks.jpg"],"comment_num":0,"url":"http://cloud.zol.com.cn/569/5695620.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/780/libyCfQwe8Sks.jpg","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/780/libyCfQwe8Sks.jpg"},{"id":"5695619","stitle":"改变格局！尼康发布DL系列一英寸相机","joinPeople":"5","sdate":"2016-02-23 13:38:37","type":"0","pics":["http://2c.zol-img.com.cn/article/12_180x134/782/liVWczZBO6TOQ.jpg"],"comment_num":1,"url":"http://dcdv.zol.com.cn/569/5695619.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/782/liVWczZBO6TOQ.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/782/liVWczZBO6TOQ.jpg"},{"id":"5695479","stitle":"尼康发布B500/B700/A900三款卡片相机","joinPeople":"21","sdate":"2016-02-23 12:46:57","type":"0","pics":["http://2d.zol-img.com.cn/article/12_180x134/765/litRsBAyPg9w.jpg"],"comment_num":0,"url":"http://dcdv.zol.com.cn/569/5695479.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/765/litRsBAyPg9w.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/765/litRsBAyPg9w.jpg"},{"id":"5695472","stitle":"尼康正式发布DL24-85 f/1.8-2.8相机","joinPeople":"412","sdate":"2016-02-23 12:16:55","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJ1bL4x-IHqiSAAR43i6jYcwAALRMgMB_dIABHj2090.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJ1bL4yOILSIoAALGYNv_pecAALRMgNvESkAAsZ4965.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJlbL4yCIIamDAAMHVHFLrUEAALRMgMQ_zoAAwds205.jpg"],"comment_num":3,"url":"http://dcdv.zol.com.cn/569/5695472.html","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/760/liqVfDpGmotg.jpg","imgsrc2":"http://2e.zol-img.com.cn/article/12_440x330/760/liqVfDpGmotg.jpg"},{"id":"5695471","stitle":"尼康正式发布DL24-500 f/2.8-5.6相机","joinPeople":"179","sdate":"2016-02-23 12:16:37","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJ1bL4gqII_qhAAMfctD1jhsAALRKQMor9kAAx-K172.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJ1bL4guIM1n3AAOz9T4Uj00AALRKQNCwcMAA7QN647.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJlbL4g6ILIG5AALqkRiO9AoAALRKQNb9HEAAuqp334.jpg"],"comment_num":4,"url":"http://dcdv.zol.com.cn/569/5695471.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/759/li3EpgGZxviWs.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/759/li3EpgGZxviWs.jpg"},{"id":"5695473","stitle":"尼康正式发布DL18-50 f/1.8-2.8相机","joinPeople":"129","sdate":"2016-02-23 12:16:09","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/09/ChMkJ1bL5SOIe1Z0AAEgV9oG7hMAALRRADyONUAASBv899.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0A/ChMkJlbL6GmID-kJAADGQAfcSBkAALRYAPhjPkAAMZY467.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0A/ChMkJ1bL6GiINvBnAADPTjLb1PQAALRYAPcuLEAAM9m158.jpg"],"comment_num":2,"url":"http://dcdv.zol.com.cn/569/5695473.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/761/liHyMpC0e33c.jpg","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/761/liHyMpC0e33c.jpg"},{"id":"5695293","stitle":"扎克伯格对什么时候教女儿上网很纠结","joinPeople":"30","sdate":"2016-02-23 11:58:53","type":"0","pics":["http://2a.zol-img.com.cn/article/12_180x134/750/liCY4DTpuxJl.jpg"],"comment_num":1,"url":"http://soft.zol.com.cn/569/5695293.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/750/liCY4DTpuxJl.jpg","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/750/liCY4DTpuxJl.jpg"}]
     * num : 10159
     * pics : [{"id":"5693595","stitle":"HTC中端机型A16曝光","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJ1bK2QWIJEhMAALxucYm2kQAALJ0wAndpYAAvHR464.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/0C/ChMkJlbKr0eIIGY3AAJGStEouH0AALF0wLFrtQAAkZi718.jpg","type":"0","url":"http://news.zol.com.cn/569/5693595.html"},{"id":"5693667","stitle":"三星S7内置水冷散热系统","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJ1bK2W6IRHxnAAMNCtxG-ekAALJ1wDVri4AAw0i616.jpg","imgsrc2":"http://i3.pro.fd.zol-img.com.cn/t_s440x330c4_w1/g5/M00/01/05/ChMkJ1bKexmIJGIwAAD_ath49DUAALEFQNkNs4AAP-C053.jpg","type":"0","url":"http://news.zol.com.cn/569/5693667.html"},{"id":"5693624","stitle":"还记得AppleWatch隐藏接口吗？","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJlbK2jOIO-JYAAMKVZZahW4AALJ3gJRdMUAAwpt641.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/0C/ChMkJ1bKsnKIA-SsAAFoqaZEJnkAALF8ACiHlAAAWjB213.jpg","type":"0","url":"http://news.zol.com.cn/569/5693624.html"}]
     * resVersion : 1456210030
     */

    private String doc_update_nums;
    private String num;
    private String resVersion;
    /**
     * id : 5695742
     * stitle : 适马正式发布EF-FE卡口自动对焦转接环
     * joinPeople : 0
     * sdate : 2016-02-23 14:13:31
     * type : 0
     * pics : ["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0D/ChMkJ1bL-k2IamBHAALKWzrB5F0AALSGgCujFUAAspz466.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0D/ChMkJlbL-k-IJj_2AAJm2ymlLl0AALSGgC9mUQAAmbz665.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/0D/ChMkJlbL-lCIUBIeAANxGyNMsqoAALSGgDdwaMAA3Ez631.jpg"]
     * comment_num : 0
     * url : http://dcdv.zol.com.cn/569/5695742.html
     * imgsrc : http://2c.zol-img.com.cn/article/12_170x300/800/liNgYvSH8F2FY.jpg
     * imgsrc2 : http://2c.zol-img.com.cn/article/12_440x330/800/liNgYvSH8F2FY.jpg
     */

    private List<ListEntity> list;
    /**
     * id : 5693595
     * stitle : HTC中端机型A16曝光
     * imgsrc : http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJ1bK2QWIJEhMAALxucYm2kQAALJ0wAndpYAAvHR464.jpg
     * imgsrc2 : http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/0C/ChMkJlbKr0eIIGY3AAJGStEouH0AALF0wLFrtQAAkZi718.jpg
     * type : 0
     * url : http://news.zol.com.cn/569/5693595.html
     */

    private List<PicsEntity> pics;

    public static News objectFromData(String str)
    {

        return new Gson().fromJson(str, News.class);
    }

    public static News objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), News.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<News> arrayNewsFromData(String str)
    {

        Type listType = new TypeToken<ArrayList<News>>()
        {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<News> arrayNewsFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<News>>()
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

    public void setNum(String num)
    {
        this.num = num;
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

    public String getDoc_update_nums()
    {
        return doc_update_nums;
    }

    public String getNum()
    {
        return num;
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
        private String id;
        private String stitle;
        private String joinPeople;
        private String sdate;
        private String type;
        private int comment_num;
        private String url;
        private String imgsrc;
        private String imgsrc2;
        private List<String> pics;

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

        public void setPics(List<String> pics)
        {
            this.pics = pics;
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

        public List<String> getPics()
        {
            return pics;
        }
    }

    public static class PicsEntity
    {
        private String id;
        private String stitle;
        private String imgsrc;
        private String imgsrc2;
        private String type;
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

        public void setType(String type)
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

        public String getType()
        {
            return type;
        }

        public String getUrl()
        {
            return url;
        }
    }
}
