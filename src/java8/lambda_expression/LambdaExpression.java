package java8.lambda_expression;

import static java.lang.System.out;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExpression {
   private static MathOperation addition = Integer::sum;
   private static MathOperation multiply = (x, y) -> x * y;

   public static void main(String[] args) {
      validSyntax();
      out.println(operation(5, 4, addition));
      out.println(operation(5, 4, multiply));

   }

   private static int operation(int a, int b, MathOperation operation) {
      return operation.operate(a, b);
   }

   private interface MathOperation {
      int operate(int a, int b);
   }

   private static void validSyntax() {
      Consumer<String> oneParamLongSyntax = (String e) -> {
         out.println("One Param full syntax");
      };
      oneParamLongSyntax.accept("input");

      Consumer oneParamShortSyntax = e -> out.println("Parentheses are optional if one param");
      oneParamShortSyntax.accept("input");

      Supplier<String> noParam = () -> "Parentheses are mandatory when no param";
      noParam.get();

      BiConsumer<String, Long> twoParams = (a, b) -> {
         out.println("Two params => Parentheses are mandatory");
         out.println("Two params => If you choose to put the type you have to put it for all params");
      };

      twoParams.accept("input",1L);
   }
}
