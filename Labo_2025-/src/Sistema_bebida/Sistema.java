package Sistema_bebida;

import java.util.ArrayList;

public class Sistema  {
    private ArrayList<Bebidas> bebidas;
    private ArrayList<Persona> personas;

    public ArrayList<Bebidas> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebidas> bebidas) {
        this.bebidas = bebidas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Sistema(ArrayList<Bebidas> bebidas, ArrayList<Persona> personas) {
        this.bebidas = bebidas;
        this.personas = personas;
    }
}
