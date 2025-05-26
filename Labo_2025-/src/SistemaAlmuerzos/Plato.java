package SistemaAlmuerzos;

public class Plato {
    private String nombre;
    private double precio;
    private int cantPedido;

    public Plato(String nombre, double precio, int cantPedido){
        this.nombre = nombre;
        this.precio = precio;
        this.cantPedido = cantPedido;
    }

    public Plato(){
        this.nombre = "Hamburguesa";
        this.precio = 5000;
        this.cantPedido = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPedido() {
        return cantPedido;
    }

    public void setCantPedido(int cantPedido) {
        this.cantPedido = cantPedido;
    }

    public static void main(String[] args) {

    }

}
