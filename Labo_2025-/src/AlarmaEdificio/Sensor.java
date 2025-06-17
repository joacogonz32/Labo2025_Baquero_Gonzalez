package AlarmaEdificio;
import java.time.LocalDate;

public abstract class Sensor{
    private boolean estado;
    private double medida;
    private double umbralInicial;
    private LocalDate fechaAdquisicion;

    public Sensor(boolean estado, double medida, double umbralInicial, LocalDate fechaAdquisicion){
        this.estado = estado;
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public boolean isEstado() {return estado;}
    public void setEstado(boolean estado) {this.estado = estado;}
    public double getMedida() {return medida;}
    public void setMedida(double medida) {this.medida = medida;}
    public double getUmbralInicial() {return umbralInicial;}
    public void setUmbralInicial(double umbralInicial) {this.umbralInicial = umbralInicial;}
    public LocalDate getFechaAdquisicion() {return fechaAdquisicion;}
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {this.fechaAdquisicion = fechaAdquisicion;}

    public abstract void suenaAlarma();

}
