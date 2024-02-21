import java.util.Scanner;

public class HW_1_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Введите номер месяца ( 1-12 ): ");
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
}
