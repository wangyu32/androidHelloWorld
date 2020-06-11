package demo.com.wangyu.helloworld.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import demo.com.wangyu.helloworld.R;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter() {}

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        //列表长度
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //列表没一个行内容使用getView
        ViewHolder holder = null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_list);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvTitle.setText("Hello...");
        holder.tvTime.setText("2088-08-08");
        holder.tvContent.setText("这是内容");
//        Glide.with(mContext).load("http://c.hiphotos.baidu.com/image/h%3D300/sign=4c574dc7022442a7b10efba5e143ad95/4d086e061d950a7bd00e398007d162d9f2d3c9bf.jpg").into(holder.imageView);
        Glide.with(mContext).load("https://www.baidu.com/img/xinshouye_ef8bb3d1d46a8b05760b91e24624b839.png").into(holder.imageView);
        return convertView;
    }
}
