import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        doFirstHomework();

    }

    public static void doFirstHomework() {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int intVariable = 0;
        byte byteVariable = 0;
        short shortVariable = 0;
        long longVariable = 0;
        float floatVariable = 0;
        double doubleVariable = 0;
        char charVariable = 'B';
        boolean booleanVariable = true;

        System.out.println("Значение переменной intVariable " + " с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable " + " с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable " + " с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable " + " с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable " + " с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable " + " с типом double равно " + doubleVariable);
        System.out.println("Значение переменной charVariable " + " с типом char равно " + charVariable);
        System.out.println("Значение переменной booleanVariable " + " с типом boolean равно " + booleanVariable);
    }

    public static void task2() {
        int totalCan = 120;
        int whiteColorCan = 2;
        int brownColorCan = 4;
        double totalWhiteColorCan;
        double totalBrownColorCan;

        double classes = totalCan / (whiteColorCan + brownColorCan);
        totalBrownColorCan = classes * brownColorCan;
        totalWhiteColorCan = classes * whiteColorCan;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteColorCan +
                " банок белой краски и " + totalBrownColorCan + " банок коричневой краски");
    }

    public static void task3() {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int increaseSalaryPercents = 10;

        double newSalaryMasha = salaryMasha + salaryMasha * increaseSalaryPercents / 100;
        double newSalaryDenis = salaryDenis + salaryDenis * increaseSalaryPercents / 100;
        double newSalaryKristina = salaryKristina + salaryKristina * increaseSalaryPercents / 100;

        double increaseMashaSalary = newSalaryMasha * 12 - salaryMasha * 12;
        double increaseDenisSalary = newSalaryDenis * 12 - salaryDenis * 12;
        double increaseKristinaSalary = newSalaryKristina * 12 - salaryKristina * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " +
                increaseMashaSalary + " рублей. ");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " +
                increaseDenisSalary + " рублей. ");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " +
                increaseKristinaSalary + " рублей. ");
    }

    public static void task4() {
        double temperature;

        for (int i = 0; i < 10; i++) {
            temperature = (Math.random() * 10);
            if (temperature < 5) {
                System.out.printf("На улице %.1f градусов. Нужно надеть шапку \n", temperature);
            } else {
                System.out.printf("На улице %.1f градусов. Можно идти без шапки \n", temperature);
            }

        }
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int monthNumber=0;

        while (monthNumber != -1) {
            System.out.println("Введите номер месяца ( 1-12 ), для выхода введите -1 : ");
            monthNumber = scanner.nextInt();
            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println(" Номер должен быть в диапазоне 1-12");
                continue;
            }

            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("Месяц номер " + monthNumber + " зимой.");
                    break;
                case 3, 4, 5:
                    System.out.println("Месяц номер " + monthNumber + " весной.");
                    break;
                case 6, 7, 8:
                    System.out.println("Месяц номер " + monthNumber + " летом.");
                    break;
                case 9, 10, 11:
                    System.out.println("Месяц номер " + monthNumber + " осенью.");
                    break;
            }
        }
    }

    public static void task6() {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Число " + i + " четное");
            }
        }
    }

    public static void task7() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }


    public static void task8() {
        int totalSum = 2459000;
        int actualSum = 0;
        int monthForSaveMoney = 0;

        while (actualSum < totalSum) {
            actualSum += 15000;
            monthForSaveMoney++;
            System.out.println("Месяц " + monthForSaveMoney + "-й и сумма накоплений равна " +
                    actualSum + " рублей. ");
        }

        int totalYears = monthForSaveMoney / 12;
        int totalMonths = monthForSaveMoney % 12;

        System.out.println("Пришлось копить " + monthForSaveMoney + " месяцев.");
        System.out.println("Или " + totalYears + " лет и " + totalMonths +
                " месяцев.");

    }
}
