package com.example.codingchallenge.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiClient {
    private static RetrofitApiClient instance = null;
    private static IRetrofitApiCalls apiPoint;


    private RetrofitApiClient(){

       /* OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient client = builder.build();*/

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spreaker.com/v2/users/8114541/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiPoint  = retrofit.create(IRetrofitApiCalls.class);
    }

    static RetrofitApiClient getInstance(){
        if(instance == null){
            instance = new RetrofitApiClient();
        }
        return instance;
    }

    IRetrofitApiCalls getApiEndPoint(){
        return apiPoint;
    }
}
