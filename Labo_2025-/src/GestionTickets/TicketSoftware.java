package GestionTickets;
import Persona.Persona;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TicketSoftware extends Ticket{
    private Software software;
    private static int intentos_resolucion = 3;
    private int intentos_actuales;

    public TicketSoftware(Persona cliente, String descripcion, LocalDateTime fh_creacion, LocalDateTime fh_finalizacion,
                          ArrayList<Comentario> comentarios, EstadoTicket estado, ArrayList<Desarrollador> desarrolladoresAsignados,
                          Software software, int intentos_usados) {
        super(cliente, descripcion, fh_creacion, fh_finalizacion, comentarios, estado, desarrolladoresAsignados);
        this.software = software;
        this.intentos_actuales = intentos_resolucion;
    }

    public Software getSoftware() {return software;}
    public void setSoftware(Software software) {this.software = software;}
    public static int getIntentos_resolucion() {return intentos_resolucion;}
    public int getIntentos_actuales() {return intentos_actuales;}
    public void setIntentos_actuales(int intentos_actuales) {this.intentos_actuales = intentos_actuales;}

    @Override
    public void cambiarEstado(EstadoTicket nuevo_estado) {
        if (getEstado().equals(EstadoTicket.ABIERTO) && getDesarrolladoresAsignados().isEmpty()){
            setEstado(nuevo_estado);
            if (nuevo_estado.equals(EstadoTicket.RESUELTO) || nuevo_estado.equals(EstadoTicket.CANCELADO) || nuevo_estado.equals(EstadoTicket.CERRADO)){
                setFh_finalizacion(LocalDateTime.now());
            }
        }
    }

    @Override
    public boolean resolverTicket() {
        if (this.software.isTiene_parche() && getEstado().equals(EstadoTicket.EN_PROGRESO) && intentos_actuales > 0){
            cambiarEstado(EstadoTicket.RESUELTO);
            return true;
        }
        else {
            intentos_actuales--;
            return false;
        }
    }



}
