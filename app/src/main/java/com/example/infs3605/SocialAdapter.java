package com.example.infs3605;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.infs3605.Entities.Social;

import java.util.ArrayList;

public class SocialAdapter extends RecyclerView.Adapter<SocialAdapter.ViewHolder>{

    private ArrayList<Social> mSocialList;
    private Social mSocial;

    private Context mContext;

    public SocialAdapter(ArrayList<Social> mSocialList) {
        this.mSocialList = mSocialList;
    }



    @NonNull
    @Override
    public SocialAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.social_list_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SocialAdapter.ViewHolder holder, int position) {

        mSocial = mSocialList.get(position);

        holder.ivSocialImage.setImageResource(mSocial.getSocialImage());
        holder.itemView.setTag(mSocial.getSocialId());


    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivSocialImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivSocialImage = itemView.findViewById(R.id.ivSocialImage);
        }

    }


    @Override
    public int getItemCount() {
        return mSocialList.size();
    }
}
