package org.example.Task2;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<String> books = new ArrayList<>();

    public BookShelf() {
    }

    public void addBook (String bookname) {
        books.add(bookname);
    }

    public void removeBook(String bookname) {
        if (books.contains(bookname)) {
            books.remove(bookname);
            System.out.println("Книга " + bookname + " убрана с полки.");
        }
        else {
            System.out.println("Книги с названием: " + bookname + " нет на полке.");
        }
    }

    public void listBooks() {
        System.out.println(books);
    }
}
