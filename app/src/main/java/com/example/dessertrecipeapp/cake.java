package com.example.dessertrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class cake extends AppCompatActivity {

    List<Recipe> Recipe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);

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
        Recipe1.add(new Recipe("Easy Carrot Cake", "Time: 65 Minutes", "Servings: 12", getString(R.string.cake1Desc), getString(R.string.cake1Ingred), getString(R.string.cake1Meth), R.drawable.cake1));
        Recipe1.add(new Recipe("Victoria Sandwich", "Time: 30 Minutes", "Servings: 10", getString(R.string.cake2Desc), getString(R.string.cake2Ingred), getString(R.string.cake2Meth), R.drawable.cake2));
        Recipe1.add(new Recipe("Lemon Drizzle", "Time: 1 Hour", "Servings: 10", getString(R.string.cake3Desc), getString(R.string.cake3Ingred), getString(R.string.cake3Meth), R.drawable.cake3));
        Recipe1.add(new Recipe("Cherry Bakewell", "Time: 45 Minutes", "Servings: 8", getString(R.string.cake4Desc), getString(R.string.cake4Ingred), getString(R.string.cake4Meth), R.drawable.cake4));
        Recipe1.add(new Recipe("Grannys Victoria", "Time: 40 Minutes", "Servings: 8-10", getString(R.string.cake5Desc), getString(R.string.cake5Ingred), getString(R.string.cake5Meth), R.drawable.cake5));
        Recipe1.add(new Recipe("Coffee and Walnut", "Time: 1 Hour 30 Minutes", "Servings: 10", getString(R.string.cake6Desc), getString(R.string.cake6Ingred), getString(R.string.cake6Meth), R.drawable.cake6));
        Recipe1.add(new Recipe("Easy Chocolate Cake", "Time: 55 Minutes", "Servings: 12-14", getString(R.string.cake7Desc), getString(R.string.cake7Ingred), getString(R.string.cake7Meth), R.drawable.cake7));
        Recipe1.add(new Recipe("Brilliant Banana Loaf", "Time: 55 Minutes", "Servings: 8-10", getString(R.string.cake8desc), getString(R.string.cake8Ingred), getString(R.string.cake8Meth), R.drawable.cake8));
        Recipe1.add(new Recipe("Chocolate Fudge Cake", "Time: 1 Hour 20 Minutes", "Servings: 12", getString(R.string.cake9desc), getString(R.string.cake9Ingred), getString(R.string.cake9Meth), R.drawable.cake9));
        Recipe1.add(new Recipe("Peach Melba Roulade", "Time: 50 Minutes", "Servings: 10", getString(R.string.cake10Desc), getString(R.string.cake10Ingred), getString(R.string.cake10Meth), R.drawable.cake10));
        Recipe1.add(new Recipe("Madeira Loaf", "Time: 1 Hour 20 Minutes", "Servings: 8", getString(R.string.cake11Desc), getString(R.string.cake11Ingred), getString(R.string.cake11Meth), R.drawable.cake11));
        Recipe1.add(new Recipe("Apple Crumble Loaf", "Time: 1 Hour 15 Minutes", "Servings: 10", getString(R.string.cake12Desc), getString(R.string.cake12Ingred), getString(R.string.cake12Meth), R.drawable.cake12));

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
