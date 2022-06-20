package capanegocio;

public class Solicitud {

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    private String nro;
    private String nombre;
    private String fecha;
}
