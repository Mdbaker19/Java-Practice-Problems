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
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> out = new HashMap<>();
        for(String s : strings){
            String subKey = s.substring(0, 1);
            String subVal = s.substring(s.length()-1);
            out.put(subKey, subVal);
        }
        return out;
    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> out = new HashMap<>();
        for(String s : strings){
            int count = 0;
            for(int i = 0; i < strings.length; i++){
                if(strings[i].equals(s)){
                    count++;
                }
            }
            out.put(s, count);
        }
        return out;
    }


}
