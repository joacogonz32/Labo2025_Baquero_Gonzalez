package Recetas;

import java.util.ArrayList;

public class Entrada extends Receta{

    private Temperatura temp;

    public Entrada(ArrayList<String> listaPasos, Dificultad dificultad) {
        super(listaPasos, dificultad);
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

    public void mostrarInstrucciones(){
        String aux = "";
        for(String p : getListaPasos()){
            aux.concat(p);
        }
        if(temp == Temperatura.FRIA){
            aux.concat("Guardar en la heladera");
        }
        else{
            aux.concat("Prender el horno");
        }
        System.out.println(aux);
    }

}
