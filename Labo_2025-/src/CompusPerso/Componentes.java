package CompusPerso;
import java.util.ArrayList;

public class Componentes {
    private String fabricante;
    private String modelo;
    private double precio;
    private int stock;
    private ArrayList<String> puertos;

    public Componentes(String fabricante, String modelo, double precio, int stock, ArrayList<String> puertos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.puertos = puertos;
    }
    public Componentes (){
        this.fabricante = "Hyperx";
        this.modelo = "Mouse PulseX";
        this.precio = 200000.0;
        this.stock = 500;
        this.puertos = new ArrayList<>();
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public ArrayList<String> getPuertos() {
        return puertos;
    }
    public void setPuertos(ArrayList<String> puertos) {
        this.puertos = puertos;
    }



    public static void main(String[] args) {

    }
}
