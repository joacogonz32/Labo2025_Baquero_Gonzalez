package GestionMascotas;

public class Cantor extends Mascota{

    private String canto;
    private int nivelAlegria;

    public Cantor(String nombre, Dueño dueño,String canto, int nivelAlegria){
        super( nombre, dueño);
        this.canto = canto;
        this.nivelAlegria = nivelAlegria;
    }

    public String getCanto() {
        return canto;
    }
    public void setCanto(String canto) {
        this.canto = canto;
    }
    public int getNivelAlegria() {
        return nivelAlegria;
    }
    public void setNivelAlegria(int nivelAlegria) {
        this.nivelAlegria = nivelAlegria;
    }

    @Override
    public String saludar(Dueño dueño){
        if (getDueño() == dueño){
            return this.canto;
        }
        else{
            return null;
        }
    }

    @Override
    public TipoMascota getTipo(){
        return TipoMascota.CANTOR;
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
