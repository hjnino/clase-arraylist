import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {
    public static void main(String[] args) {

        String nombre = "Apple";
        String nombre1 = "Banana";
        String nombre2 = "Cherry";

        List<String> listFruits = new ArrayList<>();

        listFruits.add(nombre);
        listFruits.add(nombre1);
        listFruits.add(nombre2);

        System.out.println(listFruits);
        System.out.println("-----------------------------------");

        //Imprime el tamaño de la lista y los elementos.

        System.out.println(listFruits.size());

        //Elimina "Banana" de la lista.
        System.out.println("-----------------------------------");
        listFruits.remove(1);
        System.out.println(listFruits);

        //Cambia el valor de "Cherry" por "Orange".
        System.out.println("-----------------------------------");
        listFruits.set(1, "Orange");
        System.out.println(listFruits);
    }
}
