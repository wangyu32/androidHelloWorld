package demo.com.wangyu.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

import demo.com.wangyu.helloworld.util.Util;

public class TestViewActivity extends AppCompatActivity {

    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view);
        this.textView4 = (TextView) findViewById(R.id.tv_4);
        textView4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        textView4.getPaint().setAntiAlias(true);//去除锯齿

        this.textView5 = (TextView) findViewById(R.id.tv_5);
        textView5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//中划线


        this.textView6 = (TextView) findViewById(R.id.tv_6);
//        textView6.setText("宇哥测试呢");
        textView6.setText(Html.fromHtml("<u>宇哥测试呢</u>"));

        this.textView8 = findViewById(R.id.tv8);
        textView8.setText(Util.getSerialNumber(getBaseContext()));


    }
}
