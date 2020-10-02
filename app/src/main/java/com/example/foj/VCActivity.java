package com.example.foj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class VCActivity extends Activity {
    Button btnVC;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vc);

        btnVC = findViewById(R.id.btnVC);


        btnVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VCActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}