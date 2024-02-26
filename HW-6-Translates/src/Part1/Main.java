package Part1;

public class Main {
    public static void main(String[] args) {

        MyScanner myScanner = new MyScanner();
        myScanner.printStartText();
        myScanner.makeChoice();

        WheeledTransport myTransport = null;

        if (myScanner.getChoice() == 1) {
            myTransport = new Bicycle(2, 40, "Горный");
        } else if (myScanner.getChoice() == 2) {
            myTransport = new Car(4, 240, "Petrol", "Audi", "A6");
        } else if (myScanner.getChoice() == 3) {
            myTransport = new Truck(6, 180, "Diesel", 28);
        }

        visitServiceStation(myTransport);

    }

    public static void visitServiceStation(WheeledTransport transport) {
        if (transport instanceof Bicycle) {
            transport.service();
            ((Bicycle) transport).saleBicycle();
        } else if (transport instanceof Car) {
            transport.service();
            ((Car) transport).saleCar();
        } else if (transport instanceof Truck) {
            transport.service();
            ((Truck) transport).saleTruck();
        }
    }

}