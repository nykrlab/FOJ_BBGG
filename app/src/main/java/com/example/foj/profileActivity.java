package com.example.foj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class profileActivity extends Activity {
    Button btnmyprfl, btnvc, btnvp;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        btnmyprfl = findViewById(R.id.btnmyprfl);
        btnvc = findViewById(R.id.btnvc);
        btnvp = findViewById(R.id.btnvp);


        btnmyprfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (profileActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        btnvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (profileActivity.this,VcActivity.class);
                startActivity(intent);
            }
        });
        btnvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (profileActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
