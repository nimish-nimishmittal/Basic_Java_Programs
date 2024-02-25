import java.util.Stack;

public class ParanthesisCheck {
    public static void main(String[] args) {
        String validExpression = "(a + b) * (c - d)";
        String invalidExpression = "((x + y) * z";

        System.out.println("Is '" + validExpression + "' valid? " + checkParentheses(validExpression));
        System.out.println("Is '" + invalidExpression + "' valid? " + checkParentheses(invalidExpression));
    }

    private static boolean checkParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}
