package com.example.listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] presidents = {
            "Dwight D. Eisenhower",
            "John F. Kennedy",
            "Lyndon B. Johnson",
            "Richard Nixon",
            "Gerald Ford",
            "Jimmy Carter",
            "Ronald Reagan",
            "George H. W. Bush",
            "Bill Clinton",
            "George W. Bush",
            "Barack Obama",
            "Donald Trump"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        ListAdapter adapter = (new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, presidents));
        setListAdapter(adapter);
    }

    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this,
                "You have selected " + presidents[position],
                Toast.LENGTH_SHORT).show();
    }
}

