public class HW_1_8 {
    public static void main(String[] args) {

        int totalSum = 2459000;
        int actualSum = 0;
        int monthForSaveMoney = 0;

        while (actualSum < totalSum) {
            actualSum += 15000;
            monthForSaveMoney++;
            System.out.println("Месяц " + monthForSaveMoney + "-й и сумма накоплений равна " +
                    actualSum + " рублей. ");
        }

        System.out.println("Пришлось копить " + monthForSaveMoney + " месяцев.");
        System.out.println("Или " + monthForSaveMoney / 12 + " лет и " + monthForSaveMoney % 12 +
                " месяцев.");

    }
}
