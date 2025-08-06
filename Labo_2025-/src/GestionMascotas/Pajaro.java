package GestionMascotas;

public class Pajaro extends Mascota{
    private int nivelAlegria;

    public Pajaro(String nombre, Dueño dueño, int nivelAlegria) {
        super(nombre, dueño);
        this.nivelAlegria = nivelAlegria;
    }

<<<<<<< HEAD
=======
    public int getNivelAlegria() {return nivelAlegria;}
    public void setNivelAlegria(int nivelAlegria) {this.nivelAlegria = nivelAlegria;}

>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
    @Override
    public String saludar(Dueño dueño){
        String saludo = "Pio";
        if (getDueño() == dueño){
<<<<<<< HEAD
            return "pio";
=======
            for (int i = 0; i < nivelAlegria; i++) {
                saludo.concat(", " + "Pio");
            }
            if (nivelAlegria > 0){
                nivelAlegria--;
            }
            else {
                System.out.println("La alegria esta en 0, no puede disminuir.");
            }
            return "Pio";
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
        }
        else{
            return "El pajaro no saludo.";
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
<<<<<<< HEAD

    @Override
    public void alimentar() {
        nivelAlegria++;
    }

    public static void main(String[] args) {

=======
    @Override
    public void seAlimenta(){
        this.nivelAlegria++;
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
    }

    @Override
    public boolean estoyMuerto(){
        return false;
    }

}
