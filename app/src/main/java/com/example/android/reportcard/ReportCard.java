package com.example.android.reportcard;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.name;

/**
 * Created by Kristine on 08.05.2017.
 *
 * Java class of a Report Card.
 */

public class ReportCard {

    /**
     * The teacher and the subject share the same index
     */
    private int literatureIndex = 0;
    private int latvianIndex = 1;
    private int englishIndex = 2;
    private int musicIndex = 3;
    private int mathIndex = 4;
    private int physicsIndex = 5;
    private int biologyIndex = 6;
    private int chemistryIndex = 7;

    private String[] subjects = new String[8];
    private String[] subjectTeachers = new String[8];

    /**
     * Store Subject grades in ArrayLists
     */
    private List<Integer> literature = new ArrayList<Integer>();
    private List<Integer> latvian = new ArrayList<Integer>();
    private List<Integer> english = new ArrayList<Integer>();
    private List<Integer> music = new ArrayList<Integer>();
    private List<Integer> math = new ArrayList<Integer>();
    private List<Integer> physics = new ArrayList<Integer>();
    private List<Integer> biology = new ArrayList<Integer>();
    private List<Integer> chemistry = new ArrayList<Integer>();

    /**
     * Create a new ReportCard object.
     */
    public ReportCard() {
        subjects[literatureIndex] = "Literature";
        subjects[latvianIndex] = "Latvian";
        subjects[englishIndex] = "English";
        subjects[musicIndex] = "Music";
        subjects[mathIndex] = "Math";
        subjects[physicsIndex] = "Physics";
        subjects[biologyIndex] = "Biology";
        subjects[chemistryIndex] = "Chemistry";
    }

    /**
     * Get all subjects
     */
    public String getAllSubjects(){
        String allSubjects = "";

        for(int i = 0, n = subjects.length; i < n; i++){
            allSubjects += subjects[i] + "\n";
        }

        return allSubjects;
    }

    /**
     * Set teachers
     */
    public void setLiteratureTeacher(String name) {
        subjectTeachers[literatureIndex] = name;
    }

    public void setLatvianTeacher(String name) {
        subjectTeachers[latvianIndex] = name;
    }

    public void setEnglishTeacher(String name) {
        subjectTeachers[englishIndex] = name;
    }

    public void setMusicTeacher(String name) {
        subjectTeachers[musicIndex] = name;
    }

    public void setMathTeacher(String name) {
        subjectTeachers[mathIndex] = name;
    }

    public void setPhysicsTeacher(String name) {
        subjectTeachers[physicsIndex] = name;
    }

    public void setBiologyTeacher(String name) {
        subjectTeachers[biologyIndex] = name;
    }

    public void setChemistryTeacher(String name) {
        subjectTeachers[chemistryIndex] = name;
    }

    /**
     * Get teachers
     */
    public String getAllTeachers(){
        String allTeachers = "";

        for(int i = 0, n = subjectTeachers.length; i < n; i++){
            allTeachers += subjectTeachers[i] + "\n";
        }

        return allTeachers;
     }

    public String getLiteratureTeacher() {
        if (subjectTeachers[literatureIndex] == null) {
            return "not added";
        }

        return subjectTeachers[literatureIndex];
    }

    public String getLatvianTeacher() {
        if (subjectTeachers[latvianIndex] == null) {
            return "not added";
        }

        return subjectTeachers[latvianIndex];
    }

    public String getEnglishTeacher() {
        if (subjectTeachers[englishIndex] == null) {
            return "not added";
        }

        return subjectTeachers[englishIndex];
    }

    public String getMusicTeacher() {
        if (subjectTeachers[musicIndex] == null) {
            return "not added";
        }

        return subjectTeachers[musicIndex];
    }

    public String getMathTeacher() {
        if (subjectTeachers[mathIndex] == null) {
            return "not added";
        }

        return subjectTeachers[mathIndex];
    }

    public String getPhysicsTeacher() {
        if (subjectTeachers[physicsIndex] == null) {
            return "not added";
        }

        return subjectTeachers[physicsIndex];
    }

    public String getBiologyTeacher() {
        if (subjectTeachers[biologyIndex] == null) {
            return "not added";
        }

        return subjectTeachers[biologyIndex];
    }

    public String getChemistryTeacher() {
        if (subjectTeachers[chemistryIndex] == null) {
            return "not added";
        }

        return subjectTeachers[chemistryIndex];
    }

    /**
     * @return a string with all grades
     * or "no grades" if no grades have been added
     */
    public String getAllMathGrades() {
        String grades = "";

        if (math.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = math.size(); i < n; i++) {
            grades += math.get(i) + " ";
        }

        return grades;
    }

    public String getAllLiteratureGrades() {
        String grades = "";

        if (literature.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = literature.size(); i < n; i++) {
            grades += literature.get(i) + " ";
        }

        return grades;
    }

    public String getAllLatvianGrades() {
        String grades = "";

        if (latvian.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = latvian.size(); i < n; i++) {
            grades += latvian.get(i) + " ";
        }

        return grades;
    }

    public String getAllBiologyGrades() {
        String grades = "";

        if (biology.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = biology.size(); i < n; i++) {
            grades += biology.get(i) + " ";
        }

        return grades;
    }

    public String getAllPhysicsGrades() {
        String grades = "";

        if (physics.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = physics.size(); i < n; i++) {
            grades += physics.get(i) + " ";
        }

        return grades;
    }

    public String getAllChemistryGrades() {
        String grades = "";

        if (chemistry.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = chemistry.size(); i < n; i++) {
            grades += chemistry.get(i) + " ";
        }

        return grades;
    }

    public String getAllEnglishGrades() {
        String grades = "";

        if (english.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = english.size(); i < n; i++) {
            grades += english.get(i) + " ";
        }

        return grades;
    }

    public String getAllMusicGrades() {
        String grades = "";

        if (music.size() == 0) {
            return grades + "no grades";
        }

        for (int i = 0, n = music.size(); i < n; i++) {
            grades += music.get(i) + " ";
        }

        return grades;
    }

    /**
     * @return a string with the final grade
     * or empty string if no grades have been added
     */
    public String getFinalMathGrade() {
        if (math.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = math.size();

        for (i = 0; i < n; i++) {
            finalGrade += math.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalLiteratureGrade() {
        if (literature.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = literature.size();

        for (i = 0; i < n; i++) {
            finalGrade += literature.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalLatvianGrade() {
        if (latvian.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = latvian.size();

        for (i = 0; i < n; i++) {
            finalGrade += latvian.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalBiologyGrade() {
        if (biology.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = biology.size();

        for (i = 0; i < n; i++) {
            finalGrade += biology.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalMusicGrade() {
        if (music.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = music.size();

        for (i = 0; i < n; i++) {
            finalGrade += music.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalEnglishGrade() {
        if (english.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = english.size();

        for (i = 0; i < n; i++) {
            finalGrade += english.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalPhysicsGrade() {
        if (physics.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = physics.size();

        for (i = 0; i < n; i++) {
            finalGrade += physics.get(i);
        }

        return "" + finalGrade / n;
    }

    public String getFinalChemistryGrade() {
        if (chemistry.size() == 0) {
            return "no grades";
        }

        int finalGrade = 0;
        int i, n = chemistry.size();

        for (i = 0; i < n; i++) {
            finalGrade += chemistry.get(i);
        }

        return "" + finalGrade / n;
    }

    /**
     * Appends the subject ArrayList with a grade
     */
    public void setMathGrade(int grade) {
        math.add(grade);
    }

    public void setLiteratureGrade(int grade) {
        literature.add(grade);
    }

    public void setLatvianGrade(int grade) {
        latvian.add(grade);
    }

    public void setBiologyGrade(int grade) {
        biology.add(grade);
    }

    public void setMusicGrade(int grade) {
        music.add(grade);
    }

    public void setEnglishGrade(int grade) {
        english.add(grade);
    }

    public void setPhysicsGrade(int grade) {
        physics.add(grade);
    }

    public void setChemistryGrade(int grade) {
        chemistry.add(grade);
    }

    /**
     * Creates a summary of the report card class.
     *
     * @return report card contents
     */
    public String toString() {
        String reportCard =
                "Literature" + "\n\t\t" +
                        "Teacher: " + getLiteratureTeacher() + "\n\t\t" +
                        "Grades: " + getAllLiteratureGrades() + "\n\t\t" +
                        "Final grade: " + getFinalLiteratureGrade() + "\n" +
                        "Latvian" + "\n\t\t" +
                        "Teacher: " + getLatvianTeacher() + "\n\t\t" +
                        "Grades: " + getAllLatvianGrades() + "\n\t\t" +
                        "Final grade: " + getFinalLatvianGrade() + "\n" +
                        "English" + "\n\t\t" +
                        "Teacher: " + getEnglishTeacher() + "\n\t\t" +
                        "Grades: " + getAllEnglishGrades() + "\n\t\t" +
                        "Final grade: " + getFinalEnglishGrade() + "\n" +
                        "Music" + "\n\t\t" +
                        "Teacher: " + getMusicTeacher() + "\n\t\t" +
                        "Grades: " + getAllMusicGrades() + "\n\t\t" +
                        "Final grade: " + getFinalMusicGrade() + "\n" +
                        "Math" + "\n\t\t" +
                        "Teacher: " + getMathTeacher() + "\n\t\t" +
                        "Grades: " + getAllMathGrades() + "\n\t\t" +
                        "Final grade: " + getFinalMathGrade() + "\n" +
                        "Physics" + "\n\t\t" +
                        "Teacher: " + getPhysicsTeacher() + "\n\t\t" +
                        "Grades: " + getAllPhysicsGrades() + "\n\t\t" +
                        "Final grade: " + getFinalPhysicsGrade() + "\n" +
                        "Biology" + "\n\t\t" +
                        "Teacher: " + getBiologyTeacher() + "\n\t\t" +
                        "Grades: " + getAllBiologyGrades() + "\n\t\t" +
                        "Final grade: " + getFinalBiologyGrade() + "\n" +
                        "Chemistry" + "\n\t\t" +
                        "Teacher: " + getChemistryTeacher() + "\n\t\t" +
                        "Grades: " + getAllChemistryGrades() + "\n\t\t" +
                        "Final grade: " + getFinalChemistryGrade();

        return reportCard;
    }
}