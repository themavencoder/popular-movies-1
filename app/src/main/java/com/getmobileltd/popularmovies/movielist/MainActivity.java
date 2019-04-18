package com.getmobileltd.popularmovies.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.getmobileltd.popularmovies.R;

public class MainActivity extends AppCompatActivity {
    private MoviesViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
