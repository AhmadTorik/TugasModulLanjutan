package com.example.asus.hitungluaspersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText editSisi, edithasil, editkeliling;
    private Button btnOk;
    private TextView txtsisi, textLuas, textkeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();

    }
    private void initUI(){
        txtsisi = (TextView)findViewById(R.id.txtsisi);
        textLuas = (TextView)findViewById(R.id.textLuas);
        textkeliling = (TextView)findViewById(R.id.textkeliling);
        editSisi = (EditText)findViewById(R.id.editSisi);
        edithasil = (EditText)findViewById(R.id.edithasil);
        editkeliling = (EditText)findViewById(R.id.editkeliling);
        btnOk = (Button)findViewById(R.id.btnOk);

    }
    private void initEvent(){
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();

            }
        });
    }
    private void hitungLuas(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi*sisi;
        edithasil.setText(luas+"");

    }
    private void hitungKeliling(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4*sisi;
        editkeliling.setText(keliling+"");
    }

}
