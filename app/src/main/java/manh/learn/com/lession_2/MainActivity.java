package manh.learn.com.lession_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static int REQUEST_ACT_SETTING = 10;
    private TextView tvText;
    private Button btnChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = (TextView) findViewById(R.id.tvtext);
        btnChangeText = (Button) findViewById(R.id.btnchangetile);
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Setting_Activity.class);
                startActivityForResult(intent, REQUEST_ACT_SETTING);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_ACT_SETTING)
            if (resultCode == RESULT_OK) {

                tvText.setText(data.getStringExtra("key_string"));
                String color = data.getStringExtra("key_color");
                switch (color) {
                    case "pink":
                        tvText.setTextColor(getResources().getColor(R.color.pink));
                        break;
                    case "purple":
                        tvText.setTextColor(getResources().getColor(R.color.purple));
                        break;
                    case "indigo":
                        tvText.setTextColor(getResources().getColor(R.color.indigo));
                        break;
                    case "blue":
                        tvText.setTextColor(getResources().getColor(R.color.blue));
                        break;
                    case "teal":
                        tvText.setTextColor(getResources().getColor(R.color.teal));
                        break;
                    case "green":
                        tvText.setTextColor(getResources().getColor(R.color.green));
                        break;
                    default:
                        tvText.setTextColor(getResources().getColor(R.color.pink));
                        break;
                }
            }
    }
}
