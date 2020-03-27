package java8.nested_classes;

class NestedClassExample {
   private static String staticPrivateValue = "static value";
   private String privateValue = "instance value";


   static class NestedClass {

      void accessFields() {
         NestedClassExample nestedClassExample = new NestedClassExample();

         // Can access private fields from enclosing class
         System.out.println(staticPrivateValue);
         System.out.println(nestedClassExample.privateValue);
      }
   }

   class InnerClass {
      private String innerClassField = "Inner field Class";
      void accessFields() {
         System.out.println(staticPrivateValue);
         System.out.println(privateValue);
      }

      class DeepInnerClass {

         void accessFields() {
            System.out.println("Direct enclosing field:" + innerClassField);
            System.out.println("First level enclosing field:" + staticPrivateValue);
            System.out.println("First level enclosing field:" + privateValue);
         }
      }
   }


   void localClass() {
      String effectivelyFinalVar = "effectively final";
      class LocalClass {
         void printFieldsFromEnclosingClass() {
            System.out.println("Local class method" + staticPrivateValue);
            System.out.println("Local class method" + privateValue);
            // Can access local variable if they are final or effectively final
            System.out.println("Local class method" + effectivelyFinalVar);
         }
      }
      new LocalClass().printFieldsFromEnclosingClass();
   }



   public static void main(String[] args) {
      NestedClass nestedClass = new NestedClass();
      nestedClass.accessFields();

      NestedClassExample nestedClassExample = new NestedClassExample();
      // Access through the instance of the enclosing class
      InnerClass innerClass = nestedClassExample.new InnerClass();
      innerClass.accessFields();

      // The Inner.DeepInnerClass is necessary Java can't know where to look when it's too deep
      InnerClass.DeepInnerClass deepInnerClass = innerClass.new DeepInnerClass();
      deepInnerClass.accessFields();

      nestedClassExample.localClass();
   }
}
