import java.util.*;

public class Test {

    public static void main(String[] args) {
//        int[] nums = {3, 2, 1, 2, 6};
//        minimumWaitingTime(nums);
//
//        Scanner sc = new Scanner(System.in);
//
//        getFact(sc, "Enter a number");


        Player player1 = new Player("matt", 100);


        System.out.println(player1.getName());

        player1.addItem("potion");
        player1.addItem("potion");
        player1.addItem("potion");

        Scanner sc = new Scanner(System.in);
        System.out.println("[O]pen inventory");
        hud(player1);
        if(sc.next().equals("o")){
            for(int i = 0; i < player1.getInventory().size(); i++){
                System.out.printf("%-20s | %d%n", player1.getInventory().get(i), i);
            }
        }


        player1.setHealth(player1.getHealth() - 5);





    }
    public static void hud(Player player){
        System.out.println(player.getHealth());
    }




























    public static int getFact(Scanner sc, String message){
        System.out.println(message);
        int num = sc.nextInt();
        if(num > 10 || num < 0){
            return getFact(sc, "Number must be between 1 and 10");
        } else {
            int answer = factorial(num);
            System.out.printf("factorial of %d is %d%n", num, answer);
            System.out.println("Would you like to go again?");
            String response = sc.next().toLowerCase();
            if(response.equals("y")){
                getFact(sc, "Enter another number");
            }
            return answer;
        }
    }

    public static int factorial(int x){
//        if(x == 4) return 24;
//        if(x == 3) return 6;
//        if(x == 2) return 2;
        if(x == 1) return 1;
        return x * factorial(x - 1);
        // 5 * fact(4)
        // 4 * fact(3)
        // 3 * fact(2)
        // 2 * fact(1)
        // 1 is 1
    }





















    public static int minimumWaitingTime(int[] queries) {
        int[] arr = sort(queries);
        int total = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int val = 0;
            for(int j = 0; j <= i; j++){
                val+=arr[j];
            }
            total+=val;
        }
        return total;
    }

    public static int[] sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                swap(j, j-1, arr);
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
