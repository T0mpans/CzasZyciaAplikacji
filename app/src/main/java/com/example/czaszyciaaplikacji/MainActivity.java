package com.example.czaszyciaaplikacji;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    //int licznik = 0;
    Button button;
    TextView textView;
    LicznikViewModel licznikViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.i("CYKL Zycia", "uruchomiona metoda onCreate");

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        licznikViewModel = new ViewModelProvider(this).get(LicznikViewModel.class);
        if(savedInstanceState != null){
            //licznik = savedInstanceState.getInt("LICZNIK");
            //textView.setText(""+licznik);
        }
        textView.setText(licznikViewModel.getLicznik()+"");
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //licznik++;
                        licznikViewModel.addLicznik();
                        textView.setText(""+licznikViewModel.getLicznik());
                    }
                }
        );
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CYKL Zycia", "uruchomiona metode onSaveInstanceState");
        //outState.putInt("LICZNIK", licznik);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CYKL Zycia", "uruchomiona metode onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL Zycia", "uruchomiona metoda onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL Zycia", "uruchomiona metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL Zycia", "uruchomiona metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL Zycia", "uruchomiona metoda onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL Zycia", "uruchomiona metoda onRestart");
    }
}