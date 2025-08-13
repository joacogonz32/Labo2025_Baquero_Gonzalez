package ControlCalorias;

import java.util.HashMap;
import java.util.HashSet;

public class Familia {
    private HashSet<Persona_comida> familia;

    public HashSet<Persona_comida> getFamilia() {
        return familia;
    }

    public void setFamilia(HashSet<Persona_comida> familia) {
        this.familia = familia;
    }

    public Familia(HashSet<Persona_comida> familia) {
        this.familia = familia;

    }
    public double PromedioCalorias(){
        double caloriasTotales = 0;
        for (Persona_comida p : familia){
            caloriasTotales += p.cantidadTotalConsumida()/familia.size();
        }
        return caloriasTotales;
    }
    public Persona_comida obtenerAleatorio(){
        Persona_comida obtenido = null;
        for (Persona_comida p : familia){
            obtenido = p;
        }
        return obtenido;
    }
    public Persona_comida masCaloriasConsumio(){
       Persona_comida personaMasConsumio = this.obtenerAleatorio();
       for(Persona_comida p : familia){
           if(p.cantidadTotalConsumida() > personaMasConsumio.cantidadTotalConsumida()){
               personaMasConsumio = p;
           }
       }
       return personaMasConsumio;
    }
    public Persona_comida menosCaloriasConsumio(){
        Persona_comida personaMenosConsumio = this.obtenerAleatorio();
        for(Persona_comida p : familia){
            if(p.cantidadTotalConsumida() < personaMenosConsumio.cantidadTotalConsumida()){
                personaMenosConsumio = p;
            }
        }
        return personaMenosConsumio;
    }

}
