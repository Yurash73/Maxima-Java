package org.example.Task3;

public class Calculator {

    public Calculator() {

    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public int sum(int firstNum, int... otherNum) {
        int result = firstNum;
        for (int numbers : otherNum) {
            result += numbers;
        }
        return result;
    }
}
