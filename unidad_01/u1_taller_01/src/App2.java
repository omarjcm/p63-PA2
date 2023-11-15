public class App2 {
    public static void main(String[] args) {
        Elemento<String, Integer> obj1 = new Elemento<String,Integer>("Hola mundo", 100);
        String dato1 = obj1.getDato1();
        System.out.println(dato1);

        Elemento<Integer, Integer> obj2 = new Elemento<Integer,Integer>(100, 100);
        System.out.println( obj2.getDato1() );
    }
}
