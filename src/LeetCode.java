import java.util.ArrayList;
import java.util.List;

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

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>();
        for(int c : candies){
            out.add(isMax(candies, c + extraCandies));
        }
        return out;
    }

    public static boolean isMax(int[] nums, int num){
        for(int x : nums){
            if(x > num) return false;
        }
        return true;
    }

}
