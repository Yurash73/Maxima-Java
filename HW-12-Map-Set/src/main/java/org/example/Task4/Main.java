package org.example.Task4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> fromOneToTen = new HashSet<>();
        Set<Integer> fromFiveToFifteen = new HashSet<>();
        Set<Integer> temp1 = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            fromOneToTen.add(i);
        }

        for (int i = 5; i <= 15; i++) {
            fromFiveToFifteen.add(i);
        }

        temp1.addAll(fromOneToTen);

        System.out.println("Пересечение множеств:");
        temp1.retainAll(fromFiveToFifteen);
        System.out.println(temp1);

        temp1.clear();
        temp1.addAll(fromOneToTen);
        System.out.println("Объединение множеств:");
        temp1.addAll(fromFiveToFifteen);
        System.out.println(temp1);

        temp1.clear();
        temp1.addAll(fromOneToTen);
        System.out.println("Разность множеств:");
        temp1.removeAll(fromFiveToFifteen);
        System.out.println(temp1);
    }
}
