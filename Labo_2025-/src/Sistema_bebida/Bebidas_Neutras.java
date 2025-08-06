package Sistema_bebida;

public class Bebidas_Neutras extends Bebidas {


    public Bebidas_Neutras(String nombre, int coeficientePositividad, int coeficienteNegatividad) {
        super(nombre, coeficientePositividad, coeficienteNegatividad);
    }

    public void ingresarCoeficiente(int coeficienteNeg, int coeficientePos){
        setCoeficientePositividad(coeficientePos);
        setCoeficienteNegatividad(coeficienteNeg);
    }
    @Override
    public void determinarCoeficienteNegativo() {
    }

    @Override
    public void determinarCoeficientePositivo() {
    }
}

