package com.example.dessertrecipeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentIngredients extends Fragment {
    View view;

    public FragmentIngredients() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.ingredients_fragment, container, false);
        TextView RecipeIngredients = (TextView)view.findViewById(R.id.textIngredients);

        //calls main fragment activity
        mainFragment activity = (mainFragment)getActivity();

        //recieves data from mainFragment and saves as string
        Bundle results = activity.getMyData();
        String Ingredients = results.getString("Ingredients");

        //sets data to textview
        RecipeIngredients.setText(Ingredients);

        return view;
    }
}
