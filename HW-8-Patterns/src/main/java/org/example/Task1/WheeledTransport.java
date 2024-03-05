package org.example.Task1;

public abstract class WheeledTransport implements Transport{
    private int wheelsNumber;
    private int maxSpeed;

    public WheeledTransport(int wheelsNumber, int maxSpeed) {
        this.wheelsNumber = wheelsNumber;
        this.maxSpeed = maxSpeed;
    }

    public WheeledTransport() {

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

    @Override
    public void service() {
        System.out.println("Обслужено колёс: " + wheelsNumber + " шт.");
    }
}
