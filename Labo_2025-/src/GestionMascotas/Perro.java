package GestionMascotas;

public class Perro extends Mascota{
    private int nivelAlegria;

    public Perro(String nombre, Dueño dueño, int nivelAlegria) {
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
    @Override
    public void alimentar(){
        nivelAlegria++;
    }

    public static void main(String[] args) {

    }
}
