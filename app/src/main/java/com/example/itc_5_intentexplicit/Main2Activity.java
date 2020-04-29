package com.example.itc_5_intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    final static String EXTRA_BANK = "extra_bank";
    final static String EXTRA_REK = "extra_rek";
    final static String EXTRA_NOMINAL = "extra_nominal";
    TextView tvGetBank, tvGetRek, tvGetNominal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String bank = getIntent().getStringExtra(EXTRA_BANK);
        String rek = getIntent().getStringExtra(EXTRA_REK);
        String nominal = getIntent().getStringExtra(EXTRA_NOMINAL);

        tvGetBank = findViewById(R.id.tv_getBank);
        tvGetRek = findViewById(R.id.tv_getRek);
        tvGetNominal = findViewById(R.id.tv_getNominal);

        tvGetBank.setText("Bank Tujuan \t: " + bank + "\n");
        tvGetRek.setText("Rekening Tujuan \t: " + rek + "\n");
        tvGetNominal.setText("Nominal Uang \t: " + nominal + "\n");
    }
}
