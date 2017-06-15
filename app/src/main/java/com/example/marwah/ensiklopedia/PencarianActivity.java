package com.example.marwah.ensiklopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PencarianActivity extends AppCompatActivity implements View.OnClickListener{

    private List<String> listJudul = new ArrayList<>();
    private RecyclerView recyclerView;
    private PencarianAdapter pencarianAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        View buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_cari);

        pencarianAdapter = new PencarianAdapter(listJudul);

        RecyclerView.LayoutManager pencarianLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(pencarianLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pencarianAdapter);

        listJudul.add("Batu");
        listJudul.add("Bara");
        listJudul.add("Batu Bara");
        listJudul.add("Bara Batu");
        listJudul.add("Batu Batuan");
        listJudul.add("Batu Akik");
        listJudul.add("Batu Jam");
        listJudul.add("Batu Berdahak");
        listJudul.add("Batu Cinta Kamu");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_back:
                finish();
                break;
        }
    }
}
