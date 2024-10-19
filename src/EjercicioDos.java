import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {

        int num = 1;
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        int num4 = 5;

        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(num);
        listNumbers.add(num1);
        listNumbers.add(num2);
        listNumbers.add(num3);
        listNumbers.add(num4);

        System.out.println("For");
        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.println(listNumbers.get(i));
        }

        System.out.println("For-each");
        for (Integer listNumber : listNumbers) {
            System.out.println(listNumber);
        }

        System.out.println("While");
        int j = 0;
        while (j < 5) {
            System.out.println(listNumbers.get(j));
            j++;

        }
    }
}

