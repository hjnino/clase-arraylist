import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioOcho {
    public static void main(String[] args) {

        String semana = "Lunes";
        String semana1 = "Martes";
        String semana2 = "Miercoles";
        String semana3 = "Jueves";
        String semana4 = "Viernes";
        String semana5 = "Sabado";
        String semana6 = "Domingo";

        List<String> listsemana = new ArrayList<>();

        listsemana.add(semana);
        listsemana.add(semana1);
        listsemana.add(semana2);
        listsemana.add(semana3);
        listsemana.add(semana4);
        listsemana.add(semana5);
        listsemana.add(semana6);

        System.out.println("lista original: " + listsemana);

        Collections.reverse(listsemana);

        System.out.println("Lista invertida: " + listsemana);
    }

}