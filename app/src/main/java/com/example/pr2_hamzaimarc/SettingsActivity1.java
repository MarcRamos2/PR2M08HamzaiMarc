package com.example.pr2_hamzaimarc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings1);

        TextView midaText = (TextView) findViewById(R.id.A);
        midaText.setOnClickListener((v) ->
        {
            new AlertDialog.Builder(SettingsActivity1.this)
                    .setItems(R.array.textSize, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
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
    }
}

