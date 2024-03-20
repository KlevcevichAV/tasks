public class Solution {

    public static void main(String[] args) {
//        define number
        int number = 321;
        int number2 = 0;
        int number3 = -321;
        int number4= Integer.MAX_VALUE;

//        call finding method and print result
        int reversedNumber = reverseNumber(number);

//        print reversed number
        System.out.println(reversedNumber);

    }


    private static int reverseNumber(int number) {
//        define answer equals 0
        int result = 0;
//        start loop while number more than 0
        while (number > 0) {
//            calculate last digit of the number and add the digit to the result
            result = result * 10 + number % 10;
//            remove the last digit from number
            number /= 10;
        }
//        return answer
        return result;
    }
}
