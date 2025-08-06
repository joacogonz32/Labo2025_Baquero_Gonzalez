package GestionMascotas;

public class Perro extends Mascota{
    private int nivelAlegria;

    public Perro(String nombre, Dueño dueño, int nivelAlegria) {
        super(nombre, dueño);
        this.nivelAlegria = nivelAlegria;
    }

    public int getNivelAlegria(){return nivelAlegria;}
    public void setNivelAlegria(int nivelAlegria){this.nivelAlegria = nivelAlegria;}

    @Override
    public String saludar(Dueño dueño){
        String saludo = "Guau";
        if (getDueño() == dueño){
            for (int i = 1; i < nivelAlegria; i++) {
                saludo.concat(", " + "Guau");
            }
            return saludo;
        }
        else{
            return saludo.toUpperCase();
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

    @Override
    public void seAlimenta(){
        this.nivelAlegria++;
    }

    @Override
    public boolean estoyMuerto(){
        return false;
    }

}
