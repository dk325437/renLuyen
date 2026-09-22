package com.example.test6;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private MyAdapter madapter;
    public TextView ttitle;
    public TextView tcontent;
    public TextView tviews;
    public ImageView imgCover;
    public ArticleViewHolder(View item, MyAdapter adapter) {
        super(item);
        this.madapter = adapter;
        this.ttitle = item.findViewById(R.id.ttitle);
        this.tcontent = item.findViewById(R.id.tcontent);
        this.tviews = item.findViewById(R.id.tviews);
        this.imgCover = item.findViewById(R.id.imgCover);
        item.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg = ttitle.getText() + " | " + tviews.getText();
        Toast.makeText(v.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
