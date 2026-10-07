/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_ranking_system;

/**
 *
 * @author YMATA
 */
public class Student {
 String studentId;
    String name;
 String program;
    double finalGrade;

    public Student(String studentId, String name, String program, double finalGrade) {
    this.studentId = studentId;
     this.name = name;
        this.program = program;
    this.finalGrade = finalGrade;
    }

    public void display() {
  System.out.printf("%-10s %-20s %-10s %.2f%n",
                studentId, name, program, finalGrade);
    }
}




