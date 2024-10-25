import java.util.*;

/*
    Objetivo: Contar la cantidad de veces que un elemento aparece en una lista.

    Instrucciones:

    Crea un ArrayList de palabras que contenga algunas repeticiones.
    Usa un bucle para contar cuántas veces aparece una palabra específica.
    Imprime la cantidad de veces que aparece esa palabra.
**/
public class EjercicioNueve {
    public static void main(String[] args) {

        List<String> listaPalabrasRepetidas = new ArrayList<>();

        listaPalabrasRepetidas.add("banco");
        listaPalabrasRepetidas.add("banco");
        listaPalabrasRepetidas.add("banco1");
        listaPalabrasRepetidas.add("banco1");
        listaPalabrasRepetidas.add("banco");
        listaPalabrasRepetidas.add("banco2");
        listaPalabrasRepetidas.add("banco2");

        System.out.println("Lista original: " + listaPalabrasRepetidas);

        Set<String> palabrasUnicas = new HashSet<>(listaPalabrasRepetidas);

        System.out.println("Lista palabras unicas: " + palabrasUnicas);

        for (String palabra : palabrasUnicas) {
            int veces = 0;
            for (String palabraLista :  listaPalabrasRepetidas) {
                if (palabra.equals(palabraLista) ){
                    veces++;
                }
            }
            System.out.println("La palabra : '" + palabra + "' \t esta : " + veces + " veces");
        }
        System.out.println("Fin");
    }
}