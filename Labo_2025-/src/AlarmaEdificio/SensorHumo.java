package AlarmaEdificio;
import java.time.LocalDate;

public class SensorHumo extends Sensor {

    public SensorHumo(boolean estado, double medida, double umbralInicial, LocalDate fechaAdquisicion){
        super(estado, medida, umbralInicial, fechaAdquisicion);
    }

    @Override
    public void suenaAlarma(){
        System.out.println("Ahhh llamen a los bomberos y sus mangueras");
    }

}
