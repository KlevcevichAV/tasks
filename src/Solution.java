import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        topValue();
    }

    private static void topValue() {
//        define map
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 2);
        map.put(1, 3);
        map.put(3, 4);
//        sort map by value and print the result
        map.entrySet().stream().sorted((e1, e2) -> -1 * e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);
    }
}
