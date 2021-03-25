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
public class Teacher extends User{

    private List<Course> teachingCourses;
    private static int nextId;
    
    /**
     * Default constructor for teacher
     */
    public Teacher() {
        super();
        this.teachingCourses = new ArrayList();
    }
    
    /**
     * Teacher constructor with all parameters
     * @param teachingCourses list of courses teacher teaches
     * @param id id of teacher
     * @param name name of teacher
     * @param password password of teacher
     */
    public Teacher(List<Course> teachingCourses, String id,
            String name, String password) {
        super(id, name, password);
        this.id = generateId();
        this.teachingCourses = teachingCourses;
    }
    
    /**
     * Copies values of a teacher
     * @param c parameter of teacher type
     */
    public Teacher(Teacher c) {
        super(c);
        this.teachingCourses = c.teachingCourses;
    }  
    
    /**
     * Generates id for teacher starts with T
     * @return id
     */
    @Override
    protected String generateId() {
        return String.format("T%04d", nextId++);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "Teacher{" + "teachingCourses=" + teachingCourses + '}';
        return str;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.teachingCourses);
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
        final Teacher other = (Teacher) obj;
        if (!Objects.equals(this.teachingCourses, other.teachingCourses)) {
            return false;
        }
        return true;
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Teacher.nextId = nextId;
    }

}
