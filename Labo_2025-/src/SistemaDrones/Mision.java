package SistemaDrones;

public class Mision {
    private static double latitudInicial = -58.504111;
    private double latitudDestino;
    private static double longitudInicial = -34.573195;
    private double longitudDestino;

    public Mision(double latitudInicial, double latitudDestino, double longitudInicial, double longitudDestino) {
        this.latitudInicial = latitudInicial;
        this.latitudDestino = latitudDestino;
        this.longitudInicial = longitudInicial;
        this.longitudDestino = longitudDestino;
    }

    public double getLatitudInicial() {
        return latitudInicial;
    }
    public void setLatitudInicial(double latitudInicial) {
        this.latitudInicial = latitudInicial;
    }
    public double getLatitudDestino() {
        return latitudDestino;
    }
    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }
    public double getLongitudInicial() {
        return longitudInicial;
    }
    public void setLongitudInicial(double longitudInicial) {
        this.longitudInicial = longitudInicial;
    }
    public double getLongitudDestino() {
        return longitudDestino;
    }
    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }



    public static void main(String[] args) {

    }
}
