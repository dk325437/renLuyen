package com.example.test6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btLoad;
    List articleList = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        articleList.add(new Article(
                "Bài báo 1",
                "Nội dung bài báo 1",
                R.drawable.ic_launcher_foreground,
                1
        ));

        articleList.add(new Article(
                "Bài báo 2",
                "Nội dung bài báo 2",
                R.drawable.ic_launcher_foreground,
                2
        ));

        articleList.add(new Article(
                "Bài báo 3",
                "Nội dung bài báo 3",
                R.drawable.ic_launcher_foreground,
                3
        ));

        recyclerView = findViewById(R.id.recyclerView);
        btLoad = findViewById(R.id.btLoad);
      btLoad.setOnClickListener(v -> {
              MyAdapter myAdapter = new MyAdapter(v.getContext(),articleList);
              recyclerView.setLayoutManager(new LinearLayoutManager(this));
              recyclerView.setAdapter(myAdapter);
      }
      );


    }
}