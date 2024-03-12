package org.example.Task3;

public class Main {
    public static void main(String[] args) {
        try {
            findUserById(3);
            findUserById(17);
            findUserById(-3);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findUserById(int userId) throws UserNotFoundException {
        if (userId < 0) {
            throw new UserNotFoundException("Пользователь не может иметь ID < 0, вы ввели: " + userId);
        } else {
            System.out.println("Ищем пользователя с ID = " + userId);
        }
    }
}
