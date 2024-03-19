package org.example.Task1;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public void addPhone(String name, String phoneNumber) {
        if (phoneNumber.matches(".*[а-яА-яЁё]+.*")) {
            System.out.println("Номер телефона должен содержать только цифры!");
            return;
        } else if (name.matches(".*\\d+.*")) {
            System.out.println("Имя не должно содержать  цифры!");
            return;
        } else {
            phoneBook.put(name, phoneNumber);
            System.out.println("Добавляем в список:" + name + " с номером " + phoneNumber);
        }
    }

    public void searchPhoneNumber(String name) {
       if (phoneBook.containsKey(name)) {
           System.out.println("У абонента "+ name + " номер телефона: " +
                   phoneBook.get(name));
       }
       else  {
           System.out.println("Абонент " + name + " не зарегистрирован.");
       }
    }

    public void deletePhoneNUmber(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Номер абонента " + name + " удалён из списка.");
        } else {
            System.out.println("Абонента:" + name + " не было в списке.");
        }
    }
}
