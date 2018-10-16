package com.example.kelseydonovan.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openmmb2582newest();
            }
        });

    }
    public void openmmb2582newest() {

        Intent intent = new Intent(this, mmb2582newest.class);
        startActivity(intent);
    }
}
