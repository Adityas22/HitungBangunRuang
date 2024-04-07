package com.example.hitungbangunruang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText inputAngka;
    Button bHitung, bReset;
    TextView lpKubus, vKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputAngka = findViewById(R.id.inputAngka);
        bHitung = findViewById(R.id.bHitung);
        bReset = findViewById(R.id.bReset);
        lpKubus = findViewById(R.id.lpKubus);
        vKubus = findViewById(R.id.vKubus);

        bHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai dari EditText dan mengonversinya ke float
                float sisi = Float.parseFloat(inputAngka.getText().toString());

                // Menghitung luas permukaan dan volume kubus
                float lp_Kubus = 6 * sisi * sisi;
                float v_Kubus = sisi * sisi * sisi;

                // Mengatur format dua angka desimal menggunakan DecimalFormat
                DecimalFormat df = new DecimalFormat("#.##");

                // Menampilkan hasil perhitungan dengan dua angka desimal
                lpKubus.setText(df.format(lp_Kubus));
                vKubus.setText(df.format(v_Kubus));
            }
        });
    }
}
