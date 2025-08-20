package ResolucionExcepcion;

public class Excepciones {

    public static void metodoConThrows() throws Exception {
        String nombre = null;
        if (nombre == null) {
            throw new Exception("El nombre es null (throws).");
        } else {
            System.out.println("El largo del nombre es: " + nombre.length() + " (" + nombre + ")");
        }
    }

    public static void main(String[] args) {

        // Try/Catch
        try {
            String nombre = null;
            int largoNombre = nombre.length();
            System.out.println("El largo del nombre es: " + largoNombre + " (" + nombre + ")");
        } catch (NullPointerException e) {
            System.out.println("No se puede calcular el largo de un null (try/catch).");
        }

        // Throw
        try {
            String nombre = null;
            if (nombre == null) {
                throw new RuntimeException("El nombre no puede ser null (throw).");
            }
            else {
                System.out.println("El largo del nombre es: " + nombre.length() + " (" + nombre + ")");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Throws
        try {
            metodoConThrows();
        } catch (Exception e) {
            System.out.println("Excepción capturada con throws: " + e.getMessage());
        }

        // Excepción con clase personalizada
        try {
            String nombre = null;
            if (nombre == null) {
                throw new NombreInvalidoExcepcion("El nombre no puede ser null (excepción personalizada).");
            }
            else {
                System.out.println("El largo del nombre es: " + nombre.length() + " (" + nombre + ")");
            }
        } catch (NombreInvalidoExcepcion e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        }

        // Nuestra firma
        System.out.println("\n- Hecho por: Gonzalez Parodi y Baquero -");
    }
}

