package Sistema_bebida;

public class Bebidas_Azucaradas extends Bebidas {
    private int cantAzucar;

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public Bebidas_Azucaradas(String nombre, int coeficientePositividad, int coeficienteNegatividad, int cantAzucar) {
        super(nombre, coeficientePositividad, coeficienteNegatividad);
        this.cantAzucar = cantAzucar;

    }

    @Override
    public void determinarCoeficientePositivo(){
        setCoeficientePositividad(1);

    }

    @Override
    public void determinarCoeficienteNegativo() {
        setCoeficienteNegatividad(cantAzucar * 10);

    }
}
