package com.example.retrofittest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
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

    TextView text_title_page, text_page;
    JsonPlaceHolderAPI jsonPlaceHolderAPI;

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;

    EditText search_users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),R.string.appbar_scrolling_view_behavior);

        text_page = findViewById(R.id.text_page);
        text_title_page = findViewById(R.id.text_title_page);
        viewPager = findViewById(R.id.view_pager);
        search_users = findViewById(R.id.search_users);
        search_users.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (TextUtils.isEmpty(search_users.getText())){
                    viewPager.setCurrentItem(0);
                }else {
                    viewPager.setCurrentItem((Integer.parseInt(s.toString()))-1);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.boch.gov.tw/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

        Call<List<Post>> call = jsonPlaceHolderAPI.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (!response.isSuccessful()){

                    Log.d("D200","Code: "+ response.code());
                    return;
                }

                List<Post> posts = response.body();
                int i = 0;
                assert posts != null;
                for (Post post : posts){
                    i++;
                    text_title_page.setText("  共 "+i+" 頁");

                    String content="";
                    content += "名稱: "+ post.getCaseName() + "\n\n";
                    content += "類別: "+ post.getAssetsClassifyName() + "\n\n";
                    content += "故事: "+ post.getPastHistory() + "\n\n";
                    content += "特色: "+ post.getRegisterReason() + "\n\n";
                    Log.d("D100=",content);

                    ContentFragment contentFragment = new ContentFragment();
                    contentFragment.getText_result(content);
                    viewPagerAdapter.addLayouts(contentFragment);

                }
                viewPager.setAdapter(viewPagerAdapter);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

               Log.d("E100=",""+t.getMessage());
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                int i = viewPager.getCurrentItem() +1 ;
                text_page.setText("第 "+i+" 頁  /");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}
