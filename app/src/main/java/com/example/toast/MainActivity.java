package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variable pour stocker la valeur du compteur
    private int count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison entre le XML et le Java
        textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Action du bouton Toast
        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour Hajar ! Voici un Toast.", Toast.LENGTH_SHORT).show();
        });

        // Action du bouton Compteur
        buttonCount.setOnClickListener(v -> {
            count++; // Incrémentation
            textCount.setText(String.valueOf(count)); // Mise à jour de l'affichage
        });
    }
}
