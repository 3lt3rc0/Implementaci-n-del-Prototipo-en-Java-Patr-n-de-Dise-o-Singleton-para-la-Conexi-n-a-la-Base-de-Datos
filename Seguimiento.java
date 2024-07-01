public interface Seguimiento {
    void registrarEnvio(Envio envio);
    void actualizarEstadoEnvio(int idEnvio, String nuevoEstado);
    Envio consultarEnvio(int idEnvio);
}