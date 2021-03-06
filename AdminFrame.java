/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static com.mycompany.project2.User.serializeObject;
import java.awt.Color;

/**
 *
 * @author navni
 */
public class AdminFrame extends javax.swing.JFrame {
    
private static Admin admin;

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame(Admin admin) {
        initComponents();
        this.setTitle("Admin");
        welcomeL.setText(("Welcome: ") + admin.getName());
        this.admin = admin;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBG = new javax.swing.ButtonGroup();
        addP = new javax.swing.JPanel();
        studentRB = new javax.swing.JRadioButton();
        courseRB = new javax.swing.JRadioButton();
        teacherRB = new javax.swing.JRadioButton();
        nameL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        addB = new javax.swing.JButton();
        teacherTF = new javax.swing.JTextField();
        teacherJL = new javax.swing.JLabel();
        displayWindowL = new javax.swing.JLabel();
        displayB = new javax.swing.JButton();
        welcomeL = new javax.swing.JLabel();
        messageL = new javax.swing.JLabel();
        displaySP = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBG.add(studentRB);
        studentRB.setText("Student");
        studentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRBActionPerformed(evt);
            }
        });

        addBG.add(courseRB);
        courseRB.setSelected(true);
        courseRB.setText("Course");
        courseRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseRBActionPerformed(evt);
            }
        });

        addBG.add(teacherRB);
        teacherRB.setText("Teacher");
        teacherRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRBActionPerformed(evt);
            }
        });

        nameL.setText("Name");

        nameTF.setText("Enter Name");
        nameTF.setName(""); // NOI18N
        nameTF.setVerifyInputWhenFocusTarget(false);
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        teacherTF.setText("Enter Teacher");

        teacherJL.setText("Teacher");

        javax.swing.GroupLayout addPLayout = new javax.swing.GroupLayout(addP);
        addP.setLayout(addPLayout);
        addPLayout.setHorizontalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teacherRB)
                    .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentRB)
                        .addComponent(courseRB)))
                .addGap(6, 6, 6)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(addPLayout.createSequentialGroup()
                            .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addPLayout.createSequentialGroup()
                            .addComponent(teacherJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(teacherTF)))
                    .addComponent(addB))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        addPLayout.setVerticalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherRB)
                    .addComponent(nameL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentRB)
                    .addComponent(teacherJL)
                    .addComponent(teacherTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseRB)
                    .addComponent(addB))
                .addGap(19, 19, 19))
        );

        displayWindowL.setText("Display Window");

        displayB.setText("Display");
        displayB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBActionPerformed(evt);
            }
        });

        welcomeL.setText("Welcome");

        displayTA.setEditable(false);
        displayTA.setColumns(20);
        displayTA.setRows(5);
        displaySP.setViewportView(displayTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(displayWindowL)
                                .addComponent(displaySP, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(messageL))
                            .addComponent(addP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeL)
                .addGap(18, 18, 18)
                .addComponent(addP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(displayWindowL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displaySP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 /**
 * Sets Teacher label and text field to invisible when clicked
 * resets value in name text field
 * @param evt click from user
 */
    private void teacherRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRBActionPerformed
        if (teacherRB.isSelected()) {
            teacherJL.setVisible(false);
            teacherTF.setVisible(false);
            nameTF.setText("");
        }
    }//GEN-LAST:event_teacherRBActionPerformed

 /**
 * Makes teacher label and text field visible
 * resets text field 
 * @param evt click from user
 */
    private void courseRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseRBActionPerformed
        if (courseRB.isSelected()) {
            teacherJL.setVisible(true);
            teacherTF.setVisible(true);
            nameTF.setText("");
            teacherTF.setText("");
        }
    }//GEN-LAST:event_courseRBActionPerformed

 /**
 * Sets Teacher label and text field to invisible when clicked
 * resets value in name text field
 * @param evt click from user
 */
    private void studentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRBActionPerformed
        if (studentRB.isSelected()) {
            teacherJL.setVisible(false);
            teacherTF.setVisible(false);
            nameTF.setText("");
        }
    }//GEN-LAST:event_studentRBActionPerformed

 /**
 * adds a student or teacher and sets their name and writes it to ser file
 * if course is selected also writes teacher of the course
 * @param evt 
 */
    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        if (courseRB.isSelected()) {
            try {
                List<Teacher> teachers = (List<Teacher>) Teacher.deserializeObject("teacher.ser");

                for (Teacher findteacher : teachers) {
                    if (findteacher.getName().equals(teacherTF.getText())) {
                        Course addCourse = new Course();
                        addCourse.setName(nameTF.getText());
                        addCourse.setTeacher(findteacher);
                        List<Course> courses = (List<Course>) User.deserializeObject("course.ser");
                        courses.add(addCourse);
                        serializeObject("course.ser", courses);
                        messageL.setText("Object Added");
                        messageL.setForeground(Color.green);
                    } else { 
                        messageL.setText("Teacher doesn't exist");
                        messageL.setForeground(Color.red);
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (studentRB.isSelected()) {
            Student addStudent = new Student();

            try {
                List<Student> students = (List<Student>) Student.deserializeObject("student.ser");
                addStudent.setName(nameTF.getText());
                students.add(addStudent);
                Student.serializeObject("student.ser", students);
                messageL.setText("Object Added");
                messageL.setForeground(Color.green);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (teacherRB.isSelected()) {
            Teacher addTeacher = new Teacher();

            try {
                List<Teacher> teachers = (List<Teacher>) Teacher.deserializeObject("teacher.ser");
                addTeacher.setName(nameTF.getText());
                teachers.add(addTeacher);
                Teacher.serializeObject("teacher.ser", teachers);
                messageL.setText("Object Added");
                messageL.setForeground(Color.green);
                
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addBActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

 /**
 * if student is selected shows name, id and registered courses
 * if teacher is selected shows name, id and teaching courses
 * if course is selected shows name , name of teacher, max student amount and registered students 
 * @param evt click from user
 */
    private void displayBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBActionPerformed
        displayTA.setText(null);
        if (studentRB.isSelected()) {
            try {
                List<Student> students = (List<Student>) Student.deserializeObject("student.ser");
                for (Student student : students) {
                    if (student.getName().equals(nameTF.getText())) {
                        displayTA.setText("Name:" + student.getName() + "\n"
                        + "ID:" + student.getId() + "\n" + "Registered Courses"
                        + "\n" + student.getRegCourses().toString());
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (teacherRB.isSelected()) {
            try {
                List<Teacher> teachers = (List<Teacher>) Teacher.deserializeObject("teacher.ser");
                for (Teacher teacher : teachers) {
                    if (teacher.getName().equals(nameTF.getText())) {
                        displayTA.setText("Name:" + teacher.getName() + "\n" +
                                "ID:" + teacher.getId() + "\n" + "Teaching courses"
                                        + "\n" + teacher.getTeachingCourses().toString());
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (courseRB.isSelected()) {
            try {
                List<Course> courses = (List<Course>) User.deserializeObject("course.ser");
                for (Course course : courses) {
                    if (course.getName().equals(nameTF.getText())
                            && course.getTeacher().getName().equals(teacherTF.getText())) {
                        displayTA.setText("Name:" + course.getName() + "\n"
                                + "Teacher:" + course.getTeacher().getName() + "\n" + "Max amount of students"
                                + "\n" + course.getMaxStuAmount() + "\n"
                                + "Registered Students:" + course.getRegsStudents().size());
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_displayBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.ButtonGroup addBG;
    private javax.swing.JPanel addP;
    private javax.swing.JRadioButton courseRB;
    private javax.swing.JButton displayB;
    private javax.swing.JScrollPane displaySP;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JLabel displayWindowL;
    private javax.swing.JLabel messageL;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JRadioButton studentRB;
    private javax.swing.JLabel teacherJL;
    private javax.swing.JRadioButton teacherRB;
    private javax.swing.JTextField teacherTF;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}
