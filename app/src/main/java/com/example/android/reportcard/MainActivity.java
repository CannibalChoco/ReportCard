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
        myReportCard.setLatvianGrade(9);
        myReportCard.setArtGrade(7);
        myReportCard.setEnglishGrade(8);
        myReportCard.setEnglishGrade(8);
        myReportCard.setBiologyGrade(10);
        myReportCard.setMusicGrade(7);
        myReportCard.setPhysicalEducationGrade(5);
        myReportCard.setPhysicalEducationGrade(5);

        Log.v("ReportCard", "Math final grade = " + myReportCard.getMathFinalGrade());
        Log.v("ReportCard", "Literature final grade = " + myReportCard.getLiteratureFinalGrade());
        Log.v("ReportCard", "Latvian final grade = " + myReportCard.getLatvianFinalGrade());
        Log.v("ReportCard", "Art final grade = " + myReportCard.getArtFinalGrade());
        Log.v("ReportCard", "English final grade = " + myReportCard.getEnglishFinalGrade());
        Log.v("ReportCard", "Biology final grade = " + myReportCard.getBiologyFinalGrade());
        Log.v("ReportCard", "Music final grade = " + myReportCard.getMusicFinalGrade());
        Log.v("ReportCard", "Physica education final grade = " + myReportCard.getPhysicalEducationFinalGrade());

    }
}
