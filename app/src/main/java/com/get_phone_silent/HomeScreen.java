package com.get_phone_silent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    Toolbar toolbar;
    TextView titleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initToolBar();
        titleText= (TextView) findViewById(R.id.toolbar_title_text);
        titleText.setText("Get Phone Silent");
    }

    /*Method to in initialize toolbar*/
    private void initToolBar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
    }
}
