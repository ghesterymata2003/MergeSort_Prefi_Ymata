/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_ranking_system;

/**
 *
 * @author YMATA
 */
public class MergeSort {

    
 public static void mergeSort(Student[] students, int left, int right) {

   if (left < right) {

     int middle = (left + right) / 2;

          
     mergeSort(students, left, middle);

            
   mergeSort(students, middle + 1, right);

            
        merge(students, left, middle, right);
        }
    }

 public static void merge(Student[] students,
                              int left,
                              int middle,
                              int right) {

    int leftSize = middle - left + 1;
  int rightSize = right - middle;

     Student[] leftArray = new Student[leftSize];
     Student[] rightArray = new Student[rightSize];

        
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = students[left + i];
        }

        
   for (int i = 0; i < rightSize; i++) {
            rightArray[i] = students[middle + 1 + i];
        }

        int i = 0;
  int j = 0;
        int k = left;

        
        while (i < leftSize && j < rightSize) {

    if (leftArray[i].finalGrade >= rightArray[j].finalGrade) {
                students[k] = leftArray[i];
                i++;
            } else {
          students[k] = rightArray[j];
                j++;
            }

            k++;
        }

       
   while (i < leftSize) {
      students[k] = leftArray[i];
            i++;
       k++;
        }

        
   while (j < rightSize) {
            students[k] = rightArray[j];
            j++;
            k++;
        }
    }
}