package demo.com.wangyu.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import demo.com.wangyu.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
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
        public TextView tvTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //列表没一个行内容使用getView
        MyGridViewAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_grid_item, null);
            holder = new MyGridViewAdapter.ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else {
            holder = (MyGridViewAdapter.ViewHolder) convertView.getTag();
        }

        holder.tvTitle.setText("花");
//        Glide.with(mContext).load("http://c.hiphotos.baidu.com/image/h%3D300/sign=4c574dc7022442a7b10efba5e143ad95/4d086e061d950a7bd00e398007d162d9f2d3c9bf.jpg").into(holder.imageView);
//        Glide.with(mContext).load("https://www.baidu.com/img/xinshouye_ef8bb3d1d46a8b05760b91e24624b839.png").into(holder.imageView);
        Glide.with(mContext).load("http://img2.imgtn.bdimg.com/it/u=1975416308,1193833242&fm=200&gp=0.jpghttp://img2.imgtn.bdimg.com/it/u=1975416308,1193833242&fm=200&gp=0.jpg").into(holder.imageView);
        return convertView;
    }
}
