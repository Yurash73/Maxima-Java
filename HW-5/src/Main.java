public class Main {
    public static void main(String[] args) {

         Bicycle bicycle = new Bicycle(2,40, "Горный");
         Car carAudi = new Car(4,240,"Petrol","Audi","A6");
         Truck truckKamaz = new Truck(6,180,"Diesel",28);

         visitServiceStation(bicycle);
         visitServiceStation(carAudi);
         visitServiceStation(truckKamaz);

    }

    public  static void visitServiceStation (WheeledTransport transport) {
        transport.service();
        System.out.println();
    }
}