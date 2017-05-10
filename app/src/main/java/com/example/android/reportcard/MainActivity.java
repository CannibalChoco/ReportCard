package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ReportCard myReportCard = new ReportCard();

        myReportCard.setMathGrade(6);
        myReportCard.setMathGrade(2);
        myReportCard.setLiteratureGrade(9);
        myReportCard.setLiteratureGrade(1);
        myReportCard.setEnglishGrade(8);
        myReportCard.setEnglishGrade(8);
        myReportCard.setBiologyGrade(10);
        myReportCard.setMusicGrade(7);
        myReportCard.setPhysicalEducationGrade(5);
        myReportCard.setPhysicalEducationGrade(5);

        Log.v("ReportCard", myReportCard.toString());

    }
}
