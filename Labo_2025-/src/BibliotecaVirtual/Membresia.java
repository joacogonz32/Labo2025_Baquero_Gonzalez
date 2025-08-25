package BibliotecaVirtual;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);

    private int limitePrestamos;

    Membresia(int limitePrestamos) {
        this.limitePrestamos = limitePrestamos;
    }

    public int getLimitePrestamos() {
        return limitePrestamos;
    }
}
