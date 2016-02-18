package cn.com.zol.app.zolclientandroid.other.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.other.bean.PublicListTItem;
import cn.com.zol.app.zolclientandroid.other.MyApplication;

public class PublicItemAdapter<T> extends BaseAdapter
{

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public PublicItemAdapter(Context context, List<T> objects)
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
            convertView = layoutInflater.inflate(R.layout.toutiao_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((T) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder)
    {
        //TODO implement
        String imgsrc = ((PublicListTItem.ListEntity) object).getImgsrc();
        String stitle = ((PublicListTItem.ListEntity) object).getStitle();
        String sdate = ((PublicListTItem.ListEntity) object).getSdate();
        sdate = sdate.substring(5, 9);
        String commentNum = ((PublicListTItem.ListEntity) object).getComment_num() + "";

        if (imgsrc != null)
        {
            MyApplication.imageLoader.get(imgsrc, ImageLoader.getImageListener(holder.icon, 0, 0));
        }
        holder.title.setText(stitle);
        holder.date.setText(sdate);
        holder.comment.setText(commentNum);
    }

    protected class ViewHolder
    {
        private ImageView icon;
        private TextView title;
        private TextView date;
        private TextView comment;

        public ViewHolder(View view)
        {
            icon = (ImageView) view.findViewById(R.id.toutiao_item_icon);
            title = (TextView) view.findViewById(R.id.toutiao_item_title);
            date = (TextView) view.findViewById(R.id.toutiao_item_date);
            comment = (TextView) view.findViewById(R.id.comment);
        }
    }
}
