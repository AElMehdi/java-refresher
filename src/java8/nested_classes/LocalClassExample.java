package java8.nested_classes;

class LocalClassExample {
   private static String staticPrivateValue = "static value";
   private String privateValue = "instance value";


   void localClass() {
      String effectivelyFinalVar = "effectively final";

      // Local class
      class LocalClass {
         void printFieldsFromEnclosingClass() {
            System.out.println("LocalClass => Local class method " + staticPrivateValue);
            System.out.println("LocalClass => Local class method " + privateValue);
            // Can access local variable if they are final or effectively final
            System.out.println("LocalClass => Local class method " + effectivelyFinalVar);
         }
      }

      new LocalClass().printFieldsFromEnclosingClass();
   }

   // An interface to implement using an anonymous class, and a lambda expression
   private interface AnonymousClass {
      void process();
   }

   // Can't be static, final or abstract
   // Can't have any access modifiers
   void anonymousClass() {
       final String name ="name";
      AnonymousClass anonymousClass = new AnonymousClass() {
         @Override
         public void process() {
            System.out.println("Anonymous => Access enclosing class fields: " + privateValue);
            System.out.println("Anonymous => Access enclosing class static fields: " + staticPrivateValue);
            System.out.println("Anonymous => Access final local vars: " + name);
         }
      };

      anonymousClass.process();
   }

   void lambdaExpression() {
      String nonFinal = "not effectively final";
      AnonymousClass anonymousClass = () -> {
         System.out.println("lambda => Access enclosing class fields: " + privateValue);
         System.out.println("lambda => Access enclosing class static fields: " + staticPrivateValue);
         //System.out.println("Access non final vars: " + nonFinal); Compile error
      };

      nonFinal = "changed";
      anonymousClass.process();
   }

   public static void main(String[] args) {
      LocalClassExample nestedClassExample = new LocalClassExample();
      nestedClassExample.localClass();
      nestedClassExample.anonymousClass();
      nestedClassExample.lambdaExpression();
   }
}
