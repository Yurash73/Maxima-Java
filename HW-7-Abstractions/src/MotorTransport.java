public abstract class MotorTransport extends WheeledTransport {
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
        serviceEngine();
        super.service();
    }

    private void serviceEngine() {
        System.out.println("Обслужен двигатель типа " + engineType);
    }

}