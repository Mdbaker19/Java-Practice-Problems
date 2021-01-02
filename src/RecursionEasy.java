public class RecursionEasy {
    public static void main(String[] args) {

        System.out.println(sumDigits(126)); // => 9

        System.out.println(factorial(5)); // => 120

//        System.out.println(fibonacci(47));// => 2971215073

        String s = "matt";

        System.out.println(s.substring(s.length() - 2));


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

    public static Long fibonacci(int n) {
        if(n == 0) return 0L;
        if(n == 1) return 1L;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int triangle(int rows) {
        if(rows == 1) return 1;
        if(rows == 0) return 0;
        return rows + triangle(rows - 1);
    }
    public static int powerN(int base, int n) {
        if(n == 1) return base;
        return base * powerN(base, n -1);
    }

    public static int bunnyEars(int bunnies) {
        if(bunnies == 0) return 0;
        if(bunnies == 1) return 2;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies == 0) return 0;
        if(bunnies == 1) return 2;
        if(bunnies % 2 == 1)   return 2 + bunnyEars2(bunnies - 1);
        return 3 + bunnyEars2(bunnies - 1);
    }

    public static int countX(String str) {
        if(str.length() < 1){
            return 0;
        }
        int count = 0;
        String check = str.substring(str.length() - 1);
        if(str.length() == 1){
            return check.equals("x") ? 1 : 0;
        } else {
            if (check.equals("x")){
                count++;
            }
        }
        return count + countX(str.substring(0, str.length() - 1));

    }


}
