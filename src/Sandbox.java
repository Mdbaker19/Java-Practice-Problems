import java.util.*;

public class Sandbox {
    public static void main(String[] args) {


      ls("happy");



        /*
        *      ["58", "Linear Algebra"],
     ["94", "Art History"],
     ["94", "Operating Systems"],
     ["17", "Software Design"],
     ["58", "Mechanics"],
     ["58", "Economics"],
     ["17", "Linear Algebra"],
     ["17", "Political Science"],
     ["94", "Economics"],
     ["25", "Economics"],
     ["58", "Software Design"]
        *
        * */

        String[] one =  {"58", "Linear Algebra"};
        String[] two = {"94", "Art History"};
        String[] three = {"94", "Operating Systems"};
        String[] four = {"17", "Software Design"};
        String[] five = {"58", "Mechanics"};
        String[] six = {"58", "Economics"};
        String[] seven = {"17", "Linear Algebra"};
        String[] eight = {"17", "Political Science"};
        String[] nine = {"94", "Economics"};
        String[] ten = {"25", "Economics"};
        String[] eleven = {"58", "Software Design"};



        ArrayList<String[]> student_course_pairs = new ArrayList<>();

        student_course_pairs.add(one);
        student_course_pairs.add(two);
        student_course_pairs.add(three);
        student_course_pairs.add(four);
        student_course_pairs.add(five);
        student_course_pairs.add(six);
        student_course_pairs.add(seven);
        student_course_pairs.add(eight);
        student_course_pairs.add(nine);
        student_course_pairs.add(ten);
        student_course_pairs.add(eleven);
//
//
//
//        for(String[] course : student_course_pairs){
//
//            for(String c : course){
//                System.out.println(c);
//
//            }
//
//        }
//
//


        int[] nums = {3, 4, 1, 5, 6, -9, 0, 1, 5, 3, 2, 9, 4, 3, 3, 3, 4};
        int[] sorted = sort(nums);
        int[] c = new int[5];


        System.out.println(Arrays.toString(sorted));

    }

    public static int [] sort (int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int j = i;
            while(j >= 0 && arr[j + 1] < arr[j]){
                swap(j, j + 1, arr);
                j--;
            }
        }
        return arr;
    }

    public static void swap(int x, int y, int[] arr){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int[] twoNumber(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<>();
//        nums //. view methods
        return new int[] {1};
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {

        int[] out = new int[2];
        ArrayList<Integer> build = new ArrayList<>();
        HashMap<Integer, Integer> stored = new HashMap<>();

        for(int x : array){
            stored.put(x, x);
        }

        for(int i : array){
            int tgt = targetSum - i;
            if(stored.get(tgt) != null){
                out[0] = i;
                out[1] = stored.get(tgt);
            }
        }

        return out;
    }
    public static void ls(String str){
        char[] c = str.toCharArray();
        for(char ch : c){
            System.out.println(ch);
        }
    }
    public static String longestSubstringWithoutDuplication(String str) {
        Set<Character> stored = new HashSet<>();
        ArrayList<String> allStr = new ArrayList<>();
        int spot = 0;
        for(char c : str.toCharArray()){
            stored.add(c);
        }

        char[] iterate = str.toCharArray();
        for(int s = 0; s < str.length(); s++){
            StringBuilder out = new StringBuilder();
            for(int i = 0; i < iterate.length; i++){
                if(stored.contains(iterate[i])){

                } else {
                    out.append(iterate[i]);
                }
            }
            allStr.add(out.toString());

        }
        String longest = allStr.get(0);
        int longestLen = longest.length();
        for(int i = 1; i < allStr.size(); i++){
            if(allStr.get(i).length() > longestLen){
                longest = allStr.get(i);
                longestLen = allStr.get(i).length();
                spot=i;
            }
        }

        return allStr.get(spot);
    }
    public static int[] twoNum(int[] array, int targetSum) {
        Set<Integer> contain = new HashSet<>();
        for(int x : array){
            int remain = targetSum - x;
            if(contain.contains(remain)){
                return new int[] {x, remain};
            }
            contain.add(x);
        }
        return new int[0];
    }

}
