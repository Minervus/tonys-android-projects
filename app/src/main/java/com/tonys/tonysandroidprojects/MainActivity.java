package com.tonys.tonysandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projects = {
                new Project("Getting Started","Very first app for getting started", R.drawable.getting_started),
                new Project("Tony Nguyen App","App to display some text in textView", R.drawable.quote),
                new Project("BMI Calculator","A app to display a user's BMI", R.drawable.tape),
                new Project("1RM Calculator","An app to calculate a users estimated 1 rep max", R.drawable.calculator),
                new Project("The Hungry Dev","A restaurant app displaying a menu", R.drawable.hungry_developer)
        };
    }
}