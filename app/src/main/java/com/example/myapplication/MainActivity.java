package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        EditText et1 = findViewById(R.id.editText);
        EditText et2 = findViewById(R.id.editText2);
        Button btTambah = findViewById(R.id.buttonTambah);
        Button btKurang = findViewById(R.id.buttonKurang);
        Button btKali = findViewById(R.id.buttonKali);
        Button btBagi = findViewById(R.id.buttonBagi);
        btTambah.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer bil1,bil2,hasil;
                bil1 = Integer.valueOf(et1.getText().toString().trim());
                bil2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = bil1 + bil2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });

        btKurang.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer bil1,bil2,hasil;
                bil1 = Integer.valueOf(et1.getText().toString().trim());
                bil2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = bil1 - bil2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });

        btKali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer bil1,bil2,hasil;
                bil1 = Integer.valueOf(et1.getText().toString().trim());
                bil2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = bil1 * bil2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });

        btBagi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer bil1,bil2,hasil;
                bil1 = Integer.valueOf(et1.getText().toString().trim());
                bil2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = bil1 / bil2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });
    }
}