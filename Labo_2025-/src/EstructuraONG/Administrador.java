package EstructuraONG;

public class Administrador extends RolConSueldo {
    private String usuario;
    private String contrasena;

    public Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    public String getContrasena() {return contrasena;}
    public void setContrasena(String contrasena) {
        if (esValida(contrasena)) {
            this.contrasena = contrasena;
        } else {
            throw new IllegalArgumentException("La contraseña debe tener 8 caracteres y al menos un carácter especial.");
        }
    }

    private boolean esValida(String contrasena) {
        if (contrasena == null || contrasena.length() != 8) {
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneEspecial = false;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (!Character.isLetterOrDigit(c)) { // no es ni letra ni número
                tieneEspecial = true;
            }
        }
        return tieneMayuscula && tieneEspecial;
    }

}
