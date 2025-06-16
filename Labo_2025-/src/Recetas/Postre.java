package Recetas;
import java.util.ArrayList;

public class Postre extends Receta {
    private int temperatura;
    private boolean aptoDiabeticos;

    public Postre(ArrayList<String> listaPasos, Dificultad dificultad, int temperatura, boolean aptoDiabeticos) {
        super(listaPasos, dificultad);
        this.temperatura = temperatura;
        this.aptoDiabeticos = aptoDiabeticos;
    }

    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public boolean isAptoDiabeticos() {
        return aptoDiabeticos;
    }
    public void setAptoDiabeticos(boolean aptoDiabeticos) {
        this.aptoDiabeticos = aptoDiabeticos;
    }

    @Override
    public void mostrarInstrucciones() {
        for (String p : getListaPasos()) {
            System.out.println("- " + p);
            System.out.println("Mantener la cocina limpia y el horno al minimo");
        }
    }

    @Override
    public boolean esDelTipo(Receta receta){
        return true;
    }
}
