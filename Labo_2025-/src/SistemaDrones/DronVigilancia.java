package SistemaDrones;
import java.time.LocalDate;

public class DronVigilancia extends Dron {
    private int memoriaSd;

    public DronVigilancia(String nombre, LocalDate fechaAdq, int nivelCarga, int idDron, Estado estado, int memoriaSd) {
        super(nombre, fechaAdq, nivelCarga, idDron, estado);
        this.memoriaSd = memoriaSd;
    }

    public int getMemoriaSd() {return memoriaSd;}
    public void setMemoriaSd(int memoriaSd) {this.memoriaSd = memoriaSd;}

    @Override
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
