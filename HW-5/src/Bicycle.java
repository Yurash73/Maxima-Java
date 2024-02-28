public class Bicycle extends WheeledTransport {
    private String bicycleType;

    public Bicycle(int wheelsNumber, int maxSpeed, String bicycleType) {
        super(wheelsNumber, maxSpeed);
        this.bicycleType = bicycleType;
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }

    @Override
    public void service() {
        System.out.println("Обслужен оборудование велосипеда типа " + bicycleType);
        super.service();
    }
}
