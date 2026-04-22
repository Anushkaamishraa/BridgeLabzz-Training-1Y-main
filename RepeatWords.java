import java.util.regex.*;

public class RepeatWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word";

        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}