package com.example.roomslink;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInsert {
    @FormUrlEncoded
    @POST()
    Call<Insertdata> adddata(@Field("email") String email ,@Field("phone") String Phone ,@Field("adress") String Adress ,@Field("rent") int Rent , @Field("talentcount") int Count
         ,@Field("des") String Des ,)
}
