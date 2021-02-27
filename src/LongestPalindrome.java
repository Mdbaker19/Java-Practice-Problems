import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abaxyzzyxf")); // xyzzyx
        System.out.println(longestPalindromicSubstring("a")); // a
        System.out.println(longestPalindromicSubstring("it's highnoon")); // noon
        System.out.println(longestPalindromicSubstring("abccbait's highnoon")); // abccba
    }


    public static String longestPalindromicSubstring(String s) {
        List<String> all = new ArrayList<>();
        int len = s.length();
        int count = 0;
        while(count <= len){
            for(int i = count; i < len; i++){
                StringBuilder curr = new StringBuilder();
                for(int j = count; j <= i; j++){
                    curr.append(s.charAt(j));
                }
                if(isPal(curr.toString())) all.add(curr.toString());
            }
            count++;
        }
        return longest(all);
    }

    public static String longest(List<String> list){
        int len = 0;
        int idx = 0;
        for(String s : list){
            if(s.length() > len){
                len = s.length();
                idx = list.indexOf(s);
            }
        }
        return list.get(idx);
    }

    public static boolean isPal(String s){
        StringBuilder c = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            c.append(s.charAt(i));
        }
        return (c.toString().equals(s));
    }

}
