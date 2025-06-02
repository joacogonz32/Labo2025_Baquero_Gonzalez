package AlarmaEdificio;
import java.util.ArrayList;

public class Edificio {
    private ArrayList<Sensor> sensores;
    private double umbralPromedio;

    public Edificio(ArrayList<Sensor> sensores, double umbralPromedio){
        this.sensores = sensores;
        this.umbralPromedio = umbralPromedio;
    }

    public ArrayList<Sensor> getSensores() {return sensores;}
    public void setSensores(ArrayList<Sensor> sensores) {this.sensores = sensores;}
    public double getUmbralPromedio() {return umbralPromedio;}
    public void setUmbralPromedio(double umbralPromedio) {this.umbralPromedio = umbralPromedio;}

    public void agregarSensor(Sensor sensor){
        sensores.add(sensor);
    }
    public void eliminarSensor(Sensor sensor){
        sensores.remove(sensor);
    }
    public void modificarSensor(Sensor sensorViejo, Sensor sensorNuevo){
        eliminarSensor(sensorViejo);
        agregarSensor(sensorNuevo);
    }

    public void descartaFalsaAlarma(){
        double medidaPromedio = 0.0;
        for (Sensor s : sensores){
            medidaPromedio += s.getMedida();
            if (medidaPromedio/3 > umbralPromedio){
                s.suenaAlarma();
            }
        }
    }

}
