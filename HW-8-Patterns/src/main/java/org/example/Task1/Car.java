package org.example.Task1;

import java.util.Locale;

final public class Car extends MotorTransport {
    private String brand;
    private String model;


    public Car(int wheelsNumber, int maxSpeed, String engineType, String brand, String model) {
        super(wheelsNumber, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    public Car() {
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static class CarBuilder {
        private Car newCar = new Car();

        public CarBuilder wheelsNumber(int wheelsNumber) {
            newCar.setWheelsNumber(wheelsNumber);
            return this;
        }

        public CarBuilder maxSpeed(int maxSpeed) {
            newCar.setMaxSpeed(maxSpeed);
            return this;
        }

        public CarBuilder engineType(String engineType) {
            newCar.setEngineType(engineType);
            return this;
        }

        public CarBuilder brand(String brand) {
            newCar.setBrand(brand);
            return this;
        }

        public CarBuilder model(String model) {
            newCar.setModel(model);
            return this;
        }

        public Car build() {
            return newCar;
        }

    }

    @Override
    public void service() {
        serviceCar();
        super.service();
    }

    private void serviceCar() {
        System.out.println("Обслуживаем автомобиль марки " + brand + " модель: " + model);
    }

    final public void saleCar() {
        System.out.println("Я продал автомобиль!!!");
    }

}