package com.example.pc.listvieww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {" ListView Title1", "ListView Title2 ", "ListView Title3", "ListView Title4"};
    String  SubItem[] = {
            "Android ListView Short Description",
            "Android ListView Short Description",
            "Android ListView Short Description",
            "Android ListView Short Description",
            "Android ListView Short Description"};
    int flags[] = {R.drawable.nguoi, R.drawable.nguoi, R.drawable.nguoi, R.drawable.nguoi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}
