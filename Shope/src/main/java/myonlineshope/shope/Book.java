/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myonlineshope.shope;

/**
 *
 * @author هندسة
 */
public class Book extends Product {
    @Override
    public double price (){
    return price ;
    }
    double price ;
    String bookname ;
    String author ;
    public Book () {
    }
    public Book (String bookname , String author , double price ){
    this.bookname=bookname ;
    this.author=author ;
    this.price=price ;
    }
    public void setnamebook (String name){
    this.bookname = name ;
    }

    @Override
    public String toString() {
        return "Book{" + "price=" + price + ", bookname=" + bookname + ", author=" + author + '}';
    }
    
    }
    
