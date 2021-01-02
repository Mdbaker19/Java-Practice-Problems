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

    public boolean nearHundred(int n) {
        if(Math.abs(n - 100) <= 10){
            return true;
        } else if(Math.abs(n - 200) <= 10){
            return true;
        }
        return false;
    }

    public String missingChar(String str, int n) {
        if(n > 0){
            return str.substring(0,  n) + str.substring(n + 1);
        }
        return str.substring(n + 1);

    }
    public String backAround(String str) {
        String sub = str.substring(str.length() - 1);

        return sub + str + sub;

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking){
            return hour < 7 || hour > 20;
        }
        return false;
    }
}
