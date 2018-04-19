package com.example.marmm.recipe.Utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    public static final String BASE_URL = "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/";

    private static Retrofit retrofit = null;

        public static Retrofit getClient() {

            Gson gson = new GsonBuilder().create();
            OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();

            if (retrofit==null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .callFactory(httpClientBuilder.build())
                        .build();
            }
            return retrofit;
        }
    }


