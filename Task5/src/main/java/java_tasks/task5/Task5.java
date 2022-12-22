/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_tasks.task5;
import java.util.Scanner ;
/**
 *
 * @author هندسة
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String x ;
        System.out.println("please enter a strig");
        x = input.nextLine();
        for ( int i =0 ; i < x.length() ; i++)
        {
           if (x.charAt(i) == ',' )
           {
               i+=1 ;
           }
           System.out.print ( x.charAt(i));
        }
        
        
        
    }
}
