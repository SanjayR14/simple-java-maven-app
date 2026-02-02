package com.mycompany.app;

public class App {

    // 🔴 SECURITY ISSUE (Sonar will catch this)
    private static final String API_KEY = "HARDCODED_SECRET_123";

    private String message = "Hello CI";

    public static void main(String[] args) {
        riskyMethod();
        System.out.println("Hello CI!");
    }

    // ✅ REQUIRED BY AppTest.java
    public String getMessage() {
        return message;
    }

    // 🔴 BUG + CODE SMELL
    public static void riskyMethod() {
        try {
            int x = 10 / 0; // divide by zero
        } catch (Exception e) {
            // empty catch block (code smell)
        }
    }

    // (Optional but safe)
    public int add(int a, int b) {
        return a + b;
    }
}
