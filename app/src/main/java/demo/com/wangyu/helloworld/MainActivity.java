package demo.com.wangyu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import demo.com.wangyu.helloworld.gridview.GridViewActivity;
import demo.com.wangyu.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnQRcode;
    private Button mBtnScanQRcode;
    private Button mBtnListView;
    private Button mBtnGirdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnButton = (Button)findViewById(R.id.btn_button);
        mBtnEditText = (Button)findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button)findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button)findViewById(R.id.btn_checkBox);
        mBtnImageView = (Button)findViewById(R.id.btn_imageview);
        mBtnQRcode = (Button)findViewById(R.id.btn_qrcode0);
        mBtnScanQRcode = (Button)findViewById(R.id.btn_scanqrcode);
        mBtnListView = (Button)findViewById(R.id.btn_listview);
        mBtnGirdView = (Button)findViewById(R.id.btn_gridview);
        setListeners();
    }

    public void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnQRcode.setOnClickListener(onClick);
        mBtnScanQRcode.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGirdView.setOnClickListener(onClick);
    }

    public class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            //跳转到
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TestViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkBox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_qrcode0:
                    intent = new Intent(MainActivity.this, QRcodeActivity.class);
                    break;
                case R.id.btn_scanqrcode:
                    intent = new Intent(MainActivity.this, ScanQRcodeActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}
