package SistemaPoblacion;
import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenada> coordContornoLimite;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenada> getCoordContornoLimite() {
        return coordContornoLimite;
    }

    public void setCoordContornoLimite(HashSet<Coordenada> coordContornoLimite) {
        this.coordContornoLimite = coordContornoLimite;
    }



}
