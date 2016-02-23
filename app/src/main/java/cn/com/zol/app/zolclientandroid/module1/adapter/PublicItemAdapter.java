package cn.com.zol.app.zolclientandroid.module1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.MyApplication;
import cn.com.zol.app.zolclientandroid.module1.bean.PublicListTItem;

public class PublicItemAdapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public PublicItemAdapter(Context context, List<T> objects) {
        this.context = context;
        this.objects = objects;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public T getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.frag_news_tt_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((T) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        String imgsrc = ((PublicListTItem.ListEntity) object).getImgsrc();
        String stitle = ((PublicListTItem.ListEntity) object).getStitle();
        String sdate = ((PublicListTItem.ListEntity) object).getSdate();
        String commentNum = ((PublicListTItem.ListEntity) object).getComment_num() + "";

        sdate = sdate.substring(5, 10);
        if (commentNum.equals("0")) {
            commentNum = context.getString(R.string.robsofa);
        } else {
            commentNum = context.getResources().getString(R.string.comment, commentNum);
        }

        if (imgsrc != null) {
            holder.icon.setImageUrl(imgsrc,MyApplication.imageLoader);
//            MyApplication.imageLoader.get(imgsrc, ImageLoader.getImageListener(holder.icon, 0, 0));
        }
        holder.title.setText(stitle);
        holder.date.setText(sdate);
        holder.comment.setText(commentNum);
    }

    protected class ViewHolder {
        private NetworkImageView icon;
        private TextView title;
        private TextView date;
        private TextView comment;

        public ViewHolder(View view) {
            icon = (NetworkImageView) view.findViewById(R.id.frag_news_tt_item_icon_niv);
            title = (TextView) view.findViewById(R.id.frag_news_tt_item_title_tv);
            date = (TextView) view.findViewById(R.id.frag_news_tt_item_data_tv);
            comment = (TextView) view.findViewById(R.id.frag_news_tt_item_comment_tv);
        }
    }
}
