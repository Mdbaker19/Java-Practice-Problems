public class Strings2 {
    public static void main(String[] args) {

    }
    public String doubleChar(String str) {
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            out.append(str.charAt(i));
            out.append(str.charAt(i));
        }
        return out.toString();
    }
}
