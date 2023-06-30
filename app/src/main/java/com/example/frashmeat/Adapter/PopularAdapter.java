package com.example.frashmeat.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.frashmeat.Domain.MeatDomain;
import com.example.frashmeat.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

        ArrayList<MeatDomain> PopularDomains;

    public PopularAdapter(ArrayList<MeatDomain> PopularDomains) {
        this.PopularDomains = PopularDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Title.setText(PopularDomains.get(position).getTitle());
        holder.price.setText(String.valueOf(PopularDomains.get(position).getPrice()));

        int drawableRes= holder.itemView.getContext().getResources().getIdentifier
                (PopularDomains.get(position).getImage(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableRes).into(holder.Image);

    }

    @Override
    public int getItemCount() {return PopularDomains.size();}
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Title,price;
        ImageView Image;
        ImageView addbtn_popular;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.popularTitle_item);
            price = itemView.findViewById(R.id.popularprice_item2);
            Image = itemView.findViewById(R.id.popular_item1);
            addbtn_popular = itemView.findViewById(R.id.addbtn_popular);
        }

    }
}