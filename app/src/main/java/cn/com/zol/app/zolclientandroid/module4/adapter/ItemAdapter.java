package cn.com.zol.app.zolclientandroid.module4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import cn.com.zol.app.zolclientandroid.R;
import cn.com.zol.app.zolclientandroid.module4.bean.Item;
import cn.com.zol.app.zolclientandroid.other.MyApplication;

public class ItemAdapter<T> extends BaseAdapter
{

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public ItemAdapter(Context context, List<T> objects)
    {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.objects = objects;
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
            convertView = layoutInflater.inflate(R.layout.fragment_shop_content_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((T) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder)
    {
        //TODO implement

        String attentionNum = ((Item) object).getAttentionNum();
        String goodsName = ((Item) object).getGoodsName();
        String url = ((Item) object).getUrl();
        String marketPrice = ((Item) object).getMarketPrice();
        String picUrl = ((Item) object).getPicUrl();
        String salePrice = ((Item) object).getSalePrice();
        String stauts = ((Item) object).getStauts();//剩几天
        int goodsType = ((Item) object).getGoodsType();//1表示快要卖完了或者已经卖完了,2表示还有很多

        MyApplication.imageLoader.get(picUrl, ImageLoader.getImageListener(holder.goodsPicIv, 0, 0));
        if (goodsType == 1)
        {
            holder.statusTv.setVisibility(View.VISIBLE);
            holder.statusTv.setText(stauts);
        }
        holder.goodsNameTv.setText(goodsName);
        holder.salePriceTv.setText(salePrice);
        holder.marketPriceTv.setText(marketPrice);

    }

    protected class ViewHolder
    {
        private ImageView goodsPicIv;
        private TextView statusTv;
        private TextView goodsNameTv;
        private TextView salePriceTv;
        private TextView marketPriceTv;
        private Button buyNowBtn;

        public ViewHolder(View view)
        {
            goodsPicIv = (ImageView) view.findViewById(R.id.goods_pic);
            statusTv = (TextView) view.findViewById(R.id.status);
            goodsNameTv = (TextView) view.findViewById(R.id.goods_name);
            salePriceTv = (TextView) view.findViewById(R.id.sale_price);
            marketPriceTv = (TextView) view.findViewById(R.id.market_price);
            buyNowBtn = (Button) view.findViewById(R.id.buy_now);
        }
    }
}
