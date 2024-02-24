public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int forAdding = 11;
        int sum = task1(forAdding);
        System.out.println(" Сумма всех чисел от 1 до " + forAdding + " равна - " + sum);

        System.out.println("Задача 2.");
        int forFactorial = 7;
        int factorial = task2(forFactorial);
        System.out.println(" Факториал числа " + forFactorial + " равен - " + factorial);

        System.out.println("Задача 3.");
        int forFibonachi = 8;
        int fibonachi = task3(forFibonachi);
        System.out.println(" Число Фибоначчи для " + forFibonachi + "-го члена ряда равно - " + fibonachi);

        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static int task1(int n) {
        if (n == 0) {
            return 0;
        }
        return n + task1(n - 1);
    }

    public static int task2(int n) {
        if (n == 1) {
            return 1;
        }
        return n * task2(n - 1);
    }

    public static int task3(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return task3(n - 1) + task3(n - 2);
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        int testInt = 7;
        double testDouble = 12.5;
        boolean testBoolean = true;

        Integer wrapperInteger = new Integer(testInt);
        Double wrapperDouble = new Double(testDouble);
        Boolean wrapperBoolean = new Boolean(testBoolean);

        System.out.println("Примитивы:");
        System.out.println("int - " + testInt);
        System.out.println("double - " + testDouble);
        System.out.println("boolean - " + testBoolean);

        System.out.println("Обертки:");
        System.out.println("Integer - " + wrapperInteger);
        System.out.println("Double - " + wrapperDouble);
        System.out.println("Boolean - " + wrapperBoolean);

    }

    public static void task5() {
        System.out.println("Задача 5.");
        int firstInt = 613;
        Integer secondInteger = new Integer(34);
        double firstDouble = 34.54;
        Double wrapperDouble = new Double(27.82);

        Integer sumInts = firstInt + secondInteger;
        int multipInts = firstInt * secondInteger;
        System.out.println("Сложение int и Integer - " + sumInts);
        System.out.println("Умножение int и Integer - " + multipInts);

        Double sumDoubles = firstDouble + wrapperDouble;
        double multipDoubles = firstDouble * wrapperDouble;
        System.out.println("Сложение Double и double - " + sumDoubles);
        System.out.println("Умножение Double и double - " + multipDoubles);
    }


    public static void task6() {
        System.out.println("Задача 6.");
        Integer firstInteger = 120;
        Integer secondInteger = 120;
        Integer thirdInteger = 4671;
        Integer fourthInteger = 4671;
        boolean firstEquals = (firstInteger == secondInteger);
        boolean secondEquals = (firstInteger.equals(secondInteger));
        boolean thirdEquals = (thirdInteger == fourthInteger);
        boolean fourthEquals = (thirdInteger.equals(fourthInteger));

        System.out.println("Сравниваем два Integer по 120  by == " + firstEquals);
        System.out.println("Сравниваем два Integer по 120  by Object.equals() " + secondEquals);
        System.out.println("Сравниваем два Integer по 4671  by == " + thirdEquals);
        System.out.println("Сравниваем два Integer по 4671  by Object.equals() " + fourthEquals);
    }

    public static void task7() {
        System.out.println("Задача 7.");

        long forCountNumber = 100_000_000;
        long timeWithPrimitive = checkTimeWithPrimitive(forCountNumber);
        long timeWithWrapper = checkTimeWithWrapper(forCountNumber);
        System.out.println(" Время вычислений с примитивами : " + timeWithPrimitive + " мс.");
        System.out.println(" Время вычислений с классом Оберткой : " + timeWithWrapper + " мс.");

        long differentTime = timeWithWrapper - timeWithPrimitive;
        System.out.println(" Вычисления с Оберткой дольше на " + differentTime + " мс. , чем с примитивом.");
    }

    public static long checkTimeWithPrimitive(long count) {
        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return duration;
    }

    public static long checkTimeWithWrapper(long count) {
        long startTime = System.currentTimeMillis();

        Integer sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return duration;
    }

    private static void task8() {
        System.out.println("Задача 8.");
        System.out.println("Integer.MAX_VALUE равно: " + Integer.MAX_VALUE);
        System.out.println("А теперь увеличиваем Integer.MAX_VALUE на 1 и получаем: " + (Integer.MAX_VALUE + 1));
        System.out.println("Integer.MIN_VALUE равно: " + Integer.MIN_VALUE);
        System.out.println("А теперь уменьшаем Integer.MIN_VALUE на 1 и получаем: " + (Integer.MIN_VALUE - 1));
        System.out.println("Long.MAX_VALUE равно: " + Long.MAX_VALUE);
        System.out.println("А теперь увеличиваем Long.MAX_VALUE на 1 и получаем: " + (Long.MAX_VALUE + 1));
        System.out.println("Long.MIN_VALUE равно: " + Long.MIN_VALUE);
        System.out.println("А теперь уменьшаем Long.MIN_VALUE на 1 и получаем: " + (Long.MIN_VALUE - 1));

    }
}