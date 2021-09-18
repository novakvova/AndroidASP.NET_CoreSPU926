package com.example.androidstore.network;

import com.example.androidstore.dto.ProductDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductApi {
    @GET("/api/products/all")
    public Call<List<ProductDTO>> all();
}
