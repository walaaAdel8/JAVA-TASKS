/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyOnlineShope;

/**
 *
 * @author هندسة
 */
public class Book implements Product {
    double price ;
    String bookname ;
    String author ;
    Book Cartoon ;
    @Override
    public double price ()
    {
    return price ;
    }

    public Book() {
    }

    
    public Book(double price, String bookname, String author) {
        this.price = price;
        this.bookname = bookname;
        this.author = author;
        
    }

    public Book(Book Cartoon) {
        this.Cartoon = Cartoon;
    }
     
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book getCartoon() {
        return Cartoon;
    }

    public void setCartoon(Book Cartoon) {
        this.Cartoon = Cartoon;
    }

    @Override
    public String toString() {
        return "Book{" + "price=" + price + ", bookname=" + bookname + ", author=" + author + ", Cartoon=" + Cartoon + '}';
    }
}
