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
    public int sum3(int[] nums) {
        int total = 0;
        for(int value : nums){
            total += value;
        }
        return total;
    }

    public int[] reverse3(int[] nums) {
        int size = nums.length;
        int[] bucket = new int[size];
        for(int value : nums){
            size--;
            bucket[size] = value;
        }
        return bucket;
    }

    public int[] maxEnd3(int[] nums) {
        int[] maxes = new int [nums.length];
        int first = nums[0];
        int last = nums[nums.length-1];

        int high = 0;

        if(first > last){
            high = first;
        } else {
            high = last;
        }

        int spot = 0;
        for(int value : nums){
            maxes[spot] = high;
            spot++;
        }

        return maxes;
    }

    public int sum2(int[] nums) {
        int sum = 0;

        if(nums.length > 2){

            for(int i = 0; i < 2; i++){
                sum += nums[i];
            }
        } else{
            for(int value : nums){
                sum += value;
            }
        }
        return sum;

    }

}
