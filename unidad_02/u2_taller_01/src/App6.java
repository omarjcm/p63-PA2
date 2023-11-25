import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App6 {
    public static void main(String[] args) {
        /*
         * VALIDACION DE CORREO ELECTRONICO
         * - Debe iniciar solo con un caracter alfabetico y luego de esto puede estar algunos caracteres.
         * - Debe finalizar con @ups.edu.ec o @est.ups.edu.ec
         * - Puede tener digitos al final del usuario, antes SWSdel arroba.
         */
        String texto = "gpizarro@ups.edu.ec";

        Pattern pattern = Pattern.compile("^[a-z]+[0-9]*(@ups.edu.ec|@est.ups.edu.ec)$");
        Matcher match = pattern.matcher(texto);
        System.out.println(match.find());
    }
}
