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
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.history_book_item,parent,false);
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
        private final TextView nameHistory, timeHistory, btnReadHistory;
        private final ImageView imgHistory;
        public HistoryOrderViewHolder(@NonNull View itemView) {
            super(itemView);
            nameHistory=itemView.findViewById(R.id.history_book_name);
            timeHistory=itemView.findViewById(R.id.history_book_time);
            btnReadHistory=itemView.findViewById(R.id.btn_history_read_cont);
            imgHistory=itemView.findViewById(R.id.history_book_img);
        }
    }
}
