package demo.com.wangyu.helloworld;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import demo.com.wangyu.helloworld.util.QRCodeUtil;

public class QRcodeActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        imageView = findViewById(R.id.iv_qr_1);
        int width = 300;
        Bitmap bitmap = QRCodeUtil.createQRCodeBitmap("http://www.baidu.com", width, width);
        imageView.setImageBitmap(bitmap);
    }
}
