package com.example.kastlandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkText = findViewById(R.id.LandmarkText);
        TextView landmarkTextExp = findViewById(R.id.LandmarkTextExp);

        Intent intent = getIntent();
        landmarkText.setText(intent.getStringExtra("name"));;
        landmarkTextExp.setText(intent.getStringExtra("exp"));

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImg());
    }
}