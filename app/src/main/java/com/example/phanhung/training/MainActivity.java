package com.example.phanhung.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tva, tvb, tvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tva=(TextView)findViewById(R.id.tva);
        tvb=(TextView)findViewById(R.id.tvb);
        tvc=(TextView)findViewById(R.id.tvc);
            printNumber();

    }

   public void printNumber(){

        for (int i= 0; i <= 100; i++){
            if (i%3 == 0 && i%5 ==0){
                Log.d("!!", "fizzbuzz");

            }else if (i%3 == 0){
                Log.d("!!", "fizz");

            }else if (i%5 ==0){
                Log.d("!!", "buzz");
            }else
            Log.d("!!", i+"");
        }

   }

}
