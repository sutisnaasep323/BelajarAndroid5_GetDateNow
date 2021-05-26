package com.example.belajarandroid5_getdatenow;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView dateFormat1,dateFormat2,dateFormat3;
    private Button getDate;

    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat1, simpleDateFormat2, simpleDateFormat3;
    private String date1, date2, date3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = Calendar.getInstance();
        getDate = findViewById(R.id.btn_clickhere);
        dateFormat1 = findViewById(R.id.teksDateFormat1);
        dateFormat2 = findViewById(R.id.teksDateFormat2);
        dateFormat3 = findViewById(R.id.teksDateFormat3);

        getDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleDateFormat1 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                simpleDateFormat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                simpleDateFormat3 = new SimpleDateFormat("E, dd/MM/yyyy HH:mm:ss");

                date1 = simpleDateFormat1.format(calendar.getTime());
                date2 = simpleDateFormat2.format(calendar.getTime());
                date3 = simpleDateFormat3.format(calendar.getTime());

                dateFormat1.setText(date1);
                dateFormat2.setText(date2);
                dateFormat3.setText(date3);
            }
        });
    }
}