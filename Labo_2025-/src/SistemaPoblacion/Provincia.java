package SistemaPoblacion;
import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<Ciudad> ciudades;

    public Provincia(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
