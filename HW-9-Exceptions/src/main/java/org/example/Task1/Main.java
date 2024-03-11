package org.example.Task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Результат деления 16 /4 равен - " + dividing(16, 4));
        System.out.println("Результат деления 16/0 равен - " + dividing(16, 0));
    }

    public static int dividing(int a, int b) {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Возникло исключение " + e.getMessage());
            return 0;
        }
        finally {
            System.out.println("Операция деления выполнена.");
        }
        return result;

    }
}
