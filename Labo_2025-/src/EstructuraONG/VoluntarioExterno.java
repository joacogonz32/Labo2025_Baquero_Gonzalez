package EstructuraONG;

import java.util.HashSet;

public class VoluntarioExterno extends Participante{
    private Institucion institucionTrabaja;
    private static HashSet<String> barriosQueTrabaja;

    public VoluntarioExterno(Institucion institucionTrabaja) {
        this.institucionTrabaja = institucionTrabaja;
    }

    public Institucion getInstitucionTrabaja() {return institucionTrabaja;}
    public void setInstitucionTrabaja(Institucion institucionTrabaja) {this.institucionTrabaja = institucionTrabaja;}
    public static HashSet<String> getBarriosQueTrabaja() {return barriosQueTrabaja;}
    public static void setBarriosQueTrabaja(HashSet<String> barriosQueTrabaja) {VoluntarioExterno.barriosQueTrabaja = barriosQueTrabaja;}


}
