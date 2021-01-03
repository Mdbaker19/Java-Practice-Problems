import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functional1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(nums);
        for(int i = 0; i < nums.size(); i++){
            nums.set(i, nums.get(i) * 2);
        }

        System.out.println(nums);

    }

    public List<Integer> doubling(List<Integer> nums) {
        for(int i = 0; i < nums.size(); i++){
            nums.set(i, nums.get(i) * 2);
        }
        return nums;
    }
}
