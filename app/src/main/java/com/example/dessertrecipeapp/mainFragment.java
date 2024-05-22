package com.example.dessertrecipeapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.dessertrecipeapp.ui.main.SectionsPagerAdapter;

public class mainFragment extends AppCompatActivity {
    private ImageView img;
    private String Title, Time, Servings, Description, Ingredients, Method;
    private Bundle results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_arrow));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        img = (ImageView) findViewById(R.id.recipeThumbnail);

        //Recieves Data
        Intent intent = getIntent();
        Title = intent.getExtras().getString("RecipeTitle");
        Time = intent.getExtras().getString("Time");
        Servings = intent.getExtras().getString("Servings");
        Description = intent.getExtras().getString("Description");
        Ingredients = intent.getExtras().getString("Ingredients");
        Method = intent.getExtras().getString("Method");
        int image = intent.getExtras().getInt("Thumbnail");

        img.setImageResource(image);
    }

    public Bundle getMyData(){
        Bundle hm = new Bundle();
        hm.putString("RecipeTitle", Title);
        hm.putString("Time", Time);
        hm.putString("Servings", Servings);
        hm.putString("Description", Description);
        hm.putString("Ingredients", Ingredients);
        hm.putString("Method", Method);
        return hm;
    }
}