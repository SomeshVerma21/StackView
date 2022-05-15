package com.gamest.stackview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.StackView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StackView stackView = findViewById(R.id.StackView);

        stackView.cancelDragAndDrop();
        ImageAdapter adapter = new ImageAdapter(this);

        stackView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}