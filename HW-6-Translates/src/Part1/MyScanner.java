package Part1;

import java.util.Scanner;

public class MyScanner {
    private int choice;

    public int getChoice() {
        return choice;
    }

    public void printStartText() {
        System.out.println("-------Меню для выбора класса создаваемого объекта-------");
        System.out.println("Для создания объекта класса 'Part1.Bicycle' введиет 1");
        System.out.println("Для создания объекта класса 'Part1.Car' введиет 2");
        System.out.println("Для создания объекта класса 'Part1.Truck' введиет 3");
    }

    public void makeChoice() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        while ((inputNumber != 1) && (inputNumber != 2) && (inputNumber != 3)) {
            System.out.println(" Ошибка ввода, повторите ввод!");
            inputNumber = scanner.nextInt();
        }

        this.choice = inputNumber;
    }


}
