package CompusPerso;

public class Entrada extends Componentes{
    private String tipoConector;

    public Entrada(String tipoConector){
        this.tipoConector = tipoConector;
    }
    public Entrada(){
        this.tipoConector = "USB";
    }

    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public static void main(String[] args) {

    }
}
