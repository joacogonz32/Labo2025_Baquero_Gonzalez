package CompusPerso;
import java.time.LocalDate;

public class Pago {
    private int nroTarjeta;
    private String nombreTitular;

    public Pago(){
        this.nroTarjeta = 1116554590;
        this.nombreTitular = "Karina Valeria Fernandez";
    }
    public Pago(int nroTarjeta, String nombreTitular) {
        this.nroTarjeta = nroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }
    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public static void main(String[] args) {

    }
}
