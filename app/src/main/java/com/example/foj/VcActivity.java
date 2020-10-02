package com.example.foj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class VcActivity extends Activity {
    Button btnVC;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vc);

        btnVC = findViewById(R.id.btnVC);
        btnVC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VcActivity.this,myVC.class);
                startActivity(intent);
            }
        });

    }
}
