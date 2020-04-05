package refresher.java8.patterns.immutable;

import static java.util.Collections.unmodifiableList;

import java.util.List;

public class ImmutableExample {
   // Prevent methods from being overridden: the class should be final
   // Fields must be private final (Set only using a constructor)
   // No setters
   // Never shared reference to a mutable object

   private final String name;
   private final List<String> contacts;

   public String getName() {
      return name;
   }

   public List<String> getContacts() {
      return contacts;
   }

   public ImmutableExample(String name, List<String> contacts) {
      this.name = name;

      if (contacts == null) {
         throw new RuntimeException("Contacts is required!");
      }
      this.contacts = unmodifiableList(contacts);
   }
}
