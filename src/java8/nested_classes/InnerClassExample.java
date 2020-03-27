package java8.nested_classes;

class InnerClassExample {
   private static String staticPrivateValue = "static value";
   private String privateValue = "instance value";

   // Inner class (member level non static class)
   class InnerClass {
      private String innerClassField = "Inner field Class";
      void accessFields() {
         System.out.println(staticPrivateValue);
         System.out.println(privateValue);
      }

      class DeepInnerClass {

         void accessFields() {
            System.out.println("Direct enclosing field: " + innerClassField);
            System.out.println("First level enclosing field: " + staticPrivateValue);
            System.out.println("First level enclosing field: " + privateValue);
         }
      }
   }


   public static void main(String[] args) {
      InnerClassExample nestedClassExample = new InnerClassExample();
      // Access through the instance of the enclosing class
      InnerClass innerClass = nestedClassExample.new InnerClass();
      innerClass.accessFields();

      // The Inner.DeepInnerClass is necessary Java can't know where to look when it's too deep
      InnerClass.DeepInnerClass deepInnerClass = innerClass.new DeepInnerClass();
      deepInnerClass.accessFields();
   }
}
