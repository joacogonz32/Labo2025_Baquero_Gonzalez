package Recetas;
import java.util.ArrayList;

public class PlatoPrincipal extends Receta {
    private int tiempoCoccion;
    private int cantComensales;

    public PlatoPrincipal(ArrayList<String> listaPasos, Dificultad dificultad) {
        super(listaPasos, dificultad);
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
    void mostrarInstrucciones() {
        String aux = "";
        for (String p : getListaPasos()){
            aux = aux.concat(p + " ");;
        }
        System.out.println("Esta receta tarda en cocinarse: " + this.tiempoCoccion + "y los pasos son: " + aux);
    }

    @Override
    public TipoReceta getTipo(){
        return TipoReceta.PLATOPRINCPAL;
    };
    @Override
    public boolean esDelTipo(Receta recetaTipo){
        return recetaTipo.getTipo() == this.getTipo();
    };
}
