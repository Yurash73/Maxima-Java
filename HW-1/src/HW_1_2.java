public class HW_1_2 {
    public static void main(String[] args) {

        int totalCan = 120;
        int whiteColorCan = 2;
        int brownColorCan = 4;
        int totalWhiteColorCan;
        int totalBrownColorCan;

        int classes = totalCan / (whiteColorCan + brownColorCan);
        totalBrownColorCan = classes * brownColorCan;
        totalWhiteColorCan = classes * whiteColorCan;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteColorCan +
                " банок белой краски и " + totalBrownColorCan + " банок коричневой краски");

    }
}
