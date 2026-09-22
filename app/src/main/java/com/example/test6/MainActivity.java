package com.example.test6;

import android.os.Bundle;
import android.view.View;


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
                "Khám phá những món ăn hấp dẫn",
                "Ẩm thực là một phần thú vị trong mỗi chuyến đi và trong cuộc sống hằng ngày. \n" +
                        "Từ pizza, mì Ý đến các món ăn được trình bày đẹp mắt, mỗi món ăn đều mang đến \n" +
                        "một trải nghiệm riêng về hương vị và cách thưởng thức.\n" +
                        "\n" +
                        "Bài viết giới thiệu một số món ăn phổ biến và hấp dẫn, phù hợp cho những người \n" +
                        "yêu thích khám phá ẩm thực.",
                R.drawable.mon_an,
                0
        ));

        articleList.add(new Article(
                "Khám phá không gian Đại học Kinh tế Thành phố Hồ Chí Minh",
                "Đại học Kinh tế Thành phố Hồ Chí Minh là một trong những địa điểm quen thuộc \n" +
                        "đối với sinh viên và những người quan tâm đến môi trường giáo dục. Không gian \n" +
                        "trường được thiết kế hiện đại, kết hợp giữa các công trình và khu vực cây xanh.\n" +
                        "\n" +
                        "Bài viết giới thiệu hình ảnh và không gian của trường, qua đó mang đến một góc \n" +
                        "nhìn tổng quan về môi trường học tập.",
                R.drawable.ueh,
                0
        ));

        articleList.add(new Article(
                "Vẻ đẹp của Vịnh Hạ Long",
                "Vịnh Hạ Long nổi bật với hệ thống đảo đá và mặt nước rộng lớn, tạo nên một \n" +
                        "khung cảnh thiên nhiên đặc trưng. Đây là một điểm đến được nhiều người quan tâm \n" +
                        "khi tìm kiếm những địa danh có cảnh quan đẹp tại Việt Nam.\n" +
                        "\n" +
                        "Bài viết giới thiệu vẻ đẹp của Vịnh Hạ Long và những nét đặc trưng tạo nên sức \n" +
                        "hấp dẫn của địa danh này.",
                R.drawable.ha_long,
                0
        ));

        recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(this, articleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }
}