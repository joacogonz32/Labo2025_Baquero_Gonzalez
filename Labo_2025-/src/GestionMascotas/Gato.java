package GestionMascotas;

public class Gato extends Mascota {

    public Gato(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludar(Mascota mascota, Dueño dueño){

    }
    @Override
    public TipoMascota getTipo(){
        return TipoMascota.GATO;
    }
    @Override
    public boolean esDelTipo(Mascota tipoMascota){
        return tipoMascota.getTipo() == this.getTipo();
    }

    public static void main(String[] args) {

    }
}
