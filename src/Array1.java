import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Array 1 problems");
    }
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length-1];
    }
    public static boolean commonEnd(int[] a, int[] b) {
        int value1 = a[a.length-1];
        int value2 = b[b.length-1];
        return value1 == value2 || a[0] == b[0];
    }
}
