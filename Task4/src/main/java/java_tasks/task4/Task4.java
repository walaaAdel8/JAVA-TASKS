/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_tasks.task4;
import java.util.Scanner ;

/**
 *
 * @author هندسة
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int row , col ;
        System.out.println("please enter the number of row");
        row = input.nextInt();
        System.out.println("please enter the numer of column");
        col = input.nextInt();
        int [][]arr =new int [row][col];
        System.out.println("please enter the value of array");
        for (int i = 0 ; i< row ; i++)
        {
         for(int j=0 ; j < col ; j++)
         {
             arr[i][j]= input.nextInt();
         }
        }
        System.out.println("----------");
        System.out.println("the array");
        System.out.println("----------");
         for (int i = 0 ; i< row ; i++)
        {
         for(int j=0 ; j < col ; j++)
         {
             System.out.println(arr[i][j]);
         }
        }
         System.out.println("----------");
         System.out.println("the transpose of array");
         System.out.println("----------");
         
          for (int i = 0 ; i< col ; i++)
        {
         for(int j=0 ; j < row ; j++)
         {
         System.out.println(arr[j][i]);
         }
        }

    }
}
