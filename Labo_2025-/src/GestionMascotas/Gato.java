package GestionMascotas;

public class Gato extends Mascota {
    private int nivelAlegria;

    public Gato(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            return "miau";
        }
        else{
            return "MIAU!";
        }
    }
    @Override
    public TipoMascota getTipo(){
        return TipoMascota.GATO;
    }
    @Override
    public boolean esDelTipo(Mascota tipoMascota){
        return tipoMascota.getTipo() == this.getTipo();
    }

    @Override
    public void alimentar() {
        nivelAlegria++;
    }

    public static void main(String[] args) {

    }
}
