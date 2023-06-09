package dsa_daily;

public class ValidParentheses {
    public static boolean isValidParentheses(String input) {

        if (input.isEmpty()) {
            return true;
        } else {
            for (int i = 0; i < input.length() - 1; i++) {
                if ((input.charAt(i) == '(' && input.charAt(i + 1) == ')') ||
                        (input.charAt(i) == '{' && input.charAt(i + 1) == '}') ||
                        (input.charAt(i) == '[' && input.charAt(i + 1) == ']')) {
                    input = input.substring(0, i) + input.substring(i + 2);
                    isValidParentheses(input);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()[]{}"));
    }
}
