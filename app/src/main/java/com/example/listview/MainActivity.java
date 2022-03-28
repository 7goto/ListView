package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] player ={"哈哈","呵呵","嘻嘻","草","哈哈1","呵呵2","嘻嘻3","草4","哈哈4","呵呵5","嘻嘻6","草7","哈哈89","呵呵29","嘻嘻30","草44",
            "哈哈","呵呵","嘻嘻","草","哈哈1","呵呵2","嘻嘻3","草4","哈哈4","呵呵5","嘻嘻6","草7","哈哈89","呵呵29","嘻嘻30","草44"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.LV);

//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,player);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,player);
        listView.setAdapter(adapter);

    }
}