package com.example.vaio.spend_wisely;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button signIn ,signUp;
    EditText password , Email ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.password);
        signIn = (Button) findViewById(R.id.signIn);
        signUp = (Button) findViewById(R.id.signUp);

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.signIn:
                startActivity(new Intent(this,calendar.class));
                break;

            case R.id.signUp:
                startActivity(new Intent(this,signup.class));
                break;
        }


    }
}
