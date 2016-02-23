package cn.com.zol.app.zolclientandroid.module4.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.lidroid.xutils.util.LogUtils;

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
            convertView = layoutInflater.inflate(R.layout.frag_shop_lv_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews(getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder)
    {
        String attentionNum = ((Item) object).getAttentionNum();//关注度
        String goodsName = ((Item) object).getGoodsName();//商品名称
        String url = ((Item) object).getUrl();//item单击事件响应后WebView中使用的Url
        String marketPrice = ((Item) object).getMarketPrice();//原价
        String picUrl = ((Item) object).getPicUrl();//商品图片
        String salePrice = ((Item) object).getSalePrice();//抢购价
        String stauts = ((Item) object).getStauts();//剩几天
        int goodsType = ((Item) object).getGoodsType();//1:参团,2:抢购

//        LogUtils.e("attentionNum:" + attentionNum);
//        LogUtils.e("goodsName:" + goodsName);
//        LogUtils.e("url:" + url);
//        LogUtils.e("marketPrice:" + marketPrice);
//        LogUtils.e("picUrl:" + picUrl);
//        LogUtils.e("salePrice:" + salePrice);
//        LogUtils.e("stauts:" + stauts);
//        LogUtils.e("goodsType:" + goodsType);

        //精选特惠
        if (objects.indexOf(object) == 1)
        {
            holder.choicenessLl.setVisibility(View.VISIBLE);
        } else
        {
            holder.choicenessLl.setVisibility(View.GONE);
        }

        //剩29天
        if (stauts != null)
        {
            holder.remainsDayTv.setText(stauts);
        }

        //图片,加载商品图片,用Volley的NetworkImageView加载,否则会出现图片无法填充满父控件的问题
        holder.goodsPicIv.setImageUrl(picUrl, MyApplication.imageLoader);

        //今日爆款,关注量
        attentionNum = context.getResources().getString(R.string.care_count, attentionNum);
        if (objects.indexOf(object) == 0)
        {
            holder.careCountTv.setText(attentionNum);
//            holder.buyNowBtn.setTextColor(Color.WHITE);
//            holder.buyNowBtn.setBackgroundResource(R.drawable.electricity_buying_red);
        } else
        {
            holder.careCountLl.setVisibility(View.GONE);
        }

        //团购,设置商品简介左边的文字
        if (objects.indexOf(object) == 0)
        {
            holder.goodsNameHeaderTv.setVisibility(View.GONE);
        } else if (goodsType == 1)
        {
            holder.goodsNameHeaderTv.setText("团购");
        } else if (goodsType == 2)
        {
            holder.goodsNameHeaderTv.setText("商城");
        }

        //商品简介
        holder.goodsNameTv.setText(goodsName);

        //抢购价
        salePrice = context.getResources().getString(R.string.price_place_holder, salePrice);
        holder.salePriceTv.setText(salePrice);

        //市场价,如果市场价不等于抢购价,则显示带中划线的市场价
        marketPrice = context.getResources().getString(R.string.price_place_holder, marketPrice);
        if (!marketPrice.equals(salePrice))
        {
            //如果市场价不等于抢购价,则显示市场价
            holder.marketPriceTv.setVisibility(View.VISIBLE);
            LogUtils.e("marketPrice" + marketPrice);
            //设置市场价的中划线
            holder.marketPriceTv.getPaint().setAntiAlias(true);
            holder.marketPriceTv.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            //设置市场价
            holder.marketPriceTv.setText(marketPrice);
        } else
        {
            holder.marketPriceTv.setVisibility(View.GONE);
        }

        //立即参团,购买按钮内的文字
        if (objects.indexOf(object) == 0)
        {
            holder.buyNowBtn.setBackgroundResource(R.drawable.electricity_buying_red);
            holder.buyNowBtn.setTextColor(Color.WHITE);
            holder.buyNowBtn.setText("立即抢购");
        } else if (goodsType == 1)
        {
            holder.buyNowBtn.setText("立即参团");
        } else if (goodsType == 2)
        {
            holder.buyNowBtn.setText("立即抢购");
        }
    }

    protected class ViewHolder
    {
        private LinearLayout choicenessLl;
        private NetworkImageView goodsPicIv;
        private TextView remainsDayTv;
        private TextView careCountTv;
        private LinearLayout careCountLl;
        private TextView goodsNameHeaderTv;
        private TextView goodsNameTv;
        private TextView salePriceTv;
        private TextView marketPriceTv;
        private Button buyNowBtn;

        public ViewHolder(View view)
        {
            choicenessLl = (LinearLayout) view.findViewById(R.id.frag_shop_lv_item_choiceness_ll);
            goodsPicIv = (NetworkImageView) view.findViewById(R.id.goods_pic);
            remainsDayTv = (TextView) view.findViewById(R.id.frag_shop_lv_item_remains_day_tv);
            careCountTv = (TextView) view.findViewById(R.id.frag_shop_lv_item_care_count_tv);
            careCountLl = (LinearLayout) view.findViewById(R.id.frag_shop_lv_care_count_ll);
            goodsNameHeaderTv = (TextView) view.findViewById(R.id.frag_shop_lv_item_goods_name_header_tv);
            goodsNameTv = (TextView) view.findViewById(R.id.goods_name);
            salePriceTv = (TextView) view.findViewById(R.id.frag_shop_lv_item_sale_price_tv);
            marketPriceTv = (TextView) view.findViewById(R.id.frag_shop_lv_item_market_price_tv);
            buyNowBtn = (Button) view.findViewById(R.id.frag_shop_lv_item_buy_now_btn);
        }
    }
}
