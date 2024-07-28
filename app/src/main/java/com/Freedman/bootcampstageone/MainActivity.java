package com.Freedman.bootcampstageone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView list;
    //ListView list;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list = findViewById(R.id.recycler_view);
        //list = findViewById(R.id.listview_);

        Project[] projects = {

                new Project("GettingStarted", "Default 'Hello World' App", R.drawable.getting_started),
                new Project("C1QuoteApp", "Making a motivational quote on screen", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI Calculator", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters", R.drawable.tape),
                new Project("Moxies Bar", "an App with a menu selection, (starter, main, deserts) and lists of food", R.drawable.hungry_developer),
                new Project("My Bucket List", "A bucket list app for places to visit, and things to do", R.drawable.hungry_developer)
        };


        ProjectsAdapter adapter = new ProjectsAdapter(projects);


        list.setAdapter(adapter);


    }

}

