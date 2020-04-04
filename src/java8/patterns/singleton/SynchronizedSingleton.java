package java8.patterns.singleton;

public class LazySingleton {

   private static LazySingleton instance;


   private LazySingleton() {

   }

   private static LazySingleton getInstance() {
      if (instance == null) {
         instance = new LazySingleton();
      }
      return instance;
   }


   public static void main(String[] args) {
      LazySingleton instanceOne = getInstance();
      LazySingleton instanceTwo = getInstance();

      if (instanceOne.equals(instanceTwo)) {
         System.out.println("One instance is created.");
      }
   }
}
