package GestionMascotas;

public class Pajaro extends Mascota{
    private int nivelAlegria;

    public Pajaro(String nombre, Dueño dueño, int nivelAlegria) {
        super(nombre, dueño);
        this.nivelAlegria = nivelAlegria;
    }

    public int getNivelAlegria() {return nivelAlegria;}
    public void setNivelAlegria(int nivelAlegria) {this.nivelAlegria = nivelAlegria;}

    @Override
    public String saludar(Dueño dueño){
        String saludo = "Pio";
        if (getDueño() == dueño){
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
    @Override
    public void seAlimenta(){
        this.nivelAlegria++;
    }

    @Override
    public boolean estoyMuerto(){
        return false;
    }

}
