package com.example.foj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class OrderList extends Activity {
    LinearLayout btnhlb;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderlist);

        btnhlb = findViewById(R.id.btnhlb);

        btnhlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (OrderList.this,OrderDetails.class);
                startActivity(intent);
            }
        });


    }
}
