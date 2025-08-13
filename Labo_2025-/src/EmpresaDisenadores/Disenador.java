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

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public TipoDisenador getTipoDeDiseno() {return tipoDeDiseno;}
    public void setTipoDeDiseno(TipoDisenador tipoDeDiseno) {this.tipoDeDiseno = tipoDeDiseno;}
    public HashSet<Proyecto> getProyectosRealizados() {return proyectosRealizados;}
    public void setProyectosRealizados(HashSet<Proyecto> proyectosRealizados) {this.proyectosRealizados = proyectosRealizados;}

    public double calculaComision(Proyecto proyectoACotizar) {
        double ganancia = 0;
        ganancia = proyectoACotizar.getValorTotal() * this.tipoDeDiseno.getComisionGanada();
        return ganancia;
    }

    public double calculaSueldo(){
        double sueldo = 0;
        for (Proyecto p : proyectosRealizados)
            sueldo += p.getValorTotal() + this.calculaComision(p);
        return sueldo;
    }

    public int cantProyectosHastaAhora(){return this.proyectosRealizados.size();}

    public double sueldoSinComision(Proyecto p){
        return p.getValorTotal();
    }

    public void infoProyecto(){
        for (Proyecto p : this.proyectosRealizados){
            System.out.println(p.getNombre());
            System.out.println(sueldoSinComision(p));
            System.out.println(calculaComision(p));
            System.out.println("- - -");
        }
    }

    public static void main(String[] args) {

    }
}
