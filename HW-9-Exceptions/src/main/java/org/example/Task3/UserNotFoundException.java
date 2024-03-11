package org.example.Task3;

public class UserNotFoundException extends  Exception {
    String message;
    public UserNotFoundException(String message) {

        super(message);
    }
}
