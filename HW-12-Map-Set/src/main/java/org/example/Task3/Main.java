package org.example.Task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set names = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Введите имя или Annstop для выхода:");
                String line = scanner.nextLine();
                if (line.toLowerCase().equals("stop")) {
                    break;
                }
                line = line.substring(0, 1).toUpperCase() + line.substring(1).toLowerCase();
                names.add(line);
            }

            System.out.println(names);
        }
    }
}
