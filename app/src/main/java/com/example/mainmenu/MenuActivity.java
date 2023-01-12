package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView menuList = (ListView) findViewById(R.id.list);
        menuList.setClickable(true);

        String[] items = { getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help) };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.list, items);

        menuList.setAdapter(adapt);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(MenuActivity.this, SelectorActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MenuActivity.this, "2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MenuActivity.this, "3", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MenuActivity.this, "4", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}