package Elecciones_Octubre;

public class Paloma_mensajera extends Aves implements Mensajero{
    private boolean sabeVolarSola;

    @Override
    public void enviarMensaje(String mensaje) {
        if (sabeVolarSola){
            System.out.println("Lanzando un papel que dice: " + mensaje);
        }
    }


}
