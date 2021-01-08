import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RandomProblems {

    // collections.max on a hash map value;

    public static void main(String[] args) {
        System.out.println(maxValue(letterCounter("helllooeoh")));
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
