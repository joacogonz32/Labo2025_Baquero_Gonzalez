package GestionMascotas;

public class Pez extends Mascota{
    private static int vidas = 10;
    private int vidasActuales;

    public Pez(String nombre, Dueño dueño, int vidas) {
        super(nombre, dueño);
        this.vidasActuales = vidas;

    }

    public static int getVidas() {return vidas;}
    public static void setVidas(int vidas) {Pez.vidas = vidas;}

    @Override
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
    }
    @Override
    public TipoMascota getTipo(){
        return TipoMascota.PEZ;
    }
    @Override
    public boolean esDelTipo(Mascota tipoMascota){
        return tipoMascota.getTipo() == this.getTipo();
    }

    public static void main(String[] args) {

    }
}
