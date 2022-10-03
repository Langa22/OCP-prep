package Dumps;

import java.io.IOException;

class Book2 {
    public String read(String bname) { return "Read" + bname; }
}
class EBook extends Book2 {
    public String read (String url) { return "View" + url; }
}
public class Question81 {
    public static void main (String[] args) {
        Book2 b1 = new Book2();
        b1.read("Java Programing");
        Book2 b2 = new EBook();
        b2.read("http://ebook.com/ebook");
    }
}
