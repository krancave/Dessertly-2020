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

public class cookie extends AppCompatActivity {

    List<Recipe> Recipe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

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
        Recipe1.add(new Recipe("Chocolate Chip", "Time: 22 Minutes", "Servings: 24", getString(R.string.cookie1Desc), getString(R.string.cookie1Ingred), getString(R.string.cookie1Meth), R.drawable.cookie1));
        Recipe1.add(new Recipe("Brownie Cookie", "Time: 1 Hour", "Servings: 36", getString(R.string.cookie2Desc), getString(R.string.cookie2Ingred), getString(R.string.cookie2Meth), R.drawable.cookie2));
        Recipe1.add(new Recipe("Coconut Sugar", "Time: 30 Minutes", "Servings: 30", getString(R.string.cookie3Desc), getString(R.string.cookie3Ingred), getString(R.string.cookie3Meth), R.drawable.cookie3));
        Recipe1.add(new Recipe("Raspberry Choc-Chip", "Time: 15 Minutes", "Servings: 36", getString(R.string.cookie4Desc), getString(R.string.cookie4Ingred), getString(R.string.cookie4Meth), R.drawable.cookie4));
        Recipe1.add(new Recipe("Peanut Butter", "Time: 1 Hour 30 Minutes", "Servings: 36", getString(R.string.cookie5Desc), getString(R.string.cookie5Ingred), getString(R.string.cookie5Meth), R.drawable.cookie5));
        Recipe1.add(new Recipe("Red Velvet", "Time: 1 Hour 30 Minutes", "Servings: 18", getString(R.string.cookie6Desc), getString(R.string.cookie6Ingred), getString(R.string.cookie6Meth), R.drawable.cookie6));
        Recipe1.add(new Recipe("Top Secret Chocolate", "Time: 25 Minutes", "Servings: 30", getString(R.string.cookie7Desc), getString(R.string.cookie7Ingred), getString(R.string.cookie7Meth), R.drawable.cookie7));
        Recipe1.add(new Recipe("Rainbow Choc-Chip", "Time: 24 Minutes", "Servings: 36", getString(R.string.cookie8desc), getString(R.string.cookie8Ingred), getString(R.string.cookie8Meth), R.drawable.cookie8));
        Recipe1.add(new Recipe("Chewy Chocolate", "Time: 45 Minutes", "Servings: 48", getString(R.string.cookie9desc),  getString(R.string.cookie9Ingred), getString(R.string.cookie9Meth), R.drawable.cookie9));
        Recipe1.add(new Recipe("Double Choc-Chip", "Time: 32 Minutes", "Servings: 24", getString(R.string.cookie10Desc), getString(R.string.cookie10Ingred), getString(R.string.cookie10Meth), R.drawable.cookie10));
        Recipe1.add(new Recipe("Coconut Bran", "Time: 30 Minutes", "Servings: 24", getString(R.string.cookie11Desc), getString(R.string.cookie11Ingred), getString(R.string.cookie11Meth), R.drawable.cookie11));
        Recipe1.add(new Recipe("Banana Choc-Chip", "Time: 30 Minutes", "Servings: 30", getString(R.string.cookie12Desc), getString(R.string.cookie12Ingred), getString(R.string.cookie12Meth), R.drawable.cookie12));
        Recipe1.add(new Recipe("Cinnamon and Raisin", "Time: 20 Minutes", "Servings: 20", getString(R.string.cookie13Desc), getString(R.string.cookie13Ingred), getString(R.string.cookie13Meth), R.drawable.cookie13));

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
