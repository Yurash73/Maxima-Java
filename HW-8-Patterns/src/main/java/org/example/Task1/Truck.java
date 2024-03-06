package org.example.Task1;

final public class Truck extends MotorTransport {
    private int capacity;

    public Truck(int wheelsNumber, int maxSpeed, String engineType, int capacity) {
        super(wheelsNumber, maxSpeed, engineType);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void service() {
        serviceTruck();
        super.service();
    }

    private void  serviceTruck() {
        System.out.println("Обслуживаем грузовик грузоподъемностью " + capacity + " тонн.");
    }
    final public void saleTruck() {
        System.out.println("Я продал грузовичек!");
    }
}
