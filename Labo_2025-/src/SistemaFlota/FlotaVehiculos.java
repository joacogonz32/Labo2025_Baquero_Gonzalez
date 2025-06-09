package SistemaFlota;
import SistemaFlota.*;

import java.util.ArrayList;

public class FlotaVehiculos {
    private ArrayList<Vehiculo> vehiculos;


    public FlotaVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;

    }
    public FlotaVehiculos(){
        this.vehiculos = new ArrayList<>();
    }
    public void masCantidad(){
        int auti= 0;
        int camios= 0;
        int cletas= 0;
        for(Vehiculo v : vehiculos){
            switch(v.getClass().getCanonicalName())
            {
                case "Bicicleta":
                    cletas++;
                case "Coche":
                    auti++;
                case "camios":
                    camios++;
            }
        }

    }
    public double descapotables(){
        int aux=0;
        int coches=0;
        for(Vehiculo v : vehiculos){
            //haciendo esto no hace fala castear a coche if (v instanceof Coche)

            if(v.getClass().getCanonicalName()=="Coche") {
                coches++;
                if (((CocheFlota)v).getDescapotable()) {
                    aux++;
                }
            }
        }
        int i = ( coches/ aux) * 100;
        return i;
    }



    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public static void main(String[] args) {

    }

}
