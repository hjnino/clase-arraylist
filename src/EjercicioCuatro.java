import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {
    public static void main(String[] args) {

        String nombre = "Apple";
        String nombre1 = "Banana";
        String nombre2 = "Cherry";
        String nombre3 = "Date";
        String nombre4 = "Banana";
        String nombre5 = "Date";
        String nombre6 = "Elderberry";
        String nombre7 = "Fig";

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> listCommonElements = new ArrayList<>();

        list1.add(nombre);
        list1.add(nombre1);
        list1.add(nombre2);
        list1.add(nombre3);
        list2.add(nombre4);
        list2.add(nombre5);
        list2.add(nombre6);
        list2.add(nombre7);

        for (String lista : list1) {
            if (list2.contains(lista)) {
                listCommonElements.add(lista);
            }
        }
        System.out.println(listCommonElements);

    }

}

