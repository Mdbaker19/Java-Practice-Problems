public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(126)); // => 9


    }

    //Given a non-negative int n, return the sum of its digits recursively
    public static int sumDigits(int n) {
        int sum = 0;
        if(n < 10){
            return n;
        } else sum = n % 10;

        return sum + sumDigits(n/10);

    }

}
