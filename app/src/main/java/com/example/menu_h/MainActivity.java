package com.example.menu_h;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // no code written here nothing done

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.simple_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(getApplicationContext(),"this is home page",Toast.LENGTH_LONG).show();
                break;
            case R.id.setting:
                Toast.makeText(getApplicationContext(),"this is setting page",Toast.LENGTH_LONG).show();
                break;
            case R.id.LogOut:
                Toast.makeText(getApplicationContext(),"this is Log Out page",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}