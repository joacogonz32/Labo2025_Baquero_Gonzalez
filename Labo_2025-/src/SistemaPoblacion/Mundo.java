package SistemaPoblacion;
import java.util.HashSet;

public class Mundo {
    private HashSet<Continente> continentes;

    public Mundo(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }
}
