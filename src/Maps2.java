import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps2 {
    public static void main(String[] args) {
        System.out.println(maxValue(letterCounter("aaereerreeeeegffraaeee")));
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

    public static char maxValue(HashMap<Character, Integer> charList){
        int highest = 0;
        char winner = ' ';
        for(Map.Entry<Character, Integer> list : charList.entrySet()){
            if(list.getValue() > highest){
                highest = list.getValue();
                winner = list.getKey();
            }
        }
        return winner;
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


    public static String[] allSwap(String[] strings) {
        Map<String, Integer> data = new HashMap<>();

        for(int i = 0; i < strings.length; i++){
            String first = strings[i].substring(0, 1);
            if(data.containsKey(first)){
                String temp = strings[i];
                strings[i] = strings[data.get(first)];
                strings[data.get(first)] = temp;
                data.remove(first);
            }
            else {
                data.put(first, i);
            }
        }
        return strings;
    }
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> data = new HashMap<>();
        Map<String, Integer> copy = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String first = strings[i].substring(0, 1);
            if(data.containsKey(first) && !copy.containsKey(first)){
                String temp = strings[i];
                strings[i] = strings[data.get(first)];
                strings[data.get(first)] = temp;
                data.remove(first);
                copy.put(first, i);
            } else {
                data.put(first, i);
            }
        }
        return strings;
    }


}
