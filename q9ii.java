import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    public Book(int id, String name, String author, String publisher) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    }
}
public class q9ii {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<Book>();
        Book b1=new Book(101,"The Fault in Our Stars","John Green","ABC Publications");
        Book b2=new Book(102,"Harry Potter: Prisoner of Azkaban","J.K. Rowling","XYZ Publications");
        Book b3=new Book(103,"Five Point Someone","Chetan Bhagat","PQR Publications");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b:list){
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
        }
    }
}
