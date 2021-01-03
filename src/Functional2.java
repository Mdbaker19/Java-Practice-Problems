import java.util.List;

public class Functional2 {
    public static void main(String[] args) {

    }
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
}
