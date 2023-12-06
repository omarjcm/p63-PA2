package hilos_02;

public class Interrupcion implements Runnable {

    public void trabajar() {
        while(true) {
            System.out.println("Trabajando...");
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }
    }

    @Override
    public void run() {
        trabajar();
    }
    
}
