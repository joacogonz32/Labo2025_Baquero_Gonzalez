package SistemaAlmuerzos;

public class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Plato(){
        this.nombre = "Hamburguesa";
        this.precio = 5000;
    }


    public static void main(String[] args) {

    }
}
