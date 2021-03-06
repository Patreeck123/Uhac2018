package com.benjamin.dogdroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> imageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> imageNames, ArrayList<String> mImages, Context context) {
        this.imageNames = imageNames;
        this.mImages = mImages;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(context)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.imageView);

        holder.pet_name.setText(mImages.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: " + mImages.get(position));
                Toast.makeText(context, mImages.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        TextView pet_name;
        RelativeLayout parentLayout;
        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            pet_name = itemView.findViewById(R.id.pet_name);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}
