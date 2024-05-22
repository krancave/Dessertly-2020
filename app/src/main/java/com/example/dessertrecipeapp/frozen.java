package com.example.dessertrecipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class frozen extends AppCompatActivity {

    List<Recipe> Recipe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frozen);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_arrow));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Recipe1 = new ArrayList<>();
        Recipe1.add(new Recipe("Berry Frozen Dessert", "Time: 15 Minutes", "Servings: 16", getString(R.string.frozen1Desc), getString(R.string.frozen1Ingred), getString(R.string.frozen1Meth), R.drawable.frozen1));
        Recipe1.add(new Recipe("Creamy Mocha", "Time: 20 Minutes", "Servings: 24", getString(R.string.frozen2Desc), getString(R.string.frozen2Ingred), getString(R.string.frozen2Meth), R.drawable.frozen2));
        Recipe1.add(new Recipe("Black and White", "Time: 15 Minutes", "Servings: 12", getString(R.string.frozen3Desc), getString(R.string.frozen3Ingred), getString(R.string.frozen3Meth), R.drawable.frozen3));
        Recipe1.add(new Recipe("Triple Choc", "Time: 30 Minutes", "Servings: 10", getString(R.string.frozen4Desc), getString(R.string.frozen4Ingred), getString(R.string.frozen4Meth), R.drawable.frozen4));
        Recipe1.add(new Recipe("Choc Frozen Dessert", "Time: 30 Minutes", "Servings: 16-18", getString(R.string.frozen5Desc), getString(R.string.frozen5Ingred), getString(R.string.frozen4Meth), R.drawable.frozen5));
        Recipe1.add(new Recipe("Healthy Greek Frozen Yogurt", "Time: 5 Minutes", "Servings: 4", getString(R.string.frozen6Desc), getString(R.string.frozen6Ingred), getString(R.string.frozen6Meth), R.drawable.frozen6));
        Recipe1.add(new Recipe("Honey Semifreddo", "Time: 30 Minutes", "Servings: 8", getString(R.string.frozen7Desc), getString(R.string.frozen7Ingred), getString(R.string.frozen7Meth), R.drawable.frozen7));
        Recipe1.add(new Recipe("Cookie and Ice Cream", "Time: 35 Minutes", "Servings: 16", getString(R.string.frozen8desc), getString(R.string.frozen8Ingred), getString(R.string.frozen8Meth), R.drawable.frozen8));
        Recipe1.add(new Recipe("Frozen Chocolate Cookie", "Time: 30 Minutes", "Servings: 8", getString(R.string.frozen9desc), getString(R.string.frozen9Ingred), getString(R.string.frozen9Meth), R.drawable.frozen9));
        Recipe1.add(new Recipe("Pina Colada", "Time: 20 Minutes", "Servings: 12", getString(R.string.frozen10Desc), getString(R.string.frozen10Ingred), getString(R.string.frozen10Meth), R.drawable.frozen10));
        Recipe1.add(new Recipe("Chocolate-Mousse Trifles", "Time: 25 Minutes", "Servings: 4", getString(R.string.frozen11Desc), getString(R.string.frozen11Ingred), getString(R.string.frozen11Meth), R.drawable.frozen11));
        //Recipe1.add(new Recipe("Coconut Cream", "Time: 20 Minutes", "Servings: 12-15", getString(R.string.frozen12Desc), getString(R.string.frozen12Ingred), getString(R.string.frozen12Meth), R.drawable.frozen12));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Recipe1);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);

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
