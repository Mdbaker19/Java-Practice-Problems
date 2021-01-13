public class Array2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 100};
        System.out.println(centeredAverage(nums));
    }
    public int countEvens(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public int bigDiff(int[] nums) {
        int high = 0;
        int low = 220;//not the best way
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > high) high = nums[i];
            if(nums[i] < low) low = nums[i];
        }
        return high - low;
    }

    public static int centeredAverage(int[] nums) {
        int total = 0;
        int max = getMax(nums);
        boolean maxSkip = false;
        int min = getMin(nums);
        boolean minSkip = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max && !maxSkip) {
                maxSkip = true;
                continue;
            } else if(nums[i] == min && !minSkip){
                minSkip = true;
                continue;
            }
            System.out.println(total);
            total += nums[i];
        }
        return total/(nums.length-2);
    }
    public static int getMax(int[] nums){
        int max = 0;
        for(int n : nums){
            if(n > max) max = n;
        }
        return max;
    }
    public static int getMin(int[] nums){
        int min = 0;
        for(int n : nums){
            if(n < min) min = n;
        }
        return min;
    }

}
