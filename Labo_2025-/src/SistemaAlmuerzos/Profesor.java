package SistemaAlmuerzos;
import Unidad1.Persona;

public class Profesor extends Persona {
    private double descuento;

    public Profesor(String nombre, String apellido, double descuento){
        super(nombre, apellido);
        this.descuento = descuento;
    }

    public Profesor(){
        super();
        this.descuento = 0.4;
    }

    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static void main(String[] args) {

    }
}
