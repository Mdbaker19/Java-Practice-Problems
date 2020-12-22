public class String1 {
    public static void main(String[] args) {
        System.out.println("String 1 problems");
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
    public String makeOutWord(String out, String word) {
        String f = out.substring(0, out.length()/2);
        String b = out.substring(out.length()/2, out.length());
        return f+word+b;
    }
}
