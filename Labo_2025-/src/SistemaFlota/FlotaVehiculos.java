package SistemaFlota;

import java.util.ArrayList;

public class FlotaVehiculos {
    private ArrayList<Vehiculo> vehiculos;

    public FlotaVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public FlotaVehiculos(){
        this.vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void masCantidad(){
        int autos = 0;
        int camionetas = 0;
        int bicis = 0;
        for(Vehiculo v : vehiculos){
            switch(v.getClass().getCanonicalName())
            {
                case "Bicicleta":
                    bicis++;
                case "Coche":
                    autos++;
                case "camios":
                    camionetas++;
            }
        }

    }

    public double descapotables(){
        int aux = 0;
        int coches = 0;
        for(Vehiculo v : vehiculos){
            //haciendo esto no hace fala castear a coche if (v instanceof Coche)

            if(v.getClass().getCanonicalName().equals("Coche")) {
                coches++;
                if (((Coche)v).getDescapotable()) {
                    aux++;
                }
            }
        }
        int i = ( coches/aux) * 100;
        return i;
    }

    public static void main(String[] args) {

    }

}
