package refresher.java8.patterns.immutable;

public class ImmutableExample {
   // Prevent methods from being overridden: the class should be final
   // Fields must be private final (Set only using a constructor)
   // No setters
   // Never shared reference to a mutable object

   private final String name;

   public ImmutableExample(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
}

