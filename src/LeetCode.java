import java.util.ArrayList;

public class LeetCode {

    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        int[] out = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int currSum = 0;
            for(int j = 0; j <= i; j++){
                currSum+=nums[j];
            }
            out[i] = currSum;
        }
        return out;
    }

    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> all = new ArrayList<>();

        for(int[] acct : accounts){
            int total = 0;
            for(int i = 0; i < acct.length; i++){
                total+=acct[i];
            }
            all.add(total);
        }
        int highest = 0;
        for(int x : all){
            if(x > highest){
                highest = x;
            }
        }

        return highest;
    }


}
