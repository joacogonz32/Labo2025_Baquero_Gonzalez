package CompusPerso;

public class CPU extends Componentes{
    private String codCPU;

    public CPU(String codCPU){
        this.codCPU = codCPU;
    }
    public CPU(){
        this.codCPU = "W6G2N7";
    }

    public String getCodCPU() {
        return codCPU;
    }
    public void setCodCPU(String codCPU) {
        this.codCPU = codCPU;
    }

    public static void main(String[] args) {

    }
}
