package com.example.socialmedia.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmedia.R;
import com.example.socialmedia.model.Storymodel;
import com.example.socialmedia.model.dasbordModel;

import java.util.ArrayList;

public class  dashboardAdapter extends RecyclerView.Adapter< dashboardAdapter.viewHolder> {
    ArrayList<dasbordModel> list;
    Context  context ;

    public  dashboardAdapter(ArrayList<dasbordModel > list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dasboard_rv,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        dasbordModel model =list.get(position);
        holder.profile.setImageResource(model.getProfile());
        holder.psotImage.setImageResource(model.getPostImage());
        holder.name.setText(model.getName());
        holder.like.setText(model.getLike());
        holder.comment.setText(model.getComment());
        holder.share.setText(model.getShare());




    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView profile, psotImage,save;
        TextView name,about,like,comment,share;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
                profile=itemView.findViewById(R.id.profile_image);
                psotImage=itemView.findViewById(R.id.postimg);
                save=itemView.findViewById(R.id.save);
                name=itemView.findViewById(R.id.userName);
                about=itemView.findViewById(R.id.about);
                like=itemView.findViewById(R.id.like);
                comment=itemView.findViewById(R.id.comment);
                share=itemView.findViewById(R.id.share);

        }
    }
}

