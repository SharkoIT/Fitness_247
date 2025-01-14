package com.example.fitness247.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fitness247.Adapter.Main_Lst_Adapter;
import com.example.fitness247.Domain.Main_Lst_Domain;

import java.util.ArrayList;

import com.example.fitness247.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter_exercise;
    private RecyclerView recycleView_main_list, recyclerView_ex_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_main_list();
    }

    private void recyclerView_main_list() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycleView_main_list = findViewById(R.id.Main_list);
        recycleView_main_list.setLayoutManager(linearLayoutManager);

        ArrayList<Main_Lst_Domain> ex_lst = new ArrayList<>();
        ex_lst.add(new Main_Lst_Domain("Exercise", "image_banner"));
        ex_lst.add(new Main_Lst_Domain("Sleep Tracking", "clock_banner"));
        ex_lst.add(new Main_Lst_Domain("Nutrition", "nutrition_banner"));
        ex_lst.add(new Main_Lst_Domain("Achievement", "achievement_banner"));

        adapter = new Main_Lst_Adapter(ex_lst);
        recycleView_main_list.setAdapter(adapter);
    }
}