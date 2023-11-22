public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;

    public Persona(String cedula, String nombre, String apellido) { 
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object objeto) {
        Persona persona = (Persona) objeto;
        return (this.cedula == persona.getCedula() && this.apellido == persona.getApellido() && this.nombre == persona.getNombre());
    }

    @Override
    public String toString() {
        return "Cedula: " + this.cedula + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido;
    }
}
