import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

class TeacherGUI {
    ArrayList<Teacher> mylistk = new ArrayList<>(); // Define the ArrayList

    // Declare JTextField variables 
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28;

    public TeacherGUI() {
        JFrame frame = new JFrame("Teacher");
        frame.setVisible(true);
        frame.setSize(1500, 800);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(245, 255, 250));

        // Initialize and add Panel 1 (Adding Tutor)
        JPanel p1 = initializeAddingTutorPanel();
        frame.add(p1);

        // Initialize and add Panel 2 (Grade Assignments)
        JPanel p2 = initializeGradeAssignmentsPanel();
        frame.add(p2);

        // Initialize and add Panel 3 (Adding Lecturer)
        JPanel p3 = initializeAddingLecturerPanel();
        frame.add(p3);

        // Initialize and add display and clear buttons
        initializeDisplayAndClearButtons(frame);
    }

    // Initialize Panel 1 (Adding Tutor) and JTextField variables
    private JPanel initializeAddingTutorPanel() {
        JPanel p1 = new JPanel();
        p1.setBounds(110, 30, 350, 700);
        p1.setBackground(new Color(176, 196, 222));
        p1.setLayout(null);

        JLabel la1 = new JLabel("Adding Tutor");
        la1.setBounds(120, 10, 100, 30);
        p1.add(la1);

        // Initialize JTextField variables for adding tutor
        JLabel l1 = new JLabel("Teacher ID:");
        l1.setBounds(30, 50, 100, 30);
        p1.add(l1);

        t1 = new JTextField();
        t1.setBounds(180, 50, 150, 30);
        p1.add(t1);

        JLabel l2 = new JLabel("Teacher Name:");
        l2.setBounds(30, 90, 100, 30);
        p1.add(l2);

        t2 = new JTextField();
        t2.setBounds(180, 90, 150, 30);
        p1.add(t2);

        JLabel l3 = new JLabel("Address:");
        l3.setBounds(30, 130, 100, 30);
        p1.add(l3);

        t3 = new JTextField();
        t3.setBounds(180, 130, 150, 30);
        p1.add(t3);

        JLabel l4 = new JLabel("Working Type:");
        l4.setBounds(30, 170, 100, 30);
        p1.add(l4);

        t4 = new JTextField();
        t4.setBounds(180, 170, 150, 30);
        p1.add(t4);

        JLabel l5 = new JLabel("Employment Status:");
        l5.setBounds(30, 210, 120, 30);
        p1.add(l5);

        t5 = new JTextField();
        t5.setBounds(180, 210, 150, 30);
        p1.add(t5);

        JLabel l6 = new JLabel("Working Hours:");
        l6.setBounds(30, 250, 100, 30);
        p1.add(l6);

        t6 = new JTextField();
        t6.setBounds(180, 250, 150, 30);
        p1.add(t6);

        JLabel l7 = new JLabel("Salary:");
        l7.setBounds(30, 290, 120, 30);
        p1.add(l7);

        t7 = new JTextField();
        t7.setBounds(180, 290, 150, 30);
        p1.add(t7);

        JLabel l8 = new JLabel("Specialization:");
        l8.setBounds(30, 330, 120, 30);
        p1.add(l8);

        t8 = new JTextField();
        t8.setBounds(180, 330, 150, 30);
        p1.add(t8);

        JLabel l9 = new JLabel("Academic Qualifications:");
        l9.setBounds(30, 370, 150, 30);
        p1.add(l9);

        t9 = new JTextField();
        t9.setBounds(180, 370, 150, 30);
        p1.add(t9);

        JLabel l10 = new JLabel("Performance Index:");
        l10.setBounds(30, 410, 150, 30);
        p1.add(l10);

        t10 = new JTextField();
        t10.setBounds(180, 410, 150, 30);
        p1.add(t10);

        // Add Tutor button
        JButton b1 = new JButton("Add a Tutor");
        b1.setBounds(120, 450, 110, 30);
        b1.setBackground(new Color(240, 248, 255));
        p1.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() ||
                        t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() ||
                        t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty() ||
                        t10.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Fill all the fields, please!");
                    } else {
                        Tutor tutor = new Tutor(
                            Integer.parseInt(t1.getText()), t2.getText(),
                            t3.getText(), t4.getText(), t5.getText(),
                            Integer.parseInt(t6.getText()),
                            Double.parseDouble(t7.getText()), t8.getText(),
                            t9.getText(), Integer.parseInt(t10.getText())
                        );

                        mylistk.add(tutor);
                        JOptionPane.showMessageDialog(null, "Tutor added successfully.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });

        // Title for setting the salary of a tutor
        JLabel la2 = new JLabel("Set Salary of Tutor");
        la2.setBounds(120, 500, 150, 30);
        p1.add(la2);

        // Components for setting the salary of a tutor
        JLabel l11 = new JLabel("Teacher ID:");
        l11.setBounds(30, 540, 120, 30);
        p1.add(l11);

        t11 = new JTextField();
        t11.setBounds(180, 540, 150, 30);
        p1.add(t11);

        JLabel l12 = new JLabel("New Salary:");
        l12.setBounds(30, 580, 120, 30);
        p1.add(l12);

        t12 = new JTextField();
        t12.setBounds(180, 580, 150, 30);
        p1.add(t12);

        JLabel l13 = new JLabel("New Performance Index:");
        l13.setBounds(30, 620, 150, 30);
        p1.add(l13);

        t13 = new JTextField();
        t13.setBounds(180, 620, 150, 30);
        p1.add(t13);

        JButton b2 = new JButton("Set Salary of Tutor");
        b2.setBounds(100, 660, 150, 30);
        b2.setBackground(new Color(240, 248, 255));
        p1.add(b2);

        // Add action listener to button b2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int teacherId = Integer.parseInt(t11.getText());
                    double newSalary = Double.parseDouble(t12.getText());
                    int newPerformanceIndex = Integer.parseInt(t13.getText());

                    boolean tutorFound = false;
                    for (Teacher teacher : mylistk) {
                        if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                            Tutor tutor = (Tutor) teacher;
                            String result = tutor.setSalary(newSalary, newPerformanceIndex);
                            JOptionPane.showMessageDialog(null, "Result: " + result);
                            tutorFound = true;
                            break;
                        }
                    }

                    if (!tutorFound) {
                        JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherId + " not found!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });

        return p1;
    }

    // Initialize and return Panel 2 (Grade Assignments)
    private JPanel initializeGradeAssignmentsPanel() {
        JPanel p2 = new JPanel();
        p2.setBounds(600, 50, 350, 430);
        p2.setBackground(new Color(176, 196, 222));
        p2.setLayout(null);

        JLabel la14 = new JLabel("Grade Assignments");
        la14.setBounds(110, 10, 200, 30);
        p2.add(la14);

        JLabel l15 = new JLabel("Teacher ID:");
        l15.setBounds(30, 50, 150, 30);
        p2.add(l15);

        t15 = new JTextField();
        t15.setBounds(160, 50, 150, 30);
        p2.add(t15);

        JLabel l16 = new JLabel("Graded Score:");
        l16.setBounds(30, 90, 150, 30);
        p2.add(l16);

        t16 = new JTextField();
        t16.setBounds(160, 90, 150, 30);
        p2.add(t16);

        JLabel l17 = new JLabel("Department:");
        l17.setBounds(30, 130, 150, 30);
        p2.add(l17);

        t17 = new JTextField();
        t17.setBounds(160, 130, 150, 30);
        p2.add(t17);

        JLabel l18 = new JLabel("Years of Experience:");
        l18.setBounds(30, 170, 170, 30);
        p2.add(l18);

        t18 = new JTextField();
        t18.setBounds(160, 170, 150, 30);
        p2.add(t18);

        JButton b3 = new JButton("Grade the Assignments");
        b3.setBounds(90, 220, 180, 30);
        b3.setBackground(new Color(240, 248, 255));
        p2.add(b3);

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int teacherId = Integer.parseInt(t15.getText());
                    int gradedScore = Integer.parseInt(t16.getText());
                    String department = t17.getText();
                    int yearsOfExperience = Integer.parseInt(t18.getText());

                    for (Teacher teacher : mylistk) {
                        if (teacher instanceof Lecturer && teacher.getTeacherID() == teacherId) {
                            Lecturer lecturer = (Lecturer) teacher;
                            String grade = lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                            JOptionPane.showMessageDialog(null, "Graded assignment result: " + grade);
                            return;
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Lecturer with ID " + teacherId + " not found!");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
                }
            }
        });

        JLabel l19 = new JLabel("Remove Tutor");
        l19.setBounds(130, 270, 150, 30);
        p2.add(l19);

        JLabel l20 = new JLabel("Teacher ID:");
        l20.setBounds(30, 310, 150, 30);
        p2.add(l20);

        t20 = new JTextField();
        t20.setBounds(160, 310, 150, 30);
        p2.add(t20);

        JButton b4 = new JButton("Remove the tutor");
        b4.setBounds(100, 360, 160, 30);
        b4.setBackground(new Color(240, 248, 255));
        p2.add(b4);

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int teacherId = Integer.parseInt(t20.getText());

                    boolean removed = false;
                    for (Iterator<Teacher> iterator = mylistk.iterator(); iterator.hasNext();) {
                        Teacher teacher = iterator.next();
                        if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                            iterator.remove();
                            removed = true;
                            JOptionPane.showMessageDialog(null, "Tutor removed successfully.");
                            break;
                        }
                    }

                    if (!removed) {
                        JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherId + " not found!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Only integer values accepted for Teacher ID.");
                }
            }
        });

        return p2;
    }

    // Initialize Panel 3 (Adding Lecturer)
    private JPanel initializeAddingLecturerPanel() {
        JPanel p3 = new JPanel();
        p3.setBounds(1080, 30, 350, 500);
        p3.setBackground(new Color(176, 196, 222));
        p3.setLayout(null);

        JLabel la3 = new JLabel("Adding Lecturer");
        la3.setBounds(110, 10, 100, 30);
        p3.add(la3);

        JLabel l21 = new JLabel("Teacher ID:");
        l21.setBounds(30, 50, 100, 30);
        p3.add(l21);

        t21 = new JTextField();
        t21.setBounds(180, 50, 150, 30);
        p3.add(t21);

        JLabel l22 = new JLabel("Teacher Name:");
        l22.setBounds(30, 90, 100, 30);
        p3.add(l22);

        t22 = new JTextField();
        t22.setBounds(180, 90, 150, 30);
        p3.add(t22);

        // Add address field
        JLabel l23 = new JLabel("Address:");
        l23.setBounds(30, 130, 100, 30);
        p3.add(l23);

        t23 = new JTextField();
        t23.setBounds(180, 130, 150, 30);
        p3.add(t23);

        // Add working type field
        JLabel l24 = new JLabel("Working Type:");
        l24.setBounds(30, 170, 100, 30);
        p3.add(l24);

        t24 = new JTextField();
        t24.setBounds(180, 170, 150, 30);
        p3.add(t24);

        // Add employment status field
        JLabel l25 = new JLabel("Employment Status:");
        l25.setBounds(30, 210, 120, 30);
        p3.add(l25);

        t25 = new JTextField();
        t25.setBounds(180, 210, 150, 30);
        p3.add(t25);

        JLabel l26 = new JLabel("Graded Score:");
        l26.setBounds(30, 250, 100, 30);
        p3.add(l26);

        t26 = new JTextField();
        t26.setBounds(180, 250, 150, 30);
        p3.add(t26);

        JLabel l27 = new JLabel("Years of Experience:");
        l27.setBounds(30, 290, 150, 30);
        p3.add(l27);

        t27 = new JTextField();
        t27.setBounds(180, 290, 150, 30);
        p3.add(t27);

        JLabel l28 = new JLabel("Department:");
        l28.setBounds(30, 330, 150, 30);
        p3.add(l28);

        t28 = new JTextField();
        t28.setBounds(180, 330, 150, 30);
        p3.add(t28);

        JButton b5 = new JButton("Add a Lecturer");
        b5.setBounds(100, 400, 150, 30);
        b5.setBackground(new Color(240, 248, 255));
        p3.add(b5);

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (t21.getText().isEmpty() || t22.getText().isEmpty() || t23.getText().isEmpty() ||
                        t24.getText().isEmpty() || t25.getText().isEmpty() || t26.getText().isEmpty() ||
                        t27.getText().isEmpty() || t28.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields.");
                    } else {
                        Lecturer lecturer = new Lecturer(
                            Integer.parseInt(t21.getText()),
                            t22.getText(),
                            t23.getText(),
                            t24.getText(),
                            t25.getText(),
                            Integer.parseInt(t26.getText()),
                            Integer.parseInt(t27.getText()),
                            t28.getText()
                        );

                        mylistk.add(lecturer);
                        JOptionPane.showMessageDialog(null, "Lecturer added successfully.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Teacher ID, Graded Score, and Years of Experience.");
                }
            }
        });

        return p3;
    }

    // Initialize display and clear buttons
    private void initializeDisplayAndClearButtons(JFrame frame) {
        JButton b6 = new JButton("Display");
        b6.setBounds(700, 600, 150, 30);
        b6.setBackground(new Color(240, 248, 255));
        frame.add(b6);

        JButton b7 = new JButton("Clear");
        b7.setBounds(700, 640, 150, 30);
        b7.setBackground(new Color(240, 248, 255));
        frame.add(b7);

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Display the list of Teachers
                for (Teacher teacher : mylistk) {
                    if (teacher instanceof Lecturer) {
                        teacher.display();
                    } else if (teacher instanceof Tutor) {
                        teacher.display();
                    }
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Clear all JTextFields and list of Teachers
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
                t15.setText("");
                t16.setText("");
                t17.setText("");
                t18.setText("");
                t19.setText("");
                t20.setText("");
                t21.setText("");
                t22.setText("");
                t23.setText("");
                t24.setText("");
                t25.setText("");
                t26.setText("");
                t27.setText("");
                t28.setText("");

                // Clear the list of Teachers
                mylistk.clear();

                JOptionPane.showMessageDialog(frame, "All fields and records have been cleared!");
            }
        });
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
