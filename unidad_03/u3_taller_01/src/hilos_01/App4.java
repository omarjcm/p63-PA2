package hilos_01;

public class App4 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread( App4::imprimir );

        hilo1.start();
    }

    public static void imprimir() {
        System.out.println( Thread.currentThread().getName() );
    }
}
