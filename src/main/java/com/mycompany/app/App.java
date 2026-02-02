package com.mycompany.app;

public class App {

    private String message = "Hello CI!";

    public static void main(String[] args) {
        System.out.println("Hello CI!");
    }

    public String getMessage() {
        return message;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
