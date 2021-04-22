package com.example.recycleview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView tvDetail, tvName, tvKarakter;
    private ImageView ivPhoto;
    String detail, name, karakter;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.ivFoto);
        tvName = findViewById(R.id.tvNama);
        tvKarakter = findViewById(R.id.tvKarakter);
        tvDetail = findViewById(R.id.tvDetail);

        name = getIntent().getStringExtra("Name");
        karakter = getIntent().getStringExtra("Karakter");
        detail = getIntent().getStringExtra("Detail");
        image = getIntent().getIntExtra("Image", 0);
        ivPhoto.setImageResource(image);
        tvKarakter.setText(karakter);
        tvName.setText(name);
        tvDetail.setText(detail);
    }
}