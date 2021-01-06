public class Array2 {
    public static void main(String[] args) {

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

}
