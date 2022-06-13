package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter.FavoriteBookADapter;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Adapter.My_coupons_Adapter;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model.Coupons;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.R;

import java.util.ArrayList;
import java.util.List;


public class FavoriteFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.favorite_list_fragment,container,false);
        ListView lvfavorite;
        FavoriteBookADapter adapter;

        lvfavorite = (ListView) view.findViewById(R.id.lv_fragment_favorite);
        List<Coupons> list = new ArrayList<>();
        adapter = new FavoriteBookADapter(this.getActivity(), R.layout.favorite_book_item);
        lvfavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;

    }


}
