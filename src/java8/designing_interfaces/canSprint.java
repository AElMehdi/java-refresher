package java8.designing_interfaces;

public interface canSprint extends CanWalk, canRun {
   void sprint();

   // Should be overridden cause it exists in both base interfaces: CanWalk, CanRun
   @Override
   default void walk() {
   }
}
