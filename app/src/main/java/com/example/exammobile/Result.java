package com.example.exammobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView tongSoTienText;
    TextView soTienLaiText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tongSoTienText = (TextView) findViewById(R.id.tongSoTienText);
        soTienLaiText = (TextView) findViewById(R.id.soTienLaiText);

        Intent intent = getIntent();
        String soTienLai = intent.getStringExtra("soTienLai");
        String tongSoTien = intent.getStringExtra("tongSoTien");


        if (savedInstanceState != null) {
            soTienLaiText.setText(savedInstanceState.getString("soTienLaiText"));
            tongSoTienText.setText(savedInstanceState.getString("tongSoTienText"));
        } else {
            soTienLaiText.setText(soTienLai);
            tongSoTienText.setText(tongSoTien);
        }

    }

    public void photoBtnClick(View view) {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
    }

    public void backClick(View view) {
        finish();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("soTienLaiText", soTienLaiText.getText().toString());
        outState.putString("tongSoTienText", tongSoTienText.getText().toString());
    }
}