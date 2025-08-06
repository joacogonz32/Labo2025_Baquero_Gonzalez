package GestionMascotas;

public class Pez extends Mascota{
    private static int vidas = 10;
    private int vidasActuales;

    public Pez(String nombre, Dueño dueño, int vidasActuales) {
        super(nombre, dueño);
        this.vidasActuales = vidas;
<<<<<<< HEAD

=======
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
    }

    public static int getVidas() {return vidas;}
    public static void setVidas(int vidas) {Pez.vidas = vidas;}
    public int getVidasActuales(){return vidasActuales;}
    public void setVidasActuales(int vidasActuales){this.vidasActuales = vidasActuales;}

    @Override
<<<<<<< HEAD
    public String saludar(Dueño dueño) {
        String aux ="";
        if(getDueño()==dueño)
            if(vidasActuales > 0){
                vidasActuales--;
                aux = "Pedio una vida, noooooooooo";
            }
        else{
                aux = "Se mulio, poblecito";

            }
        return aux;
    }
    @Override
    public void alimentar(){
        vidasActuales ++;
    }
    public boolean eliminar(){
        return vidasActuales == 0;
=======
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            vidasActuales--;
            return "El pez fue saludado. Se le resto una vida.";
        }
        else {
            vidasActuales = 0;
            return "Fue saludado por un no dueño, murio.";
        }
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
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
