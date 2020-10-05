package com.example.foj;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

import foundation.icon.icx.IconService;
import foundation.icon.icx.KeyWallet;
import foundation.icon.icx.data.Bytes;
import foundation.icon.icx.transport.http.HttpProvider;

import static java.lang.Math.pow;

public class Myaccount2 extends Activity {

    ImageView btnprfl, btnprdct, btnordr, btnpymnt;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount2);

        btnprfl = findViewById(R.id.btnprfl);
        btnprdct = findViewById(R.id.btnprdct);
        btnordr = findViewById(R.id.btnordr);
        btnpymnt = findViewById(R.id.btnpymnt);

        btnprfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Myaccount2.this, profileActivity.class);
                startActivity(intent);
            }
        });
        btnprdct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Myaccount2.this, ProductList1.class);
                startActivity(intent);
            }
        });
        btnordr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Myaccount2.this, OrderList.class);
                startActivity(intent);
            }
        });
        btnpymnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Myaccount2.this, Wallet.class);
                startActivity(intent);
            }
        });
    }
}
