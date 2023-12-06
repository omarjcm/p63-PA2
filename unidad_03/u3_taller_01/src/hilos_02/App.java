package hilos_02;

public class App {
    public static void main(String[] args) {
        Interrupcion proceso = new Interrupcion();
        Thread hilo = new Thread( proceso );
        hilo.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Inicio de la interrupcion");
        hilo.interrupt();
        System.out.println("Finalizacion de la interrupcion");
        System.out.println("Finalizacion");
    }
}
