package AlarmaEdificio;
import java.time.LocalDate;

public class SensorTemp extends Sensor{

    public SensorTemp(boolean estado, double medida, double umbralInicial, LocalDate fechaAdquisicion){
        super(estado, medida, umbralInicial, fechaAdquisicion);
    }

    @Override
    public void suenaAlarma(){
        System.out.println("¡Cuidado! hace calooooooor");
    }

}
