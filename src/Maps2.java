import java.util.HashMap;
import java.util.Map;

public class Maps2 {
    public static void main(String[] args) {

    }
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> out = new HashMap<>();
        for (String string : strings) {
            if (out.containsKey(string)) {
                continue;
            }
            out.put(string, 0);
        }
        return out;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> out = new HashMap<>();
        for(String s : strings){
            out.put(s, s.length());
        }
        return out;
    }


}
