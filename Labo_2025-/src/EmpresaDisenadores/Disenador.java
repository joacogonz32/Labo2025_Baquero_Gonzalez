package EmpresaDisenadores;
import java.util.HashSet;

public class Disenador {
    private String nombre;
    private TipoDisenador tipoDeDiseno;
    private HashSet<Proyecto> proyectosRealizados;

    public Disenador(String nombre, TipoDisenador tipoDeDiseno, HashSet<Proyecto> proyectosRealizados) {
        this.nombre = nombre;
        this.tipoDeDiseno = tipoDeDiseno;
        this.proyectosRealizados = proyectosRealizados;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoDisenador getTipoDeDiseno() {
        return tipoDeDiseno;
    }
    public void setTipoDeDiseno(TipoDisenador tipoDeDiseno) {
        this.tipoDeDiseno = tipoDeDiseno;
    }
    public HashSet<Proyecto> getProyectosRealizados() {
        return proyectosRealizados;
    }
    public void setProyectosRealizados(HashSet<Proyecto> proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public TipoDisenador getTipoDisenador();
    public boolean esDelTipo(Disenador disenador);

    public double calculaComision(Proyecto proyectoACotizar) {
        double comisionGanada = 0;

        return comisionGanada;
    }

    public static void main(String[] args) {

    }
}
