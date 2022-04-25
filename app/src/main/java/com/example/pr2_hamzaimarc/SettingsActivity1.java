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
    public static final String EXTRA = "Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings1);

        editText = findViewById(R.id.settingUser);
        button = findViewById(R.id.settingButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent View = new Intent(SettingsActivity1.this,NavigationDrawerActivity.class);
                TextView usuari = (TextView) findViewById(R.id.settingUser);
                String user = usuari.getText().toString();
                View.putExtra("EXTRA", user);
                startActivity(View);
            }
        });

        TextView midaText = (TextView) findViewById(R.id.A);
        midaText.setOnClickListener((v) ->
        {
            new AlertDialog.Builder(SettingsActivity1.this)
                    .setItems(R.array.textSize, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (which == 0) {
                                TextView tv2 = (TextView) findViewById(R.id.A);
                                tv2.setTextSize(14);
                                TextView tv3 = (TextView) findViewById(R.id.B);
                                tv3.setTextSize(14);
                                TextView tv1 = (TextView) findViewById(R.id.C);
                                tv1.setTextSize(14);

                            } else if (which == 1) {
                                TextView tv2 = (TextView) findViewById(R.id.A);
                                tv2.setTextSize(18);
                                TextView tv3 = (TextView) findViewById(R.id.B);
                                tv3.setTextSize(18);
                                TextView tv1 = (TextView) findViewById(R.id.C);
                                tv1.setTextSize(18);

                            } else if (which == 2) {
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


        TextView colorFons = (TextView) findViewById(R.id.B);
        colorFons.setOnClickListener((v) ->
        {
            new AlertDialog.Builder(SettingsActivity1.this)
                    .setItems(R.array.theme, new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            if(which == 0){
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                            }
                            else if(which == 1){
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                            }
                        }

                    }).create().show();

        });


        TextView canviNom = (TextView) findViewById(R.id.C);
        canviNom.setOnClickListener((v) ->
        {
            new AlertDialog.Builder(SettingsActivity1.this)
                    .setItems(R.array.theme, new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which)
                        {
                            if(which == 0){
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                            }
                            else if(which == 1){
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                            }
                        }
                    }).create().show();
        });

        FloatingActionButton fab = findViewById(R.id.fab2);
        fab.setOnClickListener((view) -> {
            new AlertDialog.Builder(SettingsActivity1.this).setTitle("FasFus").setIcon(R.drawable.burgerr)
                    .setMessage("Autor/es: Hamza i Marc").create().show();
        });



    }
}

