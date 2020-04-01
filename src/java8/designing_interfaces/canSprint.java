package java8.designing_interfaces;

public interface canSprint extends CanWalk, canRun {
   void sprint();

   // Should be overridden cause it exists in both base interfaces: canWalk, canRun
   @Override
   default void walk() {
   }
}
