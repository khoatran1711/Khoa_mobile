package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter.FavoriteBookADapter;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter.LibraryAdapter;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Book;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Coupons;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Product;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.ArrayList;
import java.util.List;


public class LibraryFragment extends Fragment {
    ArrayList<Product> products;
    RecyclerView cartItemRc;
    TextView total_price;
    Button btn_confirm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.library,container,false);
        RecyclerView lvlibraey_A;
        LibraryAdapter adapter;

        ArrayList<Book> list= new ArrayList<>();
        list.add(new Book(1));
        list.add(new Book(1));
        list.add(new Book(1));
        list.add(new Book(1));
        list.add(new Book(1));
        list.add(new Book(1));
        list.add(new Book(1));

        RecyclerView lvlibraey_C;
        LibraryAdapter adapter1;

        lvlibraey_C = (RecyclerView) view.findViewById(R.id.C_categoty_listview);
        List<Coupons> list1 = new ArrayList<>();
        adapter1 = new LibraryAdapter(this.getActivity(),list);

        lvlibraey_C.setAdapter(adapter1);
        lvlibraey_C.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        adapter1.notifyDataSetChanged();

        RecyclerView lvlibrary_A;
        LibraryAdapter adapter2;
        lvlibraey_A = (RecyclerView) view.findViewById(R.id.A_categoty_listview);
        adapter1 = new LibraryAdapter(this.getActivity(),list);

        lvlibraey_A.setAdapter(adapter1);
        lvlibraey_A.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        adapter1.notifyDataSetChanged();



        return view;


    }

}
