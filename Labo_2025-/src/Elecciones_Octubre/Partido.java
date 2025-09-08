package Elecciones_Octubre;
import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajero> enviadoresMensajes;

    public Partido(String nombre, String direccion, int cantAfiliados, HashSet<Mensajero> enviadoresMensajes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.enviadoresMensajes = enviadoresMensajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajero> getEnviadoresMensajes() {
        return enviadoresMensajes;
    }

    public void setEnviadoresMensajes(HashSet<Mensajero> enviadoresMensajes) {
        this.enviadoresMensajes = enviadoresMensajes;
    }

    public void agregarMensajero(Mensajero mensajero){
        enviadoresMensajes.add(mensajero);
    }
    public void hacerCampaña(){
        String mensajeFinal = "Vote este partido para un futuro mejor.";
        for (Mensajero m : enviadoresMensajes){
          m.enviarMensaje(mensajeFinal);
        }

    }
}
