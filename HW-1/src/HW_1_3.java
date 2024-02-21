public class HW_1_3 {
    public static void main(String[] args) {

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int increaseSalaryPercents = 10;

        double newSalaryMasha = salaryMasha + salaryMasha * increaseSalaryPercents / 100;
        double  newSalaryDenis = salaryDenis + salaryDenis * increaseSalaryPercents / 100;
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
}

