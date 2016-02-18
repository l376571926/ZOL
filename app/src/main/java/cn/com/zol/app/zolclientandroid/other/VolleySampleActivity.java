package cn.com.zol.app.zolclientandroid.other;

import android.app.Activity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.lidroid.xutils.util.LogUtils;

/**
 * Created by liyiwei on 2016/2/10.
 */
public class VolleySampleActivity extends Activity
{

    private String apiUrl = "http://api.zol.com/index.php?c=Tuan_AppReturn&a=NewGoodsList&vs=and420&page=1";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        downStringByGet();
        downStringByPost();

    }

    private void downStringByPost()
    {
    }

    private void downStringByGet()
    {

        StringRequest request = new StringRequest(apiUrl, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                LogUtils.e(response);
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                LogUtils.e(error.getMessage());
            }
        });
    }

}
