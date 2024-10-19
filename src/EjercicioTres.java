import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {
    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();
        List<Integer> listEvenNumbers = new ArrayList<>();

        System.out.println("Lista");

        for (int i = 0; i < 10; i++) {
            listNumbers.add(i + 1);
            if ((i + 1) % 2 == 0) {
                listEvenNumbers.add(i + 1);
            }
            System.out.println(listNumbers.get(i));
        }
        System.out.println("Pares");
        for (int j = 0; j < listEvenNumbers.size(); j++) {
            System.out.println(listEvenNumbers.get(j));
        }
    }
}
