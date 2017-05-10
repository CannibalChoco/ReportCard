package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by Kristine on 08.05.2017.
 */

public class ReportCard {

    /**
     * Store Subject grades in ArrayLists
     */
    private ArrayList<Integer> Math = new ArrayList<Integer>();
    private ArrayList<Integer> Literature = new ArrayList<Integer>();
    private ArrayList<Integer> Latvian = new ArrayList<Integer>();
    private ArrayList<Integer> Art = new ArrayList<Integer>();
    private ArrayList<Integer> Biology = new ArrayList<Integer>();
    private ArrayList<Integer> Music = new ArrayList<Integer>();
    private ArrayList<Integer> PhysicalEducation = new ArrayList<Integer>();
    private ArrayList<Integer> English = new ArrayList<Integer>();

    /**
     *  Create a new ReportCard object.
     */
    public ReportCard() {
    }

    /**
     * Gets the final int value of a subject.
     *
     * @return final grade
     */
    public int getMathFinalGrade(){
        int finalGrade = 0;
        int i, n = Math.size();

        for (i = 0; i < n; i++){
            finalGrade += Math.get(i);
        }

        return finalGrade / n;
    }

    public int getLiteratureFinalGrade(){
        int finalGrade = 0;
        int i, n = Literature.size();

        for (i = 0; i < n; i++){
            finalGrade += Literature.get(i);
        }

        return finalGrade / n;
    }

    public int getLatvianFinalGrade(){
        int finalGrade = 0;
        int i, n = Latvian.size();

        for (i = 0; i < n; i++){
            finalGrade += Latvian.get(i);
        }

        return finalGrade / n;
    }

    public int getArtFinalGrade(){
        int finalGrade = 0;
        int i, n = Art.size();

        for (i = 0; i < n; i++){
            finalGrade += Art.get(i);
        }

        return finalGrade / n;
    }

    public int getBiologyFinalGrade(){
        int finalGrade = 0;
        int i, n = Biology.size();

        for (i = 0; i < n; i++){
            finalGrade += Biology.get(i);
        }

        return finalGrade / n;
    }

    public int getMusicFinalGrade(){
        int finalGrade = 0;
        int i, n = Music.size();

        for (i = 0; i < n; i++){
            finalGrade += Music.get(i);
        }

        return finalGrade / n;
    }

    public int getPhysicalEducationFinalGrade(){
        int finalGrade = 0;
        int i, n = PhysicalEducation.size();

        for (i = 0; i < n; i++){
            finalGrade += PhysicalEducation.get(i);
        }

        return finalGrade / n;
    }

    public int getEnglishFinalGrade(){
        int finalGrade = 0;
        int i, n = English.size();

        for (i = 0; i < n; i++){
            finalGrade += English.get(i);
        }

        return finalGrade / n;
    }

    /**
     * Appends the subject ArrayList with a grade
     */
    public void setMathGrade(int grade){
        Math.add(grade);
    }

    public void setLiteratureGrade(int grade){
        Literature.add(grade);
    }

    public void setLatvianGrade(int grade){
        Latvian.add(grade);
    }

    public void setArtGrade(int grade){
        Art.add(grade);
    }

    public void setBiologyGrade(int grade){
        Biology.add(grade);
    }

    public void setMusicGrade(int grade){
        Music.add(grade);
    }

    public void setPhysicalEducationGrade(int grade){
        PhysicalEducation.add(grade);
    }

    public void setEnglishGrade(int grade){
        English.add(grade);
    }
}