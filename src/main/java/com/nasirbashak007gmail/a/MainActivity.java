package com.nasirbashak007gmail.a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private static final android.R.attr R = ;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showToast= (Button)findViewById(R.id.button_toast);
        showToast.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Hey i will kill you" , Toast.LENGTH_SHORT).show();

                    }
                }
        );

        final TextView showCount =(TextView)findViewById(R.id.text_count);
        Button count_click =(Button)findViewById(R.id.button_counter);
        count_click.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        count++;
                        String c= String.valueOf(count);
                        showCount.setText(c);
                        Toast.makeText(MainActivity.this,"you just clicked " + count + " times",Toast.LENGTH_SHORT).show();
                    }
                }

        );


    }
}
