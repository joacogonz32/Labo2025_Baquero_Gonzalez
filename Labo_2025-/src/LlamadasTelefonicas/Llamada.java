package LlamadasTelefonicas;
import java.time.LocalDateTime;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private int duracionSeg;
    private LocalDateTime fechaLlamada;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, int duracionSeg, LocalDateTime fechaLlamada){
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.duracionSeg = duracionSeg;
        this.fechaLlamada = fechaLlamada;
    }

    public Empleado getEmpleadoOrigen() { return empleadoOrigen; }
    public void setEmpleadoOrigen(Empleado empleadoOrigen) { this.empleadoOrigen = empleadoOrigen; }
    public Empleado getEmpleadoDestino() { return empleadoDestino; }
    public void setEmpleadoDestino(Empleado empleadoDestino) { this.empleadoDestino = empleadoDestino; }
    public int getDuracionSeg() { return duracionSeg;}
    public void setDuracionSeg(int duracionSeg) { this.duracionSeg = duracionSeg; }
    public LocalDateTime getFechaLlamada() { return fechaLlamada; }
    public void setFechaLlamada(LocalDateTime fechaLlamada) { this.fechaLlamada = fechaLlamada; }

    public boolean esdelExterior(){
        return !empleadoOrigen.getPais().equals(empleadoDestino.getPais());
    }
}
