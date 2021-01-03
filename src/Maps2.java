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
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> out = new HashMap<>();

        for(String s : strings){
            String start = s.substring(0, 1);
            StringBuilder build = new StringBuilder();
            for(String a : strings){
                if(a.substring(0, 1).equals(start)){
                    build.append(a);
                }
            }
            out.put(start, build.toString());
        }
        return out;

    }
    public String wordAppend(String[] strings) {
        StringBuilder build = new StringBuilder();
        Map<String, String> checker = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            if(checker.containsKey(strings[i])){
                build.append(strings[i]);
                checker.remove(strings[i]);
            } else {
                checker.put(strings[i], strings[i]);
            }
        }
        return build.toString();
    }
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> out = new HashMap<>();
        for(String s : strings){
            if(out.containsKey(s)){
                out.put(s, true);
            } else {
                out.put(s, false);
            }
        }
        return out;
    }




}
