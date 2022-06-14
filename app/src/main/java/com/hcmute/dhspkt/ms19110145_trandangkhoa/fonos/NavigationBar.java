package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment.LibraryFragment;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment.FavoriteFragment;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment.HistoryFragment;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment.HomeFragment;
import com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Fragment.MyProfileFragment;


public class NavigationBar extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //navigation drawer
    private DrawerLayout drawerLayout;
    private static final int HOME_FRAGMENT=0;
    private static final int ORDER_LIST_FRAGMENT=1;
    private static final int COUPON_LIST_FRAGMENT=2;
    private static final int CART_FRAGMENT=3;
    private static final int MY_PROFILE_FRAGMENT=4;
    private int currentFragment=HOME_FRAGMENT;
    private Toolbar toolbar;


    TextView user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_bar);



        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_open);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        //View view = View.inflate(R.layout.nav_header)

//        user_name = Nav_header_view.findViewById(R.id.nav_header_user_name);
//        User user = (User) getIntent().getSerializableExtra("user");
//        Log.e("content",user_name.getText().toString());
//        user_name.setText(user.getName().toString());
//        Log.e("content",user_name.getText().toString());

        NavigationView navigationView=findViewById(R.id.navigation_view);

        LinearLayout nav_header = (LinearLayout) navigationView.inflateHeaderView(R.layout.nav_header);
       // user_name = (TextView) nav_header.findViewById(R.id.nav_header_user_name);
        //User user = (User) getIntent().getSerializableExtra("user");
      // ((Cart) this.getApplication()).setUser(user);
       // user_name.setText(user.getName().toString());



        navigationView.setNavigationItemSelectedListener(this);

        replaceFragment(new HomeFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setChecked(true);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.nav_home)
        {
            if(currentFragment!=HOME_FRAGMENT)
            {
                replaceFragment(new HomeFragment());
                currentFragment=HOME_FRAGMENT;
            }
        }
        else if(id==R.id.nav_history)
        {
            if(currentFragment!=ORDER_LIST_FRAGMENT)
            {
                replaceFragment(new HistoryFragment());
                currentFragment=ORDER_LIST_FRAGMENT;
            }
        }
        else if(id==R.id.nav_coupon_list)
        {
            if(currentFragment!=COUPON_LIST_FRAGMENT)
            {
                replaceFragment(new FavoriteFragment());
                currentFragment=COUPON_LIST_FRAGMENT;
            }
        }
        else if(id==R.id.nav_shopping_cart)
        {
            if(currentFragment!=CART_FRAGMENT)
            {
                replaceFragment(new LibraryFragment());
                currentFragment=CART_FRAGMENT;
            }
        }
        else if(id==R.id.nav_my_profile)
        {
            if(currentFragment!=MY_PROFILE_FRAGMENT)
            {
                replaceFragment(new MyProfileFragment());
                currentFragment=MY_PROFILE_FRAGMENT;
            }
        }
        else if(id==R.id.nav_logout)
        {

        }
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame,fragment);
        transaction.commit();
    }


}