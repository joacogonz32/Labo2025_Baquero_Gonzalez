package BibliotecaVirtual;

import java.util.HashMap;
import java.util.HashSet;

public class Biblioteca {
    private HashSet<LibroElectronico> libros = new HashSet<>();
    private HashMap<String, Usuario> usuarios = new HashMap<>();

    public void agregarLibro(LibroElectronico libro) {
        libros.add(libro);
    }

    public void borrarLibro(LibroElectronico libro) {
        libros.remove(libro);
    }

    public void modificarLibro(LibroElectronico viejo, LibroElectronico nuevo) {
        if (libros.remove(viejo)) {
            libros.add(nuevo);
        }
    }

    public HashSet<LibroElectronico> getLibros() {
        return libros;
    }
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getDni(), usuario);
    }

    public Usuario buscarUsuario(String dni) {
        return usuarios.get(dni);
    }
}

