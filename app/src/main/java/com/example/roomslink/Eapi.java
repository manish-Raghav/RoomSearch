package com.example.roomslink;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Eapi {

    @FormUrlEncoded
    @POST("ROOSignup.php")
    Call<NmEml> adddata(@Field("Email") String email, @Field("name") String name);


}
