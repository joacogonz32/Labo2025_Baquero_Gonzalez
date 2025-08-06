package GestionMascotas;

public class Pajaro extends Mascota{
    private int nivelAlegria;

    public Pajaro(String nombre, Dueño dueño, int nivelAlegria) {
        super(nombre, dueño);
    }

    @Override
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            return "pio";
        }
        else{
            return null;
        }
    }
    @Override
    public TipoMascota getTipo(){
        return TipoMascota.PAJARO;
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
