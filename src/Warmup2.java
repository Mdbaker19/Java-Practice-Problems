public class Warmup2 {
    public static void main(String[] args) {

    }
    public String stringTimes(String str, int n) {
        String out = "";
        for(int i = 0; i < n; i++){
            out += str;
        }
        return out;
    }
    public String frontTimes(String str, int n) {
        String sub = "";
        if(str.length() > 2){
            sub = str.substring(0, 3);
        } else {
            sub = str;
        }
        String out = "";
        for(int i = 0; i < n; i++){
            out += sub;
        }
        return out;
    }
    int countXX(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            String check = str.charAt(i) +""+ str.charAt(i + 1);
            if(check.equals("xx")){
                count++;
            }
        }
        return count;
    }
    boolean doubleX(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'x'){
                return str.charAt(i+1) == 'x';
            }
        }
        return false;

    }
    public String stringBits(String str) {
        String out = "";
        for(int i = 0; i < str.length(); i+=2){
            out+=str.charAt(i);
        }
        return out;
    }
    public String stringSplosion(String str) {
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j <= i; j++){
                out.append(str.charAt(j));
            }
        }
        return out.toString();
    }
    public int last2(String str) {
        if(str.length() < 2) return 0;
        String sub = str.substring(str.length() - 2);
        int count = 0;

        for(int i = 0; i < str.length() - 2; i++){
            StringBuilder test = new StringBuilder();
            test.append(str.charAt(i));
            test.append(str.charAt(i + 1));
            String s = test.toString();
            if(sub.equals(s)){
                count++;
            }
        }
        return count;

    }
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(num == 9) count++;
        }
        return count;
    }



}
