/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_task.inherits;

/**
 *
 * @author هندسة
 */
public class Circle {
    private double radius = 1.0 ;
    private String color = "red" ;
    double area ;
    public Circle () {
    }
    public Circle (double radius ){
        this.radius = radius ;
    }
    public Circle (double radius , String color ){
        this.radius = radius ;
        this.color = color ;
    }
    public void setradius (double radius){
        this.radius = radius ;
    }
    public double getradius (){
      return radius ;  
    }
    public void setcolor (String color){
        this.color = color ;
    }
    public String getcolor (){
      return color ;  
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

    
    
    public double getarea (){
        area = 3.14* radius ;
    return area ;
    }

        }
    
    

