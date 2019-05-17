package com.example.codingchallenge.api;

import com.example.codingchallenge.models.Titles;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRetrofitApiCalls {

    @GET("episodes?limit=3")
    Call<Titles> getListOfTitles();
}
