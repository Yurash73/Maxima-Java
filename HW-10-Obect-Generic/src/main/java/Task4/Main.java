package Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(7);
        integerList.add(16);
        integerList.add(29);
        integerList.add(33);
        System.out.println("List of Integers: \n" + integerList);
        System.out.println("Сумма чисел List of Integers: " + sumOfList(integerList));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(34.14);
        doubleList.add(12.12);
        doubleList.add(6.88);
        doubleList.add(21.0);
        doubleList.add(45.3);
        System.out.println("List of Doubles: \n" + doubleList);
        System.out.println("Сумма чисел List of Doubles: " + sumOfList(doubleList));

    }

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
