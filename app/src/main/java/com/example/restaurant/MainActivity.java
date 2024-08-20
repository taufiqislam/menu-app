package com.example.restaurant;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Button menuButton = findViewById(R.id.seekButton);
    private FoodExpert expert = new FoodExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }

    public void menuHandler(View view) {
        Spinner menuSpinner = findViewById(R.id.mealSpinner);
        TextView menu = findViewById(R.id.menuTextView);
        String meal = String.valueOf(menuSpinner.getSelectedItem());
        List<String> menuList = expert.getFoods(meal);
        StringBuilder foodsFormatted = new StringBuilder();
        for(String food : menuList)
        {
            foodsFormatted.append(food).append('\n');
        }
        menu.setText(foodsFormatted);
    }
}