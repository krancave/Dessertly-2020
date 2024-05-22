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

public class creme extends AppCompatActivity {

    List<Recipe> Recipe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creme);

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
        Recipe1.add(new Recipe("Black Forest Cherry", "Time: 4 Hours 20 Minutess", "Servings: 6-8", getString(R.string.creme1Desc), getString(R.string.creme1Ingred), getString(R.string.creme1Meth), R.drawable.creme1));
        Recipe1.add(new Recipe("Crème Brûlée", "Time: 1 Hour", "Servings: 4", getString(R.string.creme2Desc), getString(R.string.creme2Ingred), getString(R.string.creme2Meth), R.drawable.creme2));
        Recipe1.add(new Recipe("Chocolate Mousse", "Time: 1 Hour", "Servings: 6", getString(R.string.creme3Desc), getString(R.string.creme3Ingred), getString(R.string.creme3Meth), R.drawable.creme3));
        Recipe1.add(new Recipe("Tiramisu Creme", "Time: 30 Minutes", "Servings: 6", getString(R.string.creme4Desc), getString(R.string.creme4Ingred), getString(R.string.creme4Meth), R.drawable.creme4));
        Recipe1.add(new Recipe("Vanilla Pasty Cream", "Time: 20 Minutes", "Servings: 6", getString(R.string.creme5Desc), getString(R.string.creme5Ingred), getString(R.string.creme5Meth), R.drawable.creme5));
        Recipe1.add(new Recipe("Giotto Cream Dessert", "Time: 5 Minutes", "Servings: 3", getString(R.string.creme6Desc), getString(R.string.creme6Ingred), getString(R.string.creme6Meth), R.drawable.creme6));


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
