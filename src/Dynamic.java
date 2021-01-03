import java.util.ArrayList;
import java.util.Arrays;

public class Dynamic {
    public static void main(String[] args) {
        //========DOES NOT WORK=========//
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 1, 8, 2, 5));
        System.out.println(longestIncreasingSubsequence(nums));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(5, 2, 8, 6, 3, 6, 9, 5));
        System.out.println(longestIncreasingSubsequence(nums2));
    }
    public static int longestIncreasingSubsequence(ArrayList<Integer> list){
        ArrayList<Integer> lens = new ArrayList<>();
        for(int num : list){
            ArrayList<Integer> build = new ArrayList<>();
            int spot = list.indexOf(num);
            for(int i = spot; i < list.size(); i++){
                if(list.get(i) > num){
                    build.add(list.get(i));
                }
            }
            lens.add(build.size());
        }
        return highestFromList(lens);
    }
    public static int highestFromList(ArrayList<Integer> list){
        int i = 0;
        for(int num : list){
            if(num > i){
                i = num;
            }
        }
        return i;
    }
}
