package day.pkg13.pkgabstract.classes;

import java.util.Scanner;

/**
 *
 * @author Md. Rana Mahmud
 */
abstract class Book {

    String title;
    String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();

}

class MyBook extends Book {

    private int price;

    public MyBook(String t, String a, int p) {
        super(t, a);
        price = p;

    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

public class Day13AbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }

}
