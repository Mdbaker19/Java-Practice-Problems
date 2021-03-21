import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algo {

    public static void main(String[] args) {
        List<String> anagrams = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));


//        System.out.println(groupAnagrams(anagrams));



        List<String> ana2 = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "ohy", "solfp"));

//        System.out.println(getAllAnaPairs(ana2));

        reverseWordsInString("Solving algorithms is a lot of fun!");

    }

    public static String reverseWordsInString(String string) {
        int len = countSpaces(string) + 1;
        String[] out = new String[len];
        for(int i = 0; i < out.length; i++){

        }
        return String.join(",", out);
    }
    public static int countSpaces(String input){
        int count = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }

    public static List<List<String>> groupAnagrams(List<String> words){
        List<List<String>> out = new ArrayList<>();
        // start on a word
        // find all matching anagram pairs for that word
        // add them to a list and then to out
        // remove them from the list of inputted words ( ? )
        return out;
    }

    public static List<String> getAllAnaPairs(List<String> words){
        List<String> out = new ArrayList<>();
        for(int i = 0; i < words.size(); i++) {
            String curr = words.get(i);
            for (int j = 0; j < words.size(); j++) {
                if (i == j) break;
                String inner = words.get(j);
                if (isAnagram(curr, inner)) {
                    if(!out.contains(curr)) {
                        out.add(curr);
                    }
                    if(!out.contains(inner)) {
                        out.add(inner);
                    }
                }
            }
        }
        return out;
    }

    public static boolean isAnagram(String a, String b){
        return sort(a).equals(sort(b));
    }














    public static String sort (String word){
        String[] wordArr = wordToArr(word);
        for(int i = 0; i < wordArr.length - 1; i++){
            int j = i;
            while(j >= 0 && wordArr[j].compareTo(wordArr[j + 1]) > 0){
                swap(wordArr, j, j+1);
                j--;
            }
        }
        return Arrays.toString(wordArr);
    }

    public static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String[] wordToArr(String word){
        String[] out = new String[word.length()];
        for(int i = 0; i < word.length(); i++){
            out[i] = String.valueOf(word.charAt(i));
        }
        return out;
    }



}
