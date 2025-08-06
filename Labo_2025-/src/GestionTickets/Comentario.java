package GestionTickets;

import java.time.LocalDateTime;

public class Comentario {
    private Desarrollador autor;
    private String texto;
    private LocalDateTime fh_escrito;

    public Comentario(Desarrollador autor, String texto, LocalDateTime fh_escrito) {
        this.autor = autor;
        this.texto = texto;
        this.fh_escrito = fh_escrito;
    }

    public Desarrollador getAutor() {return autor;}
    public void setAutor(Desarrollador autor) {this.autor = autor;}
    public String getTexto() {return texto;}
    public void setTexto(String texto) {this.texto = texto;}
    public LocalDateTime getFh_escrito() {return fh_escrito;}
    public void setFh_escrito(LocalDateTime fh_escrito) {this.fh_escrito = fh_escrito;}



}
