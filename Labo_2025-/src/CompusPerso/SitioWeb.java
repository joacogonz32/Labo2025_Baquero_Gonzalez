package CompusPerso;
import java.util.ArrayList;

public class SitioWeb {
    private ArrayList<Compra> compusVendidas;
    private ArrayList<Componentes> componentesStock;

    public SitioWeb(ArrayList<Compra> compusVendidas, ArrayList<Componentes> componentesStock) {
        this.compusVendidas = compusVendidas;
        this.componentesStock = componentesStock;
    }
    public SitioWeb(){
        this.compusVendidas = new ArrayList<>();
        this.componentesStock = new ArrayList<>();
    }

    public ArrayList<Compra> getCompusVendidas() {
        return compusVendidas;
    }
    public void setCompusVendidas(ArrayList<Compra> compusVendidas) {
        this.compusVendidas = compusVendidas;
    }
    public ArrayList<Componentes> getComponentesStock() {
        return componentesStock;
    }
    public void setComponentesStock(ArrayList<Componentes> componentesStock) {
        this.componentesStock = componentesStock;
    }

    public void ventaCompusActStock(){
        
    }

    public static void main(String[] args) {

    }
}
