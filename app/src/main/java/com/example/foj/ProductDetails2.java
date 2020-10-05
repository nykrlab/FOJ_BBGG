package com.example.foj;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ProductDetails2 extends Activity {
    ImageView btnbuy0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productdetails2);

        btnbuy0 = findViewById(R.id.btnbuy0);

        btnbuy0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetails2.this, Buying2.class);
                startActivity(intent);
            }
        });


    }
}




