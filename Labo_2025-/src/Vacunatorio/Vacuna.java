package Vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fechaFabricacion;
    private LocalDate fechaAplicacion;
    private int numeroLote;
    private int numeroFabricacion;
    private String nombreComercial;

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getNumeroFabricacion() {
        return numeroFabricacion;
    }

    public void setNumeroFabricacion(int numeroFabricacion) {
        this.numeroFabricacion = numeroFabricacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Vacuna(LocalDate fechaFabricacion, LocalDate fechaAplicacion, int numeroLote, int numeroFabricacion, String nombreComercial) {
        this.fechaFabricacion = fechaFabricacion;
        this.fechaAplicacion = fechaAplicacion;
        this.numeroLote = numeroLote;
        this.numeroFabricacion = numeroFabricacion;
        this.nombreComercial = nombreComercial;
    }
    public Vacuna() {
        this.fechaFabricacion = LocalDate.now();
        this.fechaAplicacion = LocalDate.now();
        this.numeroLote = 1;
        this.numeroFabricacion = 1;
        this.nombreComercial = "Juan";
    }



}
