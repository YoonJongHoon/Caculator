package com.yoon.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initUI() {
        final int[] btnIds = {
                R.id.btn_1,
                R.id.btn_2,
                R.id.btn_3,
                R.id.btn_4,
                R.id.btn_5,
                R.id.btn_6,
                R.id.btn_7,
                R.id.btn_8,
                R.id.btn_9,
                R.id.btn_c,
                R.id.btn_cls,
                R.id.btn_minus,
                R.id.btn_plus,
                R.id.btn_multiple,
                R.id.btn_divide,
        };
        for (int id : btnIds) {
            Button btn =  (Button) findViewById(id);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String buttonText = ((Button) v).getText().toString();
                    Toast.makeText(MainActivity.this, buttonText, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
