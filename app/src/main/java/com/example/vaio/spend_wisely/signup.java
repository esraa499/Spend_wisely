package com.example.vaio.spend_wisely;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class signup extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner , spinnerStatus , spinnerHouse , spinnerTenure;
    Button signUp;
    EditText Email , password , Name , Location , numHouse ;

    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    ArrayAdapter<CharSequence> adapter4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        Email = (EditText) findViewById(R.id.Email);
        password = (EditText) findViewById(R.id.password);
        Name = (EditText) findViewById(R.id.Name);
        Location = (EditText) findViewById(R.id.Location);
        numHouse = (EditText) findViewById(R.id.numHouse);


        spinnerStatus = (Spinner) findViewById(R.id.spinnerStatus);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.martial_status, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStatus.setAdapter(adapter2);


        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.Gender_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinnerHouse = (Spinner) findViewById(R.id.spinnerHouse);
        adapter3 = ArrayAdapter.createFromResource(this, R.array.type_housing, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHouse.setAdapter(adapter3);


        spinnerTenure = (Spinner) findViewById(R.id.spinnerTenure);
        adapter4 = ArrayAdapter.createFromResource(this, R.array.tenure_housing, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTenure.setAdapter(adapter4);


        signUp=(Button)findViewById(R.id.signUp);


        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.signUp:
                startActivity(new Intent(this,calendar.class));
                break;
        }}

}