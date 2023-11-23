import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Clase Wrapper
        ArrayList<Object> lista1 = new ArrayList<Object>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);

        for (Object obj : lista1) {
            if (obj.equals(40)) {
                System.out.println(obj);
            }
        }

        // Clase Wrapper
        ArrayList<Object> lista3 = new ArrayList<Object>();
        lista1.add("Juan");
        lista1.add("Ximena");
        lista1.add("Lola");
        lista1.add("Carlos");

        for (Object obj : lista1) {
            if (obj.equals("Ximena")) {
                System.out.println(obj);
            }
        }

        // Clase definida por el usuario
        ArrayList<Object> lista2 = new ArrayList<Object>();
        lista2.add( new Persona("0937465839", "Juan", "Alba") );
        lista2.add( new Persona("0937465812", "Maria", "Hinojosa") );
        lista2.add( new Persona("0937461239", "Andrea", "Calle") );
        lista2.add( new Persona("0937125839", "Dario", "Betancurt") );

        
        for (Object obj2 : lista2) {
            Persona obj3 = new Persona("0937125839", "Dario   ", "Betancurt");
    
            if (((Persona)obj2).equals(obj3)) {
                System.out.println(obj2);
            }
        }
    }
}
