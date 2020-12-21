public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(126)); // => 9

        System.out.println(factorial(5)); // => 120


    }

    //Given a non-negative int n, return the sum of its digits recursively
    public static int sumDigits(int n) {
        int sum = 0;
        if(n < 10){
            return n;
        } else sum = n % 10;

        return sum + sumDigits(n/10);

    }

    public static int factorial(int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }

}
