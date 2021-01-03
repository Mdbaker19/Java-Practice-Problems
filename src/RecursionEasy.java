import java.util.HashMap;

public class RecursionEasy {
    public static void main(String[] args) {

        System.out.println(sumDigits(126)); // => 9

        System.out.println(factorial(5)); // => 120

//        System.out.println(fibonacci(47));// => 2971215073 // very slow

        HashMap<Integer, Long> memoMap = new HashMap<>();
        System.out.println(memoFib(47, memoMap)); // very fast return

        int[] s = {1, 2, 11};



    }

    //Given a non-negative int n, return the sum of its digits recursively
    public static int sumDigits(int n) {
        int sum = 0;
        if(n < 10){
            return n;
        } else sum = n % 10;

        return sum + sumDigits(n/10);

    }

    public int sumDigitsSecond(int n) {
        return n >= 10 ? n % 10 + sumDigitsSecond(n/10) : n;
    }




    public static int factorial(int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }



    public static Long fibonacci(int n) {
        if(n == 0) return 0L;
        if(n == 1) return 1L;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static Long memoFib(int n, HashMap<Integer, Long> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n <= 2) return 1L;
        memo.put(n, memoFib(n - 1, memo) + memoFib(n - 2, memo));
        return memo.get(n);
    }




    public static int triangle(int rows) {
        if(rows == 1) return 1;
        if(rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int triangle(int rows) {
        return rows > 0 ?  rows + triangle(rows - 1) : 0;
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

    public int bunnyEars(int bunnies) {
        return bunnies >= 1 ? 2 + bunnyEars(bunnies - 1) : 0;
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies == 0) return 0;
        if(bunnies == 1) return 2;
        if(bunnies % 2 == 1)   return 2 + bunnyEars2(bunnies - 1);
        return 3 + bunnyEars2(bunnies - 1);
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies < 1) return 0;
        if(bunnies <= 1) return 2;
        return bunnies % 2 == 0 ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1);
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

    public int array11(int[] nums, int index) {
        int len = nums.length;
        int count = 0;

        if(len < 1){
            return 0;
        }else if(index == len - 1){
            return nums[index] == 11 ? 1 : 0;
        }
        if(nums[index] == 11){
            count++;
        }
        return count + array11(nums, index + 1);
    }

}
