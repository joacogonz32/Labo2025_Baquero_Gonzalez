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
