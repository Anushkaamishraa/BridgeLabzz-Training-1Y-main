import java.util.regex.*;

public class Languages {
    public static void main(String[] args) {
        String text = "I love Java, Python, JavaScript, Go";

        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b")
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}