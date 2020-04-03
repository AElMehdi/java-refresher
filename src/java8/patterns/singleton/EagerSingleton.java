package java8.patterns.singleton;

public class EagerSingleton {

   // Instantiated once the class is loaded
   private static EagerSingleton instance = new EagerSingleton();

   private EagerSingleton() {

   }

   private static EagerSingleton getInstance() {
      return instance;
   }

   public static void main(String[] args) {
      EagerSingleton instance1 = getInstance();
      EagerSingleton instance2 = getInstance();

      if (instance1.equals(instance)) {
         System.out.println("One instance is returned");
      }
   }
}
