package com.example.recyclerview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {
    String data[];

    public myAdapter(String[] data) {    // constructor
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            // add references of the view from xml file
            img = (ImageView) itemView.findViewById(R.id.img1);
            tv = (TextView) itemView.findViewById(R.id.t1);
        }
    }

}

/*
*    1) create class and extend  RecyclerView.Adapter:
*           class myAdapter extends RecyclerView.Adapter
*   2) create your view holder ( MyViewHolder ) and initializes all the views with your singleRow layout views id
*           MyViewHolder extends RecyclerView.ViewHolder
*
*    3) add MyViewHolder to RecyclerView.Adapter<myAdapter.MyViewHolder>
*       class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder>

*   4) now implement the other methods
*
*
* */
