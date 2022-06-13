package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Product;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.ArrayList;


public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.CartItemViewHolder> {
    private ArrayList<Product> products;
    private Context context;


    public CartItemAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public CartItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,parent,false);
        return new CartItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartItemViewHolder holder, int position) {
        Product product=products.get(position);
        if(product==null)
        {
            return;
        }
        holder.cartItemImage.setImageResource(product.getImg());
        holder.cartItemName.setText(product.getName());
        holder.cartItemPrice.setText(String.valueOf(product.getPrice()));
    }

    @Override
    public int getItemCount() {
        if(products!=null)
        {
            return products.size();
        }
        return 0;
    }

    public class CartItemViewHolder extends RecyclerView.ViewHolder{
        private TextView cartItemName,cartItemPrice;
        private ImageView cartItemImage;
        private ImageButton btn_delete;
        public CartItemViewHolder(@NonNull View itemView) {
            super(itemView);
            cartItemImage=itemView.findViewById(R.id.item_cart_img);
            cartItemName=itemView.findViewById(R.id.item_cart_name);
            cartItemPrice=itemView.findViewById(R.id.item_cart_price);
            btn_delete = itemView.findViewById(R.id.btn_delete);

        }
    }
}
