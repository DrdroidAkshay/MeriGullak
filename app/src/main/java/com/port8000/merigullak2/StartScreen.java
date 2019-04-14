package com.port8000.merigullak2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {
    Button Loginbtn, Registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Loginbtn = (Button) findViewById(R.id.loginbtn);
        Registerbtn = (Button) findViewById(R.id.registerbtn);


        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Loginbtn.setBackgroundResource(R.drawable.buttonstyle_yellow);
                Intent i =new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);

            }
        });
        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registerbtn.setBackgroundResource(R.drawable.buttonstyle_blue);
                Intent i =new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
