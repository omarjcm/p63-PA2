import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App5 {
    public static void main(String[] args) {
        String texto = "123Hola1 mundo012s34s5";

        Pattern pattern = Pattern.compile("^\\d{3,4}");
        Matcher match = pattern.matcher(texto);
        System.out.println(match.find());        
    }
}
