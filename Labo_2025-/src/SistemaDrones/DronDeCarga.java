package SistemaDrones;
import java.time.LocalDate;

public class DronDeCarga extends Dron {
    private double pesoCarga;

    public DronDeCarga(String nombre, LocalDate fechaAdq, int nivelCarga, int idDron, Estado estado, double pesoCarga) {
        super(nombre, fechaAdq, nivelCarga, idDron, estado);
        this.pesoCarga = pesoCarga;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }
    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public boolean evaluaMision(){

    }

    public static void main(String[] args) {

    }
}
