package Sistema_Prestamos;

import java.time.LocalDate;

public class BibliotecaApp {
    public static void main(String[] args) {
        SistemaBibliotecario sistema = new SistemaBibliotecario();


        Libro libro1 = new Libro("El Quijote", "Cervantes", 1605, 10, true);
        Libro libro2 = new Libro("Cien Años de Soledad", "García Márquez", 1967, 3, false);
        Revista revista1 = new Revista("National Geographic", "Varios", 2023, 15, "RBA");
        Revista revista2 = new Revista("Time", "Varios", 2018, 8, "Meredith");
        Audiolibro audio1 = new Audiolibro("Sapiens", "Yuval Harari", 2014, 5, 450, 250.5);


        sistema.agregarPublicacion(libro1);
        sistema.agregarPublicacion(libro2);
        sistema.agregarPublicacion(revista1);
        sistema.agregarPublicacion(revista2);
        sistema.agregarPublicacion(audio1);


        Usuario usuario1 = new Usuario("Juan", "Pérez", LocalDate.of(1990, 5, 15), "juan@mail.com");
        Usuario usuario2 = new Usuario("María", "González", LocalDate.of(1985, 8, 20), "maria@mail.com");


        try {
            sistema.buscarPublicacion("El Quijote");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.buscarPublicacion("Sapiens");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.buscarPublicacion("Libro Inexistente");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        // Verificar disponibilidad
        System.out.println("--- Verificación de disponibilidad ---");
        try {
            sistema.verificarDisponibilidad(libro1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.verificarDisponibilidad(audio1);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        try {
            sistema.agregarPrestamo(libro1, 1001, usuario1);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.agregarPrestamo(revista1, 1002, usuario2);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        for (Prestamo p : sistema.getPrestamosRealizados()) {
            try {
                sistema.extenderPrestamo(p, 5);
                System.out.println();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        for (Prestamo p : usuario1.getPrestamosActivos()) {
            try {
                p.devolverPrestamo();
                System.out.println("Préstamo devuelto correctamente");
                System.out.println("Usuario actualizado: " + usuario1);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}