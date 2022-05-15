package com.gamest.stackview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

public class ImageAdapter extends BaseAdapter {
    Integer[] items = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    Context context;

    public ImageAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        }

        if (view == null)
            Toast.makeText(context,"Still Null",Toast.LENGTH_LONG).show();

        return view;
    }
}
