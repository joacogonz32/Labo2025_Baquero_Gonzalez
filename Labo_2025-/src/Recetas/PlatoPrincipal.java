package Recetas;
import java.util.ArrayList;

public class PlatoPrincipal extends Receta {
    private int tiempoCoccion;
    private int cantComensales;

    public PlatoPrincipal(ArrayList<String> listaPasos, Dificultad dificultad, int tiempoCoccion, int cantComensales) {
        super(listaPasos, dificultad);
        this.tiempoCoccion = tiempoCoccion;
        this.cantComensales = cantComensales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }
    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }
    public int getCantComensales() {
        return cantComensales;
    }
    public void setCantComensales(int cantComensales) {
        this.cantComensales = cantComensales;
    }

    @Override
    public void mostrarInstrucciones() {
        System.out.println("Esta receta tarda en cocinarse: " + this.tiempoCoccion + "y los pasos son: ");
        for (String p : getListaPasos()){
            System.out.println("- " + p);
        }
    }

    @Override
    public boolean esDelTipo(Receta receta){
        return true;
    }

}
