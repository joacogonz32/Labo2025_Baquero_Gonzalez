package GestionTickets;
import java.time.Duration;
import java.util.ArrayList;

public class SistemaTickets {
    private ArrayList<Ticket> tickets;
    private ArrayList<Dispositivo> dispositivos;
    private ArrayList<Desarrollador> desarrolladores;

    public ArrayList<Ticket> getTickets() {return tickets;}
    public void setTickets(ArrayList<Ticket> tickets) {this.tickets = tickets;}
    public ArrayList<Dispositivo> getDispositivos() {return dispositivos;}
    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {this.dispositivos = dispositivos;}
    public ArrayList<Desarrollador> getDesarrolladores() {return desarrolladores;}
    public void setDesarrolladores(ArrayList<Desarrollador> desarrolladores) {this.desarrolladores = desarrolladores;}

    public int cantidadTicketsPorEstado(EstadoTicket eT){
        int cantidadTickets = 0;
        for (Ticket t: tickets){
            if (t.getEstado().equals(eT)){
                cantidadTickets++;
            }
        }
        return cantidadTickets;
    }

    public int cantidadTicketsTotal(){
        return tickets.size();
    }

    /* -- Con for i
    public Ticket ticketMasAntiguoAbierto(){
        Ticket masAntiguo = tickets.get(0);
        for (int i = 1; i < tickets.size(); i++) {
            if (tickets.get(i).getFh_creacion().isBefore(masAntiguo.getFh_creacion())){
                masAntiguo = tickets.get(i);
            }
        }
        return masAntiguo;
    }
     */

    /* -- Con for each */
    public Ticket ticketMasAntiguoAbierto(){
        Ticket masAntiguo = tickets.get(0);
        for (Ticket t: tickets) {
            if (t.getFh_creacion().isBefore(masAntiguo.getFh_creacion()) && t.getEstado().equals(EstadoTicket.ABIERTO)){
                masAntiguo = t;
            }
        }
        return masAntiguo;
    }

    public Desarrollador desarrolladorMasResuelve(){
        Desarrollador masResueltos = desarrolladores.get(0);
        for (Desarrollador d: desarrolladores){
            if (d.ticketsResueltos().size() > masResueltos.ticketsResueltos().size()) {
                masResueltos = d;
            }
        }
        return masResueltos;
    }

    public ArrayList<Ticket> ticketsAsignados(Desarrollador dAsignado){
        ArrayList<Ticket> tAsignados = new ArrayList<>();
        for (Ticket tA: tickets){
            if (tA.getDesarrolladoresAsignados().equals(dAsignado)){
                tAsignados.add(tA);
            }
        }
        return tAsignados;
    }

    public Desarrollador desarrolladorMasAntiguo(){
        Desarrollador dMasAntiguo = desarrolladores.get(0);
        for (Desarrollador d: desarrolladores){
            if (d.getF_ingreso().isBefore(dMasAntiguo.getF_ingreso())){
                dMasAntiguo = d;
            }
        }
        return dMasAntiguo;
    }

    public ArrayList<Desarrollador> dAsignadosAResolverlo(Ticket t){
        return t.getDesarrolladoresAsignados();
    }
    
    public Long promTiempoResolucion(){
        Long prom = 0L;
        for (Ticket t: tickets) {
            if (t.getEstado().equals(EstadoTicket.RESUELTO)){
                prom = Duration.between(t.getFh_creacion(), t.getFh_finalizacion()).toHours() / tickets.size();
            }
        }
        return prom;
    }

    public static void main(String[] args) {

    }
}
