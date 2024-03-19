package org.example.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Садоводство",2010));
        books.add(new Book("Война и Мир",1950));
        books.add(new Book("Идиот",1999));
        books.add(new Book("Отцы и дети",1985));
        books.add(new Book("Не отпускай меня",2016));
        books.add(new Book("Дюна",2003));
        books.add(new Book("Либиринт отражений",1994));
        books.add(new Book("Ночной дозор",2000));
        books.add(new Book("Ковид: Миф или реальность",2022));

        System.out.println("Первоначальный список книг:");
        books.forEach(System.out::println);

        List<String> after2000 = books.stream()
                .filter(book -> book.getYear() > 2000)
                .map(Book::getName)
                .toList();

        System.out.println(" \nСписок книг, изданых после 2000-го года. :" );
        System.out.println(after2000);
    }
}
