public class WheeledTransport {
    private int wheelsNumber;
    private int maxSpeed;

    public WheeledTransport(int wheelsNumber, int maxSpeed) {
        this.wheelsNumber = wheelsNumber;
        this.maxSpeed = maxSpeed;
    }


    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void service() {
        System.out.println("Обслужено колёс: " + wheelsNumber + " шт.");
    }
}
