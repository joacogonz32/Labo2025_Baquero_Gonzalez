package GestionTickets;
import Persona.Persona;
import java.time.LocalDate;
import java.util.ArrayList;

public class Desarrollador extends Persona {
    private ArrayList<Ticket> ticketsAsignados;
    private LocalDate f_ingreso;

    public Desarrollador(String nombre, String apellido, ArrayList<Ticket> ticketsAsignados, LocalDate f_ingreso) {
        super(nombre, apellido);
        this.ticketsAsignados = ticketsAsignados;
        this.f_ingreso = f_ingreso;
    }

    public ArrayList<Ticket> getTicketsAsignados() {return ticketsAsignados;}
    public void setTicketsAsignados(ArrayList<Ticket> ticketsAsignados) {this.ticketsAsignados = ticketsAsignados;}
    public LocalDate getF_ingreso(){return f_ingreso;}
    public void setF_ingreso(LocalDate f_ingreso){this.f_ingreso = f_ingreso;}

    public ArrayList<Ticket> ticketsResueltos(){
        ArrayList<Ticket> ticketsResueltos = new ArrayList<>();
        for (Ticket tA: ticketsAsignados){
            if (tA.getEstado().equals(EstadoTicket.RESUELTO)){
                ticketsResueltos.add(tA);
            }
        }
        return ticketsResueltos;
    }

}
