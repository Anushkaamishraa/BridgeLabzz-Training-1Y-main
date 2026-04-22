public class Spaces {
    public static void main(String[] args) {
        String input = "This   is   text";
        System.out.println(input.replaceAll("\\s+", " "));
    }
}