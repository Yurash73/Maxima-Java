package org.example.Task3;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Сумма 7 и 21 равно - " + calculator.sum(7, 21));

        int [] numbers = {2,4,8,12,64,31,28};
        System.out.println("Сумма чисел массива равна - " + calculator.sum(numbers));

        System.out.println("Сумма чисел ряда равна - " + calculator.sum(4,55,2,13,21));


    }
}
