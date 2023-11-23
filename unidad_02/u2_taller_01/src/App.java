import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "12-11-2023";

        Pattern pattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}");
        Matcher match = pattern.matcher(texto);
        System.out.println(match.find());
    }
}
