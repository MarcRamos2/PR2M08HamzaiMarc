package com.example.pr2_hamzaimarc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SettingsActivity1 extends AppCompatActivity {

    EditText editText;
    Button button;
    public static final String EXTRA_NAME = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings1);

        editText = findViewById(R.id.settingUser);
        button = findViewById(R.id.settingButton);

        // Canviar el nom de l'usuari connectat
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(SettingsActivity1.this,NavigationDrawerActivity.class);
                TextView usuario = (TextView) findViewById(R.id.settingUser);
                String user = usuario.getText().toString();
                View.putExtra("EXTRA_NAME", user);
                startActivity(View);
            }
        });


        // Canviar mida de Text
        TextView midaText = (TextView) findViewById(R.id.A);
        midaText.setOnClickListener((v) -> // fer que es pugui click sobre el textview
        {
            new AlertDialog.Builder(SettingsActivity1.this) //obrim un alert Dialog i li posem els items que tenim en l'array
                    .setItems(R.array.textSize, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int opcio) { //fem el mètode onclick per saber quina opció ha escollit
                            if (opcio == 0) {
                                TextView tv2 = (TextView) findViewById(R.id.A);
                                tv2.setTextSize(14); // un setTextSize per canviar la mida
                                TextView tv3 = (TextView) findViewById(R.id.B);
                                tv3.setTextSize(14);
                                TextView tv1 = (TextView) findViewById(R.id.C);
                                tv1.setTextSize(14);

                            } else if (opcio == 1) {
                                TextView tv2 = (TextView) findViewById(R.id.A);
                                tv2.setTextSize(18);
                                TextView tv3 = (TextView) findViewById(R.id.B);
                                tv3.setTextSize(18);
                                TextView tv1 = (TextView) findViewById(R.id.C);
                                tv1.setTextSize(18);

                            } else if (opcio == 2) {
                                TextView tv2 = (TextView) findViewById(R.id.A);
                                tv2.setTextSize(22);
                                TextView tv3 = (TextView) findViewById(R.id.B);
                                tv3.setTextSize(22);
                                TextView tv1 = (TextView) findViewById(R.id.C);
                                tv1.setTextSize(22);
                            }
                        }
                    }).create().show();
        });



        // Canviar color de fons de l'aplicació
        TextView colorFons = (TextView) findViewById(R.id.B);
        colorFons.setOnClickListener((v) ->
        {
            new AlertDialog.Builder(SettingsActivity1.this)
                    .setItems(R.array.theme, new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int opcio)
                        {
                            // Fosc
                            if(opcio == 0){
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                            }
                            // Clar
                            else if(opcio == 1){
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                            }
                        }
                    }).create().show();
        });

        // Botó flotant
        FloatingActionButton fab = findViewById(R.id.fab2);
        fab.setOnClickListener((view) -> {
            new AlertDialog.Builder(SettingsActivity1.this).setTitle("FasFus").setIcon(R.drawable.burgerr)
                    .setMessage("Autor/es: Hamza i Marc").create().show();
        });

    }
}

