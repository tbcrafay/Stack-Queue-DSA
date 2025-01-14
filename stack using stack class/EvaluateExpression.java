import java.util.Stack;

public class EvaluateExpression {

    public static int evaluate(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If it's a digit, push it to the operand stack
            if (Character.isDigit(c)) {
                operands.push(Character.getNumericValue(c));
            } 

            // If it's an operator
            else {
                while (!operators.isEmpty() && hasHigherPrecedence(c, operators.peek())) {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    operands.push(performOperation(operand1, operand2, operator));
                }
                operators.push(c);
            }
        }

        // Perform remaining operations
        while (!operators.isEmpty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            operands.push(performOperation(operand1, operand2, operator));
        }

        // The final result will be the single value remaining on the operand stack
        return operands.pop();
    }

    // Helper function to check operator precedence
    private static boolean hasHigherPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false; // Parentheses have higher precedence
        }
        if ((op1 == '*' && op2 == '+') || (op1 == '*' && op2 == '-') || (op1 == '/' && op2 == '+') || (op1 == '/' && op2 == '-')) {
            return false; // Multiplication and division have higher precedence than addition and subtraction
        }
        return true;
    }

    // Helper function to perform arithmetic operations
    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            // case '/': 
            //     return operand1 / operand2; // Handle division cases appropriately (e.g., integer division or floating-point)
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String expression = "2*3+4";
        int result = evaluate(expression);
        System.out.println("Result: " + result); // Output: 10
    }
}
