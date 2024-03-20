import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
//        define strings
        String s = "()()()";
        String s1 = "";
        String s2 = "(";
        String s3 = ")";
        String s4 = ")(";

//        call finding method and print result
        boolean result = checkBalancingBracketsWithReplaceAll(s);
        boolean result2 = checkBalancingBracketsWithStack(s);

//        print results
        System.out.println("Result with using replacing: " + result);
        System.out.println("Result with using stack: " + result2);
    }

    private static boolean checkBalancingBracketsWithStack(String s) {
//        define empty stack
        Stack<Character> stack = new Stack<>();

//        loop to the string
        for(char c : s.toCharArray()) {
//            check if it's open bracket, then add to the stack close bracket this type
            if(c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
//                else check the last element in the stack is not equals this close bracket or stack is empty
//                then return false
                if(stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }
//        if the loop is completed, then return the result of checking whether the stack is empty or not
        return stack.isEmpty();
    }

    private static boolean checkBalancingBracketsWithReplaceAll(String s) {
//        start loop to the string while string contains one of the type of open-close brackets
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
//            remove all open-close brackets
            s = s.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
//        if string is empty, then expression has balanced round brackets, else hasn't
        return (s.isEmpty());
    }
}
