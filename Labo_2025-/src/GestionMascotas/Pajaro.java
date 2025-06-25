package GestionMascotas;

public class Pajaro extends Mascota{
    private boolean esCantor;

    public Pajaro(String nombre, Dueño dueño) {
        super(nombre, dueño);
    }

    public String tipoCanto(String canto) {
        String aux = "";
        if (esCantor) {
            aux = canto;
        }
        return aux;
    }

    @Override
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            return ;
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

    public static void main(String[] args) {

    }
}
