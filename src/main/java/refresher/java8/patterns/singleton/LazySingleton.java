package main.java.refresher.java8.patterns.singleton;

public class LazySingleton extends Thread{

   private static LazySingleton instance;


   private LazySingleton() {

   }

   private static LazySingleton getInstance() {
      if (instance == null) {
         instance = new LazySingleton();
      }
      return instance;
   }

   // A better implementation but what will happen if our method is accessed by more than
   // a thread at the same time ?
   public static void main(String[] args) {
      LazySingleton instanceOne = getInstance();
      LazySingleton instanceTwo = getInstance();

      if (instanceOne.equals(instanceTwo)) {
         System.out.println("One instance is created.");
      }
   }
}
