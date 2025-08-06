<<<<<<< HEAD
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
=======
package GestionMascotas;

public class Cantor extends Pajaro{
    private String tipoCanto;

    public Cantor(String nombre, Dueño dueño, String tipoCanto, int nivelAlegria) {
        super(nombre, dueño, nivelAlegria);
        this.tipoCanto = tipoCanto;
    }

    public String getTipoCanto(){return tipoCanto;}
    public void setTipoCanto(String tipoCanto){this.tipoCanto = tipoCanto;}


    @Override
    public String saludar(Dueño dueño) {
        int cantorNivelAlegria = getNivelAlegria();
        String saludo = this.tipoCanto;
        if (getDueño() == dueño){
            for (int i = 0; i < cantorNivelAlegria; i++) {
                saludo.concat(", " + this.tipoCanto);
            }
            if (cantorNivelAlegria > 0){
                setNivelAlegria(cantorNivelAlegria-1);
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
    public TipoMascota getTipo() {
        return TipoMascota.PAJARO;
    }

    @Override
    public boolean esDelTipo(Mascota tipoMascota) {
        return tipoMascota.getTipo() == this.getTipo();
    }

}
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98
