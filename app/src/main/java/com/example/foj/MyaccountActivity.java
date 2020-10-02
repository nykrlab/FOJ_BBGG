package com.example.foj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MyaccountActivity extends Activity {
    Button btnprfl, btnprdct, btnordr, btnpymnt;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount);

        btnprfl = findViewById(R.id.btnprfl);
        btnprdct = findViewById(R.id.btnprdct);
        btnordr = findViewById(R.id.btnordr);
        btnpymnt = findViewById(R.id.btnpymnt);


        btnprfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MyaccountActivity.this,profileActivity.class);
                startActivity(intent);
            }
        });
        btnprdct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MyaccountActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        btnordr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MyaccountActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        btnpymnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MyaccountActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
