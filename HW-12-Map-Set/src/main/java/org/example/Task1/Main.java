package org.example.Task1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("Инициализируем Справочник.");
        phoneBook.addPhone("Иванов","8-950-123-4567");
        phoneBook.addPhone("Петров","8-495-555-8194");
        phoneBook.addPhone("Сидоров","8-343-298-3384");
        phoneBook.addPhone("Кузнецов","8-912-733-8903");
        phoneBook.addPhone("Попов","8-999-254-0803");

        System.out.println("Ищем Петрова");
        phoneBook.searchPhoneNumber("Петров");

        System.out.println("Ищем Жиглова");
        phoneBook.searchPhoneNumber("Жиглов");

        System.out.println("Простая проверка на корректность данных при вводе:");
        phoneBook.addPhone("Попов3","8-999-254-0802");
        phoneBook.addPhone("Горбачев","8-999-ну4-080К");

        phoneBook.deletePhoneNUmber("Петров");
        phoneBook.deletePhoneNUmber("Жиглов");


    }
}
