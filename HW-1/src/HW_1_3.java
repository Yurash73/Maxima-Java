public class HW_1_3 {
    public static void main(String[] args) {

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int increaseSalaryPercents = 10;

        int newSalaryMasha = salaryMasha + salaryMasha * increaseSalaryPercents / 100;
        int newSalaryDenis = salaryDenis + salaryDenis * increaseSalaryPercents / 100;
        int newSalaryKristina = salaryKristina + salaryKristina * increaseSalaryPercents / 100;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " +
                (newSalaryMasha * 12 - salaryMasha * 12) + " рублей. ");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " +
                (newSalaryDenis * 12 - salaryDenis * 12) + " рублей. ");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " +
                (newSalaryKristina * 12 - salaryKristina * 12) + " рублей. ");

    }
}

