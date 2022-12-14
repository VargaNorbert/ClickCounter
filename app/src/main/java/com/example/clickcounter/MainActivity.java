package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plusz,minusz;
    private TextView szam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusz= findViewById(R.id.plusz);
        minusz= findViewById(R.id.minusz);
        szam=findViewById(R.id.szam);

       plusz.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int a =Integer.parseInt(szam.getText().toString()) ;

               a++;
               szam.setText(String.valueOf(a));
               szam.setTextColor(color());
           }
       });

        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =Integer.parseInt(szam.getText().toString()) ;

                a--;
                szam.setText(String.valueOf(a));
                szam.setTextColor(color());
            }
        });

        szam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                szam.setText("0");
                szam.setTextColor(color());

            }
        });



    }

    public int color(){
        if (Integer.parseInt(szam.getText().toString())==0){
            return Color.BLUE;
        }else if(Integer.parseInt(szam.getText().toString())<0){
            return Color.RED;
        }else {
            return Color.GREEN;
        }
    }
}