package hilos_03;

public class App {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Programacion Aplicada");
        Panel panel = new Panel();
        ventana.add(panel);
        ventana.setVisible(true);
    }
}
