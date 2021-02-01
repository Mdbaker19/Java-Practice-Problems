import java.util.*;

public class RandomProblems {

    // collections.max on a hash map value;

    public static void main(String[] args) {
        System.out.println(maxValue(letterCounter("helllooeoh")));

        System.out.println(reversed(805322));
        System.out.println(reversed(954932211));
        System.out.println(reversed(945));

        System.out.println(powerOfToThe(5, 3));

        System.out.println(nar(153));

        narNum(25);

    }


    public static void narNum(int n){
        int count = 0;
        long number = 0;
        while(count < n){
            number++;
            if(number == nar(number)){
                System.out.println(number);
                count++;
            }
        }
    }

    public static long nar(long num){
        String[] s = Long.toString(num).split("");
        List<Integer> build = new ArrayList<>();
        int expo = s.length;
        for(int i = 0; i < s.length; i++){
            build.add(Integer.parseInt(s[i]));
        }
        long total = 0;

        for(int x : build){
            total += powerOfToThe(x, expo);
        }
        return total;
    }

    public static long powerOfToThe(long x, int exp){
        int value = (int) x;
        for(int i = 1; i < exp; i++){
            x*=value;
        }
        return x;
    }





    public static long reversed(long num){
        String[] s = Long.toString(num).split("");
        List<String> build = new ArrayList<>(Arrays.asList(s));
        StringBuilder out = new StringBuilder();
        for(int i = build.size() - 1; i >= 0; i--){
            out.append(build.get(i));
        }
        return Long.parseLong(out.toString());
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
