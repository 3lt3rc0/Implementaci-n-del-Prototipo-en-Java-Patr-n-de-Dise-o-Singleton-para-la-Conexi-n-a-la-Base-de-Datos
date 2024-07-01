public class Cliente extends Persona {
    public Cliente(int id, String nombre, String direccion) {
        super(id, nombre, direccion);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cliente ID: " + id + ", Nombre: " + nombre + ", Dirección: " + direccion);
    }

    // Agrega los getters necesarios
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}