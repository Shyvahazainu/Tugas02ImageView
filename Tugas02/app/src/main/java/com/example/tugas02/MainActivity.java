package com.example.tugas02;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tugas02.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangeImg = findViewById(R.id.btnChangeImage);
        ImageView imgView = findViewById(R.id.imgView);

        int[] cards = {R.drawable.ayam, R.drawable.gajah, R.drawable.koala};

        btnChangeImg.setOnClickListener(new View.OnClickListener() {

            int n=1;

            @Override
            public void onClick(View view) {
                if(n >= cards.length){
                    n=0;
                }
                imgView.setImageResource(cards[n]);
                n++;
            }
        });
    }
}