import java.util.HashMap;
import java.util.Map;

public class RandomProblems {
    public static void main(String[] args) {
        System.out.println(maxValue(letterCounter("eiiieedhhhhhihdeeii")));
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
}
