package cn.com.zol.app.zolclientandroid.module1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module1.bean.Headline;
import cn.com.zol.app.zolclientandroid.other.MyApplication;

public class FragNewsTtItemAdapter<T> extends BaseAdapter
{

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public FragNewsTtItemAdapter(Context context, List<T> objects)
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
            convertView = layoutInflater.inflate(R.layout.frag_news_tt_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((T) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder)
    {
        //TODO implement
        String imgsrc = ((Headline.ListEntity) object).getImgsrc();
        String stitle = ((Headline.ListEntity) object).getStitle();
        String sdate = ((Headline.ListEntity) object).getSdate();
        String comment_num = ((Headline.ListEntity) object).getComment_num() + "";

        /**
         * 设置图片
         */
        if (imgsrc != null)
        {
            holder.fragNewsTtItemIconNiv.setImageUrl(imgsrc, MyApplication.imageLoader);
        }

        /**
         * 设置标题
         */
        holder.fragNewsTtItemTitleTv.setText(stitle);

        /**
         * 设置更新时间
         */
        holder.fragNewsTtItemDataTv.setText(sdate.substring(5, 10));

        /**
         * 设置评论
         */
        if (comment_num.equals("0"))
        {
            comment_num = context.getResources().getString(R.string.robsofa);
        } else
        {
            comment_num = context.getResources().getString(R.string.comment, comment_num);
        }
        holder.fragNewsTtItemCommentTv.setText(comment_num);

    }

    protected class ViewHolder {
        private LinearLayout fragNewsTtItem;
        private LinearLayout fragNewsTtItemIconLl;
        private NetworkImageView fragNewsTtItemIconNiv;
        private LinearLayout fragNewsTtItemTitleLl;
        private TextView fragNewsTtItemTitleTv;
        private LinearLayout fragNewsTtItemCenterIconsLl;
        private ImageView fragNewsTtItemIcon1Iv;
        private ImageView fragNewsTtItemIcon2Iv;
        private ImageView fragNewsTtItemIcon3Iv;
        private LinearLayout fragNewsTtItemDataLl;
        private TextView fragNewsTtItemDataTv;
        private TextView fragNewsTtItemCommentTv;

        public ViewHolder(View view) {
            fragNewsTtItem = (LinearLayout) view.findViewById(R.id.frag_news_tt_item);
            fragNewsTtItemIconLl = (LinearLayout) view.findViewById(R.id.frag_news_tt_item_icon_ll);
            fragNewsTtItemIconNiv = (NetworkImageView) view.findViewById(R.id.frag_news_tt_item_icon_niv);
            fragNewsTtItemTitleLl = (LinearLayout) view.findViewById(R.id.frag_news_tt_item_title_ll);
            fragNewsTtItemTitleTv = (TextView) view.findViewById(R.id.frag_news_tt_item_title_tv);
            fragNewsTtItemCenterIconsLl = (LinearLayout) view.findViewById(R.id.frag_news_tt_item_center_icons_ll);
            fragNewsTtItemIcon1Iv = (ImageView) view.findViewById(R.id.frag_news_tt_item_icon1_iv);
            fragNewsTtItemIcon2Iv = (ImageView) view.findViewById(R.id.frag_news_tt_item_icon2_iv);
            fragNewsTtItemIcon3Iv = (ImageView) view.findViewById(R.id.frag_news_tt_item_icon3_iv);
            fragNewsTtItemDataLl = (LinearLayout) view.findViewById(R.id.frag_news_tt_item_data_ll);
            fragNewsTtItemDataTv = (TextView) view.findViewById(R.id.frag_news_tt_item_data_tv);
            fragNewsTtItemCommentTv = (TextView) view.findViewById(R.id.frag_news_tt_item_comment_tv);
        }
    }
}
