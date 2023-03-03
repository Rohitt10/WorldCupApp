package com.example.worldcup;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<CountryDetails> al;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Step 1:
        listView=findViewById(R.id.listView);
        al=new ArrayList<>();
        al.add(new CountryDetails("Brazil","5",R.drawable.brazil));
        al.add(new CountryDetails("France","2",R.drawable.france));
        al.add(new CountryDetails("Germany","4",R.drawable.germany));
        al.add(new CountryDetails("Saudi Arabia","0",R.drawable.saudiarabia));
        al.add(new CountryDetails("spain","2",R.drawable.spain));
        al.add(new CountryDetails("United Kingdom","0",R.drawable.unitedkingdom));
        al.add(new CountryDetails("USA","0",R.drawable.unitedstates));
        MyAdapter adapter=new MyAdapter(al,this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this,
//                        adapter.getItem(i).name+"won "+adapter.getItem(i).count,
//                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}