public class HW_1_4 {
    public static void main(String[] args) {
        double temperature;

        for (int i = 0; i < 10; i++) {
            temperature = (Math.random() * 10);
            if ( temperature < 5) {
                System.out.printf("На улице %.1f градусов. Нужно надеть шапку \n", temperature);
            }
            else {
                System.out.printf("На улице %.1f градусов. Можно идти без шапки \n", temperature);
            }

        }
    }
}
