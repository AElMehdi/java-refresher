package main.java.refresher.java8.instanceof_operator;

import java.util.ArrayList;

public class IsItFurry {
   static class Chipmunk implements Runnable {

      @Override
      public void run() {

      }
   }

   public static void main(String[] args) {
      Chipmunk chipmunk = new Chipmunk();
      ArrayList<Chipmunk> chipmunks = new ArrayList<>();
      Runnable runnable = new Thread();
      int result = 0;
      if (chipmunk instanceof Chipmunk) {
         result += 1;
      }

      //if (chipmunks instanceof Chipmunk) { Would not compile: Java knows that there's no way that a Chipmunk becomes
      // another concrete class 'ArrayList' in that case
      //   result += 1;
      //}
      if (runnable instanceof Chipmunk) { // It does compile because we are using an interface
         result += 2;
      }

      System.out.println(result); // Should print 3
   }

   static class AnotherClass extends Chipmunk implements Runnable {
      @Override
      public void run() {

      }
   }
}
