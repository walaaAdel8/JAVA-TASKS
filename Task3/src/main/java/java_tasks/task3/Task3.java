/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_tasks.task3;
import java.util.Scanner ;


public class Task3 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );
        int x ;
        System.out.println ("please enter the size of array");
        x= input.nextInt();
               int[]arr=new int [x]; 
               int max=arr[0];
       System.out.println("please fill array to calculate the max");
        for ( int i=0 ; i<arr.length ; i++)
        {
                        arr[i]= input.nextInt();
                        if (arr[i] > max)
                            max = arr[i] ;
                       
        }
        System.out.println("the max value = "+ max );
    }
}
