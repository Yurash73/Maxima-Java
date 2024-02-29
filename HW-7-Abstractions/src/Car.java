final public class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(int wheelsNumber, int maxSpeed, String engineType, String brand, String model) {
        super(wheelsNumber, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
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

    @Override
    public void service() {
        serviceCar();
        super.service();
    }

    private void serviceCar () {
        System.out.println("Обслуживаем автомобиль марки " + brand + " модель: " + model);
    }

    final public void saleCar() {
        System.out.println("Я продал автомобиль!!!");
    }

}
