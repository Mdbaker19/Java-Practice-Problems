import java.util.ArrayList;
import java.util.HashMap;
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

    public int[] shuffle(int[] nums, int n) {
        int[] first = new int[nums.length/2];
        int[] second = new int[nums.length/2];

        int[] out = new int[nums.length];

        for(int i = 0; i < n; i ++){
            first[i] = nums[i];
        }
        int j = 0;
        for(int i = n; i < nums.length; i++){
            second[j] = nums[i];
            j++;
        }

        int k = 0;
        for(int i = 0; i < nums.length; i+=2){
            out[i] = first[k];
            out[i + 1] = second[k];
            k++;
        }

        return out;
    }


    public String defangIPaddr(String address) {
        StringBuilder out = new StringBuilder();

        for(char c : address.toCharArray()){
            if(c == '.') out.append("[.]");
            else out.append(c);
        }

        return out.toString();
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            for(int j = 0; j < nums.length; j++){
                int inner = nums[j];

                if(i < j && curr == inner) count++;
            }
        }
        return count;
    }

    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Character> jewel = new HashMap<>();
        for(char c : jewels.toCharArray()){
            jewel.put(c, c);
        }

        int count = 0;

        for(char c : stones.toCharArray()){
            if(jewel.get(c) != null) count++;
        }

        return count;
    }

    public String interpret(String command) {
        StringBuilder out = new StringBuilder();

        for(int i = 0; i < command.length(); i++){

            if(command.charAt(i) == 'G') {
                out.append("G");
            }
            else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                out.append("o");
                i++;
            } else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                out.append("al");
                i+=3;
            }

        }

        return out.toString();

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int counter = 0;

            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] && j != i){
                    counter++;
                }
            }
            output[i] = counter;
        }

        return output;
    }
}
