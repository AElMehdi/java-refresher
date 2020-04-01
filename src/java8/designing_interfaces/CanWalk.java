package java8.designing_interfaces;

public interface CanWalk {
   default void walk() {
      System.out.println("walking");
   }
}
