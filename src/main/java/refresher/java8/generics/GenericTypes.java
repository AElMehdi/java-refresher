package refresher.java8.generics;

public class GenericTypes<T> {

   private T t;

   private T get() {
      return this.t;
   }

   private void set(T t) {
      this.t = t;
   }


   public static void main(String[] args) {
      GenericTypes<String> stringGenericTypes = new GenericTypes();
      stringGenericTypes.set("Mehdi");
      System.out.println(stringGenericTypes.get());

      // raw type
      GenericTypes rawType = new GenericTypes();
      rawType.set(10);
      // Valid, autoboxing support
      System.out.println(rawType.get());
   }
}
