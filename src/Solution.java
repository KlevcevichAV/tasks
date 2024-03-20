public class Solution {

    public static void main(String[] args) {
//        define numbers
        int firstNumber = 5;
        int secondNumber = 6;

        int firstNumber2 = 5;
        int secondNumber2 = 5;

        int firstNumber3 = Integer.MAX_VALUE;
        int secondNumber3 = Integer.MAX_VALUE;

        int firstNumber4 = Integer.MIN_VALUE;
        int secondNumber4 = Integer.MIN_VALUE;

        int firstNumber5 = Integer.MIN_VALUE;
        int secondNumber5 = Integer.MAX_VALUE;

//        call finding method and print result
        swap(firstNumber, secondNumber);

    }

    private static void swap (int first, int second) {

//        add second number to first
        first += second;
//        subtract second from first and set the result to the second value
        second = first - second;
//        subtract second from first and set the result to the first value
        first -= second;

//        print result
        System.out.print(first);
        System.out.print(second);
    }
}
