package com.example.socialmedia.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmedia.R;
import com.example.socialmedia.model.Storymodel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.viewHolder> {
   ArrayList<Storymodel> list;
   Context  context ;

    public StoryAdapter(ArrayList<Storymodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_rv_design,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Storymodel model =list.get(position);
        holder.storyImg.setImageResource(model.getStory());
        holder.profile.setImageResource(model.getProfile());
        holder.storyType.setImageResource(model.getStorytype());
        holder.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView storyImg , profile, storyType;
        TextView name;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            storyImg = itemView.findViewById(R.id.story);
            profile= itemView.findViewById(R.id.profile_image);
            name= itemView.findViewById(R.id.name);
            storyType= itemView.findViewById(R.id.storytype);
        }
    }
}
