package com.example.androidstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidstore.dto.ProductDTO;
import com.example.androidstore.network.services.ProductService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView txtinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtinfo=findViewById(R.id.txtinfo);
        ProductService.getInstance()
                .getProductsApi()
                .all()
                .enqueue(new Callback<List<ProductDTO>>() {
                    @Override
                    public void onResponse(Call<List<ProductDTO>> call, Response<List<ProductDTO>> response) {
                        List<ProductDTO> list = response.body();
                        String str="";
                        for (ProductDTO item : list) {
                            str+=item.getName()+"\n";
                        }
                        txtinfo.setText(str);
                    }

                    @Override
                    public void onFailure(Call<List<ProductDTO>> call, Throwable t) {

                    }
                });


    }
}