
public class Solution {

    public static void main(String[] args) {
        String string = "Guitar is playing";
        int index = 4;

        String result = reverse(string, index);

        String expResult = "tiuGar ilp saying";
        if (expResult.equals(result)) {
            System.out.println("Good! " + result);
        } else {
            System.out.println("Not good: " + result);
        }
    }

    private static String reverse(String string, int index) {
        int counter = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i+= index) {
            StringBuilder substring = new StringBuilder();
            substring.append(string, i, Math.min(i + index, string.length()));
            if (counter % 2 == 1) {
                result.append(substring.reverse());
            } else {
                result.append(substring);
            }
            counter++;
        }
        return result.toString();
    }

}