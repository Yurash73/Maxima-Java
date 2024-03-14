package org.example.Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> words = new HashMap<>();
        while (true) {
            System.out.println("Введите сторку для анализа или Enter для выхода:");
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String[] wordsArray = line.split("\\s+");
            for (String w : wordsArray) {
                if (words.containsKey(w)) {
                    Integer temp = words.get(w);
                    words.put(w,++temp);
                }
                else { words.put(w,1);}
            }
            System.out.println(words);
            words.clear();
        }
        scanner.close();
    }
}
