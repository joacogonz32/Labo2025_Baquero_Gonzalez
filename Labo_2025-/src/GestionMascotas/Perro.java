package GestionMascotas;

public class Perro extends Mascota{

    public Perro(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            return "Guau";
        }
        else{
            return "GUAU!";
        }
    }

    @Override
    public TipoMascota getTipo(){
        return TipoMascota.PERRO;
    }
    @Override
    public boolean esDelTipo(Mascota tipoMascota){
        return tipoMascota.getTipo() == this.getTipo();
    }

    public static void main(String[] args) {

    }
}
