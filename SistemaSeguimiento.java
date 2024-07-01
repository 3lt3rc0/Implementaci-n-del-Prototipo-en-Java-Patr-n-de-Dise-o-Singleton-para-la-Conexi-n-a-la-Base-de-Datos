import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaSeguimiento {
    private List<Envio> envios;

    public SistemaSeguimiento() {
        this.envios = new ArrayList<>();
    }

    public void registrarEnvio(Envio envio) {
        envios.add(envio);
    }

    public void actualizarEstadoEnvio(int idEnvio, String nuevoEstado) {
        for (Envio envio : envios) {
            if (envio.getIdEnvio() == idEnvio) {
                envio.setEstado(nuevoEstado);
                if ("Entregado".equals(nuevoEstado)) {
                    envio.setFechaEntrega(new Date());
                }
                break;
            }
        }
    }

    public Envio consultarEnvio(int idEnvio) {
        for (Envio envio : envios) {
            if (envio.getIdEnvio() == idEnvio) {
                return envio;
            }
        }
        return null;
    }
}