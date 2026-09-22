package com.example.test6;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imgCover;
    TextView ttitle;
    TextView tcontent;
    TextView tviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imgCover = findViewById(R.id.imgCover);
        ttitle = findViewById(R.id.ttitle);
        tcontent = findViewById(R.id.tcontent);
        tviews = findViewById(R.id.tviews);

        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");
        int views = getIntent().getIntExtra("views", 0);
        int img = getIntent().getIntExtra("imgCover", 0);

        ttitle.setText(title);
        tcontent.setText(content);
        tviews.setText("Views: " + views);
        imgCover.setImageResource(img);
    }
}