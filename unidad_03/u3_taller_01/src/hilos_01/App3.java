package hilos_01;

public class App3 {
    public static void main(String[] args) {
        
        Thread hilo1 = new Thread( new Tarea2("1") );
        Thread hilo2 = new Thread( new Tarea2("2") );
        Thread hilo3 = new Thread( new Tarea2("3") );
        Thread hilo4 = new Thread( new Tarea2("4") );

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
