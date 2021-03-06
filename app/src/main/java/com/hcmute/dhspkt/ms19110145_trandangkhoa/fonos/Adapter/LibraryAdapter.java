package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Book;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Product;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.ArrayList;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewHolder> {
    private BottomSheetDialog bottomSheetDialog;
    private Context context;
    private ArrayList<Book> mbooks;
    public LibraryAdapter(Context context ,ArrayList<Book> products) {
        this.context = context;
        this.mbooks = products;
    }

    @NonNull
    @Override
    public LibraryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.library_book,parent,false);
        return new LibraryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibraryViewHolder holder, int position) {
        Book book = mbooks.get(position);
        if (book == null){
            return;
            // Get resource
        }


    }



    @Override
    public int getItemCount() {
        if(mbooks !=null){
           return mbooks.size();
        }
        return 0;
    }

    public class LibraryViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout background;
        private ImageView imgProduct;
        private TextView nameProduct,priceProduct;

        public LibraryViewHolder(@NonNull View itemView) {
            super(itemView);
            background=itemView.findViewById(R.id.library_book_layout);
            nameProduct=itemView.findViewById(R.id.library_book_name);
            priceProduct=itemView.findViewById(R.id.btn_library_read_now);
        }
    }


}
