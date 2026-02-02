package com.mycompany.app;

public class App {

    private String message = "Hello World";

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    // Required by AppTest.java
    public String getMessage() {
        return message;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
