public class App {

    public static void main(String[] args) {
        riskyMethod();
        System.out.println("Hello World!");
    }

    private static void riskyMethod() {
        try {
            int x = 10 / 0;   // BUG: divide by zero
        } catch (Exception e) {
            // EMPTY catch block → BUG + CODE SMELL
        }
    }

    // SECURITY ISSUE
    private static final String API_KEY = "HARDCODED_SECRET_123";
}
