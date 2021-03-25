/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author navni
 */
public class Admin extends User {

    private static int nextId = 0;

    /**
     * Default Constructor
     */
    public Admin() {
        super();
        this.id = generateId();
    }

    /**
     * Constructor with all parameters
     * @param id can be initialized as anything will be reassigned to
     * auto generated value
     * @param name name of admin
     * @param password password of admin
     */
    public Admin(String id, String name, String password) {
        super(id, name, password);
        this.id = generateId();
    }
    
    /**
     * Creates a copy of an admin
     * @param c parameter of type Admin
     */
    public Admin(Admin c) {
        super(c);
    }
    
    /**
     * Generates id for Admin starts with A
     * @return id
     */
    @Override
    protected String generateId() {
        return String.format("A%04d", nextId++);
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Admin.nextId = nextId;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Course> courses = new ArrayList();
        List<Teacher> teachers = new ArrayList();
        Teacher teacher = new Teacher(courses,"ID","Name","Password");
        teachers.add(teacher);
        serializeObject("teacher.ser", teachers);
        teachers = (List<Teacher>) deserializeObject("teacher.ser");
        System.out.println(teachers);
    }
}
