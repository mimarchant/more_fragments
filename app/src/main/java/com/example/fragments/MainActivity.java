package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.mainContainer);
    }
}