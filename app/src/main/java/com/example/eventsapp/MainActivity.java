package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
public int [] listimageid = {R.mipmap.goldentemple,R.mipmap.keral,R.mipmap.pratapfort,R.mipmap.rajasstan,
        R.mipmap.temple,R.mipmap.varanasi,R.mipmap.tajmahal,R.mipmap.gujrat};
public int [] goalistimageid = {R.mipmap.goa2,R.mipmap.goa3,R.mipmap.goa4,R.mipmap.goa5,
        R.mipmap.goa6,R.mipmap.varanasi,R.mipmap.tajmahal,R.mipmap.gujrat};
public String[] namelist1= {"Golden Temple","Kerala","Pratap Fort","Rajasthan","Temple","Varanasi","Taj Mahal","Gujarat"};
public String[] namelist2= {"Goa","Beach","Kalangut","Hotel","Market","Varanasi","Taj Mahal","Gujarat"};
Model model;
RecyclerAdpator recyclerAdpator;
RecyclerAdpator recyclerAdpator1;
RecyclerView recyclerView1,recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        recyclerView1 = findViewById(R.id.events_recyclerview);
        recyclerView2 = findViewById(R.id.categoriy_recyclerview);
        getSupportActionBar().hide();
setRecyclerViewAdpator1();
setRecyclerViewAdpator2();

    }

    public void setRecyclerViewAdpator1()
    {
        recyclerAdpator = new RecyclerAdpator(this,listimageid,namelist1);
        recyclerView1.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false));
        recyclerView1.setAdapter(recyclerAdpator);
    }
    public void setRecyclerViewAdpator2()
    {
        recyclerAdpator1= new RecyclerAdpator(this,goalistimageid,namelist2);
        recyclerView2.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false));
        recyclerView2.setAdapter(recyclerAdpator1);
    }
}