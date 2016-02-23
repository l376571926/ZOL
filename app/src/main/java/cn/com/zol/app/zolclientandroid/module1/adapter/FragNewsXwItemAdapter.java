package cn.com.zol.app.zolclientandroid.module1.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.lidroid.xutils.util.LogUtils;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.bean.News;
import cn.com.zol.app.zolclientandroid.other.MyApplication;

public class FragNewsXwItemAdapter<T> extends BaseAdapter
{

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public FragNewsXwItemAdapter(Context context, List<T> objects)
    {
        this.context = context;
        this.objects = objects;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return objects.size();
    }

    @Override
    public T getItem(int position)
    {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = layoutInflater.inflate(R.layout.frag_news_xw_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((T) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder)
    {
        boolean showComment = false;
        /**
         * 更新时间
         * (11,15)
         */
        String sdate = ((News.ListEntity) object).getSdate();
        holder.fragNewsXwItemDateTv.setText(sdate.substring(11, 16));

        /**
         * 标题
         */
        String stitle = ((News.ListEntity) object).getStitle();
        holder.fragNewsXwItemTitleTv.setText(stitle);

        /**
         * 要显示的图片
         */
        String imgsrc = ((News.ListEntity) object).getImgsrc();
        List<String> pics = ((News.ListEntity) object).getPics();
        if (pics.size() == 3)
        {
            holder.fragNewsXwItemIconsLl.setVisibility(View.VISIBLE);
            holder.fragNewsXwItemIconRightIv.setVisibility(View.GONE);

            int width = holder.fragNewsXwItemIconsLl.getWidth();
            int height = holder.fragNewsXwItemIconsLl.getHeight();
            int measuredWidth = holder.fragNewsXwItemIconsLl.getMeasuredWidth();
            int measuredHeight = holder.fragNewsXwItemIconsLl.getMeasuredHeight();

            LogUtils.e(width + " " + height + " " + measuredWidth + " " + measuredHeight);

            holder.fragNewsXwItemIcon1Iv.setImageUrl(pics.get(0), MyApplication.imageLoader);
            holder.fragNewsXwItemIcon2Iv.setImageUrl(pics.get(1), MyApplication.imageLoader);
            holder.fragNewsXwItemIcon3Iv.setImageUrl(pics.get(2), MyApplication.imageLoader);
        } else
        {
            showComment = true;

            holder.fragNewsXwItemIconsLl.setVisibility(View.GONE);
            holder.fragNewsXwItemIconRightIv.setVisibility(View.VISIBLE);

            holder.fragNewsXwItemIconRightIv.setImageUrl(imgsrc, MyApplication.imageLoader);
        }

        /**
         * 评论数,图片集合为3时不显示评论
         */
        String comment_num = ((News.ListEntity) object).getComment_num() + "";

//        LogUtils.e("-------------------------------------------");
//        LogUtils.e("comment_num:" + comment_num);
//        LogUtils.e("imgsrc:" + imgsrc);
//        LogUtils.e("pics.size():" + pics.size() + "");
//        LogUtils.e("-------------------------------------------");

        /**
         * 当pics里有三张图片时,优先显示三张图片
         */
        if (showComment)
        {
            holder.fragNewsXwItemCommentDownTv.setVisibility(View.VISIBLE);
            if (imgsrc.length() == 0)
            {
                holder.fragNewsXwItemCommentDownTv.setGravity(Gravity.RIGHT);
            } else
            {
                holder.fragNewsXwItemCommentDownTv.setGravity(Gravity.LEFT);
            }
            if (comment_num.equals("0"))
            {
                holder.fragNewsXwItemCommentDownTv.setText(context.getResources().getString(R.string.robsofa));
            } else
            {
                comment_num = context.getResources().getString(R.string.comment, comment_num);
                holder.fragNewsXwItemCommentDownTv.setText(comment_num);
            }
        }

        String id = ((News.ListEntity) object).getId();

        String imgsrc2 = ((News.ListEntity) object).getImgsrc2();
        String joinPeople = ((News.ListEntity) object).getJoinPeople();

        String type = ((News.ListEntity) object).getType();
        /**
         * 单击进去WebView所要显示的网页
         */
        String url = ((News.ListEntity) object).getUrl();
    }

    protected class ViewHolder
    {
        private LinearLayout fragNewsXwItemLl;
        private TextView fragNewsXwItemDateTv;
        private LinearLayout fragNewsXwItemTitleLl;
        private TextView fragNewsXwItemTitleTv;
        private LinearLayout fragNewsXwItemIconsLl;
        private NetworkImageView fragNewsXwItemIcon1Iv;
        private NetworkImageView fragNewsXwItemIcon2Iv;
        private NetworkImageView fragNewsXwItemIcon3Iv;
        private TextView fragNewsXwItemCommentDownTv;
        private NetworkImageView fragNewsXwItemIconRightIv;

        public ViewHolder(View view)
        {
            fragNewsXwItemLl = (LinearLayout) view.findViewById(R.id.frag_news_xw_item_ll);
            fragNewsXwItemDateTv = (TextView) view.findViewById(R.id.frag_news_xw_item_date_tv);
            fragNewsXwItemTitleLl = (LinearLayout) view.findViewById(R.id.frag_news_xw_item_title_ll);
            fragNewsXwItemTitleTv = (TextView) view.findViewById(R.id.frag_news_xw_item_title_tv);
            fragNewsXwItemIconsLl = (LinearLayout) view.findViewById(R.id.frag_news_xw_item_icons_ll);
            fragNewsXwItemIcon1Iv = (NetworkImageView) view.findViewById(R.id.frag_news_xw_item_icon1_niv);
            fragNewsXwItemIcon2Iv = (NetworkImageView) view.findViewById(R.id.frag_news_xw_item_icon2_niv);
            fragNewsXwItemIcon3Iv = (NetworkImageView) view.findViewById(R.id.frag_news_xw_item_icon3_niv);
            fragNewsXwItemCommentDownTv = (TextView) view.findViewById(R.id.frag_news_xw_item_comment_down_tv);
            fragNewsXwItemIconRightIv = (NetworkImageView) view.findViewById(R.id.frag_news_xw_item_icon_right_niv);
        }
    }
}
