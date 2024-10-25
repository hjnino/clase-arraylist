import java.util.ArrayList;
import java.util.List;

public class EjercicioDiez {

    public static final String RESET = "\033[0m";  // Restablecer el color
    public static final String ROJO = "\033[31m";   // Rojo
    public static final String VERDE = "\033[32m";  // Verde

    public static void main(String[] args) {

        List<String> listaAnimales = new ArrayList<>();

        listaAnimales.add("Leon");
        listaAnimales.add("Pato");
        listaAnimales.add("Elefante");
        listaAnimales.add("Culebra");
        listaAnimales.add("Delfin");
        listaAnimales.add("Pinguino");
        listaAnimales.add("Liebre");

        String animlaBusqueda = "Elefante";
        String textoBusqueda = "No encontrado";
        String colorMensaje = ROJO;

        System.out.println("Lista de Animales: " + listaAnimales);

        for (String animal : listaAnimales) {
            // Comparamos con la palabra clave
            if (animal.equals(animlaBusqueda)) {
                textoBusqueda = "Encontrado";
                colorMensaje = VERDE;
                break;
            }
        }
        System.out.println(colorMensaje + "La resultado de la busqueda del animal : " + animlaBusqueda + " es " + textoBusqueda + RESET);
    }

}