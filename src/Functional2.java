import java.util.List;

public class Functional2 {
    public static void main(String[] args) {

    }
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> (n%10 == 9));
        return nums;
    }
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n > 12 && n < 20);
        return nums;
    }

}
