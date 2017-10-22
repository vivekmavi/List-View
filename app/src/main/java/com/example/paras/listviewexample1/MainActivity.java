package com.example.paras.listviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    String[] days = {"Monday" , "Tuesday" , "Wednesday" , "Friday" , "Saturday" , "Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        TextView textView = (TextView) view;

        String itemSelected = textView.getText().toString() ;

        Toast.makeText(this,itemSelected+" selected", Toast.LENGTH_SHORT).show();
    }
}
