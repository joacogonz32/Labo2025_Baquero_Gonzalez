package ControlCalorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Plato_calorias {
    private String nombre;
    private HashSet<String> ingredientes;
    private Integer cantCalorias;

    public Plato_calorias(String nombre, HashSet<String> ingredientes, Integer cantCalorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantCalorias = cantCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Integer getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(Integer cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
