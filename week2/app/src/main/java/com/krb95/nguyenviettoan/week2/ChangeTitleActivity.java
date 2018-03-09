package com.krb95.nguyenviettoan.week2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangeTitleActivity extends AppCompatActivity {


    EditText edittext;
    View sample;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6;
    Button save;
    private String color="#D81B60";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title);
//        final Bundle  data= getIntent().getExtras();
//        if(data !=null)
//        {
//            String textvalue= data.getString("textview","");
//            int colorvalue= data.getInt("colorint",0);
//        }
        edittext= (EditText) findViewById(R.id.edt);
        save= (Button) findViewById(R.id.btnSave);
        iv1=(ImageView) findViewById(R.id.iv1);
        iv2=(ImageView) findViewById(R.id.iv2);
        iv3=(ImageView) findViewById(R.id.iv3);
        iv4=(ImageView) findViewById(R.id.iv4);
        iv5=(ImageView) findViewById(R.id.iv5);
        iv6=(ImageView) findViewById(R.id.iv6);
        sample=(View) findViewById(R.id.viewSample);
      //  edittext.setText(data.getString("textview").toString());

      //  sample.setBackgroundColor(data.getInt("colorint"));
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample.setBackgroundColor(Color.parseColor("#D81B60"));
                color= "#D81B60";
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample.setBackgroundColor(Color.parseColor("#8E24AA"));
                color= "#8E24AA";
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample.setBackgroundColor(Color.parseColor("#3949AB"));
                color= "#3949AB";
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample.setBackgroundColor(Color.parseColor("#1E88E5"));
                color= "#1E88E5";
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample.setBackgroundColor(Color.parseColor("#00897B"));
                color= "#00897B";
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample.setBackgroundColor(Color.parseColor("#43A047"));
                color= "#43A047";
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data= new Intent();
                data.putExtra("txtResult",edittext.getText().toString());
                data.putExtra("colorResult",color);
                setResult(RESULT_OK,data);
                finish();
            }
        });


    }
}
