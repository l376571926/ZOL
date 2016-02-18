package cn.com.zol.app.zolclientandroid.other;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by liyiwei on 2016/1/30.
 */
public class MyApplication extends Application
{
    public static RequestQueue requestQueue;
    public static LruCache<String, Bitmap> lruCache;
    public static ImageLoader imageLoader;

    @Override
    public void onCreate()
    {
        super.onCreate();
        requestQueue = Volley.newRequestQueue(this);
        /**
         * 获取最大可用内存
         *
         * last recently use
         */
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        lruCache = new LruCache<String, Bitmap>(maxMemory / 8)
        {
            @Override
            protected int sizeOf(String key, Bitmap value)
            {
                return value.getByteCount();
            }
        };

        imageLoader = new ImageLoader(MyApplication.requestQueue, new ImageLoader.ImageCache()
        {
            @Override
            public Bitmap getBitmap(String url)
            {
                return MyApplication.lruCache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap)
            {
                MyApplication.lruCache.put(url, bitmap);
            }
        });
    }
}
