package EmpresaDisenadores;

public class Proyecto {
    private String nombre;
    private double valorTotal;

    public Proyecto(String nombre, double valorTotal) {
        this.nombre = nombre;
        this.valorTotal = valorTotal;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal;}



    public static void main(String[] args) {

    }
}
