package com.example.eventsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdpator extends RecyclerView.Adapter<RecyclerAdpator.MyViewHolder> {
    Context context;
    int[] idlist;
    String[] stringlist;

    public RecyclerAdpator(Context context, int[] idlist, String[] stringlist) {
        this.context = context;
        this.idlist = idlist;
        this.stringlist = stringlist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerAdpator.MyViewHolder holder, int position) {
        holder.textView.setText(stringlist[position]);
        holder.imageView.setBackgroundResource(idlist[position]);
    }

    @Override
    public int getItemCount() {

        return idlist.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_iamgeview);
            textView = itemView.findViewById(R.id.item_textview);
        }
    }
}
