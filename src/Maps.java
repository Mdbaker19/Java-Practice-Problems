import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> test = new HashMap<>();
        test.put("a", "candy");
        test.put("b", "dirt");

//        test.remove("b");


        test.put("ab", (test.get("a") + test.get("b")));


//        test.replace("b", test.get("a"));
//        test.replace("a", "");
//
        System.out.println(test);
//
//        System.out.println(test.get("b") == null);


    }

    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.get("b") != null && map.get("a") != null){
            map.replace("b", map.get("a"));
            map.replace("a", "");
        } else if(map.get("a") == null){
            return map;
        }else {
            map.put("b", map.get("a"));
            map.replace("a", "");
        }
        return map;
    }
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }

        return map;

    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", (map.get("a") + map.get("b")));
        }
        return map;
    }
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }
    public Map<String, String> topping2(Map<String, String> map) {

        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }

        return map;
    }
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        if(map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        return map;
    }
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }

        return map;
    }
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        } else if(!map.containsKey("a") && map.containsKey("b")){
            map.put("a", map.get("b"));
        }

        return map;
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("b") && map.containsKey("a")){
            String as = map.get("a");
            String bs = map.get("b");

            if(as.length() > bs.length()){
                map.put("c", as);
            } else if(bs.length() > as.length()) {
                map.put("c", bs);
            }

            if(as.length() == bs.length()){
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }


}
