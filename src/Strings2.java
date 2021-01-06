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
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            StringBuilder hi = new StringBuilder();
            hi.append(str.charAt(i));
            hi.append(str.charAt(i + 1));
            if(hi.toString().equals("hi")){
                count++;
            }
        }
        return count;
    }
    public boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;

        for(int i = 0; i < str.length() - 2; i++){
            StringBuilder check = new StringBuilder();
            check.append(str.charAt(i));
            check.append(str.charAt(i + 1));
            check.append(str.charAt(i + 2));
            String format = check.toString();
            if(format.equals("dog")) dogs++;
            if(format.equals("cat")) cats++;
        }

        return cats == dogs;
    }

}
