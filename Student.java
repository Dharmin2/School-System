/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author navni
 */
public class Student extends User {

    private List<Course> regCourses;
    private static int nextId;
    
    /**
     * Default constructor for student
     */
    public Student() {
        super();
        this.regCourses = new ArrayList<>();
    }
    
    /**
     * Student constructor with all parameters
     * @param regCourses registered courses for a student
     * @param id id of student uses generateID
     * @param name name of student
     * @param password password of student 
     */
    public Student(List<Course> regCourses, String id, String name, String password) {
        super(id, name, password);
        this.id = generateId();
        this.regCourses = regCourses;
    }
    
    /**
     * copies values of a student
     * @param c parameter of student type
     */
    public Student(Student c) {
        super(c);
        this.regCourses = c.regCourses;
    }
    
    /**
     * Generates id for student starts with S
     * @return id
     */
    @Override
    protected String generateId() {
        return String.format("S%04d", nextId++);

    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "Student{" + "regCourses=" + regCourses + '}';
        return str;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.regCourses);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.regCourses, other.regCourses)) {
            return false;
        }
        return true;
    }

    public List<Course> getRegCourses() {
        return regCourses;
    }

    public void setRegCourses(List<Course> regCourses) {
        this.regCourses = regCourses;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

}
