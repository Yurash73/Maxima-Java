package org.example.Task2;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook("Домоводство");
        bookShelf.addBook("Библия");
        bookShelf.addBook("Коран");
        bookShelf.addBook("Евангелие");
        bookShelf.addBook("Ветхий Завет");
        bookShelf.addBook("Новый Завет");

        System.out.println("Книжная полка:");
        bookShelf.listBooks();

        bookShelf.removeBook("Коран");
        System.out.println("Книжная полка:");
        bookShelf.listBooks();

        System.out.println("Убираем , например, Домострой.");
        bookShelf.removeBook("Домострой");
    }
}
