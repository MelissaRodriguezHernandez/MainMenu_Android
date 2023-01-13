package com.example.mainmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectgame);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Select:
                Toast.makeText(this, "1", Toast.LENGTH_LONG ).show();
                return true;
            case R.id.Score:
                Toast.makeText(this, "2", Toast.LENGTH_LONG ).show();
                return true;
            case R.id.Settings:
                Toast.makeText(this, "3", Toast.LENGTH_LONG ).show();
                return true;
            case R.id.help:
                Toast.makeText(this, "4", Toast.LENGTH_LONG ).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
