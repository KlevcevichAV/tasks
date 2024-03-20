import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
//        define list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Bob", "Bob", "Kate", "Kate", "Barry");
        List<String> names2 = List.of("Alice");
        List<String> names3 = List.of();
//        call sort method
        List<String> result = sortByRepetitionAndAlphabetically(names3);
//        print result
        System.out.println(result);

    }

    private static List<String> sortByRepetitionAndAlphabetically(List<String> names) {
//        define empty map
        HashMap<String, Integer> countOfNames = new HashMap<>();
//        loop to list and add 1 to value or add new value if it doesn't exist
        for (String name: names) {
            countOfNames.put(name, countOfNames.getOrDefault(name, 0) + 1);
        }

//        sort by repetition and alphabetically and return names list
        return countOfNames.entrySet().stream().sorted((first, second) -> {
            if (first.getValue().equals(second.getValue())) {
                return first.getKey().compareTo(second.getKey());
            } else {
                return -1 * first.getValue().compareTo(second.getValue());
            }
        }).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
