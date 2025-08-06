package Sistema_bebida;

public class Bebidas_Alcoholicas extends Bebidas{
    private int cantAlcohol;

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    public Bebidas_Alcoholicas(String nombre, int coeficientePositividad, int coeficienteNegatividad, int cantAlcohol) {
        super(nombre, coeficientePositividad, coeficienteNegatividad);
        this.cantAlcohol = cantAlcohol;
    }

    @Override
    public void determinarCoeficienteNegativo() {
        setCoeficienteNegatividad(20 * cantAlcohol);
    }

    @Override
    public void determinarCoeficientePositivo() {
         setCoeficientePositividad(0);
    }
}
