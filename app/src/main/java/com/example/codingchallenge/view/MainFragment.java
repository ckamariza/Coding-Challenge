package com.example.codingchallenge.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.codingchallenge.R;
import com.example.codingchallenge.models.Titles;
import com.example.codingchallenge.viewModels.MainViewModel;


public class MainFragment extends Fragment {

    MainViewModel mainViewModel;
    private Observer<Titles> observer;
    MainRecyclerView mainRecyclerView;
    private RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.fetchListOfShows();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
           View view = inflater.inflate(R.layout.fragment_main, container,false);
            recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);

            mainRecyclerView = new MainRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

         fetchObserver();
        return view;

    }

    private void fetchObserver() {
        if(observer != null)
            return;

        observer = new Observer<Titles>() {
            @Override
            public void onChanged(@Nullable Titles items) {
                mainRecyclerView.updateDataSet(items);
                recyclerView.setAdapter(mainRecyclerView);

            }
        };


        mainViewModel.getListOfShows().observe(this, observer);

    }

    //to handle configuration change
    public static MainFragment newInstance(){
        MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }
}
