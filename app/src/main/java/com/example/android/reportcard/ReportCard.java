package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by Kristine on 08.05.2017.
 *
 * Java class of a Report Card. Class methods check for empty ArrayLists
 * to prevent the app from crashing.
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
     * Gets all Math grades
     *
     * @return a string with Math grades
     * or "no grades" if no grades have been added
     */
    public String getMathGrades(){
        String grades = "Math: ";

        if (Math.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = Math.size(); i < n; i++){
            grades += Math.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all Literature grades
     *
     * @return a string with all Literature grades
     * or "no grades" if no grades have been added
     */
    public String getLiteratureGrades(){
        String grades = "Literature: ";

        if (Literature.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = Literature.size(); i < n; i++){
            grades += Literature.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all Latvian grades
     *
     * @return a string with all Latvian grades
     * or "no grades" if no grades have been added
     */
    public String getLatvianGrades(){
        String grades = "Latvian: ";

        if (Latvian.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = Latvian.size(); i < n; i++){
            grades += Latvian.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all Art grades
     *
     * @return a string with all Art grades
     * or "no grades" if no grades have been added
     */
    public String getArtGrades(){
        String grades = "Art: ";

        if (Art.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = Art.size(); i < n; i++){
            grades += Art.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all Biology grades
     *
     * @return a string with all Biology grades
     * or "no grades" if no grades have been added
     */
    public String getBiologyGrades(){
        String grades = "Biology: ";

        if (Biology.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = Biology.size(); i < n; i++){
            grades += Biology.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all Music grades
     *
     * @return a string with all Music grades
     * or "no grades" if no grades have been added
     */
    public String getMusicGrades(){
        String grades = "Music: ";

        if (Music.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = Music.size(); i < n; i++){
            grades += Music.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all PhysicalEducation grades
     *
     * @return a string with all PhysicalEducation grades
     * or "no grades" if no grades have been added
     */
    public String getPhysicalEducationGrades(){
        String grades = "Physical Education: ";

        if (PhysicalEducation.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = PhysicalEducation.size(); i < n; i++){
            grades += PhysicalEducation.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets all English grades
     *
     * @return a string with all English grades
     * or "no grades" if no grades have been added
     */
    public String getEnglishGrades(){
        String grades = "English: ";

        if (English.size() == 0){
            return grades + "no grades";
        }

        for (int i = 0, n = English.size(); i < n; i++){
            grades += English.get(i) + " ";
        }

        return grades;
    }

    /**
     * Gets the final Math grade
     *
     * @return a string with the final Math grade
     * or empty string if no grades have been added
     */
    public String getMathFinalGrade(){
        if (Math.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = Math.size();

        for (i = 0; i < n; i++){
            finalGrade += Math.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Gets the final Literature grade
     *
     * @return a string with the final Literature grade
     * or empty string if no grades have been added
     */
    public String getLiteratureFinalGrade(){
        if (Literature.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = Literature.size();

        for (i = 0; i < n; i++){
            finalGrade += Literature.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Gets the final Latvian grade
     *
     * @return a string with the final Latvian grade
     * or empty string if no grades have been added
     */
    public String getLatvianFinalGrade(){
        if (Latvian.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = Latvian.size();

        for (i = 0; i < n; i++){
            finalGrade += Latvian.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Gets the final Art grade
     *
     * @return a string with the final Art grade
     * or empty string if no grades have been added
     */
    public String getArtFinalGrade(){
        if (Art.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = Art.size();

        for (i = 0; i < n; i++){
            finalGrade += Art.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }


    /**
     * Gets the final Biology grade
     *
     * @return a string with the final Biology grade
     * or empty string if no grades have been added
     */
    public String getBiologyFinalGrade(){
        if (Biology.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = Biology.size();

        for (i = 0; i < n; i++){
            finalGrade += Biology.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Gets the final Music grade
     *
     * @return a string with the final Music grade
     * or empty string if no grades have been added
     */
    public String getMusicFinalGrade(){
        if (Music.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = Music.size();

        for (i = 0; i < n; i++){
            finalGrade += Music.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Gets the final PhysicalEducation grade
     *
     * @return a string with the final PhysicalEducation grade
     * or empty string if no grades have been added
     */
    public String getPhysicalEducationFinalGrade(){
        if (PhysicalEducation.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = PhysicalEducation.size();

        for (i = 0; i < n; i++){
            finalGrade += PhysicalEducation.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Gets the final English grade
     *
     * @return a string with the final English grade,
     * or empty string if no grades have been added
     */
    public String getEnglishFinalGrade(){
        if (English.size() == 0){
            return "";
        }

        int finalGrade = 0;
        int i, n = English.size();

        for (i = 0; i < n; i++){
            finalGrade += English.get(i);
        }

        return "Final grade: " + finalGrade / n;
    }

    /**
     * Appends the Math ArrayList with a grade
     */
    public void setMathGrade(int grade){
        Math.add(grade);
    }

    /**
     * Appends the Literature ArrayList with a grade
     */
    public void setLiteratureGrade(int grade){
        Literature.add(grade);
    }

    /**
     * Appends the Latvian ArrayList with a grade
     */
    public void setLatvianGrade(int grade){
        Latvian.add(grade);
    }

    /**
     * Appends the Art ArrayList with a grade
     */
    public void setArtGrade(int grade){
        Art.add(grade);
    }

    /**
     * Appends the Biology ArrayList with a grade
     */
    public void setBiologyGrade(int grade){
        Biology.add(grade);
    }

    /**
     * Appends the Music ArrayList with a grade
     */
    public void setMusicGrade(int grade){
        Music.add(grade);
    }

    /**
     * Appends the PhysicalEducation ArrayList with a grade
     */
    public void setPhysicalEducationGrade(int grade){
        PhysicalEducation.add(grade);
    }

    /**
     * Appends the English ArrayList with a grade
     */
    public void setEnglishGrade(int grade){
        English.add(grade);
    }


    /**
     * Creates a summary of the report card class.
     * Each subject on it's own line
     *
     * @return report card summary
     */
    public  String toString(){
        String reportCard = getMathGrades() + " " + getMathFinalGrade() + "\n" +
                getLiteratureGrades() + " " + getLiteratureFinalGrade()+ "\n" +
                getLatvianGrades() + " " + getLatvianFinalGrade() + "\n" +
                getArtGrades() + " " + getArtFinalGrade() + "\n" +
                getBiologyGrades() + " " + getBiologyFinalGrade() + "\n" +
                getMusicGrades() + " " + getMusicFinalGrade() + "\n" +
                getPhysicalEducationGrades() + " " + getPhysicalEducationFinalGrade() + "\n" +
                getEnglishGrades() + " " + getEnglishFinalGrade();

        return reportCard;
    }
}