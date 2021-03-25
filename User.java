/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.io.*;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author navni
 */
public abstract class User implements Serializable{
    protected String id;
    protected String name;
    protected String password;
    
    /**
     * Default user constructor
     */
    public User() {
        this.id = "";
        this.name = "";
        this.password = "1234";
    }
    
    /**
     * User constructor with all data members
     * @param id id of user
     * @param name name of user
     * @param password password of user
     */
    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    /**
     * Copies values from user 
     * @param c user class
     */
    public User(User c) {
        this.id = c.id;
        this.name = c.name;
        this.password = c.password;
    } 
    
    /**
     * Abstract method for sub classes to generate id
     * @return id
     */
    protected abstract String generateId();
    
    /**
     * Serializes a object to a ser file
     * @param path path of object
     * @param obj object that is being serialized
     * @throws FileNotFoundException exception if file isn't found
     * @throws IOException io exception thrown if error occurs when writing/reading
     */
    public static void serializeObject(String path, Object obj) throws FileNotFoundException, IOException {
        File outFile = new File(path);
        try (FileOutputStream fos = new FileOutputStream(outFile)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (Exception e) {
            System.out.printf("Exception Occured");
        }

    }
    
    /**
     * Reads the ser file
     * @param path path of object to read
     * @return Object that could be casted depending on contents of save file
     * @throws IOException exception thrown when writing/reading problem occurs
     * @throws ClassNotFoundException if class doesn't exist
     */
    public static Object deserializeObject(String path) throws IOException, ClassNotFoundException {
        File inFile = new File(path);
        try (FileInputStream fis = new FileInputStream(inFile)){
            ObjectInputStream ois = new ObjectInputStream(fis);
            return ois.readObject();
        } catch (Exception e) {
            System.out.printf("Something wrong: %s", e);
        }
        return null;
    }
 
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.password);
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
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
