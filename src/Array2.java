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

}
