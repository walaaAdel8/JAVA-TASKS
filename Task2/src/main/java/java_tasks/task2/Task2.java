/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_tasks.task2;
import java.util.Scanner ;

/**
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , r , NpR , NcR , factn=1 , fact=1 , factr=1 ;
        System.out.println ("please enter the value of n ");
        n = input.nextInt();
        System.out.println ("please enter the value of r ");
        r = input.nextInt();
        for (int i =1 ; i<= n ; i++)
        {
            factn= factn*i ;
        }
        for (int i =1 ; i<=(n-r) ; i++)
        {
            fact= fact*i ;
        }
        for (int i =1 ; i<= r ; i++)
        {
            factr= factr*i ;
        }
        NpR = (factn/fact);
        System.out.println("NpR value is : "+ NpR);
        NcR = (factn/(factr*fact));
        System.out.println("NcR value is : "+ NcR);
    }
}
