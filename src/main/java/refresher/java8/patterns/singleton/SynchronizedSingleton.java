package main.java.refresher.java8.patterns.singleton;

public class SynchronizedSingleton {

   private static SynchronizedSingleton instance;


   private SynchronizedSingleton() {

   }

   private synchronized static SynchronizedSingleton getInstance() {
      if (instance == null) {
         instance = new SynchronizedSingleton();
      }
      return instance;
   }


   public static void main(String[] args) {
      SynchronizedSingleton instanceOne = getInstance();
      SynchronizedSingleton instanceTwo = getInstance();

      if (instanceOne.equals(instanceTwo)) {
         System.out.println("One instance is created.");
      }
   }
}
