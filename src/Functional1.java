import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
//
//        System.out.println(nums);
//        for(int i = 0; i < nums.size(); i++){
//            nums.set(i, nums.get(i) * 2);
//        }
//
//        System.out.println(nums);



    }

    public List<Integer> doubling(List<Integer> nums) {
        for(int i = 0; i < nums.size(); i++){
            nums.set(i, nums.get(i) * 2);
        }
        return nums;
    }
    public List<Integer> square(List<Integer> nums) {
        for(int i = 0; i < nums.size(); i++){
            int num = nums.get(i);
            nums.set(i, num * num);
        }
        return nums;
    }
    public List<String> addStar(List<String> strings) {
        for(int i = 0; i < strings.size(); i++){
            String star = strings.get(i) + "*";
            strings.set(i, star);
        }
        return strings;
    }
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);

        return strings;
    }
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" +s+"y");
        return strings;
    }
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n%10);
        return nums;
    }

}
