package com.zulbiasa.mad_lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.zulbiasa.mad_lab2.databinding.ActivityRegisterBinding;

public class ActivityRegister extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        fnSaveState();
    }

    public void fnSaveState() {
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        binding.editTextText2.setText(intent.getStringExtra("username"));
        binding.editTextTextPassword2.setText(intent.getStringExtra("password"));

        binding.button2.setOnClickListener(this::click);

    }

    public void click(View view) {

        int agedate = Integer.parseInt(binding.editTextDate.getText().toString());
        int age = 2024 - agedate;
        String sAge = "You are " + String.valueOf(age) + " years old";

        binding.editTextDate.setText(sAge);

        Intent intent = new Intent(this, ActivityExpenses.class);
        startActivity(intent);

    }

}