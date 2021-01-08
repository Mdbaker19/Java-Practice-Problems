import java.util.*;

public class Contest {

    // Hash map the values then if can connect to zero store it, if anything else is found with that value then anything
    // with that value of previously can connect to zero is counted

    // set

    // tree set

    public static void main(String[] args) {

        HashMap<String, List<String>> callListMap = new HashMap<>();



        List<String> test = new ArrayList<>();
        test.add("0 <-> 2");
        test.add("1 <-> 1");
        test.add("2 <-> 0, 3, 4");
        test.add("3 <-> 2, 4");
        test.add("4 <-> 2, 3, 6");
        test.add("5 <-> 6");
        test.add("6 <-> 4, 5");

        for(String line : test) {
            callListMap.put(line.substring(0, 1), getChildren(line));
        }

        System.out.println(callListMap);

        int times = 0;
        HashMap<String, String> memo = new HashMap<>();
        for(Map.Entry<String, List<String>> call : callListMap.entrySet()){
                times+=recursiveCallFinder(call.getKey(), call.getValue(), memo, callListMap);
            }
//        System.out.println(times);

    }


    // MEMO KEY WILL BE THE PARENT THAT CONTAINS THE CHILD THAT CONNECTS TO 0
    // MEMO VALUE WILL BE THE CHILD THAT IS EITHER 0 OR THE ONE THAT CONNECTS TO 0 ( DIRECTLY OR EVENTUALLY )
    private static int recursiveCallFinder(String parent, List<String> children, HashMap<String, String> memo, HashMap<String, List<String>> topLineList) {
        String base = "0";
        // if it contains 0 => return 1;
        // if it contains what was just added => return 1;
        // this again
        // and so on until it doesnt
        // at the end add to memo

        int count = 0;
        for(String child : children) {

            if(memo.containsKey(parent)){
                System.out.println(memo);
            }

            if(child.equals(base)){
                count++;
                memo.put(parent, child);
                System.out.println(parent + " contains the base children =>  " + topLineList.get(parent));
                recursiveCallFinder(child, topLineList.get(parent), memo, topLineList);
            }

        }


        return count;
    }












    public static List<String> getChildren(String callList){
        String[] first = removeComma(callList);
        StringBuilder build = new StringBuilder();
        for(int i = 2; i < first.length; i++){
            build.append(first[i]);
        }
        String children = build.toString();

        List<String> childList = new ArrayList<>();
        for(char c : children.toCharArray()){
            StringBuilder charToString = new StringBuilder();
            charToString.append(c);
            childList.add(charToString.toString());
        }
        return childList;
    }

    public static String[] removeComma(String input){
        String f = input.replaceAll(",", "");
        return f.split(" ");
    }

}