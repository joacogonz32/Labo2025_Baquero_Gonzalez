package EmpresaDisenadores;
import java.util.HashSet;

public class SistemaEmpresa {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("Apple", 15000.00);
        Proyecto p2 = new Proyecto("Jordan", 6750.50);
        Proyecto p3 = new Proyecto("Adidas", 9500.00);
        Proyecto p4 = new Proyecto("Corteiz", 3250.75);

        HashSet<Proyecto> pr1 = new HashSet<>();
        pr1.add(p1);
        pr1.add(p2);
        HashSet<Proyecto> pr2 = new HashSet<>();
        pr1.add(p3);
        pr1.add(p4);

        Disenador d1 = new Disenador("Joaquin", TipoDisenador.IT, pr1);
        Disenador d2 = new Disenador("Jean Paul", TipoDisenador.UX, pr2);

        d1.calculaComision(p1);
        d1.calculaComision(p2);
        d2.calculaComision(p3);
        d2.calculaComision(p4);

        d1.calculaSueldo();
        d2.calculaSueldo();

        d1.cantProyectosHastaAhora();
        d2.cantProyectosHastaAhora();

        d1.infoProyecto();
        d2.infoProyecto();
    }
}
