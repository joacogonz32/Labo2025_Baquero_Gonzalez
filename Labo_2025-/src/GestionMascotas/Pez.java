package GestionMascotas;

public class Pez extends Mascota{
    private static int vidas = 10;
    private int vidasActuales;

    public Pez(String nombre, Dueño dueño, int vidasActuales) {
        super(nombre, dueño);
        this.vidasActuales = vidas;
    }

    public static int getVidas() {return vidas;}
    public static void setVidas(int vidas) {Pez.vidas = vidas;}
    public int getVidasActuales(){return vidasActuales;}
    public void setVidasActuales(int vidasActuales){this.vidasActuales = vidasActuales;}

    @Override
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            vidasActuales--;
            return "El pez fue saludado. Se le resto una vida.";
        }
        else {
            vidasActuales = 0;
            return "Fue saludado por un no dueño, murio.";
        }
    }
    @Override
    public TipoMascota getTipo(){
        return TipoMascota.PEZ;
    }
    @Override
    public boolean esDelTipo(Mascota tipoMascota){
        return tipoMascota.getTipo() == this.getTipo();
    }

    @Override
    public void seAlimenta(){
        this.vidasActuales++;
    }

    @Override
    public boolean estoyMuerto(){
        if (vidasActuales == 0){
            return true;
        }
        else {
            return false;
        }
    }

}
