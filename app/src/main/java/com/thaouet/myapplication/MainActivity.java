package com.thaouet.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();
        }
    };

   List<String> items; //= {"bmw R1000","Z 650 RS","HONDA 650" };
    ListView listeview;
    Spinner spin1;
    ArrayAdapter aa;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("KAWAZAKI Z650RS");
        items.add("TRIUMPH TIGER R1200 GT");
        items.add("Norden 901");

        listeview = (ListView)findViewById(R.id.list);
        spin1 = findViewById(R.id.spin);
        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1,items);

        listeview.setOnItemClickListener(listener);
        listeview.setAdapter(aa);
spin1.setAdapter(aa);

        items.add("DUCATI DESERT X");

        aa.add("HONDA NT 1100");

        items.remove(0);
    }
}