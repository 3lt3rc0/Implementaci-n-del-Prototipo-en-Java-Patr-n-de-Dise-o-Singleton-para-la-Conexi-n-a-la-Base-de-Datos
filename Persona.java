public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String direccion;

    public Persona(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public abstract void mostrarDetalles();
}