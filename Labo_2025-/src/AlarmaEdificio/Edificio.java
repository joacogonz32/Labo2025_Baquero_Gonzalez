package AlarmaEdificio;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void masInfoAlarma(int indice){
        Scanner s = new Scanner(System.in);
        try {
            if (indice >= 0 && indice < sensores.size()) {
                Sensor seleccionado = sensores.get(indice);
                System.out.println("Información del sensor en posición " + indice + ":");
                System.out.println(seleccionado);
            } else {
                System.out.println("Índice fuera de rango. Ingrese un número entre 0 y " + (sensores.size() - 1));
            }
        } catch (Exception e) {
            System.out.println("Error: debe ingresar un número entero válido.");
        }
    }
}
