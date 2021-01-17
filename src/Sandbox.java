import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {

        int a = 11;

        System.out.println(String.valueOf(a).length());


//        ArrayList<Integer> out = new ArrayList<>();
//        int[] vals = {3, 0, 1, 1, 9, 7};
//
//        for(int i = 0; i < vals.length; i++){
//            out.add(vals[i]);
//
//            if(out.size() > 2) break;
//
//
//        }
//
//        System.out.println(checker(out.get(0), out.get(1), out.get(2), vals.length, 7, 2, 3));


//        System.out.println(out.get(0));
//        System.out.println(out.get(1));
//        System.out.println(out.get(2));

//        System.out.println(out.size());

 }

    public static int checker(int first, int second, int third, int parentArrLen, int con1, int con2, int con3){

        int count = 0;
        System.out.printf("%d %d %d%n", first, second, third);

        if(0 <= first  && first < second && second < third && third < parentArrLen){
            System.out.println("met");
            if(Math.abs(first - second) >= con1){
                System.out.println("met 2");
                if(Math.abs(second - third) >= con2){
                    System.out.println("met 3");
                    if(Math.abs(first - third) >= con3){
                        System.out.println("met final");
                        count++;

                    }
                }
            }
        }
        return count;
    }


}
