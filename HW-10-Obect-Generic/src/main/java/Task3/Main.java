package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Исходный список: \n" + numbers);
        swap(numbers, 2, 4);
        System.out.println("Список после перестановки 2-го и 4-го элементов \n" + numbers );

        List <String> words = new ArrayList<>();
        words.add("Первый");
        words.add("Второй");
        words.add("Третий");
        words.add("Четвёртый");
        words.add("Пятый");
        System.out.println("Исходный список: \n" + words);
        swap(words, 1, 3);
        System.out.println("Список после перестановки 1-го и 3-го элементов \n" + words );

        System.out.println("А сейчас проверим выход ха границы индекса:");
        swap(words, 2,7);
    }

    public static <T> void swap(List<T> listForChange, int firstIndx, int secondIndx) {
        try {
            T temp = listForChange.get(firstIndx);
            listForChange.set(firstIndx, listForChange.get(secondIndx));
            listForChange.set(secondIndx, temp);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
