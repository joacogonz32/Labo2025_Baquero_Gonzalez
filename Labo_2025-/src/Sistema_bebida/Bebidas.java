package Sistema_bebida;

public abstract class Bebidas {
    private String nombre;
    private int coeficientePositividad;
    private int coeficienteNegatividad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    public int getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public Bebidas(String nombre, int coeficientePositividad, int coeficienteNegatividad) {
        this.nombre = nombre;
        this.coeficientePositividad = coeficientePositividad;
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public abstract void determinarCoeficientePositivo();
    public abstract void determinarCoeficienteNegativo();
}
