package java8.enumeration;


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

public class EnumerationExamples {

   public static void main(String[] args) {
      printValuesAndOrdinals();
      constructorsFieldsAndMethods();
      createdOnce();
      switchCase();
   }

   private static void constructorsFieldsAndMethods() {
      Season.SUMMER.printValues();
   }

   private static void printValuesAndOrdinals() {
      for (Season value : Season.values()) {
         System.out.println(value.ordinal() + " ==> " + value);
      }
   }

   private static void createdOnce() {
      OnlyOne firstCall = OnlyOne.ONLY_ONE; // First and only call to the consturt
      OnlyOne secondCall = OnlyOne.ONLY_ONE; // Won't call the constructor again
   }

   private static void switchCase() {
      Season summer = Season.SUMMER;

      switch (summer) {
         case SUMMER:
            System.out.println("Summer time");
            break;
         case FALL:
            System.out.println("Stay home");
            break;
         case WINTER:
            System.out.println("Prepare a hot chocolate");
            break;
         default:
            System.out.println("Work hard!");
      }
   }

}