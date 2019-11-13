package com.example.php_simple_con;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bttn_sqlConn;
    //BE CAREFUL: IP of the php/mysql installation needed. Get the IP of the net card.
    // 127.0.0.1 or "localhost" DO NOT WORK
    final String link="http://192.168.1.143:8080/sqli/getSimple.php?name=Johnson";
    final String simple="http://192.168.1.143:8080/sqli/SimpleRes.php";
    final String connect="http://192.168.1.143/sqli/conn.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn_sqlConn= (Button)findViewById(R.id.bttnSQLCon);
        bttn_sqlConn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.v("george", "clicked on sql/php Button");
                phpConn phpC = new phpConn();
                try {
                    phpC.urlCon(connect);//connecting to dB
                    phpC.urlCon(link); //connecting to  sql/php
                    //TODO: Get the result from phpC here....
                } catch (Exception e){
                    Log.e("exception",e.toString());
                }
            }
        });
    }
}
