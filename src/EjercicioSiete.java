import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioSiete {
    public static void main(String[] args) {

        int num = 105;
        int num1 = 43;
        int num2 = 12;
        int num3 = 43;
        int num4 = 51;

        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(num);
        listNumbers.add(num1);
        listNumbers.add(num2);
        listNumbers.add(num3);
        listNumbers.add(num4);

        System.out.println("La lista de numeros es: "+listNumbers);

//https://www.galisteocantero.com/como-eliminar-elementos-duplicados-de-un-arraylist-en-java/
        Set<Integer> miNumbers = new HashSet<>(listNumbers);

        listNumbers.clear();

        listNumbers.addAll(miNumbers);

        System.out.println("Los numeros sin duplicados son:"+ listNumbers);

    }
}
