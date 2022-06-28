package com.example.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] name = {"Arpan", "Tushal", "Mitesh", "Jagdish", "Meet", "Sanket", "Rutvij", "Vikas",
            "Arpan", "Tushal", "Mitesh", "Jagdish", "Meet", "Sanket", "Rutvij", "Vikas"};

    String[] no = {"9879995491", "9879995491", "9879995491", "9879995491",
            "9879995491", "9879995491", "9879995491", "9879995491",
            "9879995491", "9879995491", "9879995491", "9879995491",
            "9879995491", "9879995491", "9879995491", "9879995491"};

    int[] image = {R.drawable.user1, R.drawable.user1, R.drawable.user1, R.drawable.user1,
            R.drawable.user1, R.drawable.user1, R.drawable.user1, R.drawable.user1,
            R.drawable.user1, R.drawable.user1, R.drawable.user1, R.drawable.user1,
            R.drawable.user1, R.drawable.user1, R.drawable.user1, R.drawable.user1};

    ListView ListViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        ListViewText = findViewById(R.id.ListViewText);

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.activity_list_view, name, no, image);
        ListViewText.setAdapter(adapter);


    }
}