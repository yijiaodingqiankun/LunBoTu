package com.jiyun.dell.lunbotu;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by DELL zhanghuirong on 2017/8/15.
 */

public class GlideImageLoader extends ImageLoader {
    @Override//显示图片的方法
    public void displayImage(Context context, Object path, ImageView imageView) {

        Glide.with(context).load(path).into(imageView);
    }
}
