package capanegocio;

public class Paquetes {

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    private String codigo;
    private String destino;
    private String fechaI;
    private String fechaF;
    private String clase;
}
