package com.mrmukto12.apiresouse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OurRetrofitClint {

      @GET("continents")
    Call<OurDataClass>getdata(@Query("api token") String token);




}
