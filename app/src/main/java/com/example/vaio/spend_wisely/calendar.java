package com.example.vaio.spend_wisely;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class calendar extends AppCompatActivity {

    CalendarView calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calender = (CalendarView) findViewById(R.id.calendar);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {


            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int DayOfMonth) {

                Toast.makeText(getApplicationContext(), DayOfMonth + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }


        });

    }
}