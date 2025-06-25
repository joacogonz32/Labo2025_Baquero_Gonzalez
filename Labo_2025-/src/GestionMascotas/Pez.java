package GestionMascotas;

public class Pez extends Mascota{
    private static int vidas = 10;

    public Pez(String nombre, Dueño dueño, int vidas) {
        super(nombre, dueño);
        this.vidas = vidas;
    }

    public static int getVidas() {return vidas;}
    public static void setVidas(int vidas) {Pez.vidas = vidas;}

    @Override
    public String saludar(Mascota mascota, Dueño dueño){

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
