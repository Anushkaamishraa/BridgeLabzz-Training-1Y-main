public class Censor {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] bad = {"damn", "stupid"};

        for (String w : bad) {
            text = text.replaceAll("(?i)\\b" + w + "\\b", "****");
        }

        System.out.println(text);
    }
}