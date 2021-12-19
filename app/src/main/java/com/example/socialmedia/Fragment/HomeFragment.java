package com.example.socialmedia.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.socialmedia.Adapter.StoryAdapter;
import com.example.socialmedia.Adapter.dashboardAdapter;
import com.example.socialmedia.R;
import com.example.socialmedia.model.Storymodel;
import com.example.socialmedia.model.dasbordModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

   RecyclerView storyRv, dashboardRV;
   ArrayList <Storymodel> list;
    ArrayList <dasbordModel> dashboardList;
    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  =inflater.inflate(R.layout.fragment_home, container, false);
       storyRv= view.findViewById(R.id.storyRV);
        list= new ArrayList<>();
        list.add(new Storymodel(R.drawable.nature22, R.drawable.ic_video_camera,R.drawable.deaf, "roua"));
        list.add(new Storymodel(R.drawable.nature1, R.drawable.live,R.drawable.deaf, "salsabil"));
        list.add(new Storymodel(R.drawable.profil11, R.drawable.ic_video_camera,R.drawable.deaf, "rania"));
        list.add(new Storymodel(R.drawable.profil22,R.drawable.ic_video_camera,R.drawable.deaf, "sami"));
        StoryAdapter adapter  =new StoryAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL , false);
        storyRv.setLayoutManager(linearLayoutManager);
        storyRv.setNestedScrollingEnabled(false);
        storyRv.setAdapter(adapter);

        dashboardRV=view.findViewById(R.id.dashboardRv);
        dashboardList=new ArrayList<>();
      dashboardList.add(new dasbordModel(R.drawable.roua, R.drawable.nature22,R.drawable.saved , "Roua ", "Travler",  "154","54","5"));

        dashboardList.add(new dasbordModel(R.drawable.bella,R.drawable.image2,R.drawable.saved , "Bella ", "",  "100","100","5"));
        dashboardList.add(new dasbordModel(R.drawable.roua, R.drawable.nature22,R.drawable.saved , "Roua ", "Travler",  "154","54","5"));
        dashboardList.add(new dasbordModel(R.drawable.bella,R.drawable.blackimg1,R.drawable.saved , "Salsabil ", "",  "100","100","5"));
        dashboardList.add(new dasbordModel(R.drawable.profile,R.drawable.deaf,R.drawable.saved , "roua ", "Travler",  "10","54","5"));
        dashboardList.add(new dasbordModel(R.drawable.roua,R.drawable.madame1,R.drawable.saved , "roua ", "Travler",  "50","54","5"));
        dashboardAdapter dashboardAdapter = new dashboardAdapter(dashboardList,getContext());
        LinearLayoutManager LayoutManager = new LinearLayoutManager(getContext());
        dashboardRV.setLayoutManager(LayoutManager);
        dashboardRV.setNestedScrollingEnabled(false);
        dashboardRV.setAdapter(dashboardAdapter);
     return view;
    }
}