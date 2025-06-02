package AlarmaEdificio;
import java.time.LocalDate;

public class SensorPresion extends Sensor{

    public SensorPresion(boolean estado, double medida, double umbralInicial, LocalDate fechaAdquisicion){
        super(estado, medida, umbralInicial, fechaAdquisicion);
    }

    @Override
    public void suenaAlarma(){
        System.out.println("Ay le subio la presioooon");
    }
}
