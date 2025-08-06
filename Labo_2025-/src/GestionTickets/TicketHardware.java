package GestionTickets;
import Persona.Persona;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TicketHardware extends Ticket{
    private Dispositivo dispositivo;

    public TicketHardware(Persona cliente, String descripcion, LocalDateTime fh_creacion, LocalDateTime fh_finalizacion,
                          ArrayList<Comentario> comentarios, EstadoTicket estado, ArrayList<Desarrollador> desarrolladoresAsignados,
                          Dispositivo dispositivo) {
        super(cliente, descripcion, fh_creacion, fh_finalizacion, comentarios, estado, desarrolladoresAsignados);
        this.dispositivo = dispositivo;
    }

    public Dispositivo getDispositivo() {return dispositivo;}
    public void setDispositivo(Dispositivo dispositivo) {this.dispositivo = dispositivo;}

    @Override
    public void cambiarEstado(EstadoTicket nuevo_estado) {
        setEstado(nuevo_estado);
        if (nuevo_estado.equals(EstadoTicket.RESUELTO) || nuevo_estado.equals(EstadoTicket.CANCELADO) || nuevo_estado.equals(EstadoTicket.CERRADO)){
            setFh_finalizacion(LocalDateTime.now());
        }
    }

    @Override
    public boolean resolverTicket() {
        if (this.dispositivo.getCant_repuestos() > 0 && getEstado().equals(EstadoTicket.EN_PROGRESO)){
            cambiarEstado(EstadoTicket.RESUELTO);
            return true;
        }
        else {
            return false;
        }
    }



}
