package SistemaAlmuerzos;
import SistemaAlmuerzos.*;
import Unidad1.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<Plato> platoPedido;
    private LocalDate fechaCreado;
    private String estadoEntrega;
    private LocalTime horaEntrega;
    private Persona solicitante;

    public Pedido(){
        this.platoPedido = new ArrayList<>();
        this.fechaCreado = LocalDate.of(2025,5,20);
        this.estadoEntrega = "Pendiente";
        this.horaEntrega = LocalTime.of(22,0);
        this.solicitante = new Persona("Joaquin", "Gonzalez");
    }

    public Pedido(ArrayList<Plato> platoPedido, LocalDate fechaCreado, String estadoEntrega, LocalTime horaEntrega, Persona solicitante){
        this.platoPedido = platoPedido;
        this.fechaCreado = fechaCreado;
        this.estadoEntrega = estadoEntrega;
        this.horaEntrega = horaEntrega;
        this.solicitante = solicitante;
    }

    public ArrayList<Plato> getPlatoPedido() {
        return platoPedido;
    }
    public void setPlatoPedido(ArrayList<Plato> platoPedido) {
        this.platoPedido = platoPedido;
    }

    public LocalDate getFechaCreado() {
        return fechaCreado;
    }
    public void setFechaCreado(LocalDate fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }
    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }
    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public Persona getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }


    public static void main(String[] args) {

    }

}
