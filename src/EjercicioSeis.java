import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjercicioSeis {
    public static void main(String[] args) {

        String ciudad = "Bogotá";
        String ciudad1 = "Medellin";
        String ciudad2 = "Cali";
        String ciudad3 = "Barranquilla";
        String ciudad4 = "Cartagena";

        List<String> listciudad = new ArrayList<>();

        listciudad.add(ciudad);
        listciudad.add(ciudad1);
        listciudad.add(ciudad2);
        listciudad.add(ciudad3);
        listciudad.add(ciudad4);

        System.out.println("lista original: "+listciudad);

        Collections.shuffle(listciudad);

        System.out.println("Lista en desorden: "+listciudad);





    }


}
