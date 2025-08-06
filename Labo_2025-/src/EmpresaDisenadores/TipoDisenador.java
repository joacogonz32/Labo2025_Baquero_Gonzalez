package EmpresaDisenadores;

public enum TipoDisenador {
    UX(0.08), UI(0.07), IT(0.12);
    private double comisionGanada;

    TipoDisenador(double comisionGanada) {
        this.comisionGanada = comisionGanada;
    }

    public double getComisionGanada(){
        return comisionGanada;
    }
    public static void main(String[] args) {

    }
}
