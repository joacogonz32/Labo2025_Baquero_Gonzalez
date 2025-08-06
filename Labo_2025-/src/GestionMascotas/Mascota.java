package GestionMascotas;

public abstract class Mascota {
    private String nombre;
    private Dueño dueño;

    public Mascota(String nombre, Dueño dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public Dueño getDueño() {return dueño;}
    public void setDueño(Dueño dueño) {this.dueño = dueño;}


    public abstract String saludar(Dueño dueño);
    public abstract TipoMascota getTipo();
    public abstract boolean esDelTipo(Mascota tipoMascota);
<<<<<<< HEAD
    public abstract void alimentar();
=======
    public abstract void seAlimenta();
    public abstract boolean estoyMuerto();
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98

}
