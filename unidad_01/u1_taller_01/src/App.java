import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(10);
        lista1.add(100);
        lista1.add(60);
        lista1.add(99);

        for (Integer elemento : lista1) {
            System.out.println(elemento);
        }

        ArrayList<String> lista2 = new ArrayList<String>();
        lista2.add("10");
        lista2.add("100");
        lista2.add("60");
        lista2.add("99");

        for (String elemento : lista2) {
            System.out.println(elemento);
        }
    }
}
