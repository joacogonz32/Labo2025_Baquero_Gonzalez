package Recetas;
import java.util.ArrayList;

public abstract class Receta {
    private ArrayList<String> listaPasos;
    private Dificultad dificultad;

    public Receta(ArrayList<String> listaPasos, Dificultad dificultad) {
        this.listaPasos = listaPasos;
        this.dificultad = dificultad;
    }

    public void mostrarReceta(){
        System.out.println("Dificultad: " + this.dificultad + "Lista pasos: " + this.getListaPasos());
    }

    public ArrayList<String> getListaPasos() {
        return listaPasos;
    }

    public void setListaPasos(ArrayList<String> listaPasos) {
        this.listaPasos = listaPasos;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
    abstract void mostrarInstrucciones();

    public abstract TipoReceta getTipo();



}
