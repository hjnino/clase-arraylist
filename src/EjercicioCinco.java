import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {
    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listNumbers.add(i + 1);
            System.out.println(listNumbers.get(i));
        }
        Integer[] nums = new Integer[listNumbers.size()];
        nums = listNumbers.toArray(nums);

        System.out.println("--------------------");

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}

