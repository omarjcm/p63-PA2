import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App4 {
    public static void main(String[] args) {
        String texto = "30-10-1980";

        Pattern pattern = Pattern.compile("^([0][1-9]|[1-2][0-9]|[3][0-1])-([0][1-9]|[1][0-2])-(19|20)[0-9][0-9]$");
        Matcher match = pattern.matcher(texto);
        System.out.println(match.find());        
    }
}
