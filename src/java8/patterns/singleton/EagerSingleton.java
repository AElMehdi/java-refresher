package java8.patterns.singleton;

public class EagerSingleton {

   // Instantiated once the class is loaded
   private static EagerSingleton instance = new EagerSingleton();

   private EagerSingleton() {

   }

   private static EagerSingleton getInstance() {
      return instance;
   }

   // While this allows us to have only one instance
   // We are still not really there, we can improve
   // this implementation with a lazy instantiation
   // see LazySingleton class
   public static void main(String[] args) {
      EagerSingleton instance1 = getInstance();
      EagerSingleton instance2 = getInstance();

      if (instance1.equals(instance2)) {
         System.out.println("One instance is returned");
      }
   }
}
