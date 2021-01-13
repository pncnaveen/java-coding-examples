import java.util.ArrayDeque;
import java.util.Deque;

/**
 * RemoveOneLayerParen
 */
public class RemoveOneLayerParen {

    // validate the parenthesis
    public boolean validParen(String parenthesis) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (Character paren : parenthesis.toCharArray()) {
            // if paren is '('
            if (paren == '(') {
                stack.push(paren);
            }
            // if paren is ')'
            else if (paren == ')') {
                // check if stack is empty
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        // if stack is empty
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    // outer most parenthesis removal
    public String removeOuterMostParen(String parenthesis) {
        // check if parenthesis is valid
        if (!validParen(parenthesis))
            return "Invalid parenthesis";
        // remove parenthesis
        String newParenthesis = "";
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < parenthesis.length(); i++) {
            char paren = parenthesis.charAt(i);
            // if there is a '('
            if (paren == '(') {
                // check if stack is empty
                if (stack.isEmpty()) {
                    // if true, only push
                    stack.push(paren);
                } else {
                    // if fasle, push and add
                    stack.push(paren);
                    newParenthesis = newParenthesis + paren;
                }

            }
            // if there is a ')'
            else if (paren == ')') {
                stack.pop();
                // if stack is empty then dont add the paren
                if (!stack.isEmpty()) {
                    newParenthesis = newParenthesis + paren;
                }
            }
        }
        return newParenthesis;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        RemoveOneLayerParen rmvparn = new RemoveOneLayerParen();
        String parenthesis = "(())(())((()))";
        System.out.println(rmvparn.removeOuterMostParen(parenthesis));
        long endTime = System.nanoTime();
        System.out.println("Time:- " + (((endTime - startTime) * 1.0) / 1000000000));
    }
}