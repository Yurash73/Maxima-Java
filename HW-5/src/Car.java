public class Car extends MotorTransport {
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

    public void service() {
        System.out.println("Обслуживаем автомобиль марки " + brand + " модель: " + model);
        super.service();
    }

}
