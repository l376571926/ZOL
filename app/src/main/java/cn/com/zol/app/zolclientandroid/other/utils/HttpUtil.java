package cn.com.zol.app.zolclientandroid.other.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;

/**
 * Created by perbo on 2015-12-07.
 */
public class HttpUtil {
    public static String post(String url, Map<String, String> paramsMap) {
        try {
            URL parseUrl = new URL(url);

            HttpURLConnection conn = (HttpURLConnection) parseUrl.openConnection();
            // 设置请求方式
            conn.setRequestMethod("POST");
            // 添加写入数据权限
            conn.setDoOutput(true);
            //设置连接超时
            conn.setConnectTimeout(2000);
            //设置读取超时
            conn.setReadTimeout(2000);
            //连接
            conn.connect();

            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
            // 参数
            String keyValue = parseParams(paramsMap);
            // 写入参数
            dos.writeBytes(keyValue);
            // flush一下
            dos.flush();
            // 关流
            dos.close();
            // 获取状态码
            int stateCode = conn.getResponseCode();

            if (stateCode == HttpURLConnection.HTTP_OK) {

                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                // 每次读取一行的缓冲
                String readLine;
                // 数据存储缓冲
                StringBuffer stringBuffer = new StringBuffer();
                //每次读取一行，不为null的时候追加到存储缓冲，当读取返回null的时候，不再执行
                while ((readLine = br.readLine()) != null) {
                    stringBuffer.append(readLine);
                }

                br.close();
                Log.d("httputil", "连接成功");
                return stringBuffer.toString();

            }


        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Log.d("httputil","连接失败");
        return null;
    }

    /**
     * get方式获取数据
     */
    public static String get(String url) {
        try {
            URL parseUrl = new URL(url);

            HttpURLConnection conn = (HttpURLConnection) parseUrl.openConnection();
            // 设置请求方式
            conn.setRequestMethod("GET");
            // 添加读取数据权限
            conn.setDoInput(true);
            //设置连接超时
            conn.setConnectTimeout(5000);
            //设置读取超时
            conn.setReadTimeout(5000);
            //连接
            conn.connect();
            // 获取状态码
            int stateCode = conn.getResponseCode();

            if (stateCode == HttpURLConnection.HTTP_OK) {

                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                // 每次读取一行的缓冲
                String readLine;
                // 数据存储缓冲
                StringBuffer stringBuffer = new StringBuffer();
                //每次读取一行，不为null的时候追加到存储缓冲，当读取返回null的时候，不再执行
                while ((readLine = br.readLine()) != null) {
                    stringBuffer.append(readLine);
                }

                br.close();
                Log.d("httputil","连接成功");
                return stringBuffer.toString();

            }


        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Log.d("httputil","连接失败");
        return null;

    }

    /**
     * 参数包装
     *
     * @param params
     * @return
     */

    private static String parseParams(Map<String, String> params) {

        StringBuffer sb = new StringBuffer();
        // 获取所有key
        Set<String> keySet = params.keySet();

        if (keySet.size() > 0) {
            // 遍历所有key，追加到StringBuffer上，继续追加"=",value,"&"
            for (String key : keySet) {
                sb.append(key).append("=").append(params.get(key)).append("&");
            }
            // 删除最后位置的 " & "
            sb.deleteCharAt(sb.length() - 1);
        }
        ;

        return sb.toString();
    }

    public static Bitmap getBitmap(String url) {
        try {
            URL parseUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) parseUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();
            int stateCode = conn.getResponseCode();
            if (stateCode == HttpURLConnection.HTTP_OK) {
                Bitmap bitmap= BitmapFactory.decodeStream(conn.getInputStream());
                return bitmap;
            }


        }catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("httputil","连接失败");
        return null;
    }

    //网络请求得到byte数组
    public static byte[] getByte(String url) {
        try {
            URL parseUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) parseUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            int stateCode = conn.getResponseCode();
            if (stateCode == HttpURLConnection.HTTP_OK) {
                InputStream is = conn.getInputStream();
                byte[] b = null;
                try {
                    b = readStream(is);
                    return b;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                is.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    //由输入流得到byte数组
    public static byte[] readStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        outStream.close();
        inStream.close();
        return outStream.toByteArray();
    }
}
