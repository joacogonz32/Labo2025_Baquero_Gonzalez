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
<<<<<<< HEAD
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
=======
    public TipoMascota getTipo() {
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
        return TipoMascota.GATO;
    }

    @Override
    public boolean esDelTipo(Mascota tipoMascota) {
        return tipoMascota.getTipo() == this.getTipo();
    }

    @Override
<<<<<<< HEAD
    public void alimentar() {
        nivelAlegria++;
    }

    public static void main(String[] args) {

=======
    public void seAlimenta(){
        this.nivelAlegria++;
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
    }

    @Override
    public boolean estoyMuerto(){
        return false;
    }

}
