package com.example.kelseydonovan.helloworld;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class mmb2582__2 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmb2582__2);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                openMainActivity ();
            }
        });

        }

        public void openMainActivity() {

            Intent intent = new Intent ( this, MainActivity.class );
            startActivity(intent);
    }

}
