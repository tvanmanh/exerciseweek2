package manh.learn.com.lession_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Setting_Activity extends AppCompatActivity implements View.OnClickListener {

    private String color = "pink";

    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;
    private ImageView iv5;
    private ImageView iv6;

    private View viewSample;
    private EditText edt;

    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_);
        initComponents();
        CreateEvent();
    }

    public void initComponents() {
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 =  (ImageView)findViewById(R.id.iv2);
        iv3  = (ImageView)findViewById(R.id.iv3);
        iv4 =  (ImageView)findViewById(R.id.iv4);
        iv5 =  (ImageView)findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);

        viewSample = (View) findViewById(R.id.viewSample);
        edt =( EditText) findViewById(R.id.edt);

        btnSave = (Button) findViewById(R.id.btnSave);

    }

    public void CreateEvent() {
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);

        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.iv1:
                viewSample.setBackgroundResource(R.color.pink);
                color = "pink";
                break;
            case R.id.iv2:
                viewSample.setBackgroundResource(R.color.purple);
                color = "purple";
                Toast.makeText(this, color, Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv3:
                viewSample.setBackgroundResource(R.color.indigo);
                color = "indigo";
                break;
            case R.id.iv4:
                viewSample.setBackgroundResource(R.color.blue);
                color = "blue";
                break;
            case R.id.iv5:
                viewSample.setBackgroundResource(R.color.teal);
                color = "teal";
                break;
            case R.id.iv6:
                viewSample.setBackgroundResource(R.color.green);
                color = "green";
                break;
            case R.id.btnSave:
                Intent intent = new Intent();
                intent.putExtra("key_string", edt.getText().toString());
                intent.putExtra("key_color", color.toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            default:
                break;

        }


    }
}
