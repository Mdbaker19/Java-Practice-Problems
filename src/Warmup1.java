public class Warmup1 {
    public static void main(String[] args) {
        System.out.println("Warm up problems");


    }


    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
    public int sumDouble(int a, int b) {
        return (a == b) ? (a + b) * 2 : a + b;
    }

    public int diff21(int n) {
        return n > 21 ? Math.abs(n - 21) * 2 : Math.abs(n - 21);
    }
}
