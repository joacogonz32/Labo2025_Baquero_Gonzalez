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

    public boolean evaluaMision(Mision mision){
        int nivelCargaAux = 0;
        if (CalculaDistancia.calculoDistancia(mision.getLatitudInicial(), mision.getLatitudDestino(),
                mision.getLongitudInicial(), mision.getLongitudDestino()) <= 30){
            if (getNivelCarga() >= 50) {
                nivelCargaAux = getNivelCarga() - 50;
                setNivelCarga(nivelCargaAux);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
