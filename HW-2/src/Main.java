import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        System.out.println("Сумма значений элементов 3-го массива: " + task3());
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1.");

        int arraySize = 10;
        int[] simpleArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            simpleArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(simpleArray));
    }

    public static void task2() {
        System.out.println("Задача 2.");

        int[] secondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Нечетные значения 2-го массива: ");
        for (int i = 0; i < secondArray.length; i++) {
            if ((secondArray[i] % 2) != 0) {
                System.out.println(secondArray[i]);
            }
        }
    }

    public static double task3() {
        System.out.println("Задача 3.");

        double[] thirdArray = {3.54, 5.78, 52.14, 87.32, 24.98, 73.22, 4.21, 147.64, 841.99};
        double sum = 0.0;

        for (int i = 0; i < thirdArray.length; i++) {
            sum += thirdArray[i];
        }
        return sum;
    }

    public static void task4() {
        System.out.println("Задача 4.");

        String[] arrayStrings = {"Зима-", "Весна-", "Лето-", "Осень-!"};
        String result = concat(arrayStrings);
        System.out.println(result);
    }

    public static String concat(String[] stringArray) {
         String stringForConcat = "";
         for (int i=0; i< stringArray.length; i++) {
             stringForConcat += stringArray[i];
         }
         return stringForConcat;
    }

}