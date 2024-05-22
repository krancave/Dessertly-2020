package com.example.dessertrecipeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMethod extends Fragment {
    View view;

    public FragmentMethod() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.method_fragment, container, false);
        TextView RecipeMethod = (TextView)view.findViewById(R.id.textMethod);

        //calls main fragment activity
        mainFragment activity = (mainFragment)getActivity();

        //recieves data from mainFragment and saves as string
        Bundle results = activity.getMyData();
        String Method = results.getString("Method");

        //sets data to textview
        RecipeMethod.setText(Method);


        return view;
    }
}
