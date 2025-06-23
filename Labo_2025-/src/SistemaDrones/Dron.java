package SistemaDrones;
import java.time.LocalDate;

public abstract class Dron {
    private String nombre;
    private LocalDate fechaAdq;
    private int nivelCarga;
    private int idDron;
    private Estado estado;

    public Dron(String nombre, LocalDate fechaAdq, int nivelCarga, int idDron, Estado estado) {
        this.nombre = nombre;
        this.fechaAdq = fechaAdq;
        this.nivelCarga = nivelCarga;
        this.idDron = idDron;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaAdq() {
        return fechaAdq;
    }
    public void setFechaAdq(LocalDate fechaAdq) {
        this.fechaAdq = fechaAdq;
    }
    public int getNivelCarga() {
        return nivelCarga;
    }
    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }
    public int getIdDron() {
        return idDron;
    }
    public void setIdDron(int idDron) {
        this.idDron = idDron;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int recargaBateria(){
        if (nivelCarga <= 10 && nivelCarga >= 0){
            nivelCarga = 100;
        }
        else if (nivelCarga > 10 && nivelCarga <= 100){
            nivelCarga += 10;
        }
        else {
            System.out.println("Ocurrio un error");
        }
        return nivelCarga;
    }

    public abstract boolean evaluaMision(Mision mision);

    public static void main(String[] args) {

    }
}
