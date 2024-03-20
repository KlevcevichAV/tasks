import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    static int[] array = new int[] {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {

//        call finding method and print result
        int[] duplicate = findDuplicate(array);

//        print result
        for (int i : duplicate) {
            System.out.println(i);
        }
    }

    private static int[] findDuplicate(int[] array) {
        // define map count elements
        HashMap<Integer, Integer> countElements = new HashMap<>();
//        loop to array
        for (int j : array) {
//            update existed element add 1 or put new element with value 1
            countElements.put(j, countElements.getOrDefault(j, 0) + 1);
        }
//        find element with value more than 2
         List<Integer> duplicates = countElements.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();

//        convert list to array
        int[] result = new int[duplicates.size()];
        for(int i = 0; i < duplicates.size(); i++) array[i] = duplicates.get(i);

//        return duplicates
        return result;
    }
}
