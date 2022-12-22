/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_task.inherits;

/**
 *
 * @author هندسة
 */
public class Cylinder extends Circle {
    private double height =1.0 ;
    double volume ,rad ;
    public Cylinder (){
    }
    public Cylinder (double radius){
    }
    public Cylinder (double radius , String color ){
        super (radius , color);
        rad=radius ;
    }
    public Cylinder (double height , double radius , String color ){
        rad=radius ;
        this.height = height ;
    }
    public void setheight (double height){
    this.height = height ;
    }
    public double getheight (){
    return height ;
    }

    
    
    public double getvolume (){
        volume =3.14 * rad * height ;
    return volume ;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + ", rad=" + rad + '}';
    }
     
    
    
}
