import java.util.Scanner;
import java.util.Stack;

public class MatchParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = input.nextLine();

        if (checkParentheses(expr)) {
            System.out.println("Brackets are matched correctly.");
        } else {
            System.out.println("Brackets are not matched properly.");
        }

        input.close();
    }

    // Function to check if brackets are balanced
    public static boolean checkParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char last = stack.pop();
                if (!isPair(last, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    // Check if two brackets form a pair
    public static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
