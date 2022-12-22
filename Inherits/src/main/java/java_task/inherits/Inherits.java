/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_task.inherits;
import java.util.Scanner;
/**
 *
 * @author هندسة
 */
public class Inherits {

    public static void main(String[] args) {
        double r  ;
        double h;
        Scanner input = new Scanner (System.in);
        System.out.println("enter the radius");
        r = input.nextDouble();
        Circle object = new Circle (r);
        System.out.println (object.toString());
        System.out.println ("area = "+ object.getarea());
        System.out.println("enter the height");
        h = input.nextDouble();
        Cylinder obj = new Cylinder( h, r , "red");
        System.out.println ( obj.toString()) ;
        System.out.println ("volume = "+ obj.getvolume());
       
    }
}
