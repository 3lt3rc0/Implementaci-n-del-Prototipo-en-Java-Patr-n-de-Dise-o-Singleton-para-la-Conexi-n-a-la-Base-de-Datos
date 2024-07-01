import java.util.Date;

public class Envio {
    private int idEnvio;
    private String direccionDestino;
    private String estado;
    private Date fechaEnvio;
    private Date fechaEntrega;

    public Envio(int idEnvio, String direccionDestino, String estado, Date fechaEnvio, Date fechaEntrega) {
        this.idEnvio = idEnvio;
        this.direccionDestino = direccionDestino;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}