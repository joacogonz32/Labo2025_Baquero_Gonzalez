package GestionTickets;
import Persona.Persona;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Persona cliente;
    private String descripcion;
    private LocalDateTime fh_creacion;
    private LocalDateTime fh_finalizacion;
    private ArrayList<Comentario> comentarios;
    private EstadoTicket estado;
    private ArrayList<Desarrollador> desarrolladoresAsignados;

    public Ticket(Persona cliente, String descripcion, LocalDateTime fh_creacion, LocalDateTime fh_finalizacion,
                  ArrayList<Comentario> comentarios, EstadoTicket estado, ArrayList<Desarrollador> desarrolladoresAsignados) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.fh_creacion = fh_creacion;
        this.fh_finalizacion = fh_finalizacion;
        this.comentarios = comentarios;
        this.estado = estado;
        this.desarrolladoresAsignados = desarrolladoresAsignados;
    }

    public Persona getCliente() {return cliente;}
    public void setCliente(Persona cliente) {this.cliente = cliente;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public LocalDateTime getFh_creacion() {return fh_creacion;}
    public void setFh_creacion(LocalDateTime fh_creacion) {this.fh_creacion = fh_creacion;}
    public LocalDateTime getFh_finalizacion() {return fh_finalizacion;}
    public void setFh_finalizacion(LocalDateTime fh_finalizacion) {this.fh_finalizacion = fh_finalizacion;}
    public ArrayList<Comentario> getComentarios() {return comentarios;}
    public void setComentarios(ArrayList<Comentario> comentarios) {this.comentarios = comentarios;}
    public EstadoTicket getEstado() {return estado;}
    public void setEstado(EstadoTicket estado) {this.estado = estado;}
    public ArrayList<Desarrollador> getDesarrolladoresAsignados(){return desarrolladoresAsignados;}
    public void setDesarrolladoresAsignados(ArrayList<Desarrollador> desarrolladoresAsignados){this.desarrolladoresAsignados = desarrolladoresAsignados;}

    public void agregarComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }
    public abstract void cambiarEstado(EstadoTicket nuevo_estado);
    public abstract boolean resolverTicket();

}
