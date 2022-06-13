package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Order;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Product;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.ArrayList;


public class HistoryOrderAdapter extends  RecyclerView.Adapter<HistoryOrderAdapter.HistoryOrderViewHolder>{
    private final ArrayList<Order> orders;
    private ArrayList<Product> products;
    private double totalOrderPrice;


    public HistoryOrderAdapter(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @NonNull
    @Override
    public HistoryOrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.history_order,parent,false);
        return  new HistoryOrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryOrderViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Order order = orders.get(position);
        if(order ==null)
        {
            return;
        }


    }

    @Override
    public int getItemCount() {
        if(orders !=null)
        {
            return orders.size();
        }
        return 0;
    }

    public class HistoryOrderViewHolder extends RecyclerView.ViewHolder{
        private final TextView nameOrder;
        private final RecyclerView orderItemRc;
        private final ConstraintLayout constraintLayout;
        private final LinearLayout expandableLayout;
        private final ImageView imgArrow;
        private final CardView cardView;
        public HistoryOrderViewHolder(@NonNull View itemView) {
            super(itemView);
            nameOrder=itemView.findViewById(R.id.history_order_name);
            orderItemRc=itemView.findViewById(R.id.history_order_recycler_view);
            constraintLayout=itemView.findViewById(R.id.history_order_constraint_layout);
            expandableLayout=itemView.findViewById(R.id.history_order_expandable_layout);
            imgArrow=itemView.findViewById(R.id.history_order_expandable_arrow);
            cardView=itemView.findViewById(R.id.history_order_name_cv);
        }
    }
}
