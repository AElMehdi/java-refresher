package java8.enumeration;

public class EnumerationExamples {


   enum Season {
      FALL("Medium"),
      WINTER("Low"),
      SPRING("Medium"),
      SUMMER("High");

      private String expectedVisitors;

      Season(String expectedVisitors) {
         this.expectedVisitors = expectedVisitors;
      }

      public void printValues() {
         System.out.println("The expected number of visitors in " + this + " is " + this.expectedVisitors);
      }
   }

   // Demonstrate that the enum is created once "singleton"
   enum OnlyOne {
      ONLY_ONE(true);

      private boolean b;

      OnlyOne(boolean b) {
         System.out.println("constructing");
      }
   }


   public static void main(String[] args) {
      printValuesAndOrdinals();
      constructorsFieldsAndMethods();
   }


   private static void constructorsFieldsAndMethods() {
      Season.SUMMER.printValues();
   }

   private static void printValuesAndOrdinals() {
      for (Season value : Season.values()) {
         System.out.println(value.ordinal() + " ==> " + value);
      }
   }

}