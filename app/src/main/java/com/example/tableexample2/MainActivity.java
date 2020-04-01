package com.example.tableexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TableAdapter tableAdapter;
    ArrayList<TableModel> tableModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_table_elements);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tableModels = new ArrayList<>();
        tableModels.add(new TableModel("1", "Horlics", "3", "400tk"));
        tableModels.add(new TableModel("2", "Horlics Ultra", "5", "1200tk"));
        tableModels.add(new TableModel("3", "Mask", "1", "100tk"));
        tableModels.add(new TableModel("4", "Keyboard", "1", "2500tk"));

        tableAdapter = new TableAdapter(tableModels, this);
        recyclerView.setAdapter(tableAdapter);


    }
}
