package ResolucionExcepcion;

public class PruebaExcepciones{
    public static void main(String[] args) {
        try {
            String nombre = null;
            int largoNombre = nombre.length();
            System.out.println("El largo del nombre es: " + largoNombre);
        }
    catch (NullPointerException e){
        System.out.println("No se puede hacer un size de un null");
    }
    }
}
