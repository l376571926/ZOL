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
public class TestItem
{

    /**
     * doc_update_nums : 10991
     * list : [{"id":"5695293","stitle":"扎克伯格对什么时候教女儿上网很纠结","joinPeople":"0","sdate":"2016-02-23 11:58:53","type":"0","pics":["http://2a.zol-img.com.cn/article/12_180x134/750/liCY4DTpuxJl.jpg"],"comment_num":0,"url":"http://soft.zol.com.cn/569/5695293.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/750/liCY4DTpuxJl.jpg","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/750/liCY4DTpuxJl.jpg"},{"id":"5695284","stitle":"亚马逊免邮购买金额上调4成：你猜为啥","joinPeople":"0","sdate":"2016-02-23 11:46:03","type":"0","pics":["http://2f.zol-img.com.cn/article/12_180x134/749/liPLO5tn3oYJQ.jpg"],"comment_num":0,"url":"http://news.zol.com.cn/569/5695284.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/749/liPLO5tn3oYJQ.jpg","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/749/liPLO5tn3oYJQ.jpg"},{"id":"5695283","stitle":"年内难见到 诺记计划将品牌授权第三方","joinPeople":"0","sdate":"2016-02-23 11:45:23","type":"0","pics":["http://2d.zol-img.com.cn/article/12_180x134/741/ligmMBkszbTo.jpg"],"comment_num":0,"url":"http://mobile.zol.com.cn/569/5695283.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/741/ligmMBkszbTo.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/741/ligmMBkszbTo.jpg"},{"id":"5695276","stitle":"三星打造\"三星之家\"? 不卖东西专注体验","joinPeople":"0","sdate":"2016-02-23 11:40:31","type":"0","pics":["http://2f.zol-img.com.cn/article/12_180x134/743/litqeynoWm2Ps.png"],"comment_num":0,"url":"http://soft.zol.com.cn/569/5695276.html","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/743/litqeynoWm2Ps.png","imgsrc2":"http://2f.zol-img.com.cn/article/12_440x330/743/litqeynoWm2Ps.png"},{"id":"5695214","stitle":"达尔优S600 RGB键盘 荣获年度推荐产品","joinPeople":"2","sdate":"2016-02-23 11:36:22","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/07/ChMkJlbL1CCIdZzeAAEotnLp_EsAALQqwHiUGIAASjO546.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g2/M00/09/02/ChMlWlWvQ2qIe-UaAAVT-p9gTV0AAHetQHc7uIABVQS150.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g2/M00/09/02/ChMlWlWvRF-IKd63AARR4YO9OlcAAHetwFxTZoABFH5563.jpg"],"comment_num":0,"url":"http://mouse.zol.com.cn/569/5695214.html","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/736/li4BlJdnTAmwI.jpg","imgsrc2":"http://2e.zol-img.com.cn/article/12_440x330/736/li4BlJdnTAmwI.jpg"},{"id":"5695259","stitle":"模块化的LG G5 5大亮点是否让你心动?","joinPeople":"0","sdate":"2016-02-23 11:31:13","type":"0","pics":["http://2c.zol-img.com.cn/article/12_180x134/734/liukCfHoQLJSs.jpg"],"comment_num":0,"url":"http://mobile.zol.com.cn/569/5695259.html","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/734/liukCfHoQLJSs.jpg","imgsrc2":"http://2c.zol-img.com.cn/article/12_440x330/734/liukCfHoQLJSs.jpg"},{"id":"5695064","stitle":"爆炸!苹果放iOS9.3/watchOS2.2 beta4版","joinPeople":"265","sdate":"2016-02-23 11:22:42","type":"0","pics":["http://2e.zol-img.com.cn/article/12_180x134/718/liBqNgg8Sipsc.png"],"comment_num":4,"url":"http://soft.zol.com.cn/569/5695064.html","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/718/liBqNgg8Sipsc.png","imgsrc2":"http://2e.zol-img.com.cn/article/12_440x330/718/liBqNgg8Sipsc.png"},{"id":"5694872","stitle":"翻滚吧爱家守护神 LG跨界新品抢先看","joinPeople":"12","sdate":"2016-02-23 11:18:55","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/05/ChMkJlbLyoqISt1wAAEi-3Qq5GoAALQRgGc4uwAASMT950.png","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/05/ChMkJ1bLyoqII7KRAAEKYgw8g8AAALQRgGDdDsAAQp6948.png","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/05/ChMkJ1bLyouIK86pAAErKD4mEQ0AALQRgG1uKYAAStA850.png"],"comment_num":0,"url":"http://sh.zol.com.cn/569/5694872.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/696/li5Ra1ENehw0A.jpg","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/696/li5Ra1ENehw0A.jpg"},{"id":"5695217","stitle":"深度解读Apple pay、微信、支付宝三角恋","joinPeople":"11","sdate":"2016-02-23 11:17:50","type":"0","pics":[],"comment_num":0,"url":"http://hd.zol.com.cn/569/5695217.html","imgsrc":"http://article.fd.zol-img.com.cn/t_s170x300/g5/M00/04/06/ChMkJ1bLzOSIDNawAAB91EgKUOkAALQYQL-CZkAAH3s206.png","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330/g5/M00/04/06/ChMkJ1bLzOSIDNawAAB91EgKUOkAALQYQL-CZkAAH3s206.png"},{"id":"5695211","stitle":"阿里健康宣布向国家移交药品监管网","joinPeople":"27","sdate":"2016-02-23 11:16:55","type":"0","pics":[],"comment_num":0,"url":"http://soft.zol.com.cn/569/5695211.html","imgsrc":"http://article.fd.zol-img.com.cn/t_s170x300/g5/M00/04/06/ChMkJ1bLzquIfzTsAAC-PdPpek0AALQdwPJcnQAAL5V324.png","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330/g5/M00/04/06/ChMkJ1bLzquIfzTsAAC-PdPpek0AALQdwPJcnQAAL5V324.png"},{"id":"5695238","stitle":"最便宜智能机成本160元 因太火被迫叫停","joinPeople":"71","sdate":"2016-02-23 11:16:22","type":"0","pics":["http://2d.zol-img.com.cn/article/12_180x134/717/li8c6db4jydLE.jpg"],"comment_num":4,"url":"http://mobile.zol.com.cn/569/5695238.html","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/717/li8c6db4jydLE.jpg","imgsrc2":"http://2d.zol-img.com.cn/article/12_440x330/717/li8c6db4jydLE.jpg"},{"id":"5695244","stitle":"HTC One M10背部谍照流出 依然有灰带","joinPeople":"108","sdate":"2016-02-23 11:14:08","type":"0","pics":["http://2b.zol-img.com.cn/article/12_180x134/739/liOKX9YZVfAM.jpg"],"comment_num":3,"url":"http://news.zol.com.cn/569/5695244.html","imgsrc":"http://2b.zol-img.com.cn/article/12_170x300/739/liOKX9YZVfAM.jpg","imgsrc2":"http://2b.zol-img.com.cn/article/12_440x330/739/liOKX9YZVfAM.jpg"},{"id":"5695229","stitle":"三星A9 Pro获型号核准 骁龙652+4GB运存","joinPeople":"0","sdate":"2016-02-23 11:08:35","type":"0","pics":["http://i0.pro.fd.zol-img.com.cn/t_s180x134_w1_q7/g5/M00/0A/08/ChMkJ1alzK-Idri_AALOWpncpykAAHpGgFM6tkAAs5y346.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/07/ChMkJ1bL0oSIYFBAAAEWNzUssMUAALQnQOpGC8AARZP134.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/07/ChMkJlbL0oOIOlWwAACKbhmD55sAALQnQOLpOgAAIqG774.jpg"],"comment_num":0,"url":"http://mobile.zol.com.cn/569/5695229.html","imgsrc":"http://2b.zol-img.com.cn/article/12_170x300/733/liWCW4MFjF10Q.jpg","imgsrc2":"http://2b.zol-img.com.cn/article/12_440x330/733/liWCW4MFjF10Q.jpg"},{"id":"5694858","stitle":"腾讯证实正在测试微信公众号付费阅读","joinPeople":"17","sdate":"2016-02-23 11:04:23","type":"0","pics":[],"comment_num":14,"url":"http://soft.zol.com.cn/569/5694858.html","imgsrc":"http://article.fd.zol-img.com.cn/t_s170x300/g5/M00/0A/05/ChMkJlbGkEiISBd7AADkvJvqnrsAAKoFgP7BkoAAOTU045.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330/g5/M00/0A/05/ChMkJlbGkEiISBd7AADkvJvqnrsAAKoFgP7BkoAAOTU045.jpg"},{"id":"5694837","stitle":"重塑制造巨臂 HKC品牌的2016精工之旅","joinPeople":"31","sdate":"2016-02-23 11:03:32","type":"0","pics":["http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/06/ChMkJlbLy6OIRkBCAAKuRLxn8awAALQUwHo22QAAq5c845.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/06/ChMkJ1bLy6SIU75AAAH_yltfGAsAALQUwIQmCAAAf_i021.jpg","http://article.fd.zol-img.com.cn/t_s180x134_q7/g5/M00/04/06/ChMkJ1bLy6WILEuoAAI8LC6oLLIAALQUwIlkkIAAjxE778.jpg"],"comment_num":0,"url":"http://lcd.zol.com.cn/569/5694837.html","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/708/li9EPxiMBXigY.jpg","imgsrc2":"http://2a.zol-img.com.cn/article/12_440x330/708/li9EPxiMBXigY.jpg"}]
     * num : 10151
     * pics : [{"id":"5693595","stitle":"HTC中端机型A16曝光","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJ1bK2QWIJEhMAALxucYm2kQAALJ0wAndpYAAvHR464.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/0C/ChMkJlbKr0eIIGY3AAJGStEouH0AALF0wLFrtQAAkZi718.jpg","type":"0","url":"http://news.zol.com.cn/569/5693595.html"},{"id":"5693667","stitle":"三星S7内置水冷散热系统","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJ1bK2W6IRHxnAAMNCtxG-ekAALJ1wDVri4AAw0i616.jpg","imgsrc2":"http://i3.pro.fd.zol-img.com.cn/t_s440x330c4_w1/g5/M00/01/05/ChMkJ1bKexmIJGIwAAD_ath49DUAALEFQNkNs4AAP-C053.jpg","type":"0","url":"http://news.zol.com.cn/569/5693667.html"},{"id":"5693624","stitle":"还记得AppleWatch隐藏接口吗？","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s800x450/g5/M00/02/0C/ChMkJlbK2jOIO-JYAAMKVZZahW4AALJ3gJRdMUAAwpt641.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/01/0C/ChMkJ1bKsnKIA-SsAAFoqaZEJnkAALF8ACiHlAAAWjB213.jpg","type":"0","url":"http://news.zol.com.cn/569/5693624.html"}]
     * resVersion : 1456202981
     */

    private String doc_update_nums;
    private String num;
    private String resVersion;
    /**
     * id : 5695293
     * stitle : 扎克伯格对什么时候教女儿上网很纠结
     * joinPeople : 0
     * sdate : 2016-02-23 11:58:53
     * type : 0
     * pics : ["http://2a.zol-img.com.cn/article/12_180x134/750/liCY4DTpuxJl.jpg"]
     * comment_num : 0
     * url : http://soft.zol.com.cn/569/5695293.html
     * imgsrc : http://2a.zol-img.com.cn/article/12_170x300/750/liCY4DTpuxJl.jpg
     * imgsrc2 : http://2a.zol-img.com.cn/article/12_440x330/750/liCY4DTpuxJl.jpg
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

    public static TestItem objectFromData(String str)
    {

        return new Gson().fromJson(str, TestItem.class);
    }

    public static TestItem objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TestItem.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<TestItem> arrayTestItemFromData(String str)
    {

        Type listType = new TypeToken<ArrayList<TestItem>>()
        {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<TestItem> arrayTestItemFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<TestItem>>()
            {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

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

                return new Gson().fromJson(jsonObject.getString(str), listType);

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

                return new Gson().fromJson(jsonObject.getString(str), listType);

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
