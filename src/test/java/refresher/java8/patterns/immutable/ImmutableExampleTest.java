package refresher.java8.patterns.immutable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ImmutableExampleTest {

   @Test
   void should_throw_exception_when_mutable_field_is_null() {
      RuntimeException exception = assertThrows(RuntimeException.class,
            () -> new ImmutableExample("name", null),
            "A runtime exception should be thrown!");

      assertEquals("Contacts is required!", exception.getMessage());
   }

   @Test
   void ascii_to_char() {
      String ascii = "065";

      System.out.println((char)(Integer.parseInt(ascii)));
   }
}