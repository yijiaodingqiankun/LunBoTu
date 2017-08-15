package com.jiyun.dell.lunbotu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Banner banner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Integer> images=new ArrayList<>();
        images.add(R.mipmap.ic_launcher);
        images.add(R.mipmap.ic_launcher_round);



        banner = (Banner) findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置方法全部调用完毕时最后调用,开始轮播
        banner.start();
    }
}
