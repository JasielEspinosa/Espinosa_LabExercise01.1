package com.iics.ust.espinosa_labexercise01;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnBack;
    TextView result_ra;
    TextView result_fg;
    TextView statusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = (Button) findViewById(R.id.btnBack);
        result_ra = (TextView) findViewById(R.id.result_ra);
        result_fg = (TextView) findViewById(R.id.result_fg);
        statusView = (TextView) findViewById(R.id.status);

        double myRA = getIntent().getDoubleExtra("ra", 0.00);
        String myFG = getIntent().getStringExtra("fg");
        String status = getIntent().getStringExtra("stats");

        String myRA_formatted = String.format("%,.2f", myRA);

        result_ra.setText("Your Raw Average is " + myRA_formatted);
        result_fg.setText("Your Final Grade is\n" + myFG);
        statusView.setText(status);

    }

    public void toFirstActivity(View view){

        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);

    }

}
