import java.util.Stack;

interface Expression {
    int interpret();
}

class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

class Add implements Expression {
    private Expression left, right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

class Substract implements Expression {
    private Expression left, right;

    public Substract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}

class Multiply implements Expression {
    private Expression left, right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}

class Divide implements Expression {
    private Expression left, right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}

class ExpressionParser {
    public static Expression parse(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Expression> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new Add(left, right));
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new Substract(left, right));
            } else if (token.equals("*")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new Multiply(left, right));
            } else if (token.equals("/")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new Divide(left, right));
            } else {
                // It's a number
                stack.push(new Number(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }
}

public class Calculator {

    public static void main(String[] args) {

        // Using postfix notation for easier parsing
        // "10 2 - 4 4 * +" means: (10 - 2) + (4 * 4) = 8 + 16 = 24
        String input = "10 2 - 4 4 * +";
        Expression expression = ExpressionParser.parse(input);
        int result = expression.interpret();
        System.out.println("Result of postfix '" + input + "' is: " + result);

        // Another example: "5 3 + 2 *" means: (5 + 3) * 2 = 8 * 2 = 16
        String input2 = "5 3 + 2 *";
        Expression expression2 = ExpressionParser.parse(input2);
        int result2 = expression2.interpret();
        System.out.println("Result of postfix '" + input2 + "' is: " + result2);

    }

}
