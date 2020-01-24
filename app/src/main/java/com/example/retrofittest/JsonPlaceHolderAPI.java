package com.example.retrofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JsonPlaceHolderAPI {

    @GET("opendata/assetsCase/1.1.json")
    Call<List<Post>> getPosts();
}
