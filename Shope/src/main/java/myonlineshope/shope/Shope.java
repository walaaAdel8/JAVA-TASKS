/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package myonlineshope.shope;

/**
 *
 * @author
 */

public class Shope {
    
    public static void main(String[] args) {
        Book bk = new Book( "bbbb","Ahmed Khaled Twfeek" , 55.0);
        System.out.println ( bk.toString());
        Book b = new Book( "old man and the sea","Ernest Hemingway" , 270.0);
        System.out.println ( b.toString());
    }
}
