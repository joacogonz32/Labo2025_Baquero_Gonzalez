package SistemaPoblacion;
import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<Provincia> provincias;

    public Pais(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }
}
