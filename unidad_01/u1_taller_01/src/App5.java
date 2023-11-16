import java.util.ArrayList;

public class App5 {
    public static void main(String[] args) {
        ArrayList<Object> lista1 = new ArrayList<Object>();
        Elemento<String, Integer> obj1 = new Elemento<String,Integer>("Hola mundo", 100);
        lista1.add(obj1);
        Elemento<String, Integer> obj2 = new Elemento<String,Integer>("Mundo Hola", 200);
        lista1.add(obj2);
        Elemento<String, String> obj3 = new Elemento<String,String>("Mundo Hola", "HOLA MUNDO");
        lista1.add(obj3);

        Persona obj4 = new Persona("0947384922", "Luis", "Armijos");
        lista1.add(obj4);

        for (Object elemento : lista1) {
            System.out.println( elemento );
        }
    }
}
