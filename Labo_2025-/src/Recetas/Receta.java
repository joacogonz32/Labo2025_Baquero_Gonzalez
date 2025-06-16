package Recetas;
import java.util.ArrayList;

public abstract class Receta {
    protected ArrayList<String> listaPasos;
    protected Dificultad dificultad;

    public Receta(ArrayList<String> listaPasos, Dificultad dificultad) {
        this.listaPasos = listaPasos;
        this.dificultad = dificultad;
    }

    public ArrayList<String> getListaPasos() {return listaPasos;}
    public void setListaPasos(ArrayList<String> listaPasos) {this.listaPasos = listaPasos;}

    public Dificultad getDificultad() {return dificultad;}
    public void setDificultad(Dificultad dificultad) {this.dificultad = dificultad;}

    public abstract void mostrarInstrucciones();

    public abstract boolean esDelTipo(Receta receta);

}
