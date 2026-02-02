package com.mycompany.app;

public class App {

    // SECURITY ISSUE: hardcoded secret
    private static final String API_KEY = "HARDCODED_SECRET_123";

    public static void main(String[] args) {
        riskyMethod();
        System.out.println("Hello World!");
    }

    // BUG + CODE SMELL
    public static void riskyMethod() {
        try {
            int x = 10 / 0; // divide by zero
        } catch (Exception e) {
            // empty catch block (code smell)
        }
    }

    // Method used by tests
    public int add(int a, int b) {
        return a + b;
    }
}
