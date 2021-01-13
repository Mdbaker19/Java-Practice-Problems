import java.util.ArrayList;
import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // 1, 3, 2, 4, 5, 6

        System.out.println(nums);
        swap(1, 2, nums);
        System.out.println(nums);


        StringBuilder out = new StringBuilder();

        out.append(1);

        System.out.println(Integer.parseInt(out.toString()) + 1);


    }

    public static void swap(int i, int j, ArrayList<Integer> list){
        list.add(list.indexOf(list.get(i)), list.get(j));
        list.remove(list.indexOf(j) + 1);

    }
}
