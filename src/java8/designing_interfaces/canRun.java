package java8.designing_interfaces;

public interface canRun {
   default void walk() {
      System.out.println("walking");
   }

   public abstract void run();

}
