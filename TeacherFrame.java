/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.awt.Color;
import java.io.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author navni
 */
public class TeacherFrame extends javax.swing.JFrame {
private static Teacher teacher;
    /**
     * Creates new form TeacherFrame
     */
    public TeacherFrame(Teacher teacher) {
        initComponents();
        this.setTitle("Teacher");               
        welcomeL.setText(("Welcome: ") + teacher.getName());
        this.teacher = teacher;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeL = new javax.swing.JLabel();
        addAScoreL = new javax.swing.JLabel();
        exportB = new javax.swing.JButton();
        displayB = new javax.swing.JButton();
        messageL = new javax.swing.JLabel();
        displayL = new javax.swing.JLabel();
        addScorePanel = new javax.swing.JPanel();
        scoreL = new javax.swing.JLabel();
        scoreTF = new javax.swing.JTextField();
        courseL = new javax.swing.JLabel();
        courseTF = new javax.swing.JTextField();
        studentL = new javax.swing.JLabel();
        studentTF = new javax.swing.JTextField();
        addB = new javax.swing.JButton();
        displayP = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeL.setText("Welcome");

        addAScoreL.setText("Add a Score");

        exportB.setText("Export");
        exportB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBActionPerformed(evt);
            }
        });

        displayB.setText("Display");
        displayB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBActionPerformed(evt);
            }
        });

        displayL.setText("Display");

        scoreL.setText("Score");

        scoreTF.setText("Enter Score");

        courseL.setText("Course");

        courseTF.setText("Enter Course");
        courseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTFActionPerformed(evt);
            }
        });

        studentL.setText("Student");

        studentTF.setText("Enter Student");

        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addScorePanelLayout = new javax.swing.GroupLayout(addScorePanel);
        addScorePanel.setLayout(addScorePanelLayout);
        addScorePanelLayout.setHorizontalGroup(
            addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addScorePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addScorePanelLayout.createSequentialGroup()
                        .addComponent(courseL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addScorePanelLayout.createSequentialGroup()
                        .addGroup(addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentL, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(scoreL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scoreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addB)
                                .addComponent(studentTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addScorePanelLayout.setVerticalGroup(
            addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addScorePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseL)
                    .addComponent(courseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentL)
                    .addComponent(studentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addB)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        displayTA.setColumns(20);
        displayTA.setRows(5);
        displayP.setViewportView(displayTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(welcomeL)
                                    .addComponent(addAScoreL)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(messageL)))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(exportB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(displayB))
                        .addComponent(displayP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayL))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(addAScoreL)
                        .addGap(1, 1, 1)
                        .addComponent(addScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(messageL)
                        .addGap(29, 29, 29)
                        .addComponent(displayL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exportB)
                            .addComponent(displayB))))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 /**
 * Exports scores of students to a csv file
 * @param evt click from user
 */
    private void exportBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBActionPerformed
            try {
            List<Course> courses = (List<Course>) User.deserializeObject("course.ser");
            File outFile = new File("classScores.csv");
            FileWriter fw = new FileWriter(outFile);
            PrintWriter pw = new PrintWriter(fw);
            for (Course course : courses) {
                if (course.getName().equals(courseTF.getText())) {
                    for (int i = 0; i < course.getFinalScores().size(); i++) {
                        pw.print(course.getFinalScores().get(i) + ",");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

     
    }//GEN-LAST:event_exportBActionPerformed

 /**
 * Displays scores for all students registered in a course
 * @param evt click from user
 */
    private void displayBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBActionPerformed
        List<Course> courses;
        try {
            courses = (List<Course>) User.deserializeObject("course.ser");
            for (int i = 0; i < courses.size(); i++) {
                if (courseTF.getText().equals(courses.get(i).getName())) {
                    for (int j = 0; j < courses.get(i).getRegsStudents().size(); j++) {
                        displayTA.setText(courses.get(i).getRegsStudents().get(j).getName()
                                + courses.get(i).getFinalScores().get(j) + "\n");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }//GEN-LAST:event_displayBActionPerformed

 /**
 * Adds a score to a student 
 * @param evt click from user
 */
    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        double score;
        List<Double> scores;
        try {
            List<Course> courses = (List<Course>) User.deserializeObject("course.ser");
            List<Student> students = (List<Student>) User.deserializeObject("student.ser");
            for (int i = 0; i < courses.size(); i++) {
                for (int j = 0; j < students.size(); j++) {
                    if (!teacher.getName().equals(courses.get(i).getTeacher().getName())) {
                        messageL.setText("You don't teach this course");
                    } else if (!courses.get(i).getRegsStudents().contains(students.get(j))) {
                        messageL.setText("Student isn't registered in course");
                    } else {
                        scores = courses.get(i).getFinalScores();
                        score = courses.get(i).getFinalScores().get(j);
                        scores.set(j, score);
                        courses.get(i).setFinalScores(scores);
                        User.serializeObject("course.ser", courses);
                        messageL.setText("Score inputed into student");
                        messageL.setForeground(Color.green);
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

    }//GEN-LAST:event_addBActionPerformed

    private void courseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAScoreL;
    private javax.swing.JButton addB;
    private javax.swing.JPanel addScorePanel;
    private javax.swing.JLabel courseL;
    private javax.swing.JTextField courseTF;
    private javax.swing.JButton displayB;
    private javax.swing.JLabel displayL;
    private javax.swing.JScrollPane displayP;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton exportB;
    private javax.swing.JLabel messageL;
    private javax.swing.JLabel scoreL;
    private javax.swing.JTextField scoreTF;
    private javax.swing.JLabel studentL;
    private javax.swing.JTextField studentTF;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}