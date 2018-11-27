package demo.com.wangyu.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv4 = (ImageView) findViewById(R.id.iv_4);
//        mIv4.
        // 异常 Permission denied (missing INTERNET permission?)
        // 缺少网络权限
        Glide.with(this).load("http://c.hiphotos.baidu.com/image/h%3D300/sign=4c574dc7022442a7b10efba5e143ad95/4d086e061d950a7bd00e398007d162d9f2d3c9bf.jpg").into(mIv4);
    }
}
