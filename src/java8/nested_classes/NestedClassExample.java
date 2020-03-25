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

   }

   public static void main(String[] args) {
      NestedClass nestedClass = new NestedClass();
      nestedClass.accessFields();

      NestedClassExample nestedClassExample = new NestedClassExample();
      // Access through the instance of the enclosing class
      InnerClass innerClass = nestedClassExample.new InnerClass();
      innerClass.accessFields();
   }
}
