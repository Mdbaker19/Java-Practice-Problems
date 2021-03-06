import java.util.List;

public class Functional2 {
    public static void main(String[] args) {




    }
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> (n%10 == 9));
        return nums;
    }
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n > 12 && n < 20);
        return nums;
    }
    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> hasZ(s));
        return strings;
    }

    public boolean hasZ(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'z'){
                return true;
            }
        }
        return false;
    }
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }
    public List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() >= 3 && s.length() <= 4);
        return strings;
    }
    public List<String> noYY(List<String> strings) {
        strings.removeIf(s -> s.endsWith("y") || s.contains("yy"));
        strings.replaceAll(s -> s + "y");
        return strings;
    }

    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> (n * n) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }



}
