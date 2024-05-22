package com.example.dessertrecipeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class FragmentInfo extends Fragment {
    View view;

    public FragmentInfo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.info_fragment, container, false);
        TextView RecipeTitle = (TextView)view.findViewById(R.id.textTitle);
        TextView RecipeTime = (TextView)view.findViewById(R.id.textTime);
        TextView RecipeServings = (TextView)view.findViewById(R.id.textServings);
        TextView RecipeDescription = (TextView)view.findViewById(R.id.textDescription);

        //calls main fragment activity
        mainFragment activity = (mainFragment)getActivity();

        //recieves data from mainFragment and saves as string
        Bundle results = activity.getMyData();
        String Title = results.getString("RecipeTitle");
        String Time = results.getString("Time");
        String Servings = results.getString("Servings");
        String Description = results.getString("Description");

        //sets data to textviews
        RecipeTitle.setText(Title);
        RecipeTime.setText(Time);
        RecipeServings.setText(Servings);
        RecipeDescription.setText(Description);

        return view;
    }
}
