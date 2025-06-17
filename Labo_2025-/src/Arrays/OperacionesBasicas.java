package Arrays;
import Unidad1.EnumPais;
import Persona.Persona;
import java.util.ArrayList;

public class OperacionesBasicas {

    public static void SumaArrays(ArrayList<Integer> numeros){
        int resultado = 0;
        for(int numero : numeros){
            resultado += numero;

        }
        System.out.println(resultado);
    }

    public static void LetraEspecifica(char letra, ArrayList<String> palabras) {
        for (String palabra : palabras) {
            if (palabra.toUpperCase().startsWith(String.valueOf(letra))) {
                System.out.println(palabra + ' ');
            }
        }
    }

    public static void PersonasViejas(ArrayList<Persona> personas){
        for (Persona persona : personas){
            if (persona.getEdad() >= 30){
                System.out.println("Tiene mas de 30 años");
            }
            else{
                System.out.println("Tiene menos de 30 años");
            }
        }
    }

    public static void main(String[] args) {
        int resultado = 0;
        char letra = 'T';


        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("juan",17, EnumPais.ARGENTINA));
        personas.add(new Persona("joaco",30,EnumPais.AUSTRALIA));
        personas.add(new Persona("julian",46,EnumPais.AUSTRALIA));
        personas.add(new Persona("jose",48,EnumPais.AUSTRALIA));

        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Escalera");
        palabras.add("Tornillo");
        palabras.add("Taladro");
        palabras.add("Gastronomia");
        palabras.add("Elefante");

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        OperacionesBasicas.SumaArrays(numeros);
        OperacionesBasicas.LetraEspecifica(letra, palabras);
        OperacionesBasicas.PersonasViejas(personas);
    }
}
