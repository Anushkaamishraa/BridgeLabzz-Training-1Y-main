public class Card {
    public static void main(String[] args) {
        String card = "4123456789012345";

        System.out.println(card.matches("^4\\d{15}$|^5\\d{15}$"));
    }
}