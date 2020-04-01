package java8.lambda_expression;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
   private static MathOperation addition = Integer::sum;
   private static MathOperation multiply = (x, y) -> x * y;

   public static void main(String[] args) {
      validSyntax();
      someOfTheExistingFunc();
      runLambdaOperationExamples();

   }

   private static void runLambdaOperationExamples() {
      out.println(operation(5, 4, addition));
      out.println(operation(5, 4, multiply));
   }

   private static int operation(int a, int b, MathOperation operation) {
      return operation.operate(a, b);
   }

   private interface MathOperation {
      int operate(int a, int b);
   }

   // Params -> Body

   // Prams:
   // Parentheses are mandatory when:
   // Zero param
   // More than one param
   // Types are optionals, except when you have multiple params and you add it to one of them

   // Body:
   // One liner => Curly braces are mandatory, when added you have to end the line with a semicolon
   // Bloc code => Curly braces are mandatory, and so are the semicolon
   private static void validSyntax() {
      Consumer<String> oneParamLongSyntax = (String e) -> {
         out.println("One Param full syntax");
      };
      oneParamLongSyntax.accept("input");

      Consumer<String> oneParaType = (String e) -> out.println("One Param full syntax");
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

   private static void someOfTheExistingFunc() {
      Predicate<String> isTrue = input -> input.contains("true");
      out.println(isTrue.test("Is it true?"));

      Consumer<Integer> sideEffect = input -> out.println("Call an operation on the input");
      sideEffect.accept(10);

      Supplier<List<String>> namesSupplier = () -> Arrays.asList("Yassine", "Marouane", "Youssef");
      out.println(namesSupplier.get());
   }
}
