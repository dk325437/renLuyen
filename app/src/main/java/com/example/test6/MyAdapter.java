package com.example.test6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private List articleList;
    LayoutInflater mInflater;

    public MyAdapter(Context context,List list){
        mInflater =LayoutInflater.from(context);
        this.articleList = list;
    }
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.country_layout, parent, false);
        ArticleViewHolder holder = new ArticleViewHolder(view, this);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Article article = (Article) articleList.get(position);
        holder.ttitle.setText(article.title);
        holder.tcontent.setText(article.content);
        holder.tviews.setText("Views: " + article.views);
        holder.imgCover.setImageResource(article.imgCover);
    }

    @Override
    public int getItemCount() { return articleList.size();
    }
}
