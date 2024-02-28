public class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(int wheelsNumber, int maxSpeed, String engineType) {
        super(wheelsNumber, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void service() {
        System.out.println("Обслужен двигатель типа " + engineType);
        super.service();
    }

}
