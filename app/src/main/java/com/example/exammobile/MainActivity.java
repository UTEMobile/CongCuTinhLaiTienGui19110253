package com.example.exammobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText soTienGuiText;
    EditText laiSuatGuiText;
    EditText kiHanGuiText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soTienGuiText = (EditText) findViewById(R.id.soTienGuiText);
        laiSuatGuiText = (EditText) findViewById(R.id.laiSuatGuiText);
        kiHanGuiText = (EditText) findViewById(R.id.kiHanGuiText);
    }

    public void resultBtnClick(View view) {

        double soTienGui = Double.parseDouble(soTienGuiText.getText().toString());
        double laiSuatGui = Double.parseDouble(laiSuatGuiText.getText().toString());
        double kiHanGui = Double.parseDouble(kiHanGuiText.getText().toString());

        double soTienLai = soTienGui * laiSuatGui * kiHanGui/12/100;

        Intent intent = new Intent(this, Result.class);


        intent.putExtra("soTienLai", Double.toString(soTienLai) );
        intent.putExtra("tongSoTien", Double.toString(soTienGui + soTienLai));

        startActivity(intent);


    }

}