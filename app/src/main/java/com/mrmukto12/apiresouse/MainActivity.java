package com.mrmukto12.apiresouse;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    OurRetrofitClint ourRetrofitClint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(" https://cricket.sportmonks.com/api/v2.0/" )
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ourRetrofitClint = retrofit.create(OurRetrofitClint.class);
        Call<OurDataClass> call= ourRetrofitClint.getdata("VEk844SIQHWaisSc9CPsYlJeNBvGuQljln2C6ubg8Ees9Zg1rRiubo9FWTdY");

        call.enqueue(new Callback<OurDataClass>() {
            @Override
            public void onResponse(Call<OurDataClass> call, Response<OurDataClass> response) {
                if (response.isSuccessful()) {

                    List<OurDataClass> list = response.body().getData();

                    for(DataClass dataClass : list){

                        Log.d("id", String.valueOf(dataClass.getId()));
                        Log.d("name", String.valueOf(dataClass.getName()));
                        Log.d("resource", String.valueOf(dataClass.getResource()));
                        Log.d("updatedAt", String.valueOf(dataClass.getUpdatedAt()));
                    }
                }
                else {

                    Log.d("response", "fail");
                }
            }

            @Override
            public void onFailure(Call<OurDataClass> call, Throwable t) {
                Log.d("response", "fail");

            }
        });

    }
}