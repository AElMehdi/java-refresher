package java8.nested_classes;

class LocalClassExample {
   private static String staticPrivateValue = "static value";
   private String privateValue = "instance value";


   void localClass() {
      String effectivelyFinalVar = "effectively final";

      // Local class
      class LocalClass {
         void printFieldsFromEnclosingClass() {
            System.out.println("Local class method " + staticPrivateValue);
            System.out.println("Local class method " + privateValue);
            // Can access local variable if they are final or effectively final
            System.out.println("Local class method " + effectivelyFinalVar);
         }
      }

      new LocalClass().printFieldsFromEnclosingClass();
   }

   public static void main(String[] args) {
      LocalClassExample nestedClassExample = new LocalClassExample();
      nestedClassExample.localClass();
   }
}
