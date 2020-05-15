package com.example.pendaftaranmahasiswa.services;

import com.example.pendaftaranmahasiswa.model.dataMahasiswa;
import com.example.pendaftaranmahasiswa.model.resultResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("read.php")
    Call<dataMahasiswa> getdataMahasiswa();

    @FormUrlEncoded
    @POST("insert.php")
    Call<resultResponse> daftar(@Field("nim") String nim,
                                @Field("nama") String nama,
                                @Field("fakultas") String fakultas,
                                @Field("jurusan") String jurusan,
                                @Field("alamat") String alamat);

    @FormUrlEncoded
    @POST("update.php")
    Call<resultResponse> update(@Field("id") String id,
                                @Field("nim") String nim,
                                @Field("nama") String nama,
                                @Field("fakultas") String fakultas,
                                @Field("jurusan") String jurusan,
                                @Field("alamat") String alamat);

    @FormUrlEncoded
    @POST("delete.php")
    Call<resultResponse> delete(@Field("id") String id);

}
