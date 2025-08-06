package Vacunatorio;
import Unidad1.Persona;

import java.io.PrintWriter;
import java.util.HashSet;

public class Ciudadano extends Persona {
    private Provincia provinciaResidencia;
    private String domicilio;
    private String mail;
    private HashSet<Vacuna> vacunasTiene;

    public Ciudadano(Provincia provinciaResidencia, String domicilio, String mail, HashSet<Vacuna> vacunasTiene) {
        this.provinciaResidencia = provinciaResidencia;
        this.domicilio = domicilio;
        this.mail = mail;
        this.vacunasTiene = vacunasTiene;
    }

    public Provincia getProvinciaResidencia() {
        return provinciaResidencia;
    }

    public void setProvinciaResidencia(Provincia provinciaResidencia) {
        this.provinciaResidencia = provinciaResidencia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getVacunasTiene() {
        return vacunasTiene;
    }

    public void setVacunasTiene(HashSet<Vacuna> vacunasTiene) {
        this.vacunasTiene = vacunasTiene;
    }
    public void imprimirDatos(){
        for(Vacuna v : vacunasTiene){
            System.out.println(v);
        }
    }
}

