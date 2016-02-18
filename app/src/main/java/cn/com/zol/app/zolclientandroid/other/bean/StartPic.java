package cn.com.zol.app.zolclientandroid.other.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by liyiwei on 2016/2/12.
 */
public class StartPic
{

    /**
     * type : 1
     * url : {"320x480":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YCIH2TEAAIuzMjjlw0AAIVhgINhCkAAi7k998.jpg","480x854":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJ1ay8YGIMTWaAAK2wnu4C1EAAIVhgIPsw0AArba139.jpg","540x960":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJ1ay8YGIH_dGAAMmBOh3F_gAAIVhgITHlUAAyYc104.jpg","720x1280":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIGsF3AAXe6blxrHkAAIVhgIWRHEABd8B669.jpg","800x1280":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIQHTXAAH4WI6vWscAAIVhgIcI3IAAfhw457.jpg","1080x1800":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIUj-qAAgnbosXgl8AAIVhgIfObgACCeG617.jpg","1080x1920":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJ1ay8YGIInPeAAgoeVn9wRwAAIVhgIr3yIACCiR881.jpg","1440x2560":"http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIOurTAAxHdEcz35cAAIVhgI0B7MADEeM821.jpg"}
     * linktype : 0
     * data : []
     */

    private int type;

    /**
     * 320x480 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YCIH2TEAAIuzMjjlw0AAIVhgINhCkAAi7k998.jpg
     * 480x854 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJ1ay8YGIMTWaAAK2wnu4C1EAAIVhgIPsw0AArba139.jpg
     * 540x960 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJ1ay8YGIH_dGAAMmBOh3F_gAAIVhgITHlUAAyYc104.jpg
     * 720x1280 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIGsF3AAXe6blxrHkAAIVhgIWRHEABd8B669.jpg
     * 800x1280 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIQHTXAAH4WI6vWscAAIVhgIcI3IAAfhw457.jpg
     * 1080x1800 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIUj-qAAgnbosXgl8AAIVhgIfObgACCeG617.jpg
     * 1080x1920 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJ1ay8YGIInPeAAgoeVn9wRwAAIVhgIr3yIACCiR881.jpg
     * 1440x2560 : http://wuxian.fd.zol-img.com.cn/g5/M00/05/0A/ChMkJlay8YGIOurTAAxHdEcz35cAAIVhgI0B7MADEeM821.jpg
     */

    public void setType(int type)
    {
        this.type = type;
    }

    public int getType()
    {
        return type;
    }

    public static class UrlEntity
    {
        @SerializedName("320x480")
        private String s320x480;
        @SerializedName("480x854")
        private String s480x854;
        @SerializedName("540x960")
        private String s540x960;
        @SerializedName("720x1280")
        private String s720x1280;
        @SerializedName("800x1280")
        private String s800x1280;
        @SerializedName("1080x1800")
        private String s1080x1800;
        @SerializedName("1080x1920")
        private String s1080x1920;
        @SerializedName("1440x2560")
        private String s1440x2560;

        public static UrlEntity objectFromData(String str, String key)
        {

            try
            {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(key), UrlEntity.class);
            } catch (JSONException e)
            {
                e.printStackTrace();
            }

            return null;
        }

        public String getS320x480()
        {
            return s320x480;
        }

        public String getS480x854()
        {
            return s480x854;
        }

        public String getS540x960()
        {
            return s540x960;
        }

        public String getS720x1280()
        {
            return s720x1280;
        }

        public String getS800x1280()
        {
            return s800x1280;
        }

        public String getS1080x1800()
        {
            return s1080x1800;
        }

        public String getS1080x1920()
        {
            return s1080x1920;
        }

        public String getS1440x2560()
        {
            return s1440x2560;
        }
    }
}
