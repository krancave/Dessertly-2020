package com.example.dessertrecipeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Recipe> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipe> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_recipe, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.text_recipe_title.setText(mData.get(position).getTitle());
        holder.img_recipe_thumbnail.setImageResource(mData.get(position).getThumbnail());

        //set click listener

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(mContext, mainFragment.class);

                //passses data to fragment activity
                intent.putExtra("RecipeTitle", mData.get(position).getTitle());
                intent.putExtra("Time", mData.get(position).getTime());
                intent.putExtra("Servings", mData.get(position).getServings());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Ingredients", mData.get(position).getIngredients());
                intent.putExtra("Method", mData.get(position).getMethod());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());

                //start activity
                mContext.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text_recipe_title;
        ImageView img_recipe_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text_recipe_title = (TextView) itemView.findViewById(R.id.recipe_title_id);
            img_recipe_thumbnail = (ImageView) itemView.findViewById(R.id.recipe_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardView_id);
        }
    }
}
