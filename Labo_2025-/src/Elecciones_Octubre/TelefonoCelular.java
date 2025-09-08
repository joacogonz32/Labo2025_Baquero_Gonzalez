package Elecciones_Octubre;

public class TelefonoCelular extends Dispositivos implements Mensajero{
    private CompaniaTelefonica internet;
    private int lineaTelefono;
    private boolean encendido;
    private double creditoDisponible;

    @Override
    public void enviarMensaje(String mensaje) {
        if (encendido && creditoDisponible > 0){
            System.out.println("Conectando con la antena mas cercana de " + internet);
        }
    }
}
