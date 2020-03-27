package java8.nested_classes;

class NestedClassExample {
   private static String staticPrivateValue = "static value";
   private String privateValue = "instance value";

   // Static nested class (Member level)
   // Can be abstract and final
   // Can have all the access modifiers
   static class NestedClass {
      void accessFields() {
         NestedClassExample nestedClassExample = new NestedClassExample();

         // Can access private fields from enclosing class
         System.out.println(staticPrivateValue);
         System.out.println(nestedClassExample.privateValue);
      }
   }


   public static void main(String[] args) {
      NestedClass nestedClass = new NestedClass();
      nestedClass.accessFields();
   }
}
