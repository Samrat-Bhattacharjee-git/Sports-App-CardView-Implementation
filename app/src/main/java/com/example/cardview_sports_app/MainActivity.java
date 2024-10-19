package com.example.cardview_sports_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemsClickListner{

    RecyclerView recyclerView;
    List<model_class> list;

    Sports_Item_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        list=new ArrayList<>();

        model_class s1=new model_class(R.drawable.football,"FOOTBALL");
        model_class s2=new model_class(R.drawable.basketball,"BASKETBALL");
        model_class s3=new model_class(R.drawable.ping,"PING-PONG");
        model_class s4=new model_class(R.drawable.tennis,"TENNIS");
        model_class s5=new model_class(R.drawable.volley,"VOLLEY-BALL");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new Sports_Item_Adapter(list);
        recyclerView.setAdapter(adapter);

        adapter.setClickListner(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Intent intent=new Intent(this, empty.class);
        startActivity(intent);
    }
}