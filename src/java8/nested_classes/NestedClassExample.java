package java8.nested_classes;

class NestedClassExample {
   private static String staticPrivateValue = "static value";
   private String privateValue = "instance value";


   static class NestedClass {

      void aMethod() {
         NestedClassExample nestedClassExample = new NestedClassExample();

         // Can access private fields from enclosing class
         System.out.println(staticPrivateValue);
         System.out.println(nestedClassExample.privateValue);
      }
   }


   public static void main(String[] args) {
      NestedClass nestedClass = new NestedClass();
      nestedClass.aMethod();
   }
}
