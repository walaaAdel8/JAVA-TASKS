/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_tasks.task1;
import java.util.Scanner ;

/**
 *
 * @author هندسة
 */
public class Task1 {

    public static void main(String[] args) {
        char x ;
        System.out.println ("please enter the character");
        Scanner input = new Scanner (System.in);
        x=input.next().charAt(0);
        System.out.println("the Askii of "+ x + " is "+ (int)x);
        
    }
}
