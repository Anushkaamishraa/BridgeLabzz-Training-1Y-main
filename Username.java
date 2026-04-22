public class Username {
    public static void main(String[] args) {
        String input = "user_123";
        System.out.println(input.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));
    }
}