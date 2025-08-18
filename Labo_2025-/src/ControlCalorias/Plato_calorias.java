package ControlCalorias;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Plato_calorias {
    private String nombre;
    private HashMap<Ingredientes, Integer> ingredientes;

    public Plato_calorias(String nombre, HashMap<Ingredientes, Integer> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Ingredientes, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<Ingredientes, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public double calcularCalorias(){
        int suma = 0;
        for (Map.Entry<Ingredientes,Integer> y: ingredientes.entrySet()){
            suma += y.getKey().getCaloria() * y.getValue();
        }
        return suma;
    }
}
