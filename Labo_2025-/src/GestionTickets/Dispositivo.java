package GestionTickets;

public class Dispositivo {
    private NombreDispositivo nombre;
    private int cant_repuestos;

    public Dispositivo(NombreDispositivo nombre, int cant_repuestos) {
        this.nombre = nombre;
        this.cant_repuestos = cant_repuestos;
    }

    public int getCant_repuestos() {return cant_repuestos;}
    public void setCant_repuestos(int cant_repuestos) {this.cant_repuestos = cant_repuestos;}
    public NombreDispositivo getNombre() {return nombre;}
    public void setNombre(NombreDispositivo nombre) {this.nombre = nombre;}



}
