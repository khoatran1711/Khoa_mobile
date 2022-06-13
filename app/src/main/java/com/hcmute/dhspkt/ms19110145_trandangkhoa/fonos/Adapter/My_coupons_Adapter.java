package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Coupons;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.List;

public class My_coupons_Adapter extends BaseAdapter {
    private Context context;
    private List<Coupons> lcoupons;
    private int layout;
    private boolean active;

    public My_coupons_Adapter(Context context, int layout, List<Coupons> lcoupons, boolean active) {
        this.context = context;
        this.lcoupons = lcoupons;
        this.layout = layout;
        this.active = active;
    }

    @Override
    public int getCount() {
        return lcoupons.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    private class ViewHolder {
        LinearLayout background;
        TextView price;
        TextView day;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Coupons coupons = lcoupons.get(i);
        ViewHolder holder;

        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.background = (LinearLayout) view.findViewById(R.id.coupon_background);
            holder.price = (TextView) view.findViewById(R.id.tv_discount_price);
            holder.day =(TextView) view.findViewById(R.id.tv_discount_day);
            holder.price.setText(String.valueOf(coupons.getDis_percent()*100) +"%");
            holder.day.setText("Expire day: "+coupons.getExpired_date());

            if(active){
                holder.background.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Coupons value=coupons;
                        Intent i = new Intent();
                        i.putExtra("using_coupon",  value);
                        ((Activity)context).setResult(Activity.RESULT_OK,i);
                        ((Activity)context).finish();
                    }
                });
            }


        } else{
            holder = (ViewHolder) view.getTag();
        }


        return view;
    }


}
