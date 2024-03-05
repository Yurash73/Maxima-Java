package org.example.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Transport> transportList = new ArrayList<>();
        transportList.add(new Bicycle(2, 40, "Горный"));
        transportList.add(new Bicycle(2, 60, "Шоссейный"));
        transportList.add(new Car.CarBuilder()
                .wheelsNumber(4)
                .maxSpeed(240)
                .engineType("Petrol")
                .brand("Audi")
                .model("A6")
                .build());
        transportList.add(new Car.CarBuilder().
                brand("BMW").
                model("X5").
                engineType("Diesel")
                .wheelsNumber(4).
                maxSpeed(280).build());
        transportList.add(new Truck(4, 160, "Petrol", 18));
        transportList.add(new Truck(4, 180, "Diesel", 28));

        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport : transportList) {
            serviceStation.visitServiceStation(transport);
            System.out.println();
        }

    }
}
