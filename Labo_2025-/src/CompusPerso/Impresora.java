package CompusPerso;

public class Impresora extends Salida {
    private String tipoImpresion;

    public Impresora (String tipoImpresion){
        this.tipoImpresion = tipoImpresion;
    }
    public Impresora(){
        this.tipoImpresion = "Laser";
    }

    public String getTipoImpresion() {
        return tipoImpresion;
    }
    public void setTipoImpresion(String tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
    }

    public static void main(String[] args) {

    }
}
