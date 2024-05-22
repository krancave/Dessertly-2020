package com.example.dessertrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView cookieimg;
    private ImageView cakeimg;
    private ImageView frozenimg;
    private ImageView cremeimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        cookieimg = (ImageView) findViewById(R.id.cookies);
        cookieimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_cookie();
            }
        });

       cakeimg = (ImageView) findViewById(R.id.cakes);
       cakeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_cake();
            }
        });

        frozenimg = (ImageView) findViewById(R.id.frozen_desserts);
        frozenimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_frozen();
            }
        });

        cremeimg = (ImageView) findViewById(R.id.creme);
        cremeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_creme();
            }
        });
    }

    public void openActivity_cookie() {
        Intent intent = new Intent(this, cookie.class);
        startActivity(intent);
    }

    public void openActivity_cake() {
        Intent intent = new Intent(this, cake.class);
        startActivity(intent);
    }

    public void openActivity_frozen() {
        Intent intent = new Intent(this, frozen.class);
        startActivity(intent);
    }

    public void openActivity_creme() {
        Intent intent = new Intent(this, creme.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menubar, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent intent = new Intent(this, About.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
