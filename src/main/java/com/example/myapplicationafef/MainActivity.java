package com.example.myapplicationafef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirstPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goToThirdPage(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void goToSecondPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        ImageView imageView = findViewById(R.id.imageView);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }



}
