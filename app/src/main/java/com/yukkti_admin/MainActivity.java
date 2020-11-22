package com.yukkti_admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView addData, addCategories, deleteData, deleteCategories;
    private Button viewAllBtn, updateDataBtn, todaysOrderBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData = findViewById(R.id.add_Data);
        addCategories = findViewById(R.id.add_Categories);
        deleteData = findViewById(R.id.delete_Data);
        deleteCategories = findViewById(R.id.delete_Categories);

        viewAllBtn = findViewById(R.id.view_all_products);
        updateDataBtn = findViewById(R.id.UpdateData);
        todaysOrderBtn = findViewById(R.id.todaysOrder);

        addData.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",1);
            startActivity(intent);
        });

        addCategories.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",2);
            startActivity(intent);
        });

        deleteData.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",3);
            startActivity(intent);
        });

        deleteCategories.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",4);
            startActivity(intent);
        });

        viewAllBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",5);
            startActivity(intent);
        });

        updateDataBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",6);
            startActivity(intent);
        });
        todaysOrderBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityForFragment.class);
            intent.putExtra("clickedValue",7);
            startActivity(intent);
        });
    }
}