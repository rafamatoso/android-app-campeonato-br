package com.rm2xfbv.tabelabrasileirosa.model;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;

public interface iMyJsonAPI {

    @GET("bins/op419")
    Call<List<Ranking>> getRankings();
}
