package cn.com.zol.app.zolclientandroid.other.bean;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyiwei on 2016/2/2.
 */
public class PublicListTItem
{

    /**
     * list : [{"stitle":"上课偷玩的诺基亚：那些年塞班上的神级游戏","sdate":"2016-02-02 12:00:12","type":"0","listStyle":"1","label":"","joinPeople":"1533","url":"http://appnews.zol.com.cn/567/5672148.html","id":"5672148","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/03/08/ChMkJlawEZuIYNRwAACM-r2B_VMAAINEABCM9kAAI0S018.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/08/ChMkJlawEKCIEj_HAABTBaUtv0EAAINDQKcUvsAAFMd515.jpg","comment_num":62},{"stitle":"死磕苹果！谷歌计划自己设计Nexus手机","sdate":"2016-02-02 12:00:11","type":"0","listStyle":"1","label":"","joinPeople":"2094","url":"http://news.zol.com.cn/567/5672143.html","id":"5672143","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/656/liDRtyOw5pHkM.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/08/ChMkJlawEdSISAl_AAMPC_auWVcAAINEAH4cl0AAw8j188.jpg","comment_num":18},{"stitle":"自相残杀？微信移除QQ好友导入功能","sdate":"2016-02-02 12:00:10","type":"0","listStyle":"1","label":"","joinPeople":"1828","url":"http://soft.zol.com.cn/567/5672408.html","id":"5672408","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/03/09/ChMkJlawIf6IEjc4AAC2pH-idAkAAINPQKomCQAALa8495.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/09/ChMkJlawGpWIWZYQAAFZRCQ_-jQAAINKwC3xcsAAVlc846.png","comment_num":71},{"stitle":"BB平台惨遭抛弃！ 黑莓高管称将只专注安卓","sdate":"2016-02-02 12:00:09","type":"0","listStyle":"1","label":"","joinPeople":"771","url":"http://mobile.zol.com.cn/567/5671985.html","id":"5671985","imgsrc":"http://2a.zol-img.com.cn/article/12_170x300/634/liqtNi55wzoCs.jpg","imgsrc2":"http://i1.pro.fd.zol-img.com.cn/t_s640x2000c4_w1/g5/M00/0D/00/ChMkJ1ZEAcmIPSaaAALyLSy5S70AAEzeQEJKswAAvJF671.jpg","comment_num":10},{"stitle":"配压感屏幕 金立Elite S8 MWC邀请函曝光","sdate":"2016-02-02 12:00:08","type":"0","listStyle":"1","label":"","joinPeople":"1263","url":"http://mobile.zol.com.cn/567/5672428.html","id":"5672428","imgsrc":"http://2c.zol-img.com.cn/article/12_170x300/696/li9i0W4tn6ZLQ.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/09/ChMkJlawHBKIPS18AABSG5BVkJMAAINLgJcMM4AAFIz979.jpg","comment_num":16},{"stitle":"VAIO将推Win 10 Mobile手机：锁定2月4日","sdate":"2016-02-02 12:00:07","type":"0","listStyle":"1","label":"","joinPeople":"270","url":"http://news.zol.com.cn/567/5672449.html","id":"5672449","imgsrc":"http://2e.zol-img.com.cn/article/12_170x300/710/liCKUo8XJaF7g.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/09/ChMkJlawHK-IDc3bAAJZ_YkmPGYAAINMAHZYV8AAloV316.jpg","comment_num":11},{"stitle":"原力之战 RGB背光机械键盘终极横评","sdate":"2016-02-02 12:00:06","type":"0","listStyle":"1","label":"","joinPeople":"5675","url":"http://mouse.zol.com.cn/561/5618666.html","id":"5618666","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/00/02/ChMkJlavNE6IN42eAAC0v26MH0EAAH_WwDzDqYAALTX653.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/00/0F/ChMkJ1avZoSIeDJgAAOR-vLAw_EAAICmwPxMwMAA5IS951.png","comment_num":26},{"stitle":"不跟风玫瑰金 LG V10新增湖蓝配色","sdate":"2016-02-02 12:00:05","type":"0","listStyle":"1","label":"","joinPeople":"1796","url":"http://mobile.zol.com.cn/566/5669810.html","id":"5669810","imgsrc":"http://2f.zol-img.com.cn/article/12_170x300/363/li0EpbzCRyjm2.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/0F/09/ChMkJ1au2BOIOqoiAADcf1ebyyUAAH9TwLj7DcAANyX695.jpg","comment_num":12},{"stitle":"边框更加圆润 三星S7背部渲染图曝光","sdate":"2016-02-02 12:00:05","type":"0","listStyle":"1","label":"","joinPeople":"1414","url":"http://mobile.zol.com.cn/567/5672106.html","id":"5672106","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/03/09/ChMkJlawGhCITOMWAABojslEm44AAINKgD_vOIAAGim131.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/09/ChMkJ1awFFeIEKqmAAAscoCZTXoAAINFwISdQEAACyK270.jpg","comment_num":18},{"stitle":"魅族手机正式登陆美国：年底支持4G网络","sdate":"2016-02-02 12:00:05","type":"0","listStyle":"1","label":"","joinPeople":"481","url":"http://news.zol.com.cn/567/5672407.html","id":"5672407","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/673/liTean8IeQ4EQ.jpg","imgsrc2":"http://i0.pro.fd.zol-img.com.cn/t_s640x2000c4_w1/g2/M00/00/04/Cg-4WVVufvWIR0e8AAs-s3mgeu8AAEkwAG2osQACz7L410.jpg","comment_num":25},{"stitle":"iPad Air 3设计图流出 缩小版iPad Pro？","sdate":"2016-02-02 12:00:03","type":"0","listStyle":"1","label":"","joinPeople":"3689","url":"http://news.zol.com.cn/567/5671979.html","id":"5671979","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/03/08/ChMkJlawD8eIYg_vAADNlaatqPsAAINCwM-voQAAM2t779.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/08/ChMkJ1awCEKIaZUUAAFeYVkaUbkAAIM-AINQLIAAV55266.jpg","comment_num":13},{"stitle":"iPhone全套翻新流程，长见识了！","sdate":"2016-02-02 11:11:52","type":"0","listStyle":"1","label":"","joinPeople":"2917","url":"http://appnews.zol.com.cn/567/5672452.html","id":"5672452","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/703/liBhsSYFDgDc.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/09/ChMkJ1awHOyIVz9sAAQ5rD9m7-wAAINMQDCNgkABDnE065.jpg","comment_num":90},{"stitle":"微软Win10份额超越XP，你升级了么？","sdate":"2016-02-02 10:06:19","type":"0","listStyle":"1","label":"","joinPeople":"852","url":"http://news.zol.com.cn/567/5671996.html","id":"5671996","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/03/08/ChMkJ1awDxuIOyZLAABMqb6x1EsAAINCgKAn4IAAEzB185.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/08/ChMkJlawCiCIAkPYAAAzriWbmLoAAIM_wNjr9IAADPG174.jpg","comment_num":46},{"stitle":"1099充值信仰，锤子限定版汪峰耳机现货发售","sdate":"2016-02-02 09:00:07","type":"0","listStyle":"1","label":"","joinPeople":"1101","url":"http://appnews.zol.com.cn/567/5671958.html","id":"5671958","imgsrc":"http://2d.zol-img.com.cn/article/12_170x300/613/liWpPL4e3SPc.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/06/ChMkJlav_9eIF0YXAAE_3WzjzZYAAIMbgPe_sIAAT_1355.jpg","comment_num":72},{"stitle":"刚用16元抢了一部iPhone 6S","sdate":"2016-01-26 12:00:05","type":"18","listStyle":"1","label":"推广","joinPeople":"","url":"http://1.wowozhe.com/tg/zgc/index.htm","id":"0","imgsrc":"http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/0F/0A/ChMkJlau-wGIUZ3uAAAblRknD8cAAH9kwPjz2UAABut740.jpg","imgsrc2":"http://icon.zol.com.cn/zol_wap_pic/defaultpic.png","comment_num":0}]
     * num : 2000
     * doc_update_nums : 246
     * pics : [{"id":"5652985","stitle":"天价打造黄金矩阵 碾压校长定制机","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56af36c570690.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/0B/0A/ChMkJ1aoYw6IEtcQAAGkuTIMMy4AAHtXgMZi1QAAaTR550.jpg","type":0,"url":"http://power.zol.com.cn/565/5652985.html"},{"id":"http://e.cn.miaozhen.com/r/k=2010860&p=6wCMS&dx=0&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nd=__DRA__&np=__POS__&nn=__APP__&o=https://h5.m.taobao.com/weapp/view_page.htm?page=shop/activity&userId=749240762&pageId=20635261","stitle":"博朗 只给挚爱的人","imgsrc":"http://digital.zol.com.cn/275_module_images/21/56a974a5cc55a.jpg","imgsrc2":"http://digital.zol.com.cn/275_module_images/21/56a974a5cc55a.jpg","type":18,"url":"http://e.cn.miaozhen.com/r/k=2010860&p=6wCMS&dx=0&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nd=__DRA__&np=__POS__&nn=__APP__&o=https://h5.m.taobao.com/weapp/view_page.htm?page=shop/activity&userId=749240762&pageId=20635261"},{"id":"5668067","stitle":"苹果小屏幕绝唱 iPhone5SE大猜想","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56ae12efaa420.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/0D/0B/ChMkJlarPqCIO32lAAB9S80IU_YAAH1qwNkmrgAAH1j758.jpg","type":0,"url":"http://mobile.zol.com.cn/566/5668067.html"},{"id":"5554376","stitle":"PC/PS/Xbox谁是最佳游戏平台？","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56ab3feabd082.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/0D/08/ChMkJlarAL-IADriAAE4SICyjBMAAH03ADUTpQAAThg197.jpg","type":0,"url":"http://mouse.zol.com.cn/555/5554376.html"},{"id":"5656894","stitle":"高清拍摄靠吹牛？","imgsrc":"http://digital.zol.com.cn/275_module_images/20/56ab3f8a47b12.jpg","imgsrc2":"http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/0C/0E/ChMkJ1ap-jCIKOe1AAFXYLmYo2cAAHyjgFirPQAAVd4699.jpg","type":0,"url":"http://gps.zol.com.cn/565/5656894.html"}]
     * resVersion : 1454395829
     */

    private String num;
    private String doc_update_nums;
    private String resVersion;
    /**
     * stitle : 上课偷玩的诺基亚：那些年塞班上的神级游戏
     * sdate : 2016-02-02 12:00:12
     * type : 0
     * listStyle : 1
     * label :
     * joinPeople : 1533
     * url : http://appnews.zol.com.cn/567/5672148.html
     * id : 5672148
     * imgsrc : http://wuxian.fd.zol-img.com.cn/t_s170x300_q7/g5/M00/03/08/ChMkJlawEZuIYNRwAACM-r2B_VMAAINEABCM9kAAI0S018.jpg
     * imgsrc2 : http://article.fd.zol-img.com.cn/t_s640x2000c4/g5/M00/03/08/ChMkJlawEKCIEj_HAABTBaUtv0EAAINDQKcUvsAAFMd515.jpg
     * comment_num : 62
     */

    private List<ListEntity> list;
    /**
     * id : 5652985
     * stitle : 天价打造黄金矩阵 碾压校长定制机
     * imgsrc : http://digital.zol.com.cn/275_module_images/20/56af36c570690.jpg
     * imgsrc2 : http://article.fd.zol-img.com.cn/t_s440x330c4/g5/M00/0B/0A/ChMkJ1aoYw6IEtcQAAGkuTIMMy4AAHtXgMZi1QAAaTR550.jpg
     * type : 0
     * url : http://power.zol.com.cn/565/5652985.html
     */

    private List<PicsEntity> pics;

    public static PublicListTItem objectFromData(String str)
    {

        return new com.google.gson.Gson().fromJson(str, PublicListTItem.class);
    }

    public static PublicListTItem objectFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(jsonObject.getJSONArray(key).toString(), PublicListTItem.class);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static List<PublicListTItem> arrayItemFromData(String str)
    {

        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<PublicListTItem>>()
        {
        }.getType();

        return new com.google.gson.Gson().fromJson(str, listType);
    }

    public static List<PublicListTItem> arrayItemFromData(String str, String key)
    {

        try
        {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<PublicListTItem>>()
            {
            }.getType();

            return new com.google.gson.Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

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

            return new com.google.gson.Gson().fromJson(str, ListEntity.class);
        }

        public static ListEntity objectFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ListEntity.class);
            } catch (JSONException e)
            {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ListEntity> arrayListEntityFromData(String str)
        {

            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ListEntity>>()
            {
            }.getType();

            return new com.google.gson.Gson().fromJson(str, listType);
        }

        public static List<ListEntity> arrayListEntityFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ListEntity>>()
                {
                }.getType();

                return new com.google.gson.Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

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

            return new com.google.gson.Gson().fromJson(str, PicsEntity.class);
        }

        public static PicsEntity objectFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), PicsEntity.class);
            } catch (JSONException e)
            {
                e.printStackTrace();
            }

            return null;
        }

        public static List<PicsEntity> arrayPicsEntityFromData(String str)
        {

            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<PicsEntity>>()
            {
            }.getType();

            return new com.google.gson.Gson().fromJson(str, listType);
        }

        public static List<PicsEntity> arrayPicsEntityFromData(String str, String key)
        {
            try
            {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<PicsEntity>>()
                {
                }.getType();

                return new com.google.gson.Gson().fromJson(jsonObject.getJSONArray(key).toString(), listType);

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
