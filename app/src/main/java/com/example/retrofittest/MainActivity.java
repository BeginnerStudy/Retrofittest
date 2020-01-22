package com.example.retrofittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textResult;
    JsonPlaceHolderAPI jsonPlaceHolderAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.text_result);

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://opendata.cwb.gov.tw/api/v1/rest/datastore/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

//        Call<List<Post.TimeBean>> call = jsonPlaceHolderAPI.getPosts();
//
//        call.enqueue(new Callback<List<Post.TimeBean>>() {
//            @Override
//            public void onResponse(Call<List<Post.TimeBean>> call, Response<List<Post.TimeBean>> response) {
//                List<Post.TimeBean> posts = response.body();
//
//                if (!response.isSuccessful()){
//                    textResult.setText("Code: "+ response.code());
//                Log.d("D200","Code: "+ response.code());
//                return;
//            }
//
//                for (Post.TimeBean post : posts){
//                    String content="";
//                    content += "開始: "+ post.getStartTime() + "\n";
//                    content += "結束: "+ post.getEndTime() + "\n";
//                    content += "value: "+ post.getElementValue().getValue() + "\n";
//                    content += "measures: "+ post.getElementValue().getMeasures() + "\n\n";
//
//                    textResult.append(content);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Post.TimeBean>> call, Throwable t) {
//
//                textResult.setText(t.getMessage());
//               Log.d("D100=",""+t.getMessage());
//            }
//        });



        Call<Chunli> call = jsonPlaceHolderAPI.getPosts();

        call.enqueue(new Callback<Chunli>() {
            @Override
            public void onResponse(Call<Chunli> call, Response<Chunli> response) {
                if (!response.isSuccessful()){
                    textResult.setText("Code: "+ response.code());
                    Log.d("D200","Code: "+ response.code());
                    return;
                }

                Chunli chunli = response.body();
                Log.d("D200",chunli.getRecords().getLocations().get(0).getDatasetDescription());
            }

            @Override
            public void onFailure(Call<Chunli> call, Throwable t) {

            }
        });

//        call.enqueue(new Callback<>() {
//            @Override
//            public void onResponse(Call<Post> call, Response<Post> response) {
//
//                if (!response.isSuccessful()){
//                    textResult.setText("Code: "+ response.code());
//                    Log.d("D200","Code: "+ response.code());
//                    return;
//                }
//
//                Post post = response.body();
//
//
//                String content="";
//
//                content += "type: "+ post.getElementName() + "\n";
//                content += "資料: "+ post.getDescription() + "\n\n";
////                int count = post.getTime().length;
////                for (int i=0; i<count; i++) {
////                    content += "開始: " + post.getTime()[i].getStartTime() + "\n";
////                    content += "結束: " + post.getTime()[i].getEndTime() + "\n";
////                    content += "value: " + post.getTime()[i].getElementValue().getValue() + "\n";
////                    content += "measures: " + post.getTime()[i].getElementValue().getMeasures() + "\n\n";
////
////
////                }
//                textResult.append(content);
//
////                for (Post post : posts){
////                    int i = post.getElementName().length();
////
////                    String content="";
////                    content += "開始: "+ post.getTime() + "\n";
////                    content += "結束: "+ post.getEndTime() + "\n";
////                    content += "value: "+ post.getElementValue().getValue() + "\n";
////                    content += "measures: "+ post.getElementValue().getMeasures() + "\n\n";
////
////                    textResult.append(content);
////                }
//
//            }
//
//            @Override
//            public void onFailure(Call<Post> call, Throwable t) {
//                textResult.setText(t.getMessage());
//                Log.d("D100=",""+t.getMessage());
//            }
//        });

    }
}
