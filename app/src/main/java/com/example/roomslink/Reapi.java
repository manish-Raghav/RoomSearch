package com.example.roomslink;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Reapi {
    private static  final String Base_Url ="";
    private static Reapi object;
    private Retrofit retrofit;

   private Reapi()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    public static  synchronized Reapi getInstance()
    {
        if (object ==null)
        {
          object =new Reapi();
        }
        return object;
    }

    public ApiInsert getdata()
    {
        return retrofit.create(ApiInsert.class);
    }


}
