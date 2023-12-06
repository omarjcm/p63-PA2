package hilos_01;

public class Tarea implements Runnable {

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() );
    }
}