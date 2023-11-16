public class Elemento<T, V> {
    private T dato1;
    private V dato2;

    public Elemento(T dato1, V dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }
    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }
    public void setDato2(V dato2) {
        this.dato2 = dato2;
    }
    public T getDato1() {
        return dato1;
    }
    public V getDato2() {
        return dato2;
    }

    @Override
    public String toString() {
        return this.dato1 + " - " + this.dato2;
    }
}
