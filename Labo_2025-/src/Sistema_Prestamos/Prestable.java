package Sistema_Prestamos;

import java.time.LocalDate;

public interface Prestable {
    public LocalDate darPrestamo();

    public double calcularMulta();

    public boolean puedeExtenderse(Usuario usuario);


}