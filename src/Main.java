import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11);

        List<Integer> listWithOddNumbers = getOddNumbers(list);

        System.out.println(listWithOddNumbers);

        listWithOddNumbers.forEach(e -> System.out.print(" " + e));
    }

    public static List<Integer> getOddNumbers(List<Integer> list) {
        ArrayList<Integer> list2 =  new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                list2.add(integer);
            }
        }

        return list2;
    }

}
