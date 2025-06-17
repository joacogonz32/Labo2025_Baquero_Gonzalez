package Recetas;

import java.util.ArrayList;

public class Postre extends Receta {
    private int temperatura;
    private boolean aptoDiabeticos;

    public Postre(ArrayList<String> listaPasos, Dificultad dificultad) {
        super(listaPasos, dificultad);
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
        String aux = "Mantener la cocina limpia y ordernar";
        for (String p : getListaPasos()) {
            System.out.println(p + aux);
        }
    }
    @Override
    public TipoReceta getTipo(){
        return TipoReceta.POSTRE;
    };
}
