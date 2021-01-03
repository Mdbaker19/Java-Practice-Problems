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
}
