package org.example.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Double[] doubles = {4.5, 12.8, 33.3, 8.0, 91.4, 23.3, 50.1, 7.2};
        List<Double> doublesList = Arrays.asList(doubles);

        System.out.println("Изначальный список Double: " + doublesList);

        System.out.print("Сумма всех чисел списка равна: ");
        Optional<Double> sum = doublesList.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum.get());

        OptionalDouble average = doublesList.stream()
                .mapToDouble(value -> value)
                .average();
        System.out.println("Среднее значение списка: " + average.getAsDouble());

        long count = doublesList.stream()
                .filter(value -> value > 10.0)
                .count();
        System.out.println("Количество чисел больше 10.0: " + count);

    }
}
