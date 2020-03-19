package java8;

import static java.lang.System.out;

public class LambdaExpression {
    private static MathOperation addition = Integer::sum;
    private static MathOperation multiply = (x, y) -> x * y;

    public static void main(String[] args) {
        out.println(operation(5, 4, addition));
        out.println(operation(5, 4, multiply));
    }

    private static int operation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    private interface MathOperation {
        int operate(int a, int b);
    }
}
