package com.mycompany.app;

public class App {

    // ❌ SECURITY ISSUE: Hardcoded API key
    private static final String API_KEY = "sk_live_123456789";

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
    public int divide(int a, int b) {
    return a / 0; // ❌ BUG: Division by zero
}
    public void process() {
    try {
        int x = 10 / 0;
    } catch (Exception e) {
        // ❌ Empty catch block
    }
}


}
