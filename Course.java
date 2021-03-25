/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author navni
 */
public class Course implements Serializable{
    private String name;
    private int maxStuAmount;
    private Teacher teacher;
    private List<Student> regsStudents;
    private List<Double> finalScores;
    
    /**
     * Default constructor for course
     */
    public Course() {
        this.name = "";
        this.maxStuAmount = 0;
        this.teacher = new Teacher();
        this.regsStudents = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }
    
    /**
     * Course with all data members 
     * @param name name of course
     * @param maxStuAmount max student amount
     * @param teacher teacher of course
     * @param regsStudents list of registered students
     * @param finalScores list of scores for students
     */
    public Course(String name, int maxStuAmount, Teacher teacher,
            List<Student> regsStudents, List<Double> finalScores) {
        this.name = name;
        this.maxStuAmount = maxStuAmount;
        this.teacher = teacher;
        this.regsStudents = regsStudents;
        this.finalScores = finalScores;
    }
    
    /**
     * copies all the value of a course
     * @param c parameter of course type
     */
    public Course(Course c) {
        this.name = c.name;
        this.maxStuAmount = c.maxStuAmount;
        this.teacher = c.teacher;
        this.regsStudents = c.regsStudents;
        this.finalScores = c.finalScores;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStuAmount() {
        return maxStuAmount;
    }

    public void setMaxStuAmount(int maxStuAmount) {
        this.maxStuAmount = maxStuAmount;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getRegsStudents() {
        return regsStudents;
    }

    public void setRegsStudents(List<Student> regsStudents) {
        this.regsStudents = regsStudents;
    }

    public List<Double> getFinalScores() {
        return finalScores;
    }

    public void setFinalScores(List<Double> finalScores) {
        this.finalScores = finalScores;
    }

}