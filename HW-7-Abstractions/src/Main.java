import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Transport>  transportList = new ArrayList<>();
        transportList.add(new Bicycle(2,40,"Горный"));
        transportList.add(new Bicycle(2,60,"Шоссейный"));
        transportList.add(new Car(4, 240, "Petrol", "Audi", "A6"));
        transportList.add(new Car(4, 280, "Diesel", "BMW", "X5"));
        transportList.add(new Truck(4, 160, "Petrol",18 ));
        transportList.add(new Truck(4, 180, "Diesel",28 ));

        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport: transportList) {
            serviceStation.visitServiceStation(transport);
            System.out.println();
        }

    }

}