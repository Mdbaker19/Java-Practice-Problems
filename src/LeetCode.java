import javax.swing.tree.TreeNode;
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

    public String restoreString(String s, int[] indices) {
        char[] build = new char[s.length()];

        for(int i = 0; i < s.length(); i++){

            build[indices[i]] = s.charAt(i);

        }

        StringBuilder out = new StringBuilder();

        for(int i = 0; i < build.length; i++){
            out.append(build[i]);
        }

        return out.toString();

    }

    public int numberOfSteps (int num) {
        int count = 0;

        if(num == 0) return count;

        if(num % 2 == 0) {
            count++;
            return count+numberOfSteps(num/2);
        } else {
            count++;
            return count+numberOfSteps(num-1);
        }

    }

    public int subtractProductAndSum(int n) {

        String num = Integer.toString(n);

        ArrayList<Integer> build = new ArrayList<>();

        int count = 0;

        while(count < num.length()){
            build.add(Character.getNumericValue(num.charAt(count)));
            count++;
        }

        int pro = build.get(0);
        int sum = build.get(0);

        for(int i = 1; i < build.size(); i++){

            pro*=build.get(i);
            sum+=build.get(i);

        }

        return pro-sum;

    }

    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> bucket = new ArrayList<>();

        for(int i = 0; i < nums.length; i+=2){
            int val = nums[i + 1];
            int freq = nums[i];

            for(int j = 0; j < freq; j++){
                bucket.add(val);
            }
        }

        int[] out = new int[bucket.size()];


        for(int i = 0; i < out.length; i++){
            out[i] = bucket.get(i);
        }

        return out;
    }

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] out = new int[nums.length];
        ArrayList<Integer> bucket = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            bucket.add(index[i], nums[i]);

        }

        for(int i = 0; i < bucket.size(); i++){
            out[i] = bucket.get(i);
        }

        return out;
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String s : words){
            if(match(allowed, s)) count++;
        }
        return count;
    }

    public static boolean match(String rule, String input){
        HashMap<Character, Character> build = new HashMap<>();
        for(char c : rule.toCharArray()){
            build.put(c, c);
        }
        for(char c : input.toCharArray()){
            if(build.get(c) == null){
                return false;
            }
        }
        return true;
    }

    public int balancedStringSplit(String s) {
        int l = 0;
        int r = 0;
        int total = 0;
        for(char c : s.toCharArray()){
            if(c == 'R') r++;
            if(c == 'L') l++;

            if(r == l) {
                total++;
                r=0;
                l=0;
            }
        }
        return total;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i = 0; i < word1.length; i++){
            s1.append(word1[i]);
        }
        for(int i = 0; i < word2.length; i++){
            s2.append(word2[i]);
        }

        return s1.toString().equals(s2.toString());
    }

    public int maxDepth(String s) {
        int highest = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') {
                count++;
            } else if(c == ')') {
                count--;
            }
            if(count > highest) {
                highest = count;
            }
        }
        return highest;
    }
    public int numberOfMatches(int n) {
        int matches = 0;
        if(n < 2) return matches;
        if(n % 2 == 1){
            matches+=((n-1)/2);
            return matches + numberOfMatches(((n-1)/2) + 1);
        } else {
            matches+=(n/2);
            return matches + numberOfMatches(n/2);
        }
    }


    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if(root.val >= low && root.val <= high){
            sum+=root.val;
        }

        if(root.left != null){
            sum+=rangeSumBST(root.left, low, high);
        }
        if(root.right != null){
            sum+=rangeSumBST(root.right, low, high);
        }

        return sum;

    }

    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for(int x : arr){
            total+=x;
        }
        for(int i = 0; i < arr.length; i++){
            int subTotal = 0;
            ArrayList<Integer> builder = new ArrayList<>();
            for(int j = i; j < arr.length; j++){
                builder.add(arr[j]);
                if(builder.size() > 1 && builder.size() % 2 != 0){
                    for(int x : builder){
                        subTotal+=x;
                    }
                }
            }
            total += subTotal;
        }
        return total;
    }

     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public int getDecimalValue(ListNode head) {
        StringBuilder out = new StringBuilder();
        out.append(head.val);

        if(head.next != null){
            do{

                out.append(head.next.val);
                head = head.next;

            }while(head.next != null);
        }

        int val = Integer.parseInt(out.toString(), 2);

        return val;
    }

    public int findNumbers(int[] nums) {
        int count = 0;

        for(int x : nums){
            if(String.valueOf(x).length() % 2 == 0) count++;
        }
        return count;
    }


    public int minTimeToVisitAllPoints(int[][] points) {

        int count = 0;
        int movement = 0;
        while(count < points.length - 1){

            int fX = points[count][0];
            int fY = points[count][1];

            int sX = points[count + 1][0];
            int sY = points[count + 1][1];

            int xDiff = getDiff(fX, sX);
            int yDiff = getDiff(fY, sY);

            while(xDiff > 0 || yDiff > 0){
                if(xDiff > 0 && yDiff > 0){
                    xDiff--;
                    yDiff--;
                } else if(xDiff > 0 && yDiff <= 0){
                    xDiff--;
                } else if (yDiff > 0 && xDiff <= 0){
                    yDiff--;
                }
                movement++;
            }
            count++;
        }
        return movement;
    }




    public static int getDiff(int x, int y){
        int count = 0;
        if(x < y){
            for(int i = x; i < y; i++){
                count++;
            }
        } else {
            for(int i = y; i < x; i++){
                count++;
            }
        }
        return count;
    }

}
