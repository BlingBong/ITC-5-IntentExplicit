package com.example.itc_5_intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etBank, etRek, etNominal, etUsername, etPin;
    Button btnTerus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBank = findViewById(R.id.et_bank);
        etRek = findViewById(R.id.et_rek);
        etNominal = findViewById(R.id.et_nominal);
        etUsername = findViewById(R.id.et_username);
        etPin = findViewById(R.id.et_pin);

        btnTerus = findViewById(R.id.btn_terus);

        btnTerus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bank = etBank.getText().toString();
                String rek = etRek.getText().toString();
                String nominal = etNominal.getText().toString();
                String username = etUsername.getText().toString();
                String pin = etPin.getText().toString();

                if(username.equals("merdeka") && pin.equals("170845")){
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra(Main2Activity.EXTRA_BANK, bank);
                    intent.putExtra(Main2Activity.EXTRA_REK, rek);
                    intent.putExtra(Main2Activity.EXTRA_NOMINAL, nominal);
                    startActivity(intent);
                }
            }
        });
    }
}
