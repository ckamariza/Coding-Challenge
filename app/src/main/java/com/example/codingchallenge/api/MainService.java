package com.example.codingchallenge.api;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.example.codingchallenge.models.Titles;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainService {

    private MutableLiveData <Titles> titles;
    private List<Titles> list;

    public MainService(){
        titles = new MutableLiveData<>();
    }
    public LiveData<Titles> fetchListOfShows(){

        RetrofitApiClient.getInstance().getApiEndPoint().getListOfTitles().enqueue(new Callback<Titles>() {
            @Override
            public void onResponse(Call<Titles> call, Response<Titles> response) {

                    titles.postValue(response.body());
        }

            @Override
            public void onFailure(Call<Titles> call, Throwable t) {
                Log.e("error",t.toString());
            }
        });
        return titles;
    }
}
