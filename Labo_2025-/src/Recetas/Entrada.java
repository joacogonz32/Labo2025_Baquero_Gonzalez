package Recetas;
import java.util.ArrayList;

public class Entrada extends Receta{
    private Temperatura temp;
    public Entrada(ArrayList<String> listaPasos, Dificultad dificultad, Temperatura temp) {
        super(listaPasos, dificultad);
        this.temp = temp;
    }

    public Temperatura getTemp() {
        return temp;
    }
    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

    @Override
    public void mostrarInstrucciones(){
        if(temp == Temperatura.FRIA){
            System.out.println("Guardar en la heladera");
        }
        for(String p : getListaPasos()){
            System.out.println("- " + p);
        }
        if (temp == Temperatura.CALIENTE){
            System.out.println("Prender el horno");
        }
    }

    @Override
    public boolean esDelTipo(Receta receta){
        return true;
    }
}
