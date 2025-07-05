package GestionMascotas;

public class Gato extends Mascota {
    private int nivelAlegria;

    public Gato(String nombre, Dueño dueño, int nivelAlegria) {
        super(nombre, dueño);
        this.nivelAlegria = nivelAlegria;
    }

    public int getNivelAlegria() {return nivelAlegria;}
    public void setNivelAlegria(int nivelAlegria) {this.nivelAlegria = nivelAlegria;}

    @Override
    public String saludar(Dueño dueño) {
        String saludo = "Miau";
        if (getDueño() == dueño){
            for (int i = 1; i < nivelAlegria; i++) {
                saludo.concat(", " + "Miau");
            }
            if (nivelAlegria > 0){
                nivelAlegria--;
            }
            else {
                System.out.println("La alegria esta en 0, no puede disminuir.");
            }
            return saludo;
        }
        else{
            return saludo.toUpperCase();
        }
    }

    @Override
    public TipoMascota getTipo() {
        return TipoMascota.GATO;
    }

    @Override
    public boolean esDelTipo(Mascota tipoMascota) {
        return tipoMascota.getTipo() == this.getTipo();
    }

    @Override
    public void seAlimenta(){
        this.nivelAlegria++;
    }

    @Override
    public boolean estoyMuerto(){
        return false;
    }

}
