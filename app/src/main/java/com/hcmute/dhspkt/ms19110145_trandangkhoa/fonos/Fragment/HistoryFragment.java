package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter.HistoryOrderAdapter;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Order;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Product;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.ArrayList;


public class HistoryFragment extends Fragment {
    private HistoryOrderAdapter historyOrderAdapter;
    private ArrayList<Order> orders;
    private RecyclerView historyRc;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View history= inflater.inflate(R.layout.history_fragment,container,false);
        historyRc=history.findViewById(R.id.history_recycler_view);
        orders =new ArrayList<>();

        context = this.getActivity().getApplication();

        ArrayList<Product> products1=new ArrayList<>();
        products1.add(new Product(1,"Cake1",50000 ,R.drawable.cake1,""));
        products1.add(new Product(2,"Cake2",40000,R.drawable.cake1,""));
        products1.add(new Product(3,"Cake3",60000,R.drawable.cake1,""));
        ArrayList<Product> products2=new ArrayList<>();
        products2.add(new Product(1,"Cake1",50000,R.drawable.cake1,""));
        products2.add(new Product(2,"Frozen Dessert1",40000,R.drawable.frozen_dessert1,""));
        products2.add(new Product(3,"Cake7",60000,R.drawable.cake1,""));
        ArrayList<Product> products3=new ArrayList<>();
        products3.add(new Product(1,"Frozen Dessert3",50000,R.drawable.frozen_dessert1,""));
        products3.add(new Product(2,"Cake2",40000,R.drawable.cake1,""));
        products3.add(new Product(3,"Dessert Soup1",60000,R.drawable.dessert_soup1,""));
        ArrayList<Product> products4=new ArrayList<>();
        products4.add(new Product(1,"Drink1",50000,R.drawable.drink1,""));
        products4.add(new Product(2,"Drink10",40000,R.drawable.drink1,""));
        products4.add(new Product(3,"Cake3",60000,R.drawable.cake1,""));
        ArrayList<Product> products5=new ArrayList<>();
        products5.add(new Product(1,"Custard10",50000,R.drawable.custard1,""));
        products5.add(new Product(2,"Cake5",40000,R.drawable.drink1,""));
        products5.add(new Product(3,"Custard1",60000,R.drawable.custard1,""));

        orders =new ArrayList<>();
        historyOrderAdapter=new HistoryOrderAdapter(orders);
        historyRc.setAdapter(historyOrderAdapter);
        historyRc.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        return history;
    }




}
