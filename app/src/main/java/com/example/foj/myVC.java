package com.example.foj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class myVC extends Activity {

    /* seungho */
    /*EditText etVC;
    /* seungho */


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myvc);

        /* seungho */
        /*Intent intent = getIntent();
        String VC = intent.getExtras().getString("VC");
        Log.i("### VC", VC);

        etVC = findViewById(R.id.username);
        etVC.setText(VC);
        /* seungho */

    }
}
