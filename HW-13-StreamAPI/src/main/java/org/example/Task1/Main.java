package org.example.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Зима");
        words.add("Январь");
        words.add("Лето");
        words.add("Август");
        words.add("Сентябрь");
        words.add("Ноябрь");
        words.add("Лето");

        System.out.println("Исходный список: " + words);
        System.out.println("Фильтруем список(длиннее 5  символов и в обратном порядке: ");
        words.stream()
                .filter(s -> s.length() > 5)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
