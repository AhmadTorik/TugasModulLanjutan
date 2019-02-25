package com.example.asus.operatormatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button btnJumlah, btnKurang, btnKali, btnBagi;
    TextView textAwal,textOperator, texthasil;
    EditText editAwal, editKedua, editHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJumlah = (Button)findViewById(R.id.btnJumlah);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        btnKali = (Button)findViewById(R.id.btnKali);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        textAwal = (TextView)findViewById(R.id.textawal);
        textOperator = (TextView)findViewById(R.id.textOperator);
        texthasil = (TextView)findViewById(R.id.texthasil);
        editAwal = (EditText)findViewById(R.id.editAwal);
        editKedua = (EditText)findViewById(R.id.editKedua);
        editHasil = (EditText)findViewById(R.id.editHasil);
        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpenjumlahan ();
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpengurangan ();
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorperkalian ();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpembagian ();
            }
        });
    }
    private void operatorpenjumlahan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pejumlahan = angkaawal+angkakedua;
        editHasil.setText(pejumlahan+"");

    }

    private void operatorpengurangan(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pengurangan = angkaawal-angkakedua;
        editHasil.setText(pengurangan+"");
    }
    private void operatorperkalian(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int perkalian = angkaawal*angkakedua;
        editHasil.setText(perkalian+"");
    }
    private void operatorpembagian(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pembagian = angkaawal/angkakedua;
        editHasil.setText(pembagian+"");

    }
}
