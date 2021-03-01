import java.util.*;

public class RandomProblems {

    // collections.max on a hash map value;

    public static void main(String[] args) {
//        System.out.println(maxValue(letterCounter("helllooeoh")));
//
//        System.out.println(reversed(805322));
//        System.out.println(reversed(954932211));
//        System.out.println(reversed(945));
//
//        System.out.println(powerOfToThe(5, 3));
//
//        System.out.println(nar(153));
//
//        narNum(25);
//            String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
//            String[] words2 = {"This", "is", "an", "xes", "happy", "apple", "AP", "example", "of", "text", "justification."};
////        System.out.println(fullJustify(words, 16));
//
//
//        System.out.println(Arrays.toString(sort(words2)));
//
//        String a = "That";
//        String b = "hat";
//
//        System.out.println(a.compareTo(b));

        int[] nums = {8, 5, 2, 9, 5, 6, 3};
        int[] nums2 = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        List<Integer> subs = new ArrayList<>(Arrays.asList(1, 2, 3));

//        System.out.println(Arrays.toString(cockTail(nums2)));


//        System.out.println(maxSumUpTo(nums2));

//        System.out.println(Arrays.toString(quick(nums)));

//        System.out.println(isPowerOfThree(27));//t
//        System.out.println(isPowerOfThree(0));//f
//        System.out.println(isPowerOfThree(9));//t
//        System.out.println(isPowerOfThree(45));//f
//        System.out.println(isPowerOfThree(1594323)); //t
//        System.out.println(isPowerOfThree(2187));//t

//        System.out.println(allSubs("abax"));



    }

    public static List<String> allSubs(String s){
        List<String> all = new ArrayList<>();
        int len = s.length();
        int count = 0;
        while(count <= len){
            for(int i = count; i < len; i++){
                StringBuilder out = new StringBuilder();
                for(int j = count; j <= i; j++){
                    out.append(s.charAt(j));
                }
                all.add(out.toString());
            }
            count++;
        }
        return all;
    }


    /*
    *
    *         int len = s.length();
        int count = 0;
        while(count <= len){
            for(int i = count; i < len; i++){
                StringBuilder out = new StringBuilder();
                for(int j = i; j < len; j++){
                    out.append(s.charAt(j));
                }
                all.add(out.toString());
            }
            count++;
        }
    *
    * */


    public static boolean isPowerOfThree(int n) {
        int most = (int) (Math.floor(n / 3)) + 1;
        if(n == 1) return true;
        for(int i = 0; i < most; i++){
            if(power(3, i) == n) return true;
        }
        return false;
    }

    public static int power(int x, int p){
        if(p == 0) return 1;
        else if (p % 2 == 0) return power(x, p/2) * power(x, p/2);
        else return x * power(x, p/2) * power(x, p/2);
    }

    public static int[] cockTail(int[] nums){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    isSorted = false;
                    swap(i, i + 1, nums);
                }
            }
            if (isSorted) break;
            isSorted = true;
            for (int j = nums.length - 1; j > 0; j--) {
                if(nums[j] < nums[j - 1]){
                    isSorted = false;
                    swap(j, j - 1, nums);
                }
            }
        }
        return nums;
    }

    private static List<List<Integer>> powerSet(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int ele : array){
            int len = subsets.size();
            for(int i = 0; i < len; i++){
                List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(ele);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }

    public static int maxSumUpTo(int[] nums){
        int currMax = nums[0]; // 3
        int maxOut = currMax;
        for(int i = 1; i < nums.length; i++){
            currMax = max(nums[i], currMax + nums[i]); // between 5 and 8       // 8 and -1
            maxOut = max(maxOut, currMax);
        }
        return maxOut;
    }

    private static int max (int x, int y){
        return x >= y ? x : y;
    }





    // WORKING ON IT
    public static int[] quick(int[] nums){
        int pivot = nums[0];
        int left = 1;
        int right = nums.length - 1;
        while(left <= right){
            if (nums[left] > pivot && nums[right] < pivot) {
                swap(nums[left], nums[right], nums);
            }

            if (nums[left] <= pivot) {
                left++;
            } else if (nums[right] > pivot){
                right--;
            }
        }

        swap(pivot, nums[right], nums);

        return nums;
    }



    public static void swap(int x, int y, int[] arr){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }







    public static List<String> fullJustify(String[] words, int maxWidth){
        List<String> out = new ArrayList<>();
        int len = 0;
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            String next = "";
            if(i < words.length - 1){
                next = words[i + 1];
            }
            String curr = words[i];
            len += curr.length();
            build.append(curr);
            System.out.println(build.toString());

            if(len + next.length() >= maxWidth) {
                out.add(build.toString());
                build = new StringBuilder();
                len = 0;
            }
        }
        return out;
    }



    public static String[] sort(String[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int j = i;
            while(j >= 0 && arr[j + 1].compareTo(arr[j]) < 0){
                swap(j, j + 1, arr);
                j--;
            }
        }
        return arr;
    }

    public static void swap(int x, int y, String[] arr){
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }










    public static void narNum(int n){
        int count = 0;
        long number = 0;
        while(count < n){
            number++;
            if(number == nar(number)){
                System.out.println(number);
                count++;

            }
        }
    }

    public static long nar(long num){
        String[] s = Long.toString(num).split("");
        List<Integer> build = new ArrayList<>();
        int expo = s.length;
        for(int i = 0; i < s.length; i++){
            build.add(Integer.parseInt(s[i]));
        }
        long total = 0;

        for(int x : build){
            total += powerOfToThe(x, expo);
        }
        return total;
    }

    public static long powerOfToThe(long x, int exp){
        int value = (int) x;
        for(int i = 1; i < exp; i++){
            x*=value;
        }
        return x;
    }





    public static long reversed(long num){
        String[] s = Long.toString(num).split("");
        List<String> build = new ArrayList<>(Arrays.asList(s));
        StringBuilder out = new StringBuilder();
        for(int i = build.size() - 1; i >= 0; i--){
            out.append(build.get(i));
        }
        return Long.parseLong(out.toString());
    }







    public static HashMap<Character, Integer> letterCounter(String string){
        HashMap<Character, Integer> charList = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            char currChar = string.charAt(i);
            if (charList.containsKey(currChar)) {
                int count = charList.get(currChar);
                charList.put(currChar, count + 1);
            } else {
                charList.put(currChar, 1);
            }
        }
        return charList;
    }

    public static ArrayList<Character> maxValue(HashMap<Character, Integer> charList){
        ArrayList<Character> winners = new ArrayList<>();
        int highest = 0;
        for(Map.Entry<Character, Integer> list : charList.entrySet()){
            if(list.getValue() > highest){
                highest = list.getValue();
            }
        }
        int amount = highest;
        for(Map.Entry<Character, Integer> letter : charList.entrySet()){
            if(letter.getValue() == amount){
                winners.add(letter.getKey());
            }
        }
        return winners;
    }
}
