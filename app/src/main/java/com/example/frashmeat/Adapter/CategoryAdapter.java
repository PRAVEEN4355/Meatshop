package com.example.frashmeat.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.Glide;
import com.example.frashmeat.Domain.CategoryDomain;
import com.example.frashmeat.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

        ArrayList<CategoryDomain> categoryDomains;

    public CategoryAdapter(ArrayList<CategoryDomain> categoryDomains) {
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categorytext.setText(categoryDomains.get(position).getPic());
        String picurl="";
        switch (position){
            case 0:{
                picurl="chleg1";
                break;
            }
            case 1:{
                picurl="mumeat1";
                break;
            }
            case 2:{
                picurl="fish1";
                break;
            }
            case 3:{
                picurl="prawn";
                break;
            }
        }
        int drawableRes= holder.itemView.getContext().getResources().getIdentifier
                (picurl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableRes).into(holder.categoryimg);

    }

    @Override
    public int getItemCount() {return categoryDomains.size();}
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView categorytext;
        ImageView categoryimg;
        ConstraintLayout categorymainlayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categorytext = itemView.findViewById(R.id.category_text);
            categoryimg = itemView.findViewById(R.id.category_img);
            categorymainlayout = itemView.findViewById(R.id.category_mainlayout);
        }
    }
}