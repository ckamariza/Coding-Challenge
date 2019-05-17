package com.example.codingchallenge.viewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.codingchallenge.api.MainService;
import com.example.codingchallenge.models.Titles;

public class MainViewModel extends AndroidViewModel {

     MainService mainService;
     private LiveData<Titles> showsList;

     public MainViewModel(@NonNull Application application) {
        super(application);
        mainService = new MainService();
    }

    public void fetchListOfShows(){
        showsList = mainService.fetchListOfShows();
    }

    public LiveData<Titles> getListOfShows(){
        return showsList;
    }
}
