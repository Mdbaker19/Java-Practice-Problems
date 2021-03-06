import java.util.Arrays;
import java.util.HashMap;

public class SingleCycle {


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, -4, -4, 2};
        int[] nums2 = {0, 1, 1, 1, 1};
        int[] nums3 = {1, 1, 1, 1, 2};
        int[] nums4 = {1, 2, 3, 4, -2, 3, 7, 8, 1};
        // index 3
        // index -1
        // array .length - (negative value) => new index

        // 2 => 1
        // 1 => -4 (1)
        // -4 => 2 (2)
        // 2 => 3
        // 3 -> -4 (1)
        // -4 -> 2 is the start so true;

        System.out.println(singleCycle(nums)); // true
        System.out.println(singleCycle(nums2)); // false
        System.out.println(singleCycle(nums3)); // false
        System.out.println(singleCycle(nums4)); // true


    }


    // one loop
    // 2, 4, 3, 5, 0, 1
    // if some counter exceeds array len then return false
    // sort
    // pass through and check i with i + 1 ( -1 ) in order else return false;

    public static boolean singleCycle(int[] nums){
        nums = sort(getIndexes(nums));
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] + 1 != nums[i + 1]) return false;
        }
        return true;
    }






                                        // 3,        -4           6          return 5
                                        // 3,        1           6          return 4
                                        // 5,        2           6          return 1
    public static int indexConversion(int index, int value, int arrLen){
        int num = (index + value) % arrLen;
        if(num <= 0){
            return arrLen + num;
        }
        return num;
    }














    public static int[] getIndexes(int[] nums){
        int len = nums.length;
        int[] bucket = new int[len];
        for(int i = 0; i < len; i++){
            int value = nums[i];
            bucket[i] = indexConversion(i, value, len);
        }
        return bucket;
    }









    public static int[] sort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int j = i;
            while(j >= 0 && nums[j] > nums[j + 1]){
                swap(nums, j, j + 1);
                j--;
            }
        }
        return nums;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}




