import javax.swing.tree.TreeNode;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {


//        System.out.println(strings("Tart", "Rat")); // false
//        System.out.println(strings("Tar", "tra")); //true
//        System.out.println(strings("tar", "atr")); // true
//        System.out.println(strings("apples", "Pelsap")); // true
//        System.out.println(strings("totally", "yalltoo")); // false
//        System.out.println(strings("ups", "down")); // false
//        System.out.println(strings("aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa")); // true
//        System.out.println(strings("aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa")); // false
//        System.out.println(strings("", "aaaaaaaaaaaaaa")); // false
//        System.out.println(strings("aaaaaaaaaaaaaa", "")); // false
//        System.out.println(strings("dddaaacccbbb", "aaabbbcccddd")); // true

    }


    public static boolean strings(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> first = charCount(s1.toLowerCase());
        HashMap<Character, Integer> second = charCount(s2.toLowerCase());

        for(Map.Entry<Character, Integer> e : first.entrySet()) {
            int val = e.getValue();
            char key = e.getKey();
            int matchVal = second.get(key) != null ? second.get(key) : 0;
            if(val != matchVal) return false;
        }
        return true;
    }

    public static HashMap<Character, Integer> charCount(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else map.put(curr, 1);
        }
        return map;
    }

    public static int maxRope(int len) {
        // 5 -> return 6 (3 x 2)
        // could of been 1 (1 x 1 x 1 x 1 x 1)
        //      2 (1 x 1 x 1 x 2)
        //      4 (2 x 2 x 1)
        // find the max value that can be made by splitting the length of the rope into sections


        return -1;
    }
    public static int[] shift(int[] nums, int shift) {
        int len = nums.length;
        shift%=len;
        if(shift == 0) return nums;
        int[] out = new int[len];
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int idx = i - shift;
            if(idx < 0) idx = len + idx;
            out[idx] = val;
        }
        return out;
    }

    public static String abbr(String in){
        int len = in.length();
        return in.charAt(0)+ String.valueOf(len - 2) + in.charAt(len - 1);
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

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < mat.length; i++){
            sum+=mat[i][i];
            set.add(indexed(i + 1, i + 1));
        }
        int back = 0;
        for(int i = mat[0].length - 1; i >= 0; i--){
            if(!set.contains(indexed(i + 1, back + 1))){
                sum+=mat[i][back];
            }
            set.add(indexed(i + 1, back));
            back++;
        }

        return sum;
    }

    public static int indexed(int r, int c){
        return Integer.parseInt(r+""+c);
    }


    public int maximum69Number (int num) {
        int spot = 0;
        boolean swapped = false;
        StringBuilder out = new StringBuilder();
        String n = String.valueOf(num);
        for(int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            if(c == '6'){
                out.append('9');
                spot = i;
                swapped = true;
                break;
            } else {
                out.append(c);
            }
        }
        if(swapped){
            return Integer.parseInt(out.toString()+n.substring(spot + 1));
        } else {
            return Integer.parseInt(out.toString());
        }
    }

    public int strStr(String haystack, String needle) {
        if(needle.length() < 1) return 0;

        int len = needle.length(); // 1

        for(int i = 0; i <= haystack.length() - len; i++){ // i = 0

            String toCheck = haystack.substring(i, i + len);

            if(toCheck.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(curr != val) {
                nums[count] = curr;
                count++; // 1
            }
        }
        return count;
    }

    public int maxSubArray(int[] nums) {
        int[] arr = new int[nums.length];
        int number = nums[0];
        arr[0] = number;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum+=nums[i];
            arr[i] = max(sum, nums[i]);
            if(nums[i] > sum) sum = nums[i];
        }
        return max(arr);
    }
    public int max(int a, int b){
        return a > b ? a : b;
    }
    public int max(int[] arr){
        int x = Integer.MIN_VALUE;
        for(int a : arr){
            if( a > x ) x = a;
        }
        return x;
    }
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int goal = nums[len - 1];
        for(int i = len - 1; i >= 0; i--){
            int curr = nums[i];
            if(curr + i >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> out = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(selfDivide(i)) out.add(i);
        }
        return out;
    }
    public static boolean selfDivide(int i) {
        String check = String.valueOf(i);
        List<String> out = new ArrayList<>(Arrays.asList(check.split("")));
        if(out.contains("0")) return false;
        for(String s : out){
            int x = Integer.parseInt(s);
            if(i % x != 0) return false;
        }
        return true;
    }

    public List<String> commonChars(String[] words) {
        String master = words[0];
        List<String> out = new ArrayList<>();

        for(int i = 0; i < master.length(); i++){
            String curr = String.valueOf(master.charAt(i));
            int count = 0;
            for(int j = 1; j < words.length; j++) {
                if(letterExists(curr, words[j], out, master)) count++;
            }
            if(count == words.length - 1) {
                out.add(curr);
            }
        }
        return out;
    }

    public boolean letterExists(String letter, String word, List<String> soFar, String master) {
        if(soFar.contains(letter)) {
            if(appears(word, letter) != appears(master, letter)) {
                int minOcc = Math.min(appears(word, letter), appears(master, letter));
                if(timesInList(soFar, letter) >= minOcc){
                    return false;
                }
            }
        }
        return word.indexOf(letter) >= 0;
    }

    public int appears(String word, String letter) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            String curr = String.valueOf(word.charAt(i));
            if(curr.equals(letter)) count++;
        }
        return count;
    }

    public int timesInList(List<String> soFar, String letter) {
        int count = 0;
        for(String s : soFar) {
            if(letter.equals(s)) count++;
        }
        return count;
    }

    public int largestSumAfterKNegations(int[] A, int K) {
        for(int i = 0; i < K; i++) {
            int currMinIdx = indexOfMinValue(A);
            int newValue = A[currMinIdx] * -1;
            A[currMinIdx] = newValue;
        }
        return sumOf(A);
    }


    public int indexOfMinValue(int[] a) {
        int idx = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            int curr = a[i];
            if(curr < max) {
                max = curr;
                idx = i;
            }
        }
        return idx;
    }

    public int sumOf(int[] a) {
        int sum = 0;
        for(int x : a) {
            sum += x;
        }
        return sum;
    }
    public int[] sortArrayByParity(int[] A) {
        int count = 0; // when is len, out arr is full
        int len = A.length;
        int idx = 0; // work left to right through arr
        int rightInsert = A.length - 1;
        int leftInsert = 0;
        int[] out = new int[len];
        while(count < len) {
            int curr = A[idx];
            if(curr % 2 == 0) {
                out[leftInsert] = curr;
                leftInsert++;
            } else {
                out[rightInsert] = curr;
                rightInsert--;
            }
            idx++;
            count++;
        }
        return out;
    }

    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for(int j = 0; j < arr.length; j++) {
                if(j == i) continue;
                int inner = arr[j];
                if(curr == inner * 2) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean stoneGame(int[] piles) {
        int aSum = 0;
        int lSum = 0;
        for(int i = 0; i < piles.length; i++) {
            int[] set = maxFrom(piles);
            int best = set[0];
            if(i % 2 == 0) {
                aSum+=best;
            } else {
                lSum+=best;
            }
            piles[set[1]] = Integer.MIN_VALUE;
        }
        return aSum > lSum;
    }
    public int[] maxFrom(int[] arr) {
        int m = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > m) {
                m = arr[i];
                idx = i;
            }
        }
        return new int[] {m, idx};
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> out = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {
            int[] curr = matrix[i];
            for(int j = 0; j < curr.length; j++) {
                int num = curr[j];
                if(isLucky(num, i, j, matrix)) out.add(num);
            }
        }

        return out;
    }

    public boolean isLucky(int num, int row, int idx, int[][] matrix) {
        int[] numbersRow = matrix[row];
        List<Integer> colNums = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            colNums.add(matrix[i][idx]);
        }
        for(int x : colNums) {
            if(x > num) return false;
        }
        for(int x : numbersRow) {
            if(x < num) return false;
        }
        return true;
    }

}
