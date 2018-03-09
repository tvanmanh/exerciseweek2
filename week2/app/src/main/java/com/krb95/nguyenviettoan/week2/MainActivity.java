package com.krb95.nguyenviettoan.week2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button btnbackground, btntitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview= (TextView) findViewById(R.id.textView);
        btnbackground=(Button) findViewById(R.id.btnChangeBackground);
        btntitle=(Button) findViewById(R.id.btnChangeTitle);
        btntitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color= textview.getCurrentTextColor();
                Intent i= new Intent(MainActivity.this, ChangeTitleActivity.class);
                startActivityForResult(i,REQUEST_ACT_CHANGETITLE);
            }
        });


    }
    private static final int REQUEST_ACT_CHANGETITLE=1000;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==REQUEST_ACT_CHANGETITLE){
            if(resultCode==RESULT_OK){
                String textviewresult= data.getStringExtra("txtResult");
                String color= data.getStringExtra("colorResult");
                textview= (TextView) findViewById(R.id.textView);
                textview.setText(textviewresult);
                textview.setTextColor(Color.parseColor(color));
            }
        }
    }
}
