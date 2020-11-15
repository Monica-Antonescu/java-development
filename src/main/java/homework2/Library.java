package src.main.java.homework2;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int index) {
        books.remove(index);
    }

    public void listBooks() {
        //Print all books added in the library
        for (Book book : books) {
            System.out.println("bookName=" + book.getName() + " bookPages=" + book.getNumberOfPages());
        }
    }
}