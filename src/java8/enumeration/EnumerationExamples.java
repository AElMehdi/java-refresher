package java8.enumeration;


enum Season {
   FALL("Medium"){
      @Override
      public void printHours() {
         System.out.println("9am - 5pm");
      }
   },
   WINTER("Low") {
      @Override
      public void printHours() {
         System.out.println("9am - 3pm");
      }
   },
   SPRING("Medium") {
      @Override
      public void printHours() {
         System.out.println("9am - 5pm");
      }
   },
   SUMMER("High") {
      @Override
      public void printHours() {
         System.out.println("9am - 7pm");
      }

      @Override
      public void printPrices() {
         System.out.println("Nineteen dollars.");
      }
   };

   private String expectedVisitors;

   Season(String expectedVisitors) {
      this.expectedVisitors = expectedVisitors;
   }

   public void printValues() {
      System.out.println("The expected number of visitors in " + this + " is " + this.expectedVisitors);
   }

   public abstract void printHours();

   public void printPrices() {
      System.out.println("Fourteen dollars.");
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
      useOverriddenMethods();
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

   private static void useOverriddenMethods() {
      Season.WINTER.printHours();
      Season.WINTER.printPrices();
      Season.SUMMER.printHours();
      Season.SUMMER.printPrices();
   }
}