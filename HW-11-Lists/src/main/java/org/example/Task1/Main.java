package org.example.Task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        List<String> vegetables = new ArrayList<>();
        List<String> common = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Plum");
        fruits.add("Apricot");
        fruits.add("Peach");

        vegetables.add("Tomato");
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Eggplant");

        common.addAll(fruits);
        common.addAll(vegetables);

        System.out.println("Содержит ли LinkedList ArrayList fruits: " + common.containsAll(fruits));
        System.out.println("Содержит ли LinkedList ArrayList vegetables: " + common.containsAll(vegetables));
        System.out.println("Удаляем из LinkedList коллекцию vegetables: ");
        common.removeAll(vegetables);
        System.out.println(common);
    }
}
