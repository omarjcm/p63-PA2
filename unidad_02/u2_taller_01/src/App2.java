import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {
    public static void main(String[] args) {
        String texto = "31-09-2023";

        Pattern pattern = Pattern.compile("^([0][1-9]|[1-2][0-9]|[3][0-1])-([0][1-9]|[1][0-2])-\\d{4}");
        Matcher match = pattern.matcher(texto);
        System.out.println(match.find());        
    }
}
