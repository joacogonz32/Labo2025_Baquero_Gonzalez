package ControlCalorias;

public class Ingredientes {
    private String nombre;
    private int caloria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public Ingredientes(String nombre, int caloria) {
        this.nombre = nombre;
        this.caloria = caloria;
    }
}
