package com.iics.ust.espinosa_labexercise01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    Button btnCompute;
    EditText editText_quiz1;
    EditText editText_quiz2;
    EditText editText_seatworks;
    EditText editText_labExercises;
    EditText editText_majorExams;
    double myRA;
    String myFG;
    String myStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnCompute = (Button) findViewById(R.id.btnCompute);

        editText_quiz1 = (EditText) findViewById(R.id.editText_quiz1);
        editText_quiz2 = (EditText) findViewById(R.id.editText_quiz2);
        editText_seatworks = (EditText) findViewById(R.id.editText_seatworks);
        editText_labExercises = (EditText) findViewById(R.id.editText_labExercises);
        editText_majorExams = (EditText) findViewById(R.id.editText_majorExam);
    }

    public void toSecondActivity(View view) {

        double quiz1 = Double.parseDouble(editText_quiz1.getText().toString()) * 0.1;
        double quiz2 = Double.parseDouble(editText_quiz2.getText().toString()) * 0.1;
        double seatworks = Double.parseDouble(editText_seatworks.getText().toString()) * 0.1;
        double labExercises = Double.parseDouble(editText_labExercises.getText().toString()) * 0.4;
        double majorExams = Double.parseDouble(editText_majorExams.getText().toString()) * 0.3;

        myRA = quiz1 + quiz2 + seatworks + labExercises + majorExams;

        if (myRA < 60) {
            myFG = "Failed";
            myStats = "It's ok, mistakes can be learned from your mistakes :)";
        } else if (myRA > 60 && myRA <= 65) {
            myFG = "3.0";
            myStats = "Sabit! At least you kept a good job";
        } else if (myRA > 65 && myRA <= 70) {
            myFG = "2.75";
            myStats = "Good job!";
        } else if (myRA > 70 && myRA <= 75) {
            myFG = "2.5";
            myStats = "Great job!";
        } else if (myRA > 75 && myRA <= 80) {
            myFG = "2.25";
            myStats = "Nice job!";
        } else if (myRA > 80 && myRA <= 85) {
            myFG = "2.0";
            myStats = "Well done!";
        } else if (myRA > 85 && myRA <= 90) {
            myFG = "1.75";
            myStats = "Very Nice grade! Congratsulations";
        } else if (myRA > 90 && myRA <= 92) {
            myFG = "1.5";
            myStats = "Amazing grade! Congratsulations";
        } else if (myRA > 92 && myRA <= 94) {
            myFG = "1.25";
            myStats = "Fantastic grade! Congratsulations";
        } else if (myRA > 94 && myRA <= 100) {
            myFG = "1.0";
            myStats = "Congratsulations!\nProfessor Alex will be proud of you :)";
        } else if (myRA > 100) {
            myFG = "1.0";
            myStats = "Where is this grade came from?\n Hahaha!";
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("ra", myRA);
        intent.putExtra("fg", myFG);
        intent.putExtra("stats", myStats);
        startActivity(intent);

    }

}
