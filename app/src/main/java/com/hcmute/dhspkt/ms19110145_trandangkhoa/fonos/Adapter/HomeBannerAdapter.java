package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Banner;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.List;


public class HomeBannerAdapter extends RecyclerView.Adapter<HomeBannerAdapter.HomeCouponViewHolder>{
    private final List<Banner> bannerList;
    public HomeBannerAdapter(List<Banner> bannerList) {
        this.bannerList = bannerList;
    }


    @NonNull
    @Override
    public HomeCouponViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coupon,parent,false);
        return new HomeCouponViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull HomeCouponViewHolder holder, int position) {
        Banner banner = bannerList.get(position);
        if(banner ==null)
        {
            return;
        }
        holder.imgCoupon.setImageResource(banner.getResourceId());
    }

    @Override
    public int getItemCount() {
        if(bannerList !=null)
        {
            return bannerList.size();
        }
        return 0;
    }

    public static class HomeCouponViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imgCoupon;
        public HomeCouponViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCoupon=itemView.findViewById(R.id.coupon_image);
        }
    }
}