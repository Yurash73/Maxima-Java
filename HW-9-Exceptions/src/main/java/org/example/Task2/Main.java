package org.example.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inNumber = 0;
    while (true) {
        try {
            System.out.println("Введите число в консоли: ");
            inNumber = Integer.parseInt(scanner.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Вы ввели не число, повторите попытку: ");
            continue;
        }
        break;
    }
        System.out.println("Умножаем ваше число на 2 - " + inNumber * 2);

    }
}
