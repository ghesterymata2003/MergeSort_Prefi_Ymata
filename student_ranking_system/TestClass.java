/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_ranking_system;

/**
 *
 * @author YMATA
 */
public class TestClass {

    public static void main(String[] args) {

       
        Student[] students = {
  new Student("S001", "Juan Dela Cruz", "BSIT", 92.50),
            new Student("S002", "Maria Santos", "BSCS", 96.75),
            new Student("S003", "Pedro Reyes", "BSIT", 88.25),
  new Student("S004", "Ana Garcia", "BSIS", 94.00),
        new Student("S005", "John Lim", "BSCS", 85.50),
            new Student("S006", "Sofia Ramos", "BSIT", 97.25),
  new Student("S007", "Mark Tan", "BSIS", 90.75),
            new Student("S008", "Lisa Bautista", "BSCS", 93.50)
        };

        
   System.out.println("STUDENTS BEFORE SORTING");
        System.out.println("-----------------------------------------------");
   displayStudents(students);

        
    MergeSort.mergeSort(students, 0, students.length - 1);

        
        System.out.println("\nSTUDENTS AFTER MERGE SORT");
        System.out.println("(Highest Grade to Lowest)");
   System.out.println("-----------------------------------------------");
        displayStudents(students);

        
        System.out.println("\nTOP 3 STUDENTS");
        System.out.println("-----------------------------------------------");

  for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s - %.2f%n",
                    i + 1,
                    students[i].name,
                    students[i].finalGrade);
        }
    }

    public static void displayStudents(Student[] students) {

        System.out.printf("%-10s %-20s %-10s %s%n",
                "ID", "Name", "Program", "Grade");

 for (Student student : students) {
            student.display();
        }
    }
}
