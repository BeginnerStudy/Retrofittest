package com.example.retrofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JsonPlaceHolderAPI {
//    @Headers(
//            {
//                    "Content-Type:application/json",
//                    "Authorization:CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96"
//            }
//    )

    @GET("F-D0047-005?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&format=JSON&locationName=%E4%B8%AD%E5%A3%A2%E5%8D%80")
    Call<Chunli> getPosts();
}
